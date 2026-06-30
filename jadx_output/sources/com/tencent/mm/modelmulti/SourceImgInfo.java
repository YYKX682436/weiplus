package com.tencent.mm.modelmulti;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelmulti/SourceImgInfo;", "Landroid/os/Parcelable;", "w11/u1", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class SourceImgInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelmulti.SourceImgInfo> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f71258d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71259e;

    static {
        new w11.u1(null);
        CREATOR = new w11.v1();
    }

    public SourceImgInfo(java.lang.String imgSourceUrl, int i17) {
        kotlin.jvm.internal.o.g(imgSourceUrl, "imgSourceUrl");
        this.f71258d = imgSourceUrl;
        this.f71259e = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.tencent.mm.modelmulti.SourceImgInfo a(com.tencent.mm.storage.f9 r3) {
        /*
            java.lang.String r0 = "msgInfo"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r3 = r3.j()
            if (r3 == 0) goto L14
            int r0 = r3.length()
            if (r0 != 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            r1 = 0
            if (r0 == 0) goto L19
            goto L2e
        L19:
            p15.m r0 = new p15.m
            r0.<init>()
            r0.fromXml(r3)
            java.lang.String r3 = r0.k()
            if (r3 != 0) goto L30
            java.lang.String r3 = "from, ImgSourceUrl is null"
            java.lang.String r0 = "MicroMsg.SourceImgInfo"
            com.tencent.mars.xlog.Log.i(r0, r3)
        L2e:
            r2 = r1
            goto L39
        L30:
            int r0 = r0.j()
            com.tencent.mm.modelmulti.SourceImgInfo r2 = new com.tencent.mm.modelmulti.SourceImgInfo
            r2.<init>(r3, r0)
        L39:
            if (r2 == 0) goto L3c
            r1 = r2
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelmulti.SourceImgInfo.a(com.tencent.mm.storage.f9):com.tencent.mm.modelmulti.SourceImgInfo");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.modelmulti.SourceImgInfo)) {
            return false;
        }
        com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo = (com.tencent.mm.modelmulti.SourceImgInfo) obj;
        return kotlin.jvm.internal.o.b(this.f71258d, sourceImgInfo.f71258d) && this.f71259e == sourceImgInfo.f71259e;
    }

    public int hashCode() {
        return (this.f71258d.hashCode() * 31) + java.lang.Integer.hashCode(this.f71259e);
    }

    public java.lang.String toString() {
        return "SourceImgInfo(imgSourceUrl=" + this.f71258d + ", bizType=" + this.f71259e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f71258d);
        out.writeInt(this.f71259e);
    }
}
