package com.p314xaae8f345.mm.p956x88360526;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelscan/ScanCodeInfo;", "Landroid/os/Parcelable;", "j21/a", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.modelscan.ScanCodeInfo */
/* loaded from: classes4.dex */
public final /* data */ class C11131x285e79f8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8> f32567x681a0c0c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152806d;

    /* renamed from: e, reason: collision with root package name */
    public final int f152807e;

    static {
        new j21.a(null);
        f32567x681a0c0c = new j21.b();
    }

    public C11131x285e79f8(java.lang.String codeContent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codeContent, "codeContent");
        this.f152806d = codeContent;
        this.f152807e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48144xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8)) {
            return false;
        }
        com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 c11131x285e79f8 = (com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152806d, c11131x285e79f8.f152806d) && this.f152807e == c11131x285e79f8.f152807e;
    }

    /* renamed from: hashCode */
    public int m48145x8cdac1b() {
        return (this.f152806d.hashCode() * 31) + java.lang.Integer.hashCode(this.f152807e);
    }

    /* renamed from: toString */
    public java.lang.String m48146x9616526c() {
        return "ScanCodeInfo{codeContent: " + this.f152806d + ", sourceBizType: " + this.f152807e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f152806d);
        out.writeInt(this.f152807e);
    }
}
