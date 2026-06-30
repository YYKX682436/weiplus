package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction */
/* loaded from: classes7.dex */
public abstract class AbstractC12323x626e3745 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165873d;

    /* renamed from: e, reason: collision with root package name */
    public final int f165874e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p[] f165872f = {com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.HEADLESS, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.PRE_RENDER};

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a0 f35048x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a0();

    public AbstractC12323x626e3745(android.os.Parcel parcel) {
        this.f165873d = parcel.readString();
        this.f165874e = parcel.readInt();
    }

    public abstract void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(getClass().getName());
        parcel.writeString(this.f165873d);
        parcel.writeInt(this.f165874e);
    }

    public AbstractC12323x626e3745(java.lang.String str, int i17) {
        this.f165873d = str;
        this.f165874e = i17;
    }
}
