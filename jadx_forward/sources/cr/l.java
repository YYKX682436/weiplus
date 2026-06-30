package cr;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f303112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, yz5.l lVar) {
        super(2);
        this.f303112d = c21053xdbf1e5f4;
        this.f303113e = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cr.i iVar = (cr.i) obj2;
        yz5.l lVar = this.f303113e;
        if (!booleanValue || iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader.FetcherFactory", "fetch: get config fail " + this.f303112d.mo42933xb5885648());
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = iVar.f303105e;
            sb6.append(i17);
            sb6.append(' ');
            sb6.append(iVar.f303101a.mo42933xb5885648());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader.FetcherFactory", sb6.toString());
            (i17 == 3 ? new cr.b() : new cr.d()).a(iVar, lVar);
        }
        return jz5.f0.f384359a;
    }
}
