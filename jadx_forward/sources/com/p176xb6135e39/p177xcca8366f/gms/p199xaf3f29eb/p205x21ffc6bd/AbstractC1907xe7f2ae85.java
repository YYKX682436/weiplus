package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.DowngradeableSafeParcel */
/* loaded from: classes13.dex */
public abstract class AbstractC1907xe7f2ae85 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {
    private static final java.lang.Object zza = new java.lang.Object();
    private boolean zzb = false;

    /* renamed from: canUnparcelSafely */
    public static boolean m18154x88da704c(java.lang.String str) {
        synchronized (zza) {
        }
        return true;
    }

    /* renamed from: getUnparcelClientVersion */
    public static java.lang.Integer m18155xcc06015() {
        synchronized (zza) {
        }
        return null;
    }

    /* renamed from: prepareForClientVersion */
    public abstract boolean m18156x8c5bcb6b(int i17);

    /* renamed from: setShouldDowngrade */
    public void m18157x2c7a5f40(boolean z17) {
        this.zzb = z17;
    }

    /* renamed from: shouldDowngrade */
    public boolean m18158x1141f402() {
        return this.zzb;
    }
}
