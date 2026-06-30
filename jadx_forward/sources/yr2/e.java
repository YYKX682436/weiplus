package yr2;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final yr2.e f546197a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f546198b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f546199c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f546200d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f546201e;

    static {
        yr2.e eVar = new yr2.e();
        f546197a = eVar;
        boolean z17 = false;
        f546198b = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26322xe3cb8d7f.m101910xf9014ce3(2, 0, 0);
        f546199c = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26322xe3cb8d7f.m101910xf9014ce3(0, 0, 0);
        f546200d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26322xe3cb8d7f.m101910xf9014ce3(1, 0, 0);
        synchronized (eVar) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a[] m101851x1afabf73 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26308xa59a071a.m101851x1afabf73(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m101851x1afabf73);
            int length = m101851x1afabf73.length;
            int i17 = 0;
            loop0: while (true) {
                if (i17 >= length) {
                    break;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a c26307xa598bb2a = m101851x1afabf73[i17];
                if (android.text.TextUtils.equals(c26307xa598bb2a.m101827xeef34bbc(), "video/hevc")) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel[] m101834x719764c2 = c26307xa598bb2a.m101834x719764c2();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m101834x719764c2);
                    for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel decoderProfileLevel : m101834x719764c2) {
                        if (decoderProfileLevel.f52178xed8e89a9 == 2) {
                            z17 = true;
                            break loop0;
                        }
                    }
                }
                i17++;
            }
        }
        f546201e = z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportDolbyVersion:");
        yr2.e eVar2 = f546197a;
        sb6.append(eVar2.a());
        sb6.append(" isSupportHDR10:");
        sb6.append(eVar2.b());
        sb6.append(" isSupportHDR10PLUS:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isSupportHDR10PLUS:");
        boolean z18 = f546200d;
        sb7.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HdrCapability", sb7.toString());
        sb6.append(z18);
        sb6.append(" isSupportHDRHLG:");
        sb6.append(eVar2.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HdrCapability", sb6.toString());
    }

    public final boolean a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportDolbyVersion:");
        boolean z17 = f546198b;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HdrCapability", sb6.toString());
        return z17;
    }

    public final boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportHDR10:");
        boolean z17 = f546199c;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HdrCapability", sb6.toString());
        return z17;
    }

    public final boolean c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportHDRHLG:");
        boolean z17 = f546201e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HdrCapability", sb6.toString());
        return z17;
    }
}
