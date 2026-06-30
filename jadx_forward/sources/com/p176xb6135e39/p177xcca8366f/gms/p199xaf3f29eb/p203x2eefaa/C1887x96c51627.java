package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.DataBufferUtils */
/* loaded from: classes13.dex */
public final class C1887x96c51627 {

    /* renamed from: KEY_NEXT_PAGE_TOKEN */
    public static final java.lang.String f5918xb6f6bef5 = "next_page_token";

    /* renamed from: KEY_PREV_PAGE_TOKEN */
    public static final java.lang.String f5919x3e9a9fb5 = "prev_page_token";

    private C1887x96c51627() {
    }

    /* renamed from: freezeAndClose */
    public static <T, E extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8<T>> java.util.ArrayList<T> m18016xafa91a18(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa<E> interfaceC1881xa5f564aa) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(interfaceC1881xa5f564aa.mo17736x7444f759());
        try {
            java.util.Iterator<E> it = interfaceC1881xa5f564aa.iterator();
            while (it.hasNext()) {
                b0Var.add(it.next().mo18042xb4843a97());
            }
            return b0Var;
        } finally {
            interfaceC1881xa5f564aa.close();
        }
    }

    /* renamed from: hasData */
    public static boolean m18017x29831964(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa<?> interfaceC1881xa5f564aa) {
        return interfaceC1881xa5f564aa != null && interfaceC1881xa5f564aa.mo17736x7444f759() > 0;
    }

    /* renamed from: hasNextPage */
    public static boolean m18018x396cdc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa<?> interfaceC1881xa5f564aa) {
        android.os.Bundle mo17737x6107b8a5 = interfaceC1881xa5f564aa.mo17737x6107b8a5();
        return (mo17737x6107b8a5 == null || mo17737x6107b8a5.getString(f5918xb6f6bef5) == null) ? false : true;
    }

    /* renamed from: hasPrevPage */
    public static boolean m18019x5f5ce41c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa<?> interfaceC1881xa5f564aa) {
        android.os.Bundle mo17737x6107b8a5 = interfaceC1881xa5f564aa.mo17737x6107b8a5();
        return (mo17737x6107b8a5 == null || mo17737x6107b8a5.getString(f5919x3e9a9fb5) == null) ? false : true;
    }
}
