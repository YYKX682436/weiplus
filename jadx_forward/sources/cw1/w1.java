package cw1;

/* loaded from: classes7.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f304921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f304922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f304923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304924g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39 f304925h;

    public w1(long j17, boolean z17, java.util.Set set, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39 activityC13110x50e4df39) {
        this.f304921d = j17;
        this.f304922e = z17;
        this.f304923f = set;
        this.f304924g = str;
        this.f304925h = activityC13110x50e4df39;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List Sa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Sa();
        long j17 = this.f304921d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Sa);
        java.util.Iterator it = Sa.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            j18 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0) it.next()).f157801d;
        }
        long j19 = j17 - j18;
        if (j19 > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(Sa);
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0("", "", this.f304924g, j19, java.lang.Boolean.FALSE));
            Sa = arrayList;
        }
        if (Sa.size() > 1) {
            kz5.g0.t(Sa, new cw1.v1());
        }
        int size = Sa.size();
        boolean[] zArr = new boolean[size];
        for (int i17 = 0; i17 < size; i17++) {
            zArr[i17] = this.f304922e || this.f304923f.contains(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0) Sa.get(i17)).f157798a);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.u1(this.f304925h, Sa, zArr));
    }
}
