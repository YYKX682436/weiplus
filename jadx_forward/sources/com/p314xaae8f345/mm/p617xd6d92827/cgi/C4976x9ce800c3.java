package com.p314xaae8f345.mm.p617xd6d92827.cgi;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiData;", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.cgi.MagicAdIPCCgiData */
/* loaded from: classes5.dex */
public final /* data */ class C4976x9ce800c3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p617xd6d92827.cgi.C4976x9ce800c3> f21387x681a0c0c = new yj.j();

    /* renamed from: d, reason: collision with root package name */
    public final yj.h f134684d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428 f134685e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 f134686f;

    public C4976x9ce800c3(yj.h action, com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428 c4977xe7434428, com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f134684d = action;
        this.f134685e = c4977xe7434428;
        this.f134686f = c4978x557b1957;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42876xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p617xd6d92827.cgi.C4976x9ce800c3)) {
            return false;
        }
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4976x9ce800c3 c4976x9ce800c3 = (com.p314xaae8f345.mm.p617xd6d92827.cgi.C4976x9ce800c3) obj;
        return this.f134684d == c4976x9ce800c3.f134684d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134685e, c4976x9ce800c3.f134685e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134686f, c4976x9ce800c3.f134686f);
    }

    /* renamed from: hashCode */
    public int m42877x8cdac1b() {
        int hashCode = this.f134684d.hashCode() * 31;
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428 c4977xe7434428 = this.f134685e;
        int m42881x8cdac1b = (hashCode + (c4977xe7434428 == null ? 0 : c4977xe7434428.m42881x8cdac1b())) * 31;
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957 = this.f134686f;
        return m42881x8cdac1b + (c4978x557b1957 != null ? c4978x557b1957.m42885x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m42878x9616526c() {
        return "MagicAdIPCCgiData(action=" + this.f134684d + ", pullData=" + this.f134685e + ", reportData=" + this.f134686f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f134684d.name());
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428 c4977xe7434428 = this.f134685e;
        if (c4977xe7434428 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c4977xe7434428.writeToParcel(out, i17);
        }
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957 = this.f134686f;
        if (c4978x557b1957 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c4978x557b1957.writeToParcel(out, i17);
        }
    }

    public /* synthetic */ C4976x9ce800c3(yj.h hVar, com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428 c4977xe7434428, com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(hVar, (i17 & 2) != 0 ? null : c4977xe7434428, (i17 & 4) != 0 ? null : c4978x557b1957);
    }
}
