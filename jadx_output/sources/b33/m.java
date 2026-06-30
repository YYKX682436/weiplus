package b33;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b33.o f17675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b33.o oVar) {
        super(1);
        this.f17675d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.gallery.BaseMediaTabActivity baseMediaTabActivity = (com.tencent.mm.ui.gallery.BaseMediaTabActivity) obj;
        b33.o controller = this.f17675d;
        if (baseMediaTabActivity != null) {
            kotlin.jvm.internal.o.g(controller, "controller");
            baseMediaTabActivity.f208684d = controller;
        }
        if (baseMediaTabActivity != null) {
            baseMediaTabActivity.V6(controller.getActivity());
        }
        return jz5.f0.f302826a;
    }
}
