package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b f268517a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f268518b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f268519c = new java.util.ArrayList();

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList arrayList = f268519c;
        synchronized (arrayList) {
            arrayList.size();
            arrayList.add(listener);
        }
    }

    public void b(android.os.Bundle data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = f268518b;
        synchronized (arrayList) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0) it.next()).a(data);
            }
        }
    }

    public void c(int i17, android.os.Bundle bundle) {
        java.util.ArrayList arrayList = f268519c;
        synchronized (arrayList) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0) it.next()).a(i17, bundle);
            }
        }
    }

    public void d(int i17, com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        byte[] bArr = null;
        if (i17 != 2 || !(event instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5793x280baadc)) {
            if (i17 == 1 && (event instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5792x2373e800)) {
                c(i17, null);
                return;
            }
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        am.om omVar = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5793x280baadc) event).f136102g;
        bundle.putString("status", omVar.f89091a);
        bundle.putFloat("playbackTime", omVar.f89092b);
        bundle.putFloat("playbackRate", omVar.f89094d);
        bundle.putBoolean("isPause", omVar.f89093c);
        omVar.getClass();
        bundle.putBoolean("showBarrage", false);
        try {
            r45.n23 n23Var = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5793x280baadc) event).f136102g.f89095e;
            if (n23Var != null) {
                bArr = n23Var.mo14344x5f01b1f6();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FinderFeedInfoUpdateEventManager", e17, "FinderVideoInfoForMp.toByteArray exception", new java.lang.Object[0]);
        }
        if (bArr != null) {
            bundle.putByteArray("videoInfoForMp", bArr);
        }
        c(i17, bundle);
    }
}
