package a82;

/* loaded from: classes12.dex */
public class c1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.z0 f83513d;

    public c1(a82.z0 z0Var) {
        this.f83513d = z0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        try {
            a82.z0.a(this.f83513d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.FavModService", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m803x9616526c() {
        return super.toString() + "|scenePusher";
    }
}
