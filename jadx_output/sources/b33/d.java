package b33;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b33.f f17661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b33.f fVar) {
        super(1);
        this.f17661d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View U6;
        com.tencent.mm.ui.gallery.BaseMediaTabActivity baseMediaTabActivity = (com.tencent.mm.ui.gallery.BaseMediaTabActivity) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MPFooterUIC", "getTabActivity:" + baseMediaTabActivity);
        b33.f controller = this.f17661d;
        if (baseMediaTabActivity != null) {
            kotlin.jvm.internal.o.g(controller, "controller");
            baseMediaTabActivity.f208685e = controller;
        }
        if (baseMediaTabActivity != null && (U6 = baseMediaTabActivity.U6()) != null) {
            ((android.widget.FrameLayout) ((jz5.n) controller.f17665h).getValue()).addView(U6);
        }
        return jz5.f0.f302826a;
    }
}
