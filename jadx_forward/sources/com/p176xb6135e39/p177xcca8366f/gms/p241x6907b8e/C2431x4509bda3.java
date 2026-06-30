package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* renamed from: com.google.android.gms.tasks.NativeOnCompleteListener */
/* loaded from: classes13.dex */
public class C2431x4509bda3 implements com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c<java.lang.Object> {
    private final long zza;

    public C2431x4509bda3(long j17) {
        this.zza = j17;
    }

    /* renamed from: createAndAddCallback */
    public static void m19572xe71f41cb(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Object> abstractC2439x27a9a5, long j17) {
        abstractC2439x27a9a5.mo19582xef59738d(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2431x4509bda3(j17));
    }

    /* renamed from: nativeOnComplete */
    public native void m19573x675b8faf(long j17, java.lang.Object obj, boolean z17, boolean z18, java.lang.String str);

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c
    /* renamed from: onComplete */
    public void mo17960x815f5438(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Object> abstractC2439x27a9a5) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Exception mo19594x57bd4199;
        if (abstractC2439x27a9a5.mo19599x55b0a764()) {
            obj = abstractC2439x27a9a5.mo19595x2d64eb13();
            str = null;
        } else if (abstractC2439x27a9a5.mo19597xc9602be3() || (mo19594x57bd4199 = abstractC2439x27a9a5.mo19594x57bd4199()) == null) {
            obj = null;
            str = null;
        } else {
            str = mo19594x57bd4199.getMessage();
            obj = null;
        }
        m19573x675b8faf(this.zza, obj, abstractC2439x27a9a5.mo19599x55b0a764(), abstractC2439x27a9a5.mo19597xc9602be3(), str);
    }
}
