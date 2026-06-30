package dl4;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final dl4.d1 f316916a = new dl4.d1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f316917b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f316918c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f316919d = jz5.h.b(dl4.u0.f317010d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f316920e = jz5.h.b(dl4.q0.f316991d);

    public static final void a(dl4.d1 d1Var, long j17, java.lang.String str, java.lang.String str2, o11.g gVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, p11.k kVar) {
        d1Var.getClass();
        java.util.HashMap hashMap = f316918c;
        java.lang.Object obj = hashMap.get(str2);
        if (obj != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (!arrayList.isEmpty()) {
                if (kVar != null) {
                    arrayList.add(kVar);
                    return;
                }
                return;
            }
        }
        if (obj == null) {
            obj = new java.util.ArrayList();
        }
        if (kVar != null) {
            ((java.util.ArrayList) obj).add(kVar);
        }
        hashMap.put(str2, obj);
        n11.a.b().k(str, null, gVar, new dl4.o0(j17, str, str2, gVar, w1Var), new dl4.p0(j17, str2, gVar, w1Var));
    }

    public static final void b(dl4.d1 d1Var, long j17, java.lang.String str, java.lang.String str2, o11.g gVar, p11.d dVar) {
        d1Var.getClass();
        java.util.HashMap hashMap = f316917b;
        java.lang.Object obj = hashMap.get(str);
        if (obj != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (!arrayList.isEmpty()) {
                arrayList.add(dVar);
                return;
            }
        }
        if (obj == null) {
            obj = new java.util.ArrayList();
        }
        ((java.util.ArrayList) obj).add(dVar);
        hashMap.put(str, obj);
        n11.a.b().d(str, gVar, new dl4.t0(j17, str));
    }

    public static final void c(dl4.d1 d1Var, long j17, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, o11.g gVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        d1Var.getClass();
        final dl4.a1 a1Var = new dl4.a1(str2, j17, bitmap, str, gVar);
        if (w1Var == null) {
            pm0.v.X(a1Var);
        } else {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c4) w1Var).a(new java.lang.Runnable(a1Var) { // from class: dl4.c1

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f316911d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "function");
                    this.f316911d = a1Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f316911d.mo152xb9724478();
                }
            });
        }
    }
}
