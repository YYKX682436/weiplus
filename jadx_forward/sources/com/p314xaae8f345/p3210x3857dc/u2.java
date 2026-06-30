package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class u2 extends com.p314xaae8f345.p3210x3857dc.i0 {
    @Override // com.p314xaae8f345.p3210x3857dc.i0
    public void a(com.p314xaae8f345.p3210x3857dc.e0 e0Var, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(e0Var.f301791a);
        java.lang.String[][] strArr = (java.lang.String[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, unmodifiableList.size(), 2);
        for (int i17 = 0; i17 < unmodifiableList.size(); i17++) {
            strArr[i17][0] = ((com.p314xaae8f345.p3210x3857dc.d0) unmodifiableList.get(i17)).f301770a;
            strArr[i17][1] = ((com.p314xaae8f345.p3210x3857dc.d0) unmodifiableList.get(i17)).f301771b;
        }
        java.lang.String[] strArr2 = (java.lang.String[]) java.util.Collections.unmodifiableList(e0Var.f301792b).toArray(new java.lang.String[0]);
        boolean a17 = com.p314xaae8f345.p3210x3857dc.k1.a("PROXY_OVERRIDE");
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
        if (a17) {
            if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q) {
                by5.s0.e(1749L, 84L, 1L);
                throw new java.lang.IllegalStateException("WebViewFeature.PROXY_OVERRIDE Supported, ReverseBypass Disabled, XWebCore is not inited!");
            }
            tx5.h b17 = tx5.j.b(f1Var);
            if (b17 != null) {
                b17.mo120205xb04520a3(80026, new java.lang.Object[]{strArr, strArr2, runnable, executor});
                by5.s0.e(1749L, 83L, 1L);
                return;
            }
            return;
        }
        if (!com.p314xaae8f345.p3210x3857dc.k1.a("PROXY_OVERRIDE") || !com.p314xaae8f345.p3210x3857dc.k1.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74968xc787dee7)) {
            by5.s0.e(1749L, 84L, 1L);
            throw new java.lang.IllegalStateException("WebViewFeature.PROXY_OVERRIDE Unsupported");
        }
        if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q) {
            by5.s0.e(1749L, 87L, 1L);
            throw new java.lang.IllegalStateException("WebViewFeature.PROXY_OVERRIDE Supported, ReverseBypass Enabled, WebViewFeature.PROXY_OVERRIDE_REVERSE_BYPASS Supported, XWebCore is not inited!");
        }
        tx5.h b18 = tx5.j.b(f1Var);
        if (b18 != null) {
            b18.mo120205xb04520a3(80028, new java.lang.Object[]{strArr, strArr2, runnable, executor, java.lang.Boolean.FALSE});
            by5.s0.e(1749L, 86L, 1L);
        }
    }
}
