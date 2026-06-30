package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class FavTagEditUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f100413s = 0;

    /* renamed from: d, reason: collision with root package name */
    public o72.r2 f100414d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f100415e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavTagPanel f100416f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavTagPanel f100417g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f100418h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f100419i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f100420m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.adapter.f f100421n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.adapter.g f100422o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f100423p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f100424q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f100425r = false;

    public final void T6() {
        if (this.f100423p) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTagEditUI", "match max length, disable finish button");
            if (isOptionMenuEnable(0)) {
                enableOptionMenu(0, false);
                return;
            }
            return;
        }
        o72.r2 r2Var = this.f100414d;
        if (r2Var == null) {
            if (this.f100417g.getTagCount() > 0 || this.f100417g.getEditText().length() > 0) {
                if (isOptionMenuEnable(0)) {
                    return;
                }
                enableOptionMenu(0, true);
                return;
            } else {
                if (isOptionMenuEnable(0)) {
                    enableOptionMenu(0, false);
                    return;
                }
                return;
            }
        }
        if (r2Var.field_tagProto.f385096e.size() != this.f100417g.getTagCount() || this.f100417g.getEditText().length() > 0) {
            if (isOptionMenuEnable(0)) {
                return;
            }
            enableOptionMenu(0, true);
            return;
        }
        java.util.ArrayList<java.lang.String> tagList = this.f100417g.getTagList();
        for (int i17 = 0; i17 < tagList.size(); i17++) {
            if (!tagList.get(i17).equals(this.f100414d.field_tagProto.f385096e.get(i17))) {
                if (isOptionMenuEnable(0)) {
                    return;
                }
                enableOptionMenu(0, true);
                return;
            }
        }
        if (isOptionMenuEnable(0)) {
            enableOptionMenu(0, false);
        }
    }

    public final void U6() {
        db5.e1.A(getContext(), getString(com.tencent.mm.R.string.f491203cc0), "", getString(com.tencent.mm.R.string.f490008ib), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.fav.ui.o6(this), null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.abx;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("key_fav_item_id", -1L);
        if (-1 != longExtra) {
            this.f100414d = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra);
        }
        this.f100415e = getIntent().getStringArrayListExtra("key_fav_result_list");
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("key_fav_item_ids");
        if (integerArrayListExtra != null) {
            java.util.ArrayList arrayList = this.f100424q;
            arrayList.clear();
            for (int i17 = 0; i17 < integerArrayListExtra.size(); i17++) {
                arrayList.add(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(integerArrayListExtra.get(i17).intValue()));
            }
        }
        this.f100417g = (com.tencent.mm.plugin.fav.ui.widget.FavTagPanel) findViewById(com.tencent.mm.R.id.dwl);
        this.f100418h = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f487218nx4);
        this.f100419i = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mfk);
        this.f100420m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jdc);
        this.f100417g.k(true);
        this.f100417g.setTagEditTextBG(com.tencent.mm.R.drawable.b4q);
        this.f100417g.setIsAllowEnterCharacter(true);
        this.f100417g.setCallBack(new com.tencent.mm.plugin.fav.ui.p6(this));
        this.f100417g.postDelayed(new com.tencent.mm.plugin.fav.ui.q6(this), 100L);
        o72.r2 r2Var = this.f100414d;
        if (r2Var != null) {
            com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = this.f100417g;
            java.util.LinkedList linkedList = r2Var.field_tagProto.f385096e;
            favTagPanel.r(linkedList, linkedList);
        } else {
            java.util.List list = this.f100415e;
            if (list != null) {
                this.f100417g.r(list, list);
            }
        }
        com.tencent.mm.plugin.fav.ui.r6 r6Var = new com.tencent.mm.plugin.fav.ui.r6(this, getContext());
        this.f100421n = r6Var;
        r6Var.f100502i = new com.tencent.mm.plugin.fav.ui.s6(this);
        o72.r2 r2Var2 = this.f100414d;
        java.util.LinkedList linkedList2 = r2Var2 == null ? null : r2Var2.field_tagProto.f385096e;
        java.util.Set set = r6Var.f100500g;
        ((java.util.HashSet) set).clear();
        if (linkedList2 != null) {
            set.addAll(linkedList2);
        }
        o72.r2 r2Var3 = this.f100414d;
        if (r2Var3 != null && !r2Var3.field_tagProto.f385095d.isEmpty()) {
            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488763ac0, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dve);
            textView.setText(getString(com.tencent.mm.R.string.f491204cc1));
            textView.setVisibility(0);
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479782f3);
            com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel2 = (com.tencent.mm.plugin.fav.ui.widget.FavTagPanel) inflate.findViewById(com.tencent.mm.R.id.dwm);
            this.f100416f = favTagPanel2;
            favTagPanel2.setVisibility(0);
            com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel3 = this.f100416f;
            r45.rq0 rq0Var = this.f100414d.field_tagProto;
            favTagPanel3.r(rq0Var.f385096e, rq0Var.f385095d);
            this.f100416f.setBackgroundResource(com.tencent.mm.R.drawable.bfk);
            this.f100416f.setPadding(0, 0, 0, dimensionPixelSize);
            this.f100416f.setCallBack(new com.tencent.mm.plugin.fav.ui.t6(this));
            this.f100418h.addHeaderView(inflate);
        }
        if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().c() > 0) {
            this.f100418h.addHeaderView(android.view.View.inflate(getContext(), com.tencent.mm.R.layout.abz, null));
        }
        this.f100418h.setAdapter((android.widget.ListAdapter) this.f100421n);
        this.f100418h.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.u6(this));
        com.tencent.mm.plugin.fav.ui.g6 g6Var = new com.tencent.mm.plugin.fav.ui.g6(this, getContext());
        this.f100422o = g6Var;
        this.f100419i.setAdapter((android.widget.ListAdapter) g6Var);
        this.f100419i.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.h6(this));
        boolean booleanExtra = getIntent().getBooleanExtra("key_fav_is_add_tag", false);
        this.f100425r = booleanExtra;
        if (booleanExtra) {
            setMMTitle(com.tencent.mm.R.string.c_a);
        } else {
            setMMTitle(com.tencent.mm.R.string.f491195ca4);
        }
        setBackBtn(new com.tencent.mm.plugin.fav.ui.m6(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.fav.ui.n6(this), null, com.tencent.mm.ui.fb.GREEN);
        T6();
        if (this.f100414d != null) {
            ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(this.f100414d.field_localId));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        return true;
    }
}
