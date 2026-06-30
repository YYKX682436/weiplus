package com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/matrix/battery/BinderTracker$Timer", "Landroid/os/Parcelable;", "CREATOR", "cr0/e1", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.matrix.battery.BinderTracker$Timer */
/* loaded from: classes8.dex */
public final /* data */ class C10871xcc6f010f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final cr0.e1 f29677x681a0c0c = new cr0.e1(null);

    /* renamed from: d, reason: collision with root package name */
    public int f150222d;

    /* renamed from: e, reason: collision with root package name */
    public long f150223e;

    public C10871xcc6f010f(int i17, long j17) {
        this.f150222d = i17;
        this.f150223e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46646xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f)) {
            return false;
        }
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f c10871xcc6f010f = (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) obj;
        return this.f150222d == c10871xcc6f010f.f150222d && this.f150223e == c10871xcc6f010f.f150223e;
    }

    /* renamed from: hashCode */
    public int m46647x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f150222d) * 31) + java.lang.Long.hashCode(this.f150223e);
    }

    /* renamed from: toString */
    public java.lang.String m46648x9616526c() {
        return "Timer(count=" + this.f150222d + ", timeMs=" + this.f150223e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f150222d);
        dest.writeLong(this.f150223e);
    }

    public /* synthetic */ C10871xcc6f010f(int i17, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? 0L : j17);
    }
}
