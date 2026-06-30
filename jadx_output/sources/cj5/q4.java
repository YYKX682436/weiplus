package cj5;

/* loaded from: classes.dex */
public final class q4 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42221d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42221d = jz5.h.b(new cj5.p4(activity));
        this.f42222e = jz5.h.b(new cj5.m4(activity, this));
    }

    public final void T6(wi5.n0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f446319o;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactTopMenuUIC", sb6.toString());
        int size = linkedList.size();
        jz5.g gVar = this.f42222e;
        if (size > 0) {
            mMActivity.updateOptionMenuText(1, ((java.lang.String) ((jz5.n) gVar).getValue()) + '(' + linkedList.size() + ')');
        } else {
            mMActivity.updateOptionMenuText(1, (java.lang.String) ((jz5.n) gVar).getValue());
        }
        if (linkedList.size() > state.f446317m) {
            mMActivity.enableOptionMenu(1, true);
        } else {
            mMActivity.enableOptionMenu(1, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.o4(this));
    }
}
