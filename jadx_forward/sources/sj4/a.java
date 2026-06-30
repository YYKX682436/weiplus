package sj4;

/* loaded from: classes9.dex */
public final class a implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f490353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f490355c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.j0 f490356d;

    public a(long j17, java.lang.String str, yz5.a aVar, pj4.j0 j0Var) {
        this.f490353a = j17;
        this.f490354b = str;
        this.f490355c = aVar;
        this.f490356d = j0Var;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.ExtJumpInfoHandler", "[CgiGetFinderFeed] errType=" + i17 + " errCode=" + i18 + " feed_id=" + this.f490353a + " nonce_id:" + this.f490354b);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj : null;
            if (c19792x256d2725 != null) {
                byte[] mo14344x5f01b1f6 = c19792x256d2725.mo14344x5f01b1f6();
                this.f490356d.f436674f = android.util.Base64.encodeToString(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length, 0);
            }
        }
        this.f490355c.mo152xb9724478();
    }
}
