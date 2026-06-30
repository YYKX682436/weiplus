package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad f264358a;

    /* renamed from: b, reason: collision with root package name */
    public int f264359b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f264360c = new java.util.ArrayList();

    public void a() {
        java.util.ArrayList arrayList = this.f264360c;
        try {
            if (!arrayList.isEmpty()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putStringArrayList("reportAdH5Load", new java.util.ArrayList<>(arrayList));
                bundle.putInt("errCode", this.f264359b);
                bundle.putParcelable("snsAdClick", this.f264358a);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b5.f264328d.getClass(), null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebviewReporter", e17, "", new java.lang.Object[0]);
        }
        this.f264358a = null;
        arrayList.clear();
    }
}
