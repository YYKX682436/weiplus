package cj5;

/* loaded from: classes.dex */
public final class x4 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42272d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42273e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f42274f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f42275g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f42276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42272d = jz5.h.b(new cj5.w4(this));
        this.f42273e = jz5.h.b(new cj5.v4(activity));
        this.f42274f = jz5.h.b(new cj5.r4(activity));
        this.f42275g = jz5.h.b(new cj5.s4(activity));
        this.f42276h = new java.util.LinkedList();
    }

    public final em.l2 T6() {
        return (em.l2) ((jz5.n) this.f42272d).getValue();
    }

    public final void U6(wi5.n0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        jz5.g gVar = this.f42275g;
        int size = ((java.util.List) ((jz5.n) gVar).getValue()).size();
        java.util.LinkedList list = state.f446319o;
        if (size <= 0 || list.size() != ((java.util.List) ((jz5.n) gVar).getValue()).size()) {
            T6().i().setChecked(false);
        } else {
            T6().i().setChecked(true);
        }
        kotlin.jvm.internal.o.g(list, "list");
        java.util.LinkedList linkedList = this.f42276h;
        linkedList.clear();
        linkedList.addAll(list);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickDialogSpaceOnHalfScreenMode !! ");
        java.util.LinkedList linkedList = this.f42276h;
        sb6.append(linkedList);
        com.tencent.mars.xlog.Log.i("SelectCustomContactUIC", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ","));
        getActivity().setResult(-1, intent);
        getActivity().finish();
        return super.onClickDialogSpaceOnHalfScreenMode();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        java.util.List list = (java.util.List) ((jz5.n) this.f42275g).getValue();
        kotlin.jvm.internal.o.f(list, "<get-memberList>(...)");
        java.util.LinkedList linkedList = this.f42276h;
        linkedList.clear();
        linkedList.addAll(list);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.u4(this));
    }
}
