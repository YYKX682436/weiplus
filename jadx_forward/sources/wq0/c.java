package wq0;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d f530030d;

    public c(com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d) {
        this.f530030d = c10867x3e50a04d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = this.f530030d;
        fq0.x frameSet = c10867x3e50a04d.getFrameSet();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclViewContainer", "need check frameset is bind:" + frameSet);
        if (frameSet != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclViewContainer", frameSet + " bind status is:" + frameSet.e());
            if (frameSet.e()) {
                return;
            }
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            if (iVar != null) {
                iVar.Sc("MagicAdMiniProgramNotExecutedOnLayout", 1, frameSet.m130019x9616526c(), com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37609x7a9310ab.getValue());
            }
            c10867x3e50a04d.requestLayout();
        }
    }
}
