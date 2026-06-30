package ch2;

/* loaded from: classes10.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.q f41343d;

    public f(ch2.q qVar) {
        this.f41343d = qVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.widget.q30 q30Var;
        r45.gw1 gw1Var = (r45.gw1) obj;
        ch2.q qVar = this.f41343d;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "checkKTVGuideOrderSongBubble text: " + gw1Var.getString(2) + " limit: " + gw1Var.getInteger(4));
        if (((mm2.e1) qVar.business(mm2.e1.class)).b7() && !zl2.r4.f473950a.x1()) {
            android.content.Context O6 = qVar.O6();
            android.view.ViewGroup viewGroup = null;
            android.app.Activity activity = O6 instanceof android.app.Activity ? (android.app.Activity) O6 : null;
            if (activity != null) {
                com.tencent.mm.plugin.finder.live.view.ub ubVar = qVar.f291099e;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
                com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) qVar.R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
                if (ag0Var != null && (q30Var = ag0Var.f111884z) != null) {
                    viewGroup = q30Var.f119467d;
                }
                if (k0Var != null && viewGroup != null) {
                    com.tencent.mm.plugin.finder.live.widget.rc rcVar = new com.tencent.mm.plugin.finder.live.widget.rc(activity);
                    gw1Var.getInteger(4);
                    rcVar.f119629k = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
                    java.lang.String string = gw1Var.getString(2);
                    if (string == null) {
                        string = "";
                    }
                    rcVar.f119626h = string;
                    rcVar.f119630l = true;
                    rcVar.f119627i = "GuideOrderSongBubble";
                    rcVar.f119628j = com.tencent.mm.plugin.finder.live.widget.sc.f119750e;
                    new com.tencent.mm.plugin.finder.live.widget.yc(rcVar).b(viewGroup, k0Var.getViewScope());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
