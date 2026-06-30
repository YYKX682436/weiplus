package a82;

/* loaded from: classes12.dex */
public class k2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.h2 f2065d;

    public k2(a82.h2 h2Var) {
        this.f2065d = h2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        try {
            a82.h2.a(this.f2065d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.FavSendService", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|scenePusher";
    }
}
