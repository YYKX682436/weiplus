package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.PendingResultUtil */
/* loaded from: classes13.dex */
public class C1922x695faa96 {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zas zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zao();

    /* renamed from: com.google.android.gms.common.internal.PendingResultUtil$ResultConverter */
    /* loaded from: classes13.dex */
    public interface ResultConverter<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, T> {
        /* renamed from: convert */
        T mo17330x38b81db3(R r17);
    }

    /* renamed from: toResponseTask */
    public static <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1757xef917861<R>> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<T> m18194x22e33781(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<R> abstractC1752x4624a074, T t17) {
        return m18195xcc3602a0(abstractC1752x4624a074, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaq(t17));
    }

    /* renamed from: toTask */
    public static <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, T> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<T> m18195xcc3602a0(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<R> abstractC1752x4624a074, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.ResultConverter<R, T> resultConverter) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zas zasVar = zaa;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
        abstractC1752x4624a074.mo17814xbaafdc7(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zap(abstractC1752x4624a074, c2440x4f4de6dc, resultConverter, zasVar));
        return c2440x4f4de6dc.m19602xfb859dfb();
    }

    /* renamed from: toVoidTask */
    public static <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m18196x8941d8d4(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<R> abstractC1752x4624a074) {
        return m18195xcc3602a0(abstractC1752x4624a074, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zar());
    }
}
