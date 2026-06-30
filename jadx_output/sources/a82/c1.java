package a82;

/* loaded from: classes12.dex */
public class c1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.z0 f1980d;

    public c1(a82.z0 z0Var) {
        this.f1980d = z0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        try {
            a82.z0.a(this.f1980d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.FavModService", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|scenePusher";
    }
}
