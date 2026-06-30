package com.tencent.mm.plugin.appbrand.jsapi.share;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.ipcinvoker.i<android.os.Bundle, android.os.Bundle> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        try {
            ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Ni(bundle.getInt("action"), bundle);
            if (rVar == null) {
                return;
            }
        } catch (java.lang.Exception unused) {
            if (rVar == null) {
                return;
            }
        } catch (java.lang.Throwable th6) {
            if (rVar != null) {
                try {
                    rVar.a(android.os.Bundle.EMPTY);
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
        try {
            rVar.a(android.os.Bundle.EMPTY);
        } catch (java.lang.Exception unused3) {
        }
    }
}
