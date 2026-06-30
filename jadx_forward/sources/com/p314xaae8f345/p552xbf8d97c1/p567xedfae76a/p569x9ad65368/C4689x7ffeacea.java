package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "Landroid/os/Parcelable;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.supervisor.ProcessToken */
/* loaded from: classes12.dex */
public final class C4689x7ffeacea implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea> f19986x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.e0();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f134324d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134325e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f134326f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f134327g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f134328h;

    public C4689x7ffeacea(int i17, java.lang.String processName, java.lang.String statefulName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefulName, "statefulName");
        this.f134324d = new android.os.Binder();
        this.f134325e = i17;
        this.f134326f = processName;
        this.f134327g = statefulName;
        this.f134328h = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m41098xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134326f, c4689x7ffeacea.f134326f) && this.f134325e == c4689x7ffeacea.f134325e;
    }

    /* renamed from: hashCode */
    public int m41099x8cdac1b() {
        return (this.f134325e * 31) + this.f134326f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m41100x9616526c() {
        return "ProcessToken(pid=" + this.f134325e + ", name='" + this.f134326f + "', statefulName = " + this.f134327g + ", state = " + this.f134328h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeStrongBinder(this.f134324d);
        dest.writeInt(this.f134325e);
        dest.writeString(this.f134326f);
        dest.writeString(this.f134327g);
        dest.writeInt(this.f134328h ? 1 : 0);
    }

    public C4689x7ffeacea(android.os.Parcel src) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        android.os.IBinder readStrongBinder = src.readStrongBinder();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readStrongBinder, "src.readStrongBinder()");
        this.f134324d = readStrongBinder;
        this.f134325e = src.readInt();
        java.lang.String readString = src.readString();
        this.f134326f = readString == null ? "" : readString;
        java.lang.String readString2 = src.readString();
        this.f134327g = readString2 != null ? readString2 : "";
        this.f134328h = src.readInt() != 0;
    }
}
