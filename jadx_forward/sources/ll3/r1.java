package ll3;

/* loaded from: classes11.dex */
public class r1 implements ka0.l0 {

    /* renamed from: b, reason: collision with root package name */
    public ll3.p1 f400757b;

    /* renamed from: c, reason: collision with root package name */
    public ka0.k0 f400758c;

    /* renamed from: d, reason: collision with root package name */
    public final p11.h f400759d = new ll3.o1(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f400760e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f400756a = new jt0.i(5, ll3.r1.class);

    public void a(b21.r rVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913, android.content.Context context, boolean z17, boolean z18) {
        if (rVar == null || c19659x677e0913 == null) {
            return;
        }
        ql3.a aVar = new ql3.a();
        java.lang.String str = rVar.f98879e;
        aVar.f66983xc8c6afdb = str;
        aVar.f66986xd6cee995 = str;
        aVar.f66984xb1df81fa = rVar.f98878d;
        aVar.f66989xae75a955 = rVar.f98883i;
        aVar.f66991xbe4efa2f = rVar.f98892u;
        aVar.f66990x8cd5305b = rVar.f98889r;
        aVar.f66992xe65a7da = rVar.f98884m;
        if (android.text.TextUtils.isEmpty(aVar.f66997xaf16cf45) && !android.text.TextUtils.isEmpty(rVar.f98888q)) {
            aVar.f66997xaf16cf45 = rVar.f98888q;
        }
        aVar.f67004x4075980c = rVar.f98897z;
        if (android.text.TextUtils.isEmpty(aVar.f66995x4a6948ee) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98895x)) {
            aVar.f66995x4a6948ee = rVar.f98895x;
        }
        b(aVar, c19659x677e0913, context, z17, z18);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(ql3.a r23, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 r24, android.content.Context r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.r1.b(ql3.a, com.tencent.mm.pluginsdk.ui.applet.CdnImageView, android.content.Context, boolean, boolean):void");
    }

    public final void c(ql3.a aVar, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicImageLoader", "putBitmapToCache %s", aVar.f66983xc8c6afdb);
        ((jt0.i) this.f400756a).put(aVar.f66983xc8c6afdb, bitmap);
    }
}
