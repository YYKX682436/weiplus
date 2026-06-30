package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class ChooseMsgFileUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.choosemsgfile.ui.f0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f95592y = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f95593d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95594e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f95595f;

    /* renamed from: g, reason: collision with root package name */
    public int f95596g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f95597h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.choosemsgfile.logic.ui.u f95598i;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f95600n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f95601o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f95602p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f95603q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f95604r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageButton f95605s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f95606t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f95607u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f95608v;

    /* renamed from: x, reason: collision with root package name */
    public int f95610x;

    /* renamed from: m, reason: collision with root package name */
    public final xv1.b f95599m = new xv1.b();

    /* renamed from: w, reason: collision with root package name */
    public boolean f95609w = true;

    public static void T6(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI) {
        chooseMsgFileUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) chooseMsgFileUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.choosemsgfile.ui.z(chooseMsgFileUI);
        k0Var.f211881s = new com.tencent.mm.plugin.choosemsgfile.ui.a0(chooseMsgFileUI);
        k0Var.v();
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public void A(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUI", "[onDataLoaded] isFirst:%s addCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            if (i17 <= 0) {
                this.f95602p.getAdapter().notifyItemChanged(0);
                return;
            } else {
                this.f95602p.getAdapter().notifyItemRangeInserted(0, i17);
                this.f95602p.getAdapter().notifyItemRangeChanged(i17, this.f95610x + i17);
                return;
            }
        }
        U6(false, null);
        this.f95602p.getAdapter().notifyDataSetChanged();
        int itemCount = this.f95602p.getAdapter().getItemCount();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f95602p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(itemCount - 1));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
        if (i17 > 0) {
            this.f95600n.setVisibility(8);
            this.f95602p.setVisibility(0);
        } else {
            this.f95600n.setVisibility(0);
            this.f95602p.setVisibility(8);
            this.f95600n.setText(getString(com.tencent.mm.R.string.b7a));
        }
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public void P(boolean z17) {
        if (z17) {
            U6(true, null);
        } else {
            this.f95610x = ((androidx.recyclerview.widget.GridLayoutManager) this.f95602p.getLayoutManager()).y();
        }
    }

    public final void U6(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (str == null) {
                str = getString(com.tencent.mm.R.string.ggc);
            }
            this.f95608v = com.tencent.mm.ui.widget.dialog.u3.f(this, str, true, 0, null);
        } else {
            android.app.ProgressDialog progressDialog = this.f95608v;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f95608v.dismiss();
            this.f95608v = null;
        }
    }

    public final void V6(java.lang.String str) {
        if ("image".equals(str) || "video".equals(str) || com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equals(str)) {
            this.f95605s.setVisibility(0);
            this.f95606t.setVisibility(0);
        } else {
            this.f95605s.setVisibility(4);
            this.f95606t.setVisibility(4);
        }
        if (!com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equals(this.f95595f)) {
            this.f95603q.setVisibility(4);
            this.f95604r.setVisibility(4);
            return;
        }
        this.f95603q.setVisibility(0);
        this.f95604r.setVisibility(0);
        if (com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equals(str)) {
            this.f95604r.setText("");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        if ("image".equals(str)) {
            sb6.append(getString(com.tencent.mm.R.string.b7e));
        } else if ("video".equals(str)) {
            sb6.append(getString(com.tencent.mm.R.string.b7f));
        } else if ("file".equals(str)) {
            sb6.append(getString(com.tencent.mm.R.string.b7d));
        }
        sb6.append(")");
        this.f95604r.setText(sb6.toString());
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public xv1.b f6() {
        return this.f95599m;
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public android.view.View getChildAt(int i17) {
        return this.f95602p.getChildAt(i17);
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488609yj;
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public java.lang.String getUserName() {
        return this.f95593d;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f95600n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kfa);
        this.f95601o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cql);
        this.f95602p = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.e2d);
        this.f95603q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.e4a);
        this.f95604r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.e4d);
        this.f95605s = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.kmr);
        this.f95606t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kmt);
        this.f95607u = (android.widget.Button) findViewById(com.tencent.mm.R.id.nsj);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(i65.a.d(this, com.tencent.mm.R.color.f478861j7));
        java.lang.String stringExtra = getIntent().getStringExtra("USERNAME");
        this.f95593d = stringExtra;
        this.f95594e = xv1.d.f(stringExtra);
        java.lang.String stringExtra2 = getIntent().getStringExtra("TYPE");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileUtils", "type is null, use default type");
        } else if (com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equals(stringExtra2) || "image".equals(stringExtra2) || "video".equals(stringExtra2) || "file".equals(stringExtra2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileUtils", "type is invalid, use default type");
            this.f95595f = stringExtra2;
            this.f95596g = getIntent().getIntExtra("COUNT", 9);
            this.f95597h = getIntent().getStringExtra("EXTENSION");
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUI", "select msg file from username:%s nickname:%s, type:%s, count:%d", this.f95593d, this.f95594e, this.f95595f, java.lang.Integer.valueOf(this.f95596g));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUI", "select msg file from extension:%s", this.f95597h);
            this.f95599m.b(this.f95596g);
            this.f95598i = new com.tencent.mm.plugin.choosemsgfile.logic.ui.u(this);
            initView();
            this.f95602p.setLayoutManager(this.f95598i.b(this));
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f95602p;
            com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar = this.f95598i;
            uVar.getClass();
            recyclerView.N(new com.tencent.mm.plugin.choosemsgfile.logic.ui.r(uVar, this));
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f95602p;
            com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar2 = this.f95598i;
            com.tencent.mm.plugin.choosemsgfile.logic.ui.c cVar = new com.tencent.mm.plugin.choosemsgfile.logic.ui.c(uVar2.f95528b, uVar2.f95529c);
            uVar2.f95561d = cVar;
            cVar.f95526g = new com.tencent.mm.plugin.choosemsgfile.logic.ui.p(uVar2);
            recyclerView2.setAdapter(cVar);
            this.f95602p.setHasFixedSize(true);
            this.f95602p.i(new com.tencent.mm.plugin.choosemsgfile.ui.o(this));
            setMMTitle(this.f95594e);
            setBackBtn(new com.tencent.mm.plugin.choosemsgfile.ui.r(this));
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.choosemsgfile.ui.s(this));
            this.f95605s.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.t(this));
            this.f95606t.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.u(this));
            this.f95603q.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.v(this));
            this.f95604r.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.w(this));
            this.f95607u.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.y(this));
            com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar3 = this.f95598i;
            java.lang.String str = this.f95595f;
            java.lang.String str2 = this.f95597h;
            uVar3.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "onCreate");
            uVar3.f95562e.alive();
            uVar3.c(true, str, str2);
            V6(this.f95595f);
            o25.n1.c(this);
        }
        stringExtra2 = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL;
        this.f95595f = stringExtra2;
        this.f95596g = getIntent().getIntExtra("COUNT", 9);
        this.f95597h = getIntent().getStringExtra("EXTENSION");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUI", "select msg file from username:%s nickname:%s, type:%s, count:%d", this.f95593d, this.f95594e, this.f95595f, java.lang.Integer.valueOf(this.f95596g));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUI", "select msg file from extension:%s", this.f95597h);
        this.f95599m.b(this.f95596g);
        this.f95598i = new com.tencent.mm.plugin.choosemsgfile.logic.ui.u(this);
        initView();
        this.f95602p.setLayoutManager(this.f95598i.b(this));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f95602p;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar4 = this.f95598i;
        uVar4.getClass();
        recyclerView3.N(new com.tencent.mm.plugin.choosemsgfile.logic.ui.r(uVar4, this));
        androidx.recyclerview.widget.RecyclerView recyclerView22 = this.f95602p;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar22 = this.f95598i;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.c cVar2 = new com.tencent.mm.plugin.choosemsgfile.logic.ui.c(uVar22.f95528b, uVar22.f95529c);
        uVar22.f95561d = cVar2;
        cVar2.f95526g = new com.tencent.mm.plugin.choosemsgfile.logic.ui.p(uVar22);
        recyclerView22.setAdapter(cVar2);
        this.f95602p.setHasFixedSize(true);
        this.f95602p.i(new com.tencent.mm.plugin.choosemsgfile.ui.o(this));
        setMMTitle(this.f95594e);
        setBackBtn(new com.tencent.mm.plugin.choosemsgfile.ui.r(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.choosemsgfile.ui.s(this));
        this.f95605s.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.t(this));
        this.f95606t.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.u(this));
        this.f95603q.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.v(this));
        this.f95604r.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.w(this));
        this.f95607u.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.y(this));
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar32 = this.f95598i;
        java.lang.String str3 = this.f95595f;
        java.lang.String str22 = this.f95597h;
        uVar32.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "onCreate");
        uVar32.f95562e.alive();
        uVar32.c(true, str3, str22);
        V6(this.f95595f);
        o25.n1.c(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar = this.f95598i;
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "onDestroy");
        uVar.f95562e.dead();
        xv1.b bVar = this.f95599m;
        synchronized (bVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileHelper", "uninit");
            ((java.util.concurrent.ConcurrentHashMap) bVar.f457388b).clear();
            bVar.f457388b = null;
            ((java.util.HashSet) bVar.f457390d).clear();
            bVar.f457390d = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f95598i.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar = this.f95598i;
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "onResume");
        uVar.f95561d.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public void v2() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.choosemsgfile.ui.p(this));
    }
}
