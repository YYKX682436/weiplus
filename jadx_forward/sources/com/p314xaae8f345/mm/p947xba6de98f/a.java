package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public final class a implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.c f152403a;

    public a(com.p314xaae8f345.mm.p947xba6de98f.c cVar) {
        this.f152403a = cVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var;
        java.lang.ref.WeakReference weakReference = this.f152403a.f152427h.f392703d;
        if (weakReference == null || (v2Var = (com.p314xaae8f345.mm.p947xba6de98f.v2) weakReference.get()) == null) {
            return;
        }
        v2Var.a(n1Var);
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var;
        com.p314xaae8f345.mm.p947xba6de98f.c cVar = this.f152403a;
        java.lang.ref.WeakReference weakReference = cVar.f152427h.f392703d;
        if (weakReference != null && (v2Var = (com.p314xaae8f345.mm.p947xba6de98f.v2) weakReference.get()) != null) {
            v2Var.b(n1Var);
        }
        if (n1Var != null) {
            kq.a aVar = cVar.f152427h;
            aVar.f392706g = n1Var;
            if (n1Var.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152610f) {
                java.lang.Integer h17 = cVar.h();
                if (h17 != null) {
                    h17.intValue();
                    sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                    dn.m mVar = n1Var.f152639d;
                    java.lang.String str = mVar != null ? mVar.f69601xaca5bdda : null;
                    if (str == null) {
                        str = "";
                    }
                    ((rx.f) b0Var).Ai(str);
                    h17.intValue();
                    return;
                }
                if (cVar.f524889e == w65.q.f524901f) {
                    dn.g gVar = n1Var.f152640e;
                    float f17 = gVar != null ? (float) gVar.f69496x83ec3dd : 0.0f;
                    if (gVar != null) {
                        java.lang.Long valueOf = java.lang.Long.valueOf(gVar.f69500x8ab84c59);
                        java.lang.Long l17 = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1)) != 0 ? valueOf : null;
                        if (l17 != null) {
                            float longValue = (float) l17.longValue();
                            if (f17 < longValue) {
                                float f18 = (f17 / longValue) * 100.0f;
                                if (aVar.f392704e < f18) {
                                    aVar.f392704e = f18;
                                }
                                cVar.f1();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void c(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var;
        java.lang.ref.WeakReference weakReference = this.f152403a.f152427h.f392703d;
        if (weakReference == null || (v2Var = (com.p314xaae8f345.mm.p947xba6de98f.v2) weakReference.get()) == null) {
            return;
        }
        v2Var.c(n1Var);
    }
}
