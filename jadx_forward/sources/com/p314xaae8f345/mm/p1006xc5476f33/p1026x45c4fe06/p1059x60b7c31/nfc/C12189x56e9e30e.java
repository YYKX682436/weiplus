package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic$SendHCEEventToMMTask */
/* loaded from: classes7.dex */
public class C12189x56e9e30e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.C12189x56e9e30e> f34551x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.c();

    /* renamed from: f, reason: collision with root package name */
    public int f163922f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f163923g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Bundle f163924h;

    public /* synthetic */ C12189x56e9e30e(java.lang.String str, int i17, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.b bVar) {
        this(str, i17, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f163922f = parcel.readInt();
        this.f163923g = parcel.readString();
        this.f163924h = parcel.readBundle();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f163922f);
        parcel.writeString(this.f163923g);
        parcel.writeBundle(this.f163924h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEEventLogic", "HCEEventLogic SendHCEEventToMMTask runInMainProcess");
        cd1.o.f122174n.c(this.f163922f, this.f163923g, this.f163924h);
        c();
    }

    private C12189x56e9e30e(java.lang.String str, int i17, android.os.Bundle bundle) {
        this.f163922f = i17;
        this.f163923g = str;
        this.f163924h = bundle;
    }

    public C12189x56e9e30e(android.os.Parcel parcel) {
        v(parcel);
    }
}
