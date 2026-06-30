package com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4;

/* renamed from: com.qq.wx.voice.embed.recognizer.Grammar */
/* loaded from: classes11.dex */
public class C2880x73ecff87 {

    /* renamed from: mData */
    public static java.lang.String f9784x62065b7;

    /* renamed from: mDataPath */
    public static java.lang.String f9785x8f9e8a7c;
    public static java.lang.String mSo;

    /* renamed from: b, reason: collision with root package name */
    private wb.a f127356b = new wb.a();

    /* renamed from: c, reason: collision with root package name */
    private boolean f127357c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f127358d = false;

    /* renamed from: e, reason: collision with root package name */
    private java.util.ArrayList f127359e = null;

    /* renamed from: a, reason: collision with root package name */
    private wb.h f127355a = new wb.h();

    private java.lang.String a() {
        for (int i17 = 0; i17 < this.f127359e.size(); i17++) {
            ((wb.e) this.f127359e.get(i17)).f525867d = a(((wb.e) this.f127359e.get(i17)).f525864a);
            ((wb.e) this.f127359e.get(i17)).f525868e = a(((wb.e) this.f127359e.get(i17)).f525865b);
            ((wb.e) this.f127359e.get(i17)).f525869f = a(((wb.e) this.f127359e.get(i17)).f525866c);
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (int i18 = 0; i18 < this.f127359e.size(); i18++) {
            java.lang.String str = ((wb.e) this.f127359e.get(i18)).f525867d;
            if (!str.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str);
            }
            java.lang.String str2 = ((wb.e) this.f127359e.get(i18)).f525868e;
            if (!str2.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str2);
            }
            java.lang.String str3 = ((wb.e) this.f127359e.get(i18)).f525869f;
            if (!str3.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str3);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: begin */
    public int m21460x59478a9() {
        return com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4.C2881x98023a7e.m21467x59478a9();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* renamed from: checkFiles */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m21461xdfb5ca4f(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4.C2880x73ecff87.m21461xdfb5ca4f(android.content.Context, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public int end() {
        return com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4.C2881x98023a7e.end();
    }

    /* renamed from: getResult */
    public int m21462x2d64eb13(wb.a aVar) {
        int m21468x2d64eb13 = com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4.C2881x98023a7e.m21468x2d64eb13(this);
        if (m21468x2d64eb13 < 0) {
            return m21468x2d64eb13;
        }
        wb.a aVar2 = this.f127356b;
        aVar.f525860a = aVar2.f525860a;
        if (aVar2.f525861b == null) {
            aVar.f525861b = null;
            return 0;
        }
        for (int i17 = 0; i17 < this.f127359e.size(); i17++) {
            if (((wb.e) this.f127359e.get(i17)).f525867d.compareTo(this.f127356b.f525861b) == 0 || ((wb.e) this.f127359e.get(i17)).f525868e.compareTo(this.f127356b.f525861b) == 0 || ((wb.e) this.f127359e.get(i17)).f525869f.compareTo(this.f127356b.f525861b) == 0) {
                aVar.f525861b = ((wb.e) this.f127359e.get(i17)).f525864a;
                break;
            }
        }
        return 0;
    }

    /* renamed from: init */
    public int m21463x316510(java.util.ArrayList arrayList) {
        if (this.f127358d) {
            return 0;
        }
        if (arrayList == null) {
            return org.p3343x72743996.net.InterfaceC29524x4f65168b.f74009xff6d24fe;
        }
        try {
            com.p314xaae8f345.cso.C2941xefde02d2.g(java.lang.String.valueOf(f9785x8f9e8a7c) + "/" + mSo);
            this.f127359e = arrayList;
            try {
                if (com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4.C2881x98023a7e.m21469x316510(f9785x8f9e8a7c.getBytes(), f9784x62065b7.getBytes(), a().toString().getBytes("GBK")) < 0) {
                    return -101;
                }
                this.f127358d = true;
                return 0;
            } catch (java.io.UnsupportedEncodingException unused) {
                return -101;
            }
        } catch (java.lang.Exception unused2) {
            return -205;
        }
    }

    /* renamed from: onGetResult */
    public void m21464x2b8f27f4(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            if (bArr != null) {
                this.f127356b.f525860a = new java.lang.String(bArr, "GBK");
            } else {
                this.f127356b.f525860a = null;
            }
            if (bArr3 == null) {
                this.f127356b.f525861b = null;
            } else {
                this.f127356b.f525861b = new java.lang.String(bArr3, "GBK");
            }
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: recognize */
    public int m21465x3aa2088e(byte[] bArr, int i17) {
        return com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4.C2881x98023a7e.m21470x3aa2088e(bArr, i17);
    }

    /* renamed from: update */
    public int m21466xce0038c9(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            return org.p3343x72743996.net.InterfaceC29524x4f65168b.f74009xff6d24fe;
        }
        this.f127359e = arrayList;
        try {
            return com.qq.wx.p309x6b2e132.p310x5c24ed9.p311x199f09a4.C2881x98023a7e.m21471xce0038c9(a().getBytes("GBK")) < 0 ? -106 : 0;
        } catch (java.io.UnsupportedEncodingException unused) {
            return -106;
        }
    }

    private static java.lang.String a(java.lang.String str) {
        return new java.lang.String(str).replaceAll("[^(a-zA-Z0-9\\u4e00-\\u9fa5)]", "").replaceAll("0", "零").replaceAll("1", "一").replaceAll("2", "二").replaceAll("3", "三").replaceAll("4", "四").replaceAll("5", "五").replaceAll("6", "六").replaceAll("7", "七").replaceAll("8", "八").replaceAll("9", "九");
    }
}
