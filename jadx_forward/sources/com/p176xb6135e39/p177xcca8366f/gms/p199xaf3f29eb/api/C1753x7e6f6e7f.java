package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.PendingResults */
/* loaded from: classes13.dex */
public final class C1753x7e6f6e7f {
    private C1753x7e6f6e7f() {
    }

    /* renamed from: canceledPendingResult */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> m17822xf8001c7b() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2 c1793x54db91a2 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2(android.os.Looper.getMainLooper());
        c1793x54db91a2.mo17729xae7a2e7a();
        return c1793x54db91a2;
    }

    /* renamed from: immediateFailedResult */
    public static <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<R> m17824xeaf3710b(R r17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(r17, "Result must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(!r17.mo17538x2fe4f2e8().m17855x6e268779(), "Status code must not be SUCCESS");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zag zagVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zag(abstractC1748xd28d482c, r17);
        zagVar.m17883x209a1f1f(r17);
        return zagVar;
    }

    /* renamed from: immediatePendingResult */
    public static <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1751x8d3920f4<R> m17825xbf19b063(R r17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(r17, "Result must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zah zahVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zah(null);
        zahVar.m17883x209a1f1f(r17);
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1785x193a5d34(zahVar);
    }

    /* renamed from: canceledPendingResult */
    public static <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<R> m17823xf8001c7b(R r17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(r17, "Result must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(r17.mo17538x2fe4f2e8().m17849xfd0160f5() == 16, "Status code must be CommonStatusCodes.CANCELED");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zaf zafVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zaf(r17);
        zafVar.mo17729xae7a2e7a();
        return zafVar;
    }

    /* renamed from: immediatePendingResult */
    public static <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1751x8d3920f4<R> m17826xbf19b063(R r17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(r17, "Result must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zah zahVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zah(abstractC1748xd28d482c);
        zahVar.m17883x209a1f1f(r17);
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1785x193a5d34(zahVar);
    }

    /* renamed from: immediatePendingResult */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> m17827xbf19b063(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1763x9432bc12, "Result must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2 c1793x54db91a2 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2(android.os.Looper.getMainLooper());
        c1793x54db91a2.m17883x209a1f1f(c1763x9432bc12);
        return c1793x54db91a2;
    }

    /* renamed from: immediatePendingResult */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> m17828xbf19b063(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1763x9432bc12, "Result must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2 c1793x54db91a2 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2(abstractC1748xd28d482c);
        c1793x54db91a2.m17883x209a1f1f(c1763x9432bc12);
        return c1793x54db91a2;
    }
}
