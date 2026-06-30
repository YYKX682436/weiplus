package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKUpFileItem */
/* loaded from: classes8.dex */
public class C19286xc5f66e62 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19286xc5f66e62> f38726x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o4();

    /* renamed from: w, reason: collision with root package name */
    public int f264285w = -1;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f264286x;

    public C19286xc5f66e62() {
        this.f264275n = 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public java.lang.String b() {
        return "file";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public java.lang.String c() {
        return "nomal";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public void e(dn.h hVar) {
        super.e(hVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f264285w + "");
        arrayList.add(this.f264286x);
        arrayList.add(hVar.f69522xf9dbbe9c);
        arrayList.add(hVar.f69502xf11df5f5);
        arrayList.add(hVar.f69523x17c343e7 + "");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            arrayList.add("1");
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            arrayList.add("4");
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            arrayList.add("5");
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(context)) {
            arrayList.add("6");
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
            arrayList.add("3");
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40091x5fd3d5c(context)) {
            arrayList.add("2");
        } else {
            arrayList.add("0");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(12018, arrayList);
        java.lang.String str = this.f264271g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            r6Var.l();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    public C19286xc5f66e62(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o4 o4Var) {
    }
}
