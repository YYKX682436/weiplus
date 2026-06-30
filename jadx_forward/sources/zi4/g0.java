package zi4;

/* loaded from: classes11.dex */
public final class g0 implements com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24918xf3c08e91 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f554747g;

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f554748a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24924xf55b6e2f f554749b;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f554751d;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f554750c = jz5.h.b(zi4.c0.f554729d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f554752e = jz5.h.b(zi4.x.f554805d);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f554753f = new java.util.ArrayList();

    static {
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedMap, "synchronizedMap(...)");
        f554747g = synchronizedMap;
    }

    public static final /* synthetic */ java.lang.String a(zi4.g0 g0Var) {
        g0Var.getClass();
        return "MicroMsg.FLTStatusActionHost";
    }

    public final void b(android.app.Activity activity) {
        this.f554748a = activity;
        if (activity != null) {
            f554747g.put(activity, this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f554753f;
        arrayList.addAll(list);
        ((java.util.ArrayList) list).clear();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f554751d;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new zi4.e0(arrayList, null), 2, null);
        }
    }

    public final void c(android.app.Activity activity) {
        if (activity != null) {
            java.util.Map map = f554747g;
            if (map.get(activity) == this) {
                map.remove(activity);
            }
        }
        this.f554748a = activity;
        ((java.util.ArrayList) this.f554753f).clear();
        synchronized (aj4.w.f86911a) {
            aj4.w.f86913c.clear();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24918xf3c08e91
    /* renamed from: fltStatusAction */
    public void mo92263x9156a856(com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24922x59782579 request, yz5.l callback) {
        byte[] m92310x8383f77b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fltStatusAction: cmdId=");
        sb6.append(request.m92277x7443ca3f());
        sb6.append(", dataLen=");
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24928xe4a82335 m92278x74fd7032 = request.m92278x74fd7032();
        sb6.append((m92278x74fd7032 == null || (m92310x8383f77b = m92278x74fd7032.m92310x8383f77b()) == null) ? 0 : m92310x8383f77b.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusActionHost", sb6.toString());
        zi4.d dVar = (zi4.d) ((jz5.n) this.f554752e).mo141623x754a37bb();
        java.lang.String cmdId = request.m92277x7443ca3f();
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        zi4.c cVar = (zi4.c) ((java.util.LinkedHashMap) dVar.f554731a).get(cmdId);
        jz5.f0 f0Var = null;
        if (cVar != null) {
            boolean z17 = cVar.f554728b.f554722a;
            zi4.a0 a0Var = new zi4.a0(cVar, request, this, callback);
            if (z17) {
                if (this.f554748a != null) {
                    a0Var.mo152xb9724478();
                } else {
                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f554751d;
                    if (c20976x6ba6452a != null) {
                        v65.i.c(c20976x6ba6452a, null, new zi4.z(this, a0Var, null), 1, null);
                    }
                }
            } else {
                a0Var.mo152xb9724478();
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FLTStatusActionHost", "fltStatusAction not found action handle, cmdId=" + request.m92277x7443ca3f());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("not found action handle " + request.m92277x7443ca3f())))));
        }
    }
}
