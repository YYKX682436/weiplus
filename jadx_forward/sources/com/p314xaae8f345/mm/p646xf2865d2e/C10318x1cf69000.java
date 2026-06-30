package com.p314xaae8f345.mm.p646xf2865d2e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/CheckCanCreatePhotoAccountResponse;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse */
/* loaded from: classes8.dex */
public final /* data */ class C10318x1cf69000 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000> f27775x681a0c0c = new rm.b();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145144d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f145145e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f145146f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f145147g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f145148h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f145149i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f145150m;

    public C10318x1cf69000(boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String registerWording, java.lang.String switchWording, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(registerWording, "registerWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchWording, "switchWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        this.f145144d = z17;
        this.f145145e = z18;
        this.f145146f = z19;
        this.f145147g = z27;
        this.f145148h = registerWording;
        this.f145149i = switchWording;
        this.f145150m = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m43453xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000)) {
            return false;
        }
        com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000 c10318x1cf69000 = (com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000) obj;
        return this.f145144d == c10318x1cf69000.f145144d && this.f145145e == c10318x1cf69000.f145145e && this.f145146f == c10318x1cf69000.f145146f && this.f145147g == c10318x1cf69000.f145147g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f145148h, c10318x1cf69000.f145148h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f145149i, c10318x1cf69000.f145149i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f145150m, c10318x1cf69000.f145150m);
    }

    /* renamed from: hashCode */
    public int m43454x8cdac1b() {
        return (((((((((((java.lang.Boolean.hashCode(this.f145144d) * 31) + java.lang.Boolean.hashCode(this.f145145e)) * 31) + java.lang.Boolean.hashCode(this.f145146f)) * 31) + java.lang.Boolean.hashCode(this.f145147g)) * 31) + this.f145148h.hashCode()) * 31) + this.f145149i.hashCode()) * 31) + this.f145150m.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m43455x9616526c() {
        return "CheckCanCreatePhotoAccountResponse(success=" + this.f145144d + ", canCreatePhotoAcct=" + this.f145145e + ", canCreateBizAcct=" + this.f145146f + ", sceneEnabled=" + this.f145147g + ", registerWording=" + this.f145148h + ", switchWording=" + this.f145149i + ", errorMsg=" + this.f145150m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f145144d ? 1 : 0);
        out.writeInt(this.f145145e ? 1 : 0);
        out.writeInt(this.f145146f ? 1 : 0);
        out.writeInt(this.f145147g ? 1 : 0);
        out.writeString(this.f145148h);
        out.writeString(this.f145149i);
        out.writeString(this.f145150m);
    }
}
