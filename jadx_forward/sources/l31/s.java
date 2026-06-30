package l31;

/* loaded from: classes9.dex */
public final class s implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.t f396926d;

    public s(l31.t tVar) {
        this.f396926d = tVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSubscribeMsgUIStatusTask", "getSubscribeStatus end errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new l31.r(i17, i18, this.f396926d, c11158xe7d16ed5, errMsg));
    }
}
