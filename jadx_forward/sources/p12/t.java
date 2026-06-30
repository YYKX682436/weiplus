package p12;

/* loaded from: classes10.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p12.w f432582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f432583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f432584f;

    public t(p12.w wVar, long j17, android.graphics.Bitmap bitmap) {
        this.f432582d = wVar;
        this.f432583e = j17;
        this.f432584f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a = this.f432582d.f432588h;
        if (c13261x57992c3a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimView");
            throw null;
        }
        java.util.List list = c13261x57992c3a.F;
        boolean z17 = list instanceof java.util.Collection;
        long j17 = this.f432583e;
        if (!z17 || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!(((o12.h0) it.next()).f423687a == j17)) {
                    break;
                }
            }
        }
        int size = c13261x57992c3a.F.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((o12.h0) c13261x57992c3a.F.get(i17)).f423687a == j17) {
                ((o12.h0) c13261x57992c3a.F.get(i17)).f423688b = this.f432584f;
                c13261x57992c3a.I.m8147xed6e4d18(i17);
            }
        }
    }
}
