package e33;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f328641h = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f328642d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b f328643e;

    /* renamed from: f, reason: collision with root package name */
    public final e33.z f328644f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f328645g;

    public a0(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b, e33.z zVar) {
        this.f328642d = new java.lang.ref.WeakReference(textView);
        this.f328643e = c15635xf0ea441b;
        this.f328644f = zVar;
    }

    public static void a(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b) {
        e33.a0 a0Var;
        if (textView == null || c15635xf0ea441b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumAdapter", "Error input for duration fetcher");
            return;
        }
        java.util.HashMap hashMap = f328641h;
        if (hashMap.containsKey(textView) && (a0Var = (e33.a0) hashMap.get(textView)) != null) {
            if (a0Var.f328643e.m63662xb2c87fbf(c15635xf0ea441b)) {
                return;
            }
            if (textView.equals(a0Var.f328642d.get())) {
                a0Var.f328642d = new java.lang.ref.WeakReference(null);
                a0Var.f328645g = true;
            }
        }
        int i17 = c15635xf0ea441b.f219979x;
        if (i17 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "Directly attach durationMs %d to tv, path %s", java.lang.Integer.valueOf(i17), c15635xf0ea441b);
            c(textView, c15635xf0ea441b.f219979x);
            hashMap.remove(textView);
        } else {
            textView.setText("");
            e33.a0 a0Var2 = new e33.a0(textView, c15635xf0ea441b, new e33.y());
            t23.p0.n().b(a0Var2);
            hashMap.put(textView, a0Var2);
        }
    }

    public static void c(android.widget.TextView textView, int i17) {
        if (textView == null) {
            return;
        }
        if (i17 < 0) {
            textView.setText("--:--");
            return;
        }
        int round = java.lang.Math.round(i17 / 1000.0f);
        java.lang.String valueOf = java.lang.String.valueOf(round % 60);
        if (valueOf.length() < 2) {
            valueOf = "0".concat(valueOf);
        }
        textView.setText((round / 60) + ":" + valueOf);
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = this.f328643e;
        if (c15635xf0ea441b == null) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.String o17 = c15635xf0ea441b.o();
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69182xa23d6ecc(o17));
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
    public boolean m126850xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof e33.a0)) {
            return false;
        }
        return this.f328643e.m63662xb2c87fbf(((e33.a0) obj).f328643e);
    }

    /* renamed from: hashCode */
    public int m126851x8cdac1b() {
        return this.f328643e.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.a0.run():void");
    }
}
