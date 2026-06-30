package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi$RemoteCgiTask */
/* loaded from: classes8.dex */
public final class C19547xb6f6a078 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.C19547xb6f6a078> f38797x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.j();

    /* renamed from: f, reason: collision with root package name */
    public int f270017f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f270018g;

    /* renamed from: h, reason: collision with root package name */
    public int f270019h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f270020i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f270021m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f270022n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.i f270023o;

    public C19547xb6f6a078() {
    }

    public void B(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f270018g = i17;
        this.f270019h = i18;
        this.f270020i = str;
        this.f270021m = oVar;
        this.f270017f = 2;
        c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        B(i17, i18, str, oVar);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        int readInt = parcel.readInt();
        this.f270017f = readInt;
        if (readInt == 1) {
            this.f270022n = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.k.b(parcel);
        } else {
            if (readInt != 2) {
                return;
            }
            this.f270018g = parcel.readInt();
            this.f270019h = parcel.readInt();
            this.f270020i = parcel.readString();
            this.f270021m = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.k.b(parcel);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f270017f);
        int i18 = this.f270017f;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.k.a(this.f270022n, parcel);
        } else {
            if (i18 != 2) {
                return;
            }
            parcel.writeInt(this.f270018g);
            parcel.writeInt(this.f270019h);
            parcel.writeString(this.f270020i);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.k.a(this.f270021m, parcel);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270036c).remove(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.i iVar = this.f270023o;
        if (iVar != null) {
            iVar.a(this.f270018g, this.f270019h, this.f270020i, this.f270021m);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p944x882e457a.z2.d(this.f270022n, this, true);
    }

    public C19547xb6f6a078(android.os.Parcel parcel) {
        v(parcel);
    }
}
