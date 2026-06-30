package qr;

/* loaded from: classes12.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qr.o f447562d;

    public n(qr.o oVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f447562d = oVar;
        this.f447559a = str;
        this.f447560b = str2;
        this.f447561c = str3;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadBackup", "backup callback: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String str = this.f447561c;
        java.lang.String str2 = this.f447560b;
        java.lang.String str3 = this.f447559a;
        qr.o oVar = this.f447562d;
        if (i17 == 0 && i18 == 0) {
            oVar.d(str3);
            qr.o.e(oVar, (r45.ri0) ((r45.bd) fVar.f152151d).f452205e.getFirst());
            oVar.b(0, str3, str2, str);
            gr.v.f356229a.a(true);
            return null;
        }
        if (i18 != -434) {
            oVar.c();
            return null;
        }
        if (oVar.f447553b) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE);
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE);
        }
        oVar.d(str3);
        qr.o.e(oVar, (r45.ri0) ((r45.bd) fVar.f152151d).f452205e.getFirst());
        oVar.b(1, str3, str2, str);
        gr.v.f356229a.a(true);
        return null;
    }
}
