package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* renamed from: com.google.android.gms.iid.zzai */
/* loaded from: classes13.dex */
abstract class AbstractC2059x394b68 {

    /* renamed from: zzcy */
    private static com.p176xb6135e39.p177xcca8366f.gms.iid.AbstractC2059x394b68 f6123x394bb6;

    public static synchronized com.p176xb6135e39.p177xcca8366f.gms.iid.AbstractC2059x394b68 zzw() {
        com.p176xb6135e39.p177xcca8366f.gms.iid.AbstractC2059x394b68 abstractC2059x394b68;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.iid.AbstractC2059x394b68.class) {
            if (f6123x394bb6 == null) {
                f6123x394bb6 = new com.p176xb6135e39.p177xcca8366f.gms.iid.C2053x394b62();
            }
            abstractC2059x394b68 = f6123x394bb6;
        }
        return abstractC2059x394b68;
    }

    public abstract com.p176xb6135e39.p177xcca8366f.gms.iid.InterfaceC2060x394b69<java.lang.Boolean> zzd(java.lang.String str, boolean z17);
}
