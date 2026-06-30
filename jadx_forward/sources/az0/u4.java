package az0;

/* loaded from: classes5.dex */
public final class u4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 f97470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54) {
        super(1);
        this.f97470d = c4073xbc40c54;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseMJMoviePlayer[");
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = this.f97470d;
        sb6.append(c4073xbc40c54.hashCode());
        sb6.append("]: ready tearDown");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", sb6.toString());
        return c4073xbc40c54.m33253x9ccada24(onComplete);
    }
}
