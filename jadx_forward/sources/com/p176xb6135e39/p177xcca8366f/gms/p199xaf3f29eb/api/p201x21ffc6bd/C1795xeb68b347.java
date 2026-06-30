package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.TaskUtil */
/* loaded from: classes13.dex */
public class C1795xeb68b347 {
    /* renamed from: setResultOrApiException */
    public static void m17954x825e61d7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<java.lang.Void> c2440x4f4de6dc) {
        m17955x825e61d7(c1763x9432bc12, null, c2440x4f4de6dc);
    }

    @java.lang.Deprecated
    /* renamed from: toVoidTaskThatFailsOnFalse */
    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m17956x35cfdbea(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> abstractC2439x27a9a5) {
        return abstractC2439x27a9a5.mo19590xd315a60d(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1872x38eddc());
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: trySetResultOrApiException */
    public static <ResultT> boolean m17957xce3b59c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12, ResultT resultt, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<ResultT> c2440x4f4de6dc) {
        return c1763x9432bc12.m17855x6e268779() ? c2440x4f4de6dc.m19606xd9193fa4(resultt) : c2440x4f4de6dc.m19605xc5fa5768(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1898x7a082917.m18078x8098ec3c(c1763x9432bc12));
    }

    /* renamed from: setResultOrApiException */
    public static <ResultT> void m17955x825e61d7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12, ResultT resultt, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<ResultT> c2440x4f4de6dc) {
        if (c1763x9432bc12.m17855x6e268779()) {
            c2440x4f4de6dc.m19604x209a1f1f(resultt);
        } else {
            c2440x4f4de6dc.m19603xb411020d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1898x7a082917.m18078x8098ec3c(c1763x9432bc12));
        }
    }
}
