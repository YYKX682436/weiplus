package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb;

/* loaded from: classes11.dex */
public class d implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ql3.a f232170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e f232172c;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar, ql3.a aVar, java.lang.String str) {
        this.f232172c = eVar;
        this.f232170a = aVar;
        this.f232171b = str;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object... objArr) {
        ql3.a aVar = this.f232170a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotification", "music.field_songAlbumUrl:%s, success:%b", aVar.f66992xe65a7da, java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f232171b, null);
            if (J2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "bitmap is null, return");
            } else {
                n11.a.b().o(aVar.f66992xe65a7da, J2);
                this.f232172c.f232175c.c();
            }
        }
    }
}
