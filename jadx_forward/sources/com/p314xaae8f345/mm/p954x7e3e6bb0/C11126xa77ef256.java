package com.p314xaae8f345.mm.p954x7e3e6bb0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelmulti/SourceImgInfo;", "Landroid/os/Parcelable;", "w11/u1", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.modelmulti.SourceImgInfo */
/* loaded from: classes3.dex */
public final /* data */ class C11126xa77ef256 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256> f32565x681a0c0c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152791d;

    /* renamed from: e, reason: collision with root package name */
    public final int f152792e;

    static {
        new w11.u1(null);
        f32565x681a0c0c = new w11.v1();
    }

    public C11126xa77ef256(java.lang.String imgSourceUrl, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgSourceUrl, "imgSourceUrl");
        this.f152791d = imgSourceUrl;
        this.f152792e = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r3) {
        /*
            java.lang.String r0 = "msgInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
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
            r0.m126728xdc93280d(r3)
            java.lang.String r3 = r0.k()
            if (r3 != 0) goto L30
            java.lang.String r3 = "from, ImgSourceUrl is null"
            java.lang.String r0 = "MicroMsg.SourceImgInfo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256.a(com.tencent.mm.storage.f9):com.tencent.mm.modelmulti.SourceImgInfo");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48136xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256)) {
            return false;
        }
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256 = (com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152791d, c11126xa77ef256.f152791d) && this.f152792e == c11126xa77ef256.f152792e;
    }

    /* renamed from: hashCode */
    public int m48137x8cdac1b() {
        return (this.f152791d.hashCode() * 31) + java.lang.Integer.hashCode(this.f152792e);
    }

    /* renamed from: toString */
    public java.lang.String m48138x9616526c() {
        return "SourceImgInfo(imgSourceUrl=" + this.f152791d + ", bizType=" + this.f152792e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f152791d);
        out.writeInt(this.f152792e);
    }
}
