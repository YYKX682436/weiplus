package bj5;

/* loaded from: classes.dex */
public final class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f21199d;

    /* renamed from: e, reason: collision with root package name */
    public int f21200e;

    /* renamed from: f, reason: collision with root package name */
    public int f21201f;

    /* renamed from: g, reason: collision with root package name */
    public int f21202g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f21203h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f21204i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f21205m;

    /* renamed from: n, reason: collision with root package name */
    public int f21206n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21207o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f21208p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f21209q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f21203h = "";
        this.f21204i = "";
        this.f21208p = jz5.h.b(new bj5.j(this));
        this.f21209q = jz5.h.b(new bj5.i(this));
    }

    public final void T6(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.AtUserSelectionStruct atUserSelectionStruct = new com.tencent.mm.autogen.mmdata.rpt.AtUserSelectionStruct();
        long j17 = 1;
        long j18 = !com.tencent.mm.sdk.platformtools.t8.K0(this.f21204i) ? 1L : 2L;
        com.tencent.mm.storage.a3 a3Var = this.f21205m;
        boolean z17 = false;
        if (!(a3Var != null && a3Var.L0(c01.z1.r()))) {
            com.tencent.mm.storage.a3 a3Var2 = this.f21205m;
            if (a3Var2 != null && a3Var2.G0(c01.z1.r())) {
                z17 = true;
            }
            j17 = z17 ? 2L : 3L;
        }
        atUserSelectionStruct.f55330e = j17;
        atUserSelectionStruct.f55332g = i17;
        atUserSelectionStruct.f55329d = atUserSelectionStruct.b("ChatName", this.f21203h, true);
        atUserSelectionStruct.f55331f = this.f21205m != null ? r12.field_memberCount : 0L;
        atUserSelectionStruct.f55334i = this.f21200e;
        atUserSelectionStruct.f55333h = this.f21199d;
        atUserSelectionStruct.f55335j = j18;
        atUserSelectionStruct.f55336k = this.f21201f;
        atUserSelectionStruct.f55337l = this.f21202g;
        atUserSelectionStruct.f55338m = this.f21206n;
        atUserSelectionStruct.k();
        atUserSelectionStruct.o();
    }

    public final void U6(wi5.n0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f446319o;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeOneTopMenuUIC", sb6.toString());
        this.f21201f = linkedList.size();
        if (linkedList.contains(this.f21204i)) {
            this.f21202g = 1;
        }
        if (!state.e()) {
            this.f21207o = false;
            mMActivity.setBackBtnVisible(true);
            mMActivity.updateOptionMenuStyle(1, com.tencent.mm.ui.fb.TRANSPARENT);
            mMActivity.updateOptionMenuListener(1, new bj5.m(this), null);
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490493wm));
            mMActivity.enableOptionMenu(1, true);
            return;
        }
        mMActivity.setBackBtnVisible(false);
        mMActivity.getController().x0(getResources().getString(com.tencent.mm.R.string.f490347sg), new bj5.k(this));
        mMActivity.updateOptionMenuStyle(1, com.tencent.mm.ui.fb.GREEN);
        mMActivity.updateOptionMenuListener(1, new bj5.l(this), null);
        if (linkedList.size() > 0) {
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5) + '(' + linkedList.size() + ')');
        } else {
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5));
        }
        if (linkedList.size() > state.f446317m) {
            mMActivity.enableOptionMenu(1, true);
            this.f21207o = false;
        } else {
            mMActivity.enableOptionMenu(1, false);
            this.f21207o = true;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        T6(3);
        return this.f21207o;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        java.lang.String stringExtra = getIntent().getStringExtra("msgQuoteName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f21204i = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("chatroomName");
        this.f21203h = stringExtra2 != null ? stringExtra2 : "";
        this.f21206n = getIntent().getIntExtra("showSource", 0);
        this.f21205m = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f21203h);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.L2(getActivity(), new bj5.g(this, h0Var));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.z3(getActivity(), bj5.h.f21187d);
    }
}
