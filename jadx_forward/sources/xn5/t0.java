package xn5;

@j95.b
/* loaded from: classes13.dex */
public final class t0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f537255d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f537256e = new xn5.r0(this);

    public static final void wi(xn5.t0 t0Var) {
        t0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C.X2CFeatureService", "submitPreloadData");
        java.util.HashMap hashMap = xn5.q0.f537244j;
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            r45.hg7 hg7Var = new r45.hg7();
            hg7Var.f457673d = ((xn5.h0) entry.getValue()).f537210a.f457673d;
            hg7Var.f457674e.addAll(((xn5.h0) entry.getValue()).f537210a.f457674e);
            arrayList.add(hg7Var);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r45.hg7 hg7Var2 = (r45.hg7) it.next();
            xn5.z b17 = xn5.q0.f537235a.b().b();
            if (b17 != null) {
                b17.b(hg7Var2);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f537255d = ((ku5.t0) ku5.t0.f394148d).d(new xn5.s0(this), 300000L, 600000L);
        this.f537256e.m43071x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        wu5.c cVar = this.f537255d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f537256e.m43072x2efc64();
    }
}
