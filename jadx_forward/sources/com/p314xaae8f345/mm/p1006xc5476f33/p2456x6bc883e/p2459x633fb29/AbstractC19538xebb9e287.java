package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* renamed from: com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask */
/* loaded from: classes8.dex */
public abstract class AbstractC19538xebb9e287 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: f, reason: collision with root package name */
    public boolean f269866f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f269867g = false;

    public abstract void B(android.os.Parcel parcel);

    public abstract void C(android.os.Parcel parcel, int i17);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public final void v(android.os.Parcel parcel) {
        this.f269866f = parcel.readByte() != 0;
        this.f269867g = parcel.readByte() != 0;
        B(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f269866f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f269867g ? (byte) 1 : (byte) 0);
        C(parcel, i17);
    }
}
