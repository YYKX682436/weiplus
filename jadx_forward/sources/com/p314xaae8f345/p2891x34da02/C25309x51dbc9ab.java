package com.p314xaae8f345.p2891x34da02;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/qbar/ScanIdentifyReportInfo;", "Landroid/os/Parcelable;", "scan-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.qbar.ScanIdentifyReportInfo */
/* loaded from: classes13.dex */
public final class C25309x51dbc9ab implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f296775d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f296776e;

    /* renamed from: f, reason: collision with root package name */
    public final int f296777f;

    /* renamed from: g, reason: collision with root package name */
    public final int f296778g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f296779h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f296780i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f296781m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f296782n;

    public C25309x51dbc9ab(byte[] bArr, android.graphics.Point point, int i17, int i18, java.lang.String str, byte[] bArr2, boolean z17) {
        this.f296775d = bArr;
        this.f296776e = point;
        this.f296777f = i17;
        this.f296778g = i18;
        this.f296779h = str;
        this.f296780i = bArr2;
        this.f296781m = z17;
    }

    public final boolean a() {
        android.graphics.Point point;
        if (this.f296775d != null && (point = this.f296776e) != null && point.x > 0 && point.y > 0) {
            return true;
        }
        java.lang.String str = this.f296779h;
        return !(str == null || str.length() == 0);
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807 codeRect, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codeRect, "codeRect");
        this.f296782n = new android.graphics.RectF(codeRect.f240144d, codeRect.f240145e, codeRect.f240146f, codeRect.f240147g);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        try {
            parcel.writeByteArray(this.f296775d);
            parcel.writeParcelable(this.f296776e, i17);
            parcel.writeInt(this.f296777f);
            parcel.writeInt(this.f296778g);
            parcel.writeString(this.f296779h);
            parcel.writeParcelable(this.f296782n, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanIdentifyReportInfo", "failed write reportinfo to parcel: " + e17);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25309x51dbc9ab(byte[] r9, android.graphics.Point r10, int r11, int r12) {
        /*
            r8 = this;
            if (r9 == 0) goto Ld
            int r0 = r9.length
            byte[] r9 = java.util.Arrays.copyOf(r9, r0)
            java.lang.String r0 = "copyOf(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r0)
            goto Le
        Ld:
            r9 = 0
        Le:
            r1 = r9
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab.<init>(byte[], android.graphics.Point, int, int):void");
    }

    public C25309x51dbc9ab(java.lang.String str, byte[] bArr, boolean z17) {
        this(null, null, 0, 0, str, bArr, z17);
    }
}
