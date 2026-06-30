package d45;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final d45.f f307974h = new d45.f(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f307975i = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f307976d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b f307977e;

    /* renamed from: f, reason: collision with root package name */
    public final d45.g f307978f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f307979g;

    public i(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b, d45.g gVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f307976d = new java.lang.ref.WeakReference(textView);
        this.f307977e = c15635xf0ea441b;
        this.f307978f = gVar;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = this.f307977e;
        if (c15635xf0ea441b == null) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.String o17 = c15635xf0ea441b.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getThumbPath(...)");
            java.lang.String m69182xa23d6ecc = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69182xa23d6ecc(o17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m69182xa23d6ecc, "getSimpleMp4InfoVFS(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(m69182xa23d6ecc);
            c15635xf0ea441b.f219979x = jSONObject.getInt("videoDuration");
            c15635xf0ea441b.f219980y = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
            c15635xf0ea441b.f219981z = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
            c15635xf0ea441b.A = jSONObject.getInt("videoBitrate");
            c15635xf0ea441b.C = jSONObject.getInt("videoFPS");
            c15635xf0ea441b.D = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(o17);
            c15635xf0ea441b.B = 0;
            c15635xf0ea441b.f219977v = j33.q.a(jSONObject.getString("videoType"));
            c15635xf0ea441b.f219978w = j33.q.a(jSONObject.getString("audioType"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AlbumAdapter", e17, "loadItemFromSimpleMP4Info fail", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "loadItemFromSimpleMP4Info mediaItem: %s", c15635xf0ea441b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "loadItemFromSimpleMP4Info used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: equals */
    public boolean m123502xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof d45.i)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f307977e, ((d45.i) obj).f307977e);
    }

    /* renamed from: hashCode */
    public int m123503x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = this.f307977e;
        if (c15635xf0ea441b != null) {
            return c15635xf0ea441b.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00c8, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00ca, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, "hit devices but it is too big, fileSize: %s, maxSize: %s, filePath: %s", java.lang.Long.valueOf(r17), java.lang.Integer.valueOf(r6), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d45.i.run():void");
    }
}
