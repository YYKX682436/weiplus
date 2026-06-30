package a82;

/* loaded from: classes12.dex */
public class k2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.h2 f83598d;

    public k2(a82.h2 h2Var) {
        this.f83598d = h2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        try {
            a82.h2.a(this.f83598d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.FavSendService", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m827x9616526c() {
        return super.toString() + "|scenePusher";
    }
}
