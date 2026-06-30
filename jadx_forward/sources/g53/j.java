package g53;

/* loaded from: classes8.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f350450a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f350451b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f350452c;

    /* renamed from: d, reason: collision with root package name */
    public static int f350453d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f350454e;

    public static final void a(java.lang.String appId, java.lang.String actId, boolean z17, sd.k page, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actId, "actId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        f350451b = appId;
        f350452c = actId;
        f350453d = i17;
        f350450a = z17;
        android.content.Context context = page.f488143d;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78735x28280f95().m81450x8e764904(!z17);
        }
        f350454e = new java.lang.ref.WeakReference(page);
    }

    public static final boolean b(sd.k kVar) {
        if (kVar instanceof sd.u0) {
            tw4.b bVar = new tw4.b();
            bVar.f504014b = "userAction";
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("action", "back");
            bVar.f504013a = jSONObject;
            ((sd.u0) kVar).f488188i.c(bVar);
        }
        if (f350453d == 0) {
            return f350450a;
        }
        if (!f350450a || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f350451b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f350452c)) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = f350454e;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar, weakReference != null ? (sd.k) weakReference.get() : null);
    }
}
