package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class a implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.c f70870a;

    public a(com.tencent.mm.modelcdntran.c cVar) {
        this.f70870a = cVar;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void a(com.tencent.mm.modelcdntran.n1 n1Var) {
        com.tencent.mm.modelcdntran.v2 v2Var;
        java.lang.ref.WeakReference weakReference = this.f70870a.f70894h.f311170d;
        if (weakReference == null || (v2Var = (com.tencent.mm.modelcdntran.v2) weakReference.get()) == null) {
            return;
        }
        v2Var.a(n1Var);
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        com.tencent.mm.modelcdntran.v2 v2Var;
        com.tencent.mm.modelcdntran.c cVar = this.f70870a;
        java.lang.ref.WeakReference weakReference = cVar.f70894h.f311170d;
        if (weakReference != null && (v2Var = (com.tencent.mm.modelcdntran.v2) weakReference.get()) != null) {
            v2Var.b(n1Var);
        }
        if (n1Var != null) {
            kq.a aVar = cVar.f70894h;
            aVar.f311173g = n1Var;
            if (n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71077f) {
                java.lang.Integer h17 = cVar.h();
                if (h17 != null) {
                    h17.intValue();
                    sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                    dn.m mVar = n1Var.f71106d;
                    java.lang.String str = mVar != null ? mVar.field_mediaId : null;
                    if (str == null) {
                        str = "";
                    }
                    ((rx.f) b0Var).Ai(str);
                    h17.intValue();
                    return;
                }
                if (cVar.f443356e == w65.q.f443368f) {
                    dn.g gVar = n1Var.f71107e;
                    float f17 = gVar != null ? (float) gVar.field_finishedLength : 0.0f;
                    if (gVar != null) {
                        java.lang.Long valueOf = java.lang.Long.valueOf(gVar.field_toltalLength);
                        java.lang.Long l17 = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1)) != 0 ? valueOf : null;
                        if (l17 != null) {
                            float longValue = (float) l17.longValue();
                            if (f17 < longValue) {
                                float f18 = (f17 / longValue) * 100.0f;
                                if (aVar.f311171e < f18) {
                                    aVar.f311171e = f18;
                                }
                                cVar.f1();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void c(com.tencent.mm.modelcdntran.n1 n1Var) {
        com.tencent.mm.modelcdntran.v2 v2Var;
        java.lang.ref.WeakReference weakReference = this.f70870a.f70894h.f311170d;
        if (weakReference == null || (v2Var = (com.tencent.mm.modelcdntran.v2) weakReference.get()) == null) {
            return;
        }
        v2Var.c(n1Var);
    }
}
