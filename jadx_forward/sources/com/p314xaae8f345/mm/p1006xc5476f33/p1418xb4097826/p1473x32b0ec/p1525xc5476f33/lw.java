package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class lw implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f194973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f194974b;

    public lw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar, int i17) {
        this.f194973a = owVar;
        this.f194974b = i17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f194973a;
            java.util.ArrayList arrayList = owVar.f195332y;
            int i17 = this.f194974b;
            synchronized (arrayList) {
                int i18 = no0.i.f420260a;
                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i18, i18, true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
                owVar.f195332y.add(createScaledBitmap);
                owVar.f195334z.add(java.lang.Integer.valueOf(i17));
            }
        }
    }
}
