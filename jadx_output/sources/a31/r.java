package a31;

/* loaded from: classes14.dex */
public class r implements z21.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout f994a;

    public r(com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout) {
        this.f994a = voiceSearchLayout;
    }

    public void a(java.lang.String[] strArr, long j17) {
        com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = this.f994a;
        if (strArr != null) {
            try {
                strArr.toString();
                for (java.lang.String str : strArr) {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoiceSearchLayout", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        voiceSearchLayout.f();
        a31.v vVar = ((a31.u) voiceSearchLayout.f71755e).f995a;
        y90.j jVar = vVar.f999u;
        if (jVar != null) {
            jVar.o2(true, strArr, j17, vVar.f998t);
        }
    }
}
