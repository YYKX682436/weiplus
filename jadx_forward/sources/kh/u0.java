package kh;

/* loaded from: classes12.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f389457a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f389458b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f389459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.k1 f389460d;

    public u0(kh.k1 k1Var) {
        this.f389460d = k1Var;
        jz5.i iVar = jz5.i.f384362d;
        jz5.h.a(iVar, new kh.q0(this));
        this.f389459c = jz5.h.a(iVar, new kh.t0(k1Var));
    }

    public final void a(java.lang.String str, android.os.Looper looper) {
        if (android.text.TextUtils.isEmpty(str) || looper == null) {
            return;
        }
        synchronized (this.f389457a) {
            ((java.util.ArrayList) this.f389457a).remove(str);
            gj.k kVar = (gj.k) ((java.util.HashMap) this.f389458b).remove(looper);
            if (kVar != null) {
                kVar.b();
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) gj.k.f353886p;
            gj.k kVar2 = (gj.k) concurrentHashMap.get(looper);
            if (kVar2 == null) {
                kVar2 = new gj.k(looper);
                concurrentHashMap.put(looper, kVar2);
            }
            kh.s0 s0Var = (kh.s0) this.f389459c.mo141623x754a37bb();
            synchronized (kVar2.f353894i) {
                ((java.util.HashMap) kVar2.f353894i).put(s0Var, new gj.g(s0Var));
            }
            ((java.util.ArrayList) this.f389457a).add(str);
            ((java.util.HashMap) this.f389458b).put(looper, kVar2);
        }
    }
}
