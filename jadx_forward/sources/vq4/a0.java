package vq4;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static int f520798b;

    /* renamed from: c, reason: collision with root package name */
    public static int f520799c;

    /* renamed from: d, reason: collision with root package name */
    public static int f520800d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f520801e;

    /* renamed from: a, reason: collision with root package name */
    public static final vq4.a0 f520797a = new vq4.a0();

    /* renamed from: f, reason: collision with root package name */
    public static android.util.Size f520802f = vq4.b0.k();

    public final void a(boolean z17) {
        int i17;
        sq4.b bVar;
        if (z17) {
            i17 = 1;
            if (f520800d == 1) {
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderInfo", "encode trans to soft");
            }
        } else {
            i17 = 2;
            if (f520800d == 2) {
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderInfo", "encode trans to hard");
            }
        }
        f520800d = i17;
        rq4.d dVar = qq4.c.f447524e;
        if (dVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderReport", "encode mode change to soft " + z17);
            long j17 = gq4.v.wi().f447516q;
            java.lang.String str = z17 ? "EncoderModeChangeSoft" : "EncoderModeChangeHard";
            java.lang.String str2 = dVar.f480487d;
            java.util.HashMap hashMap = dVar.f480484a;
            if (str2 != null && (bVar = (sq4.b) hashMap.get(str2)) != null) {
                bVar.b();
            }
            sq4.b bVar2 = (sq4.b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new sq4.b();
            }
            bVar2.f492906a = str;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            bVar2.d(java.lang.System.currentTimeMillis() - j17);
            hashMap.put(str, bVar2);
            dVar.f480487d = str;
        }
    }

    public final void b(int i17, int i18) {
        if (i17 != f520798b || i18 != f520799c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderInfo", "set encode size:[" + i17 + ',' + i18 + ']');
            rq4.d dVar = qq4.c.f447524e;
            if (dVar != null) {
                android.util.Size size = new android.util.Size(i17, i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderReport", "encoder size change to " + size.getWidth() + " * " + size.getHeight());
                long j17 = gq4.v.wi().f447516q;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EncoderDrawSizeChanged_");
                sb6.append(java.lang.Math.max(size.getWidth(), size.getHeight()));
                java.lang.String sb7 = sb6.toString();
                sq4.b bVar = (sq4.b) dVar.f480485b.get("EncodeBadFrame_" + java.lang.Math.max(size.getWidth(), size.getHeight()));
                if (bVar != null) {
                    bVar.b();
                }
                java.util.HashMap hashMap = dVar.f480484a;
                sq4.b bVar2 = (sq4.b) hashMap.get(dVar.f480486c);
                if (bVar2 != null) {
                    bVar2.b();
                }
                sq4.b bVar3 = (sq4.b) hashMap.get(sb7);
                if (bVar3 == null) {
                    bVar3 = new sq4.b();
                }
                bVar3.f(sb7);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                bVar3.d(java.lang.System.currentTimeMillis() - j17);
                bVar3.g(java.lang.String.valueOf(java.lang.Math.max(size.getWidth(), size.getHeight())));
                hashMap.put(sb7, bVar3);
                dVar.f480486c = sb7;
            }
            rq4.q qVar = rq4.q.f480600a;
            rq4.q.f480601b.add(java.lang.Integer.valueOf(i17));
        }
        f520798b = i17;
        f520799c = i18;
        android.util.Size size2 = f520802f;
        if (size2 != null) {
            f520798b = size2.getWidth();
            f520799c = size2.getHeight();
        }
    }
}
