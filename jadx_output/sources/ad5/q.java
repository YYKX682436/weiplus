package ad5;

/* loaded from: classes10.dex */
public final class q extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.q f3294a = new ad5.q();

    /* renamed from: b, reason: collision with root package name */
    public static yz5.p f3295b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f3296c;

    /* renamed from: d, reason: collision with root package name */
    public static yz5.p f3297d;

    /* renamed from: e, reason: collision with root package name */
    public static java.util.List f3298e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3299f;

    public q() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.tencent.mm.R.string.f493846pc0;
    }

    @Override // ad5.l0
    public int b() {
        return com.tencent.mm.R.raw.share_filled;
    }

    @Override // ad5.l0
    public int c() {
        return com.tencent.mm.R.raw.share_regular;
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
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
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
        if (f3299f) {
            return;
        }
        f3299f = true;
        yz5.p pVar = f3297d;
        java.lang.Object obj = f3298e;
        if (obj == null) {
            obj = kz5.p0.f313996d;
        }
        f3297d = null;
        f3298e = null;
        f3295b = null;
        f3296c = null;
        if (pVar != null) {
            pVar.invoke(jVar, obj);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.q)) {
            return false;
        }
        return true;
    }

    public final void f(yz5.q qVar, java.util.List list) {
        f3299f = false;
        ad5.k kVar = new ad5.k(qVar, this, list);
        f3297d = kVar;
        f3298e = list;
        f3295b = kVar;
        f3296c = list;
    }

    public final void g(android.content.Context context, java.util.List list, java.lang.String str, boolean z17, ad5.t0 t0Var) {
        ad5.p pVar = new ad5.p();
        java.lang.Object obj = t0Var.f3314a.get(ad5.s0.f3307a);
        if (!kotlin.jvm.internal.m0.f(obj, 1)) {
            obj = null;
        }
        yz5.l lVar = (yz5.l) obj;
        if (lVar != null) {
            lVar.invoke(pVar);
        }
        com.tencent.mm.ui.chatting.x3.d(context, list, z17, str, pVar);
    }

    public int hashCode() {
        return -953890110;
    }

    public java.lang.String toString() {
        return "Retransmit";
    }
}
