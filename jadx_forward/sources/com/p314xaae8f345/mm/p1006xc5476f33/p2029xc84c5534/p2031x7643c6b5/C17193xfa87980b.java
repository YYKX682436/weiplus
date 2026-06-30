package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.report.service.BroadCastData */
/* loaded from: classes12.dex */
public class C17193xfa87980b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b> f37896x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f239650d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f239651e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f239652f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f239653g;

    public C17193xfa87980b() {
        this.f239650d = new java.util.ArrayList();
        this.f239651e = new java.util.ArrayList();
        this.f239652f = new java.util.ArrayList();
        long[] jArr = new long[1];
        this.f239653g = jArr;
        synchronized (jArr) {
            jArr[0] = 12;
        }
    }

    public final void a(int i17) {
        synchronized (this.f239653g) {
            long[] jArr = this.f239653g;
            jArr[0] = jArr[0] + i17;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f239650d);
        parcel.writeTypedList(this.f239651e);
        parcel.writeTypedList(this.f239652f);
    }

    public C17193xfa87980b(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b) {
        long j17;
        this.f239650d = new java.util.ArrayList();
        this.f239651e = new java.util.ArrayList();
        this.f239652f = new java.util.ArrayList();
        long[] jArr = new long[1];
        this.f239653g = jArr;
        if (c17193xfa87980b == null) {
            return;
        }
        this.f239650d = new java.util.ArrayList(c17193xfa87980b.f239650d);
        this.f239651e = new java.util.ArrayList(c17193xfa87980b.f239651e);
        this.f239652f = new java.util.ArrayList(c17193xfa87980b.f239652f);
        synchronized (c17193xfa87980b.f239653g) {
            j17 = c17193xfa87980b.f239653g[0];
        }
        jArr[0] = j17;
    }

    public C17193xfa87980b(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f239650d = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f239651e = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.f239652f = arrayList3;
        this.f239653g = new long[1];
        parcel.readTypedList(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717.f37898x681a0c0c);
        parcel.readTypedList(arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17202xbfa55fb.f37903x681a0c0c);
        parcel.readTypedList(arrayList3, com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17194xb20112dd.f37897x681a0c0c);
    }
}
