package ad5;

/* loaded from: classes10.dex */
public final class q extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.q f84827a = new ad5.q();

    /* renamed from: b, reason: collision with root package name */
    public static yz5.p f84828b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f84829c;

    /* renamed from: d, reason: collision with root package name */
    public static yz5.p f84830d;

    /* renamed from: e, reason: collision with root package name */
    public static java.util.List f84831e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f84832f;

    public q() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f575379pc0;
    }

    @Override // ad5.l0
    public int b() {
        return com.p314xaae8f345.mm.R.raw.f81036xd95291c2;
    }

    @Override // ad5.l0
    public int c() {
        return com.p314xaae8f345.mm.R.raw.f81037xc4b4c73c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad  */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.ui.widget.dialog.u1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.Window] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    @Override // ad5.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r21, ad5.t0 r22) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad5.q.d(android.content.Context, ad5.t0):void");
    }

    public final void e(ad5.j jVar) {
        if (f84832f) {
            return;
        }
        f84832f = true;
        yz5.p pVar = f84830d;
        java.lang.Object obj = f84831e;
        if (obj == null) {
            obj = kz5.p0.f395529d;
        }
        f84830d = null;
        f84831e = null;
        f84828b = null;
        f84829c = null;
        if (pVar != null) {
            pVar.mo149xb9724478(jVar, obj);
        }
    }

    /* renamed from: equals */
    public boolean m1131xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.q)) {
            return false;
        }
        return true;
    }

    public final void f(yz5.q qVar, java.util.List list) {
        f84832f = false;
        ad5.k kVar = new ad5.k(qVar, this, list);
        f84830d = kVar;
        f84831e = list;
        f84828b = kVar;
        f84829c = list;
    }

    public final void g(android.content.Context context, java.util.List list, java.lang.String str, boolean z17, ad5.t0 t0Var) {
        ad5.p pVar = new ad5.p();
        java.lang.Object obj = t0Var.f84847a.get(ad5.s0.f84840a);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.m0.f(obj, 1)) {
            obj = null;
        }
        yz5.l lVar = (yz5.l) obj;
        if (lVar != null) {
            lVar.mo146xb9724478(pVar);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.d(context, list, z17, str, pVar);
    }

    /* renamed from: hashCode */
    public int m1132x8cdac1b() {
        return -953890110;
    }

    /* renamed from: toString */
    public java.lang.String m1133x9616526c() {
        return "Retransmit";
    }
}
