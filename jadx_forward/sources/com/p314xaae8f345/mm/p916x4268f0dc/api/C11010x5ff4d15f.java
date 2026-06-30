package com.p314xaae8f345.mm.p916x4268f0dc.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/mj_template/api/MJTemplateSession;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_template.api.MJTemplateSession */
/* loaded from: classes4.dex */
public final /* data */ class C11010x5ff4d15f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f> f29779x681a0c0c = new uy0.i();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f151298d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f151299e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f151300f;

    public C11010x5ff4d15f(byte[] templatePb, java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templatePb, "templatePb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        this.f151298d = templatePb;
        this.f151299e = musicId;
        this.f151300f = jz5.h.b(new uy0.j(this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m47464xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f)) {
            return false;
        }
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f c11010x5ff4d15f = (com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151298d, c11010x5ff4d15f.f151298d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151299e, c11010x5ff4d15f.f151299e);
    }

    /* renamed from: hashCode */
    public int m47465x8cdac1b() {
        return (java.util.Arrays.hashCode(this.f151298d) * 31) + this.f151299e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m47466x9616526c() {
        return "MJTemplateSession(templatePb=" + java.util.Arrays.toString(this.f151298d) + ", musicId=" + this.f151299e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeByteArray(this.f151298d);
        out.writeString(this.f151299e);
    }
}
