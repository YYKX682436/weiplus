package b04;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.code.CodeItemView f16899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f16900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.ui.widget.code.CodeItemView codeItemView, b04.j0 j0Var) {
        super(2);
        this.f16899d = codeItemView;
        this.f16900e = j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.widget.FrameLayout expandContainer = (android.widget.FrameLayout) obj2;
        kotlin.jvm.internal.o.g(expandContainer, "expandContainer");
        expandContainer.toString();
        expandContainer.getChildCount();
        com.tencent.mm.ui.widget.code.CodeItemView codeItemView = this.f16899d;
        android.content.Context context = codeItemView.getContext();
        com.tencent.mm.ui.vas.VASActivity vASActivity = context instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context : null;
        if (vASActivity != null) {
            vASActivity.enableSwipeBackGesture(!booleanValue);
        }
        b04.j0 j0Var = this.f16900e;
        j0Var.f16918g = booleanValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "QR code expand status changed: " + j0Var.f16918g);
        if (j0Var.f16915d == null) {
            android.view.View oj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(codeItemView.getContext(), false, false, null);
            j0Var.f16915d = oj6;
            com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = oj6 instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView ? (com.tencent.liteapp.ui.WxaLiteAppBaseView) oj6 : null;
            if (wxaLiteAppBaseView != null) {
                wxaLiteAppBaseView.f46058y = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "createLiteAppView: add lite app view:" + j0Var.f16915d);
            expandContainer.addView(j0Var.f16915d, new android.view.ViewGroup.MarginLayoutParams(-1, i65.a.b(codeItemView.getContext(), 332)));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalite041d1599beb6eb0d45167bc1e9ec7ebe@pay");
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
            bundle.putString("query", "scan_entrance=" + com.tencent.mm.plugin.scanner.model.h2.f158926g + "&face2face_status=" + ((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi());
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.f144167d = new b04.e0(j0Var);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).pk(j0Var.f16915d, bundle, true, false, sVar, new b04.f0());
        }
        cl0.g gVar = new cl0.g();
        gVar.s("status", java.lang.Boolean.valueOf(booleanValue));
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.tencent.mm.feature.lite.i) g0Var).rj("wxalite041d1599beb6eb0d45167bc1e9ec7ebe@pay", "qrcodeCell/notifyExpandStatus", gVar);
        }
        return jz5.f0.f302826a;
    }
}
