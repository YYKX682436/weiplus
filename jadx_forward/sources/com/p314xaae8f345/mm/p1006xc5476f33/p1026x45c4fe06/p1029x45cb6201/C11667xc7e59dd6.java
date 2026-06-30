package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo */
/* loaded from: classes7.dex */
public final class C11667xc7e59dd6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e implements java.lang.Iterable<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e> {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f156930m;

    /* renamed from: d, reason: collision with root package name */
    public int f156932d;

    /* renamed from: e, reason: collision with root package name */
    public long f156933e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f156934f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f156935g;

    /* renamed from: h, reason: collision with root package name */
    public volatile transient java.util.Map f156936h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 f156937i;

    /* renamed from: n, reason: collision with root package name */
    public static final bm5.x0 f156931n = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11668x39bb164b());

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6> f33466x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.bb();

    public C11667xc7e59dd6() {
        this.f156935g = new java.util.LinkedList();
        this.f156937i = null;
        this.f33454x337a8b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8;
        this.f33453xc73e777a = true;
    }

    public static java.lang.String d(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.lang.String str = null;
        if (f156930m && r6Var.m()) {
            try {
                com.p314xaae8f345.mm.p2809x52b77bcb.C22917xbc5972a2 c22917xbc5972a2 = (com.p314xaae8f345.mm.p2809x52b77bcb.C22917xbc5972a2) f156931n.b();
                java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(r6Var.o(), false);
                if (!android.text.TextUtils.isEmpty(i17)) {
                    str = c22917xbc5972a2.m83302xad6ae4c(i17);
                }
            } catch (java.lang.UnsatisfiedLinkError e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.WxaPkgWrappingInfo", e17, "getFileMD5 by weapp_core", new java.lang.Object[0]);
            }
        } else {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11655x6ff60bd8.m49193x3797549();
                java.lang.String[] strArr = new java.lang.String[1];
                if (-101 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11706x873c9d47.m49645x40453099(com.p314xaae8f345.mm.vfs.w6.i(r6Var.o(), false), strArr)) {
                    throw new java.io.IOException("MD5_ERR_FILE_OPEN");
                }
                str = strArr[0];
            } catch (java.lang.UnsatisfiedLinkError e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.WxaPkgWrappingInfo", e18, "getFileMD5 by jni", new java.lang.Object[0]);
            }
        }
        if (android.text.TextUtils.isEmpty(str)) {
            try {
                java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(r6Var);
                try {
                    str = kk.k.c(C, 16384);
                    if (C != null) {
                        C.close();
                    }
                } finally {
                }
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.WxaPkgWrappingInfo", e19, "getFileMD5 by java io", new java.lang.Object[0]);
            }
        }
        return str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8.equals(str2)) {
            return str2;
        }
        synchronized (this.f156935g) {
            if (this.f156936h == null) {
                g(str);
            }
            str3 = (java.lang.String) ((android.util.ArrayMap) this.f156936h).get(str2);
            if (android.text.TextUtils.isEmpty(str3)) {
                str3 = str2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WxaPkgWrappingInfo", "getModuleNameForURLFetch appId:%s, retrace module %s -> %s", str, str2, str3);
        return str3;
    }

    public void g(java.lang.String str) {
        synchronized (this.f156935g) {
            if (!this.f156935g.isEmpty() && this.f156936h == null) {
                this.f156936h = new android.util.ArrayMap();
                java.util.Iterator it = this.f156935g.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) it.next();
                    c11656xaf63146e.f33456x1c82a56c = this.f33456x1c82a56c;
                    java.lang.String str2 = c11656xaf63146e.f33454x337a8b;
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8.equals(str2)) {
                        str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str2, false);
                    }
                    if (!str2.equals(c11656xaf63146e.f33454x337a8b)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WxaPkgWrappingInfo", "setupModuleEnv, appId:%s, module mapped %s -> %s", str, c11656xaf63146e.f33454x337a8b, str2);
                        ((android.util.ArrayMap) this.f156936h).put(str2, c11656xaf63146e.f33454x337a8b);
                        c11656xaf63146e.f33454x337a8b = str2;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WxaPkgWrappingInfo", "setupModuleEnv, appId:%s, NameMap.size:%d", str, java.lang.Integer.valueOf(((android.util.ArrayMap) this.f156936h).size()));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e
    /* renamed from: isAssignable */
    public boolean mo49199xbe910393(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e) {
        return c11656xaf63146e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 ? super.mo49199xbe910393(c11656xaf63146e) && this.f33456x1c82a56c == c11656xaf63146e.f33456x1c82a56c : super.mo49199xbe910393(c11656xaf63146e);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e> iterator() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ab(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e
    /* renamed from: readFromParcel */
    public void mo49200xb362ce89(android.os.Parcel parcel) {
        super.mo49200xb362ce89(parcel);
        this.f156932d = parcel.readInt();
        this.f33456x1c82a56c = parcel.readInt();
        this.f156933e = parcel.readLong();
        this.f156934f = parcel.readByte() != 0;
        parcel.readTypedList(this.f156935g, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33444x681a0c0c);
        this.f156937i = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7.class.getClassLoader());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e
    /* renamed from: toString */
    public java.lang.String mo49201x9616526c() {
        return "WxaPkgWrappingInfo{pkgDebugType=" + this.f156932d + ", pkgVersion=" + this.f33456x1c82a56c + ", pkgCreateTime=" + this.f156933e + ", localPkg=" + this.f156934f + ", md5='" + this.f156905md5 + "', pkgPath='" + this.f33455xe121c411 + "'}";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f156932d);
        parcel.writeInt(this.f33456x1c82a56c);
        parcel.writeLong(this.f156933e);
        parcel.writeByte(this.f156934f ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f156935g);
        parcel.writeParcelable(this.f156937i, 0);
    }

    public C11667xc7e59dd6(android.os.Parcel parcel) {
        this();
        mo49200xb362ce89(parcel);
    }
}
