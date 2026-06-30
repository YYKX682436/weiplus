package com.tencent.mm.plugin.brandservice.ui;

/* loaded from: classes9.dex */
public class EnterpriseBizEntranceListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f94028m = 0;

    /* renamed from: d, reason: collision with root package name */
    public or1.s1 f94029d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f94030e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f94031f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f94032g;

    /* renamed from: h, reason: collision with root package name */
    public or1.j1 f94033h;

    /* renamed from: i, reason: collision with root package name */
    public final or1.p1 f94034i = new or1.p1(new or1.n1(this));

    public final void T6(java.util.List list) {
        if (this.f94029d == null) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            or1.s1 s1Var = this.f94029d;
            s1Var.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList.add(new or1.v1((r45.d67) it.next()));
            }
            s1Var.f347572e = linkedList;
            return;
        }
        or1.s1 s1Var2 = this.f94029d;
        s1Var2.getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        or1.v1 v1Var = new or1.v1();
        v1Var.f347590b = com.tencent.mm.R.raw.enterprise_chat_entry_avatar;
        r45.d67 d67Var = v1Var.f347589a;
        d67Var.f372185d = 1;
        android.content.Context context = s1Var2.f347571d;
        d67Var.f372186e = context.getString(com.tencent.mm.R.string.f491124c13);
        d67Var.f372187f = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyw) + "/node/wework/images/icon_im.48490d44c5.png";
        linkedList2.add(v1Var);
        or1.v1 v1Var2 = new or1.v1();
        java.lang.String string = context.getString(com.tencent.mm.R.string.c1l);
        r45.d67 d67Var2 = v1Var2.f347589a;
        d67Var2.f372186e = string;
        d67Var2.f372187f = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyw) + "/node/wework/images/icon_workspace.cb133ed72e.png";
        d67Var2.f372185d = 2;
        linkedList2.add(v1Var2);
        s1Var2.f347572e = linkedList2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488742a93;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.util.LinkedList linkedList;
        this.f94030e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f484233dh2);
        if (this.f94029d == null) {
            this.f94029d = new or1.s1(this, this);
            try {
                r01.m y07 = r01.q3.bj().y0(this.f94031f);
                r45.ik ikVar = new r45.ik();
                ikVar.parseFrom(y07.field_raw_attrs);
                linkedList = ikVar.f377102d;
            } catch (java.lang.Throwable unused) {
                linkedList = null;
            }
            T6(linkedList);
            r01.q3.bj().b1(this.f94031f, new or1.u1(this));
            this.f94032g = new or1.k1(this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "count = %s", java.lang.Integer.valueOf(this.f94029d.getCount()));
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f94031f, true);
        setMMTitle(n17.f2());
        if (!n17.r2() || this.f94029d.getCount() <= 0) {
            this.f94030e.setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484234dh3);
            textView.setText(com.tencent.mm.R.string.c1g);
            textView.setVisibility(0);
        } else {
            this.f94030e.setVisibility(0);
            this.f94030e.setAdapter((android.widget.ListAdapter) this.f94029d);
            this.f94030e.setOnItemClickListener(this.f94032g);
        }
        setBackBtn(new or1.l1(this));
        setToTop(new or1.m1(this));
        or1.j1 j1Var = this.f94033h;
        j1Var.getClass();
        addIconOptionMenu(1, com.tencent.mm.R.string.f489817cl, com.tencent.mm.R.raw.actionbar_icon_dark_add, new or1.i1(j1Var));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f94033h.a(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("enterprise_scene", 2);
        java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f94031f = stringExtra;
        this.f94033h = new or1.j1(this, stringExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "bizName = %s", stringExtra);
        initView();
        r01.q3.cj().add(this.f94029d);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f94029d);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        r01.q3.cj().remove(this.f94029d);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f94029d);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (c01.e2.J(this.f94031f)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "%s !isContact", this.f94031f);
        finish();
    }
}
