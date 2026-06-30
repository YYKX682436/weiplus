package az0;

/* loaded from: classes5.dex */
public final class s4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 f97415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54) {
        super(0);
        this.f97415d = c4073xbc40c54;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseMJMoviePlayer[");
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = this.f97415d;
        sb6.append(c4073xbc40c54.hashCode());
        sb6.append("]: ready release");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", sb6.toString());
        c4073xbc40c54.m33242x41012807();
        return null;
    }
}
