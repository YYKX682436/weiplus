package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/MonitoredBluetoothDeviceInfo;", "Ldm/b8;", "", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/device_discovery/bluetooth/f1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo */
/* loaded from: classes7.dex */
public final class C11858x835ced59 extends dm.b8 implements android.os.Parcelable {

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f159393z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.g1(this));

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.f1 f33621x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.f1(null);
    public static final l75.e0 A = dm.b8.m124817x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59.class);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50223xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo");
        java.lang.String str = this.f65990x28d45f97;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str)) {
            java.lang.String str2 = this.f65992x13d36e99;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str2)) {
                java.lang.String str3 = this.f65996x62fb9eae;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str3)) {
                    java.lang.String str4 = this.f65991x19e082da;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, str4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // dm.b8, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return A;
    }

    /* renamed from: hashCode */
    public int m50224x8cdac1b() {
        return (((((((this.f65990x28d45f97.hashCode() * 31) + java.lang.Integer.hashCode(this.f65995x94d24c6d)) * 31) + this.f65992x13d36e99.hashCode()) * 31) + this.f65996x62fb9eae.hashCode()) * 31) + this.f65991x19e082da.hashCode();
    }

    /* renamed from: isValid */
    public boolean m50225x7b953cf2() {
        java.lang.String str = this.f65990x28d45f97;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String str2 = this.f65991x19e082da;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        java.lang.String str3 = this.f65996x62fb9eae;
        if (str3 == null || str3.length() == 0) {
            return false;
        }
        int i17 = this.f65995x94d24c6d;
        return 1 == i17 || 2 == i17 || i17 == 0;
    }

    /* renamed from: toString */
    public java.lang.String m50226x9616526c() {
        return "MonitoredBluetoothDeviceInfo(appId=" + this.f65990x28d45f97 + ", bluetoothDeviceId=" + this.f65991x19e082da + ", wechatToken=" + this.f65996x62fb9eae + ", versionType=" + this.f65995x94d24c6d + ", entryPackage=" + this.f65992x13d36e99 + ", updateTime=" + this.f65994xa783a79b + ", isBlocked=" + this.f65993x76c8545d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f65990x28d45f97);
        parcel.writeString(this.f65991x19e082da);
        parcel.writeString(this.f65996x62fb9eae);
        parcel.writeInt(this.f65995x94d24c6d);
        parcel.writeString(this.f65992x13d36e99);
        parcel.writeLong(this.f65994xa783a79b);
    }
}
