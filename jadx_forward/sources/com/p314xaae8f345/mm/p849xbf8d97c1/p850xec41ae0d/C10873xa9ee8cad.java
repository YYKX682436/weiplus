package com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/matrix/battery/ProcessTracker$ProcessCallStats", "Landroid/os/Parcelable;", "CREATOR", "cr0/x3", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.matrix.battery.ProcessTracker$ProcessCallStats */
/* loaded from: classes12.dex */
public final class C10873xa9ee8cad implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final cr0.x3 f29686x681a0c0c = new cr0.x3(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f150224d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150225e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f150226f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f150227g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f150228h;

    /* renamed from: i, reason: collision with root package name */
    public final long f150229i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f150230m;

    public C10873xa9ee8cad(int i17, java.lang.String type, java.lang.String from, java.lang.String to6, java.lang.String caller, long j17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
        this.f150224d = i17;
        this.f150225e = type;
        this.f150226f = from;
        this.f150227g = to6;
        this.f150228h = caller;
        this.f150229i = j17;
        this.f150230m = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m46659x9616526c() {
        return "ProcessCallStats(id=" + this.f150224d + ", type='" + this.f150225e + "', '" + this.f150226f + "'>>'" + this.f150227g + "', time=" + pj.e.c(this.f150229i, "HH:mm:ss") + ", desc=" + this.f150230m + "): " + kz5.n0.g0(r26.n0.f0(this.f150228h, new java.lang.String[]{";"}, false, 0, 6, null), "\n\t", null, null, 0, null, null, 62, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f150224d);
        dest.writeString(this.f150225e);
        dest.writeString(this.f150226f);
        dest.writeString(this.f150227g);
        dest.writeString(this.f150228h);
        dest.writeLong(this.f150229i);
        dest.writeString(this.f150230m);
    }
}
