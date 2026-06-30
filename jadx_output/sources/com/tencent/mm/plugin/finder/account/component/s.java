package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class s extends com.tencent.mm.ui.component.UIComponent implements zy2.p5 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f101727d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer f101728e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f101729f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f101730g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f101731h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.account.component.g f101732i;

    /* renamed from: m, reason: collision with root package name */
    public r45.zn5 f101733m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f101734n;

    /* renamed from: o, reason: collision with root package name */
    public int f101735o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f101736p;

    /* renamed from: q, reason: collision with root package name */
    public r45.hr5 f101737q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f101732i = new com.tencent.mm.plugin.finder.account.component.g();
        this.f101737q = new r45.hr5();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", "onActivityResult, requestCode:" + i17 + ", resultCode:" + i18 + " curFinderUserName:" + e17);
        if (i17 == 702) {
            if (i18 == -1) {
                ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).hj(getActivity(), intent, 11103);
            }
        } else if (i17 == 11103 || i17 == 11104) {
            if (e17 == null || r26.n0.N(e17)) {
                return;
            }
            ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ni("create_new_profile_succ", null, kz5.b1.e(new jz5.l("profile_finderusername", e17)), false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = this.f101728e;
        if (!(finderAccountSwitchDrawer != null && finderAccountSwitchDrawer.q())) {
            return super.onBackPressed();
        }
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer2 = this.f101728e;
        if (finderAccountSwitchDrawer2 != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.o(finderAccountSwitchDrawer2, false, 1, null);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.Objects.toString(bundle);
        this.f101727d = findViewById(com.tencent.mm.R.id.e7x);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.e7z);
        com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        android.view.View view = this.f101727d;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.account.component.q(this));
        }
        r45.hr5 hr5Var = new r45.hr5();
        com.tencent.mars.xlog.Log.isDebug();
        this.f101737q = hr5Var;
        this.f101734n = xy2.c.e(getContext());
        this.f101729f = g92.b.f269769e.W1(true);
        this.f101735o = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderMultiUserQuota", 2);
        this.f101733m = null;
        this.f101736p = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshAccountSwitch] curUserName:");
        sb6.append(this.f101734n);
        sb6.append(" account.size:");
        java.util.List list = this.f101729f;
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(" isCreateShow:");
        sb6.append(this.f101736p);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", sb6.toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (getActivity().isFinishing()) {
            g92.b.f269769e.P0("", "selfCenterClear");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f101732i = new com.tencent.mm.plugin.finder.account.component.g();
        this.f101737q = new r45.hr5();
    }
}
