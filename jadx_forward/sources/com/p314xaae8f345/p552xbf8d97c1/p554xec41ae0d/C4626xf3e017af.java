package com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/matrix/battery/TaskProfiler$Timer", "Landroid/os/Parcelable;", "CREATOR", "kh/w1", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.matrix.battery.TaskProfiler$Timer */
/* loaded from: classes11.dex */
public final /* data */ class C4626xf3e017af implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final kh.w1 f19872x681a0c0c = new kh.w1(null);

    /* renamed from: d, reason: collision with root package name */
    public int f134081d;

    /* renamed from: e, reason: collision with root package name */
    public long f134082e;

    public C4626xf3e017af(int i17, long j17) {
        this.f134081d = i17;
        this.f134082e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m40772xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af c4626xf3e017af = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af) obj;
        return this.f134081d == c4626xf3e017af.f134081d && this.f134082e == c4626xf3e017af.f134082e;
    }

    /* renamed from: hashCode */
    public int m40773x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f134081d) * 31) + java.lang.Long.hashCode(this.f134082e);
    }

    /* renamed from: toString */
    public java.lang.String m40774x9616526c() {
        return "Timer(count=" + this.f134081d + ", cpuTime=" + this.f134082e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f134081d);
        dest.writeLong(this.f134082e);
    }

    public /* synthetic */ C4626xf3e017af(int i17, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? 0L : j17);
    }
}
