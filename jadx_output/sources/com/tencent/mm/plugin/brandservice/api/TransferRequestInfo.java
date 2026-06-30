package com.tencent.mm.plugin.brandservice.api;

/* loaded from: classes7.dex */
public class TransferRequestInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.brandservice.api.TransferRequestInfo> CREATOR = new zq1.o0();

    /* renamed from: d, reason: collision with root package name */
    public int f93913d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f93914e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f93915f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f93916g;

    /* renamed from: h, reason: collision with root package name */
    public r45.y24 f93917h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93918i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f93919m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f93920n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f93921o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f93922p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93923q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f93924r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f93925s;

    public TransferRequestInfo() {
        this.f93913d = -1;
        this.f93914e = "";
        this.f93915f = "";
        this.f93916g = "";
        this.f93917h = null;
        this.f93918i = false;
        this.f93919m = null;
        this.f93920n = false;
        this.f93921o = null;
        this.f93922p = null;
        this.f93923q = false;
        this.f93924r = null;
        this.f93925s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0041
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            int r4 = r2.f93913d
            r3.writeInt(r4)
            java.lang.String r4 = r2.f93914e
            r3.writeString(r4)
            java.lang.String r4 = r2.f93915f
            r3.writeString(r4)
            java.lang.String r4 = r2.f93916g
            r3.writeString(r4)
            boolean r4 = r2.f93918i
            r3.writeByte(r4)
            boolean r4 = r2.f93920n
            r3.writeByte(r4)
            java.lang.String r4 = r2.f93921o
            r3.writeString(r4)
            boolean r4 = r2.f93923q
            r3.writeByte(r4)
            r4 = 0
            r45.y24 r0 = r2.f93917h     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L41
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L3e
            int r1 = r0.length     // Catch: java.lang.Exception -> L41
            if (r1 <= 0) goto L3e
            int r1 = r0.length     // Catch: java.lang.Exception -> L41
            r3.writeInt(r1)     // Catch: java.lang.Exception -> L41
            r3.writeByteArray(r0)     // Catch: java.lang.Exception -> L41
            goto L41
        L3e:
            r3.writeInt(r4)     // Catch: java.lang.Exception -> L41
        L41:
            boolean r0 = r2.f93918i     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L5d
            r45.cu5 r0 = r2.f93919m     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L5d
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L5a
            int r1 = r0.length     // Catch: java.lang.Exception -> L5d
            if (r1 <= 0) goto L5a
            int r4 = r0.length     // Catch: java.lang.Exception -> L5d
            r3.writeInt(r4)     // Catch: java.lang.Exception -> L5d
            r3.writeByteArray(r0)     // Catch: java.lang.Exception -> L5d
            goto L5d
        L5a:
            r3.writeInt(r4)     // Catch: java.lang.Exception -> L5d
        L5d:
            java.lang.String r4 = r2.f93924r
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r0 = ""
            if (r4 != 0) goto L66
            r4 = r0
        L66:
            r3.writeString(r4)
            java.lang.String r4 = r2.f93925s
            if (r4 != 0) goto L6e
            goto L6f
        L6e:
            r0 = r4
        L6f:
            r3.writeString(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.api.TransferRequestInfo.writeToParcel(android.os.Parcel, int):void");
    }

    public TransferRequestInfo(android.os.Parcel parcel) {
        this.f93913d = -1;
        this.f93914e = "";
        this.f93915f = "";
        this.f93916g = "";
        this.f93917h = null;
        this.f93918i = false;
        this.f93919m = null;
        this.f93920n = false;
        this.f93921o = null;
        this.f93922p = null;
        this.f93923q = false;
        this.f93924r = null;
        this.f93925s = null;
        this.f93913d = parcel.readInt();
        this.f93914e = parcel.readString();
        this.f93915f = parcel.readString();
        this.f93916g = parcel.readString();
        this.f93918i = parcel.readByte() != 0;
        this.f93920n = parcel.readByte() != 0;
        this.f93921o = parcel.readString();
        this.f93923q = parcel.readByte() != 0;
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                r45.y24 y24Var = new r45.y24();
                this.f93917h = y24Var;
                y24Var.parseFrom(bArr);
            }
        } catch (java.lang.Exception unused) {
        }
        if (this.f93918i) {
            try {
                int readInt2 = parcel.readInt();
                if (readInt2 > 0) {
                    byte[] bArr2 = new byte[readInt2];
                    parcel.readByteArray(bArr2);
                    r45.cu5 cu5Var = new r45.cu5();
                    this.f93919m = cu5Var;
                    cu5Var.b(bArr2);
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        this.f93924r = parcel.readString();
        this.f93925s = parcel.readString();
    }
}
