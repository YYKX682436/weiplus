package mn1;

/* loaded from: classes12.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f411429a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f411430b;

    /* renamed from: e, reason: collision with root package name */
    public final kn1.g f411433e;

    /* renamed from: f, reason: collision with root package name */
    public final mn1.c0 f411434f;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f411431c = "";

    /* renamed from: d, reason: collision with root package name */
    public long f411432d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f411435g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new mn1.a0(this), true);

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f411436h = new mn1.b0(this);

    public z(mn1.c0 c0Var, kn1.g gVar) {
        this.f411434f = c0Var;
        this.f411433e = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(final mn1.z r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn1.z.a(mn1.z, boolean):void");
    }

    public final void b() {
        java.lang.String ticket = mn1.d.i().f411368n;
        java.util.LinkedList addressList = this.f411429a;
        java.lang.String wifiName = this.f411430b;
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: mn1.z$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                sn1.j jVar = (sn1.j) obj;
                mn1.z zVar = mn1.z.this;
                zVar.getClass();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.f491565b);
                int i17 = jVar.f491566c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createOffilineQrcode response.[%d,%d,%s]", valueOf, java.lang.Integer.valueOf(i17), jVar.f491567d);
                bw5.p2 p2Var = (bw5.p2) jVar.f491564a;
                int i18 = jVar.f491565b;
                mn1.c0 c0Var = zVar.f411434f;
                kn1.g gVar = zVar.f411433e;
                if (i18 != 0 || i17 != 0 || p2Var == null) {
                    gVar.f391142a = -11;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    ((mn1.x) c0Var).a(-11, null);
                    return;
                }
                boolean[] zArr = p2Var.f112975i;
                boolean z18 = zArr[2];
                if (z18) {
                    if ((z18 ? p2Var.f112971e : new r45.cu5()).f453372d > 0) {
                        gVar.f391142a = 51;
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        ((mn1.x) c0Var).a(51, (zArr[2] ? p2Var.f112971e : new r45.cu5()).f453374f.f273689a);
                    }
                }
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addressList, "addressList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wifiName, "wifiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, null, null, new sn1.p(addressList, wifiName, ticket, consumer, null), 3, null);
        } else {
            consumer.accept(new sn1.j(null, 3, -1, "No account scope"));
        }
    }
}
