package l53;

/* loaded from: classes8.dex */
public final class f implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l53.i f398184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f398186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398187g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f398188h;

    public f(l53.i iVar, java.lang.String str, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, java.lang.String str2, java.util.HashMap hashMap) {
        this.f398184d = iVar;
        this.f398185e = str;
        this.f398186f = activityC21401x6ce6f73f;
        this.f398187g = str2;
        this.f398188h = hashMap;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1001) {
            l53.i iVar = this.f398184d;
            if (i18 != -1) {
                l53.a aVar = iVar.f398195c;
                if (aVar != null) {
                    aVar.mo64831x3d6f0539();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToFriend cancel");
                return;
            }
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                l53.a aVar2 = iVar.f398195c;
                if (aVar2 != null) {
                    aVar2.a("toUser is null");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , toUser is null");
            }
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            k70.v vVar = (k70.v) i95.n0.c(k70.v.class);
            java.lang.String str = this.f398185e;
            ((j70.e) vVar).Ai(str, new l53.e(this.f398184d, this.f398186f, this.f398187g, str, stringExtra, this.f398188h, stringExtra2));
        }
    }
}
