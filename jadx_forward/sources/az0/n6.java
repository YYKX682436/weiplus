package az0;

/* loaded from: classes5.dex */
public final class n6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f97274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(az0.n7 n7Var) {
        super(1);
        this.f97274d = n7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete it = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        az0.i5 i5Var = az0.i5.f97090a;
        if (az0.i5.f97104o) {
            return this.f97274d.f97275a.m33375x961d542c(it);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "recreateWithMusicID: skip cancelRecreation, session released");
        return null;
    }
}
