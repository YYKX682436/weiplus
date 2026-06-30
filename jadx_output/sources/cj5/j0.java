package cj5;

/* loaded from: classes.dex */
public final class j0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f42149d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f42150e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f42151f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f42152g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f42153h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42149d = "";
        this.f42150e = "";
        this.f42153h = jz5.h.b(new cj5.g0(this));
    }

    public static final void T6(cj5.j0 j0Var, int i17) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = j0Var.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.t(i17));
    }

    public final em.l2 U6() {
        return (em.l2) ((jz5.n) this.f42153h).getValue();
    }

    public final void V6(wi5.n0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f446319o;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiSelectModeUIC", sb6.toString());
        linkedList.size();
        linkedList.contains(this.f42150e);
        mMActivity.setBackBtnVisible(false);
        mMActivity.getController().x0(getResources().getString(com.tencent.mm.R.string.f490347sg), new cj5.h0(this));
        mMActivity.updateOptionMenuStyle(1, com.tencent.mm.ui.fb.GREEN);
        mMActivity.updateOptionMenuListener(1, new cj5.i0(this), null);
        if (linkedList.size() > 0) {
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5) + '(' + linkedList.size() + ')');
        } else {
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5));
        }
        if (linkedList.size() > state.f446317m) {
            mMActivity.enableOptionMenu(1, true);
            this.f42152g = false;
        } else {
            mMActivity.enableOptionMenu(1, false);
            this.f42152g = true;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        return this.f42152g;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        java.lang.String stringExtra = getIntent().getStringExtra("msgQuoteName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f42150e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("chatroomName");
        this.f42149d = stringExtra2 != null ? stringExtra2 : "";
        this.f42151f = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f42149d);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.L2(getActivity(), new cj5.e0(this, h0Var));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.z3(getActivity(), cj5.f0.f42116d);
    }
}
