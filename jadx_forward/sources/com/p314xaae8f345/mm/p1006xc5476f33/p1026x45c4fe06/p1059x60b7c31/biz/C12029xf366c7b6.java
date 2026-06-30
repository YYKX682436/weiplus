package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput */
/* loaded from: classes7.dex */
public final /* data */ class C12029xf366c7b6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12029xf366c7b6> f33936x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.y();

    /* renamed from: d, reason: collision with root package name */
    public final int f161460d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161461e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f161462f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f161463g;

    /* renamed from: h, reason: collision with root package name */
    public final int f161464h;

    public C12029xf366c7b6(int i17, int i18, java.lang.String draftPrompt, java.lang.String draftPicId, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftPrompt, "draftPrompt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftPicId, "draftPicId");
        this.f161460d = i17;
        this.f161461e = i18;
        this.f161462f = draftPrompt;
        this.f161463g = draftPicId;
        this.f161464h = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50685xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12029xf366c7b6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12029xf366c7b6 c12029xf366c7b6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12029xf366c7b6) obj;
        return this.f161460d == c12029xf366c7b6.f161460d && this.f161461e == c12029xf366c7b6.f161461e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161462f, c12029xf366c7b6.f161462f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161463g, c12029xf366c7b6.f161463g) && this.f161464h == c12029xf366c7b6.f161464h;
    }

    /* renamed from: hashCode */
    public int m50686x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f161460d) * 31) + java.lang.Integer.hashCode(this.f161461e)) * 31) + this.f161462f.hashCode()) * 31) + this.f161463g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f161464h);
    }

    /* renamed from: toString */
    public java.lang.String m50687x9616526c() {
        return "IPCEditTextCoverTaskInput(topInset=" + this.f161460d + ", bottomInset=" + this.f161461e + ", draftPrompt=" + this.f161462f + ", draftPicId=" + this.f161463g + ", editScene=" + this.f161464h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f161460d);
        out.writeInt(this.f161461e);
        out.writeString(this.f161462f);
        out.writeString(this.f161463g);
        out.writeInt(this.f161464h);
    }
}
