package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class i1 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f159429d = {"appId", "wechatToken"};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f159430e = {"appId", "versionType"};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f159431f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59.A, "MonitoredBluetoothDeviceInfoV2")};

    static {
        java.lang.String[] strArr = {"wechatToken", "appId"};
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", PRIMARY KEY ( ");
        int i17 = 0;
        int i18 = 0;
        while (i17 < 2) {
            java.lang.String str = strArr[i17];
            int i19 = i18 + 1;
            if (i18 == 0) {
                sb6.append(str);
            } else {
                sb6.append(", " + str);
            }
            i17++;
            i18 = i19;
        }
        sb6.append(" )");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59.A.f398489e += sb7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59.A, "MonitoredBluetoothDeviceInfoV2", dm.b8.f317414o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.h1(this, db6));
    }

    public final synchronized java.util.List y0(java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, appId: " + str);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("SELECT * FROM " + mo145255x88e404c3() + " WHERE appId = '" + str + '\'', new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            if (m145256x1d3f4980.moveToFirst()) {
                arrayList2 = new java.util.ArrayList();
                do {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59();
                    c11858x835ced59.mo9015xbf5d97fd(m145256x1d3f4980);
                    arrayList2.add(c11858x835ced59);
                } while (m145256x1d3f4980.moveToNext());
                m145256x1d3f4980.close();
            } else {
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor moveToFirst fail");
                arrayList2 = null;
            }
            arrayList = arrayList2 != null ? arrayList2 : null;
        }
        t91.a.f498100a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor is null");
        return arrayList;
    }

    public final synchronized java.util.List z0(java.lang.String str, int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, appId: " + str + ", versionType: " + i17);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("SELECT * FROM " + mo145255x88e404c3() + " WHERE appId = '" + str + "' AND versionType = " + i17, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            if (m145256x1d3f4980.moveToFirst()) {
                arrayList2 = new java.util.ArrayList();
                do {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59();
                    c11858x835ced59.mo9015xbf5d97fd(m145256x1d3f4980);
                    arrayList2.add(c11858x835ced59);
                } while (m145256x1d3f4980.moveToNext());
                m145256x1d3f4980.close();
            } else {
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor moveToFirst fail");
                arrayList2 = null;
            }
            arrayList = arrayList2 != null ? arrayList2 : null;
        }
        t91.a.f498100a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor is null");
        return arrayList;
    }
}
