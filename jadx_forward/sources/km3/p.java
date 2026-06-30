package km3;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final km3.m f390783i = new km3.m(null);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f390784m = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f390785d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f390786e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b f390787f;

    /* renamed from: g, reason: collision with root package name */
    public final km3.n f390788g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f390789h;

    public p(android.widget.TextView textView, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b, km3.n nVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f390785d = new java.lang.ref.WeakReference(textView);
        this.f390786e = new java.lang.ref.WeakReference(view);
        this.f390787f = c15635xf0ea441b;
        this.f390788g = nVar;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = this.f390787f;
        if (c15635xf0ea441b == null) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.String o17 = c15635xf0ea441b.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getThumbPath(...)");
            java.lang.String mo10219xa23d6ecc = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10219xa23d6ecc(o17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo10219xa23d6ecc, "getSimpleMp4InfoVFS(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(mo10219xa23d6ecc);
            c15635xf0ea441b.f219979x = jSONObject.getInt("videoDuration");
            c15635xf0ea441b.f219980y = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
            c15635xf0ea441b.f219981z = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
            c15635xf0ea441b.A = jSONObject.getInt("videoBitrate");
            c15635xf0ea441b.C = jSONObject.getInt("videoFPS");
            c15635xf0ea441b.D = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10218x9787f6ed(o17);
            c15635xf0ea441b.B = 0;
            c15635xf0ea441b.f219977v = j33.q.a(jSONObject.getString("videoType"));
            c15635xf0ea441b.f219978w = j33.q.a(jSONObject.getString("audioType"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Music.MusicMvAlbumAdapter", e17, "loadItemFromSimpleMP4Info fail", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvAlbumAdapter", "loadItemFromSimpleMP4Info used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: equals */
    public boolean m143701xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof km3.p)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390787f, ((km3.p) obj).f390787f);
    }

    /* renamed from: hashCode */
    public int m143702x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = this.f390787f;
        if (c15635xf0ea441b != null) {
            return c15635xf0ea441b.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x00c8, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00ca, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, "hit devices but it is too big, fileSize: %s, maxSize: %s, filePath: %s", java.lang.Long.valueOf(r17), java.lang.Integer.valueOf(r6), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km3.p.run():void");
    }
}
