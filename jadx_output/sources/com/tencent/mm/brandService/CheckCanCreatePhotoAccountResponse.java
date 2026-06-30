package com.tencent.mm.brandService;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/CheckCanCreatePhotoAccountResponse;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class CheckCanCreatePhotoAccountResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse> CREATOR = new rm.b();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63611d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63612e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63613f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63614g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f63615h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f63616i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f63617m;

    public CheckCanCreatePhotoAccountResponse(boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String registerWording, java.lang.String switchWording, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(registerWording, "registerWording");
        kotlin.jvm.internal.o.g(switchWording, "switchWording");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        this.f63611d = z17;
        this.f63612e = z18;
        this.f63613f = z19;
        this.f63614g = z27;
        this.f63615h = registerWording;
        this.f63616i = switchWording;
        this.f63617m = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse)) {
            return false;
        }
        com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse checkCanCreatePhotoAccountResponse = (com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse) obj;
        return this.f63611d == checkCanCreatePhotoAccountResponse.f63611d && this.f63612e == checkCanCreatePhotoAccountResponse.f63612e && this.f63613f == checkCanCreatePhotoAccountResponse.f63613f && this.f63614g == checkCanCreatePhotoAccountResponse.f63614g && kotlin.jvm.internal.o.b(this.f63615h, checkCanCreatePhotoAccountResponse.f63615h) && kotlin.jvm.internal.o.b(this.f63616i, checkCanCreatePhotoAccountResponse.f63616i) && kotlin.jvm.internal.o.b(this.f63617m, checkCanCreatePhotoAccountResponse.f63617m);
    }

    public int hashCode() {
        return (((((((((((java.lang.Boolean.hashCode(this.f63611d) * 31) + java.lang.Boolean.hashCode(this.f63612e)) * 31) + java.lang.Boolean.hashCode(this.f63613f)) * 31) + java.lang.Boolean.hashCode(this.f63614g)) * 31) + this.f63615h.hashCode()) * 31) + this.f63616i.hashCode()) * 31) + this.f63617m.hashCode();
    }

    public java.lang.String toString() {
        return "CheckCanCreatePhotoAccountResponse(success=" + this.f63611d + ", canCreatePhotoAcct=" + this.f63612e + ", canCreateBizAcct=" + this.f63613f + ", sceneEnabled=" + this.f63614g + ", registerWording=" + this.f63615h + ", switchWording=" + this.f63616i + ", errorMsg=" + this.f63617m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f63611d ? 1 : 0);
        out.writeInt(this.f63612e ? 1 : 0);
        out.writeInt(this.f63613f ? 1 : 0);
        out.writeInt(this.f63614g ? 1 : 0);
        out.writeString(this.f63615h);
        out.writeString(this.f63616i);
        out.writeString(this.f63617m);
    }
}
