package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p824x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/live/core/core/model/UserVolumeInfo;", "Landroid/os/Parcelable;", "CREATOR", "kn0/s", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.core.model.UserVolumeInfo */
/* loaded from: classes3.dex */
public final class C10829x94b03533 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final kn0.s f29643x681a0c0c = new kn0.s(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150090d;

    /* renamed from: e, reason: collision with root package name */
    public final int f150091e;

    /* renamed from: f, reason: collision with root package name */
    public final int f150092f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10829x94b03533(android.os.Parcel parcel) {
        this("", 0, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f150090d = readString != null ? readString : "";
        this.f150091e = parcel.readInt();
        this.f150092f = parcel.readInt();
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getF150090d() {
        return this.f150090d;
    }

    /* renamed from: b, reason: from getter */
    public final int getF150091e() {
        return this.f150091e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f150090d);
        parcel.writeInt(this.f150091e);
        parcel.writeInt(this.f150092f);
    }

    public C10829x94b03533(java.lang.String userId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        this.f150090d = userId;
        this.f150091e = i17;
        this.f150092f = i18;
    }
}
