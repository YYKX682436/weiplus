package an4;

/* loaded from: classes15.dex */
public final class a extends jk3.v {
    public final void c0(r45.un6 topStoryVideoContext, r45.xn6 currentVideoInfo) {
        kotlin.jvm.internal.o.g(topStoryVideoContext, "topStoryVideoContext");
        kotlin.jvm.internal.o.g(currentVideoInfo, "currentVideoInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryMultiTaskHelper", "updateFloatBallData contextId:%s videoId:%s", topStoryVideoContext.f387512r, currentVideoInfo.f390259h);
        r45.wn6 wn6Var = new r45.wn6();
        wn6Var.f389313d = topStoryVideoContext.f387501d;
        wn6Var.f389314e = topStoryVideoContext.f387502e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(topStoryVideoContext.f387507m)) {
            wn6Var.f389315f = topStoryVideoContext.f387503f;
        } else {
            wn6Var.f389315f = topStoryVideoContext.f387507m;
        }
        wn6Var.f389316g = topStoryVideoContext.f387504g;
        wn6Var.f389317h = topStoryVideoContext.f387510p;
        wn6Var.f389319m = topStoryVideoContext.f387512r;
        wn6Var.f389321o = topStoryVideoContext.A;
        wn6Var.f389320n = topStoryVideoContext.f387513s;
        wn6Var.f389318i = topStoryVideoContext.f387505h;
        wn6Var.f389322p = topStoryVideoContext.f387506i;
        wn6Var.f389323q = topStoryVideoContext.f387508n;
        wn6Var.f389325s = currentVideoInfo.W;
        wn6Var.f389324r.add(currentVideoInfo);
        try {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
            r45.lr4 v07 = multiTaskInfo != null ? multiTaskInfo.v0() : null;
            if (v07 != null) {
                v07.set(1, currentVideoInfo.f390255d);
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f300077a;
            if (multiTaskInfo2 != null) {
                multiTaskInfo2.field_data = wn6Var.toByteArray();
            }
            J();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStoryMultiTaskHelper", e17, "updateFloatBallData exception:%s", e17);
        }
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        super.y(i17, str);
    }
}
