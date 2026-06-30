package com.p314xaae8f345.mm.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/api/EmotionStrategyInfo;", "Landroid/os/Parcelable;", "emojisdk-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.api.EmotionStrategyInfo */
/* loaded from: classes4.dex */
public final /* data */ class C4986x2b88169c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.api.C4986x2b88169c> f21397x681a0c0c = new qk.f0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f134734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134735e;

    public C4986x2b88169c(java.lang.String md52, java.lang.String queryWording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryWording, "queryWording");
        this.f134734d = md52;
        this.f134735e = queryWording;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42924xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.api.C4986x2b88169c)) {
            return false;
        }
        com.p314xaae8f345.mm.api.C4986x2b88169c c4986x2b88169c = (com.p314xaae8f345.mm.api.C4986x2b88169c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134734d, c4986x2b88169c.f134734d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134735e, c4986x2b88169c.f134735e);
    }

    /* renamed from: hashCode */
    public int m42925x8cdac1b() {
        return (this.f134734d.hashCode() * 31) + this.f134735e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m42926x9616526c() {
        return "EmotionStrategyInfo(md5=" + this.f134734d + ", queryWording=" + this.f134735e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f134734d);
        out.writeString(this.f134735e);
    }
}
