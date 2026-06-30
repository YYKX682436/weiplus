package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask */
/* loaded from: classes.dex */
public class C12018xa9151e66 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.C12018xa9151e66> f33916x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.d();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161418f;

    /* renamed from: g, reason: collision with root package name */
    public final int f161419g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.e f161420h;

    /* renamed from: i, reason: collision with root package name */
    public int f161421i;

    public C12018xa9151e66(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.e eVar) {
        this.f161418f = null;
        this.f161419g = -1;
        this.f161421i = 0;
        this.f161418f = lVar;
        this.f161419g = i17;
        this.f161420h = eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f161421i = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f161421i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("supportMode", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.a.b(this.f161421i));
        this.f161418f.a(this.f161419g, this.f161420h.p("ok", hashMap));
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5608x14193b64 c5608x14193b64 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5608x14193b64();
        c5608x14193b64.e();
        int i17 = c5608x14193b64.f135934g.f87885a;
        this.f161421i = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIsSupportSoterTask", "hy: supportMode: %d", java.lang.Integer.valueOf(i17));
        c();
    }

    public C12018xa9151e66(android.os.Parcel parcel) {
        this.f161418f = null;
        this.f161419g = -1;
        this.f161421i = 0;
        v(parcel);
    }
}
