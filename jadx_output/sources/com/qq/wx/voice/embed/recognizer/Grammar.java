package com.qq.wx.voice.embed.recognizer;

/* loaded from: classes11.dex */
public class Grammar {
    public static java.lang.String mData;
    public static java.lang.String mDataPath;
    public static java.lang.String mSo;

    /* renamed from: b, reason: collision with root package name */
    private wb.a f45823b = new wb.a();

    /* renamed from: c, reason: collision with root package name */
    private boolean f45824c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45825d = false;

    /* renamed from: e, reason: collision with root package name */
    private java.util.ArrayList f45826e = null;

    /* renamed from: a, reason: collision with root package name */
    private wb.h f45822a = new wb.h();

    private java.lang.String a() {
        for (int i17 = 0; i17 < this.f45826e.size(); i17++) {
            ((wb.e) this.f45826e.get(i17)).f444334d = a(((wb.e) this.f45826e.get(i17)).f444331a);
            ((wb.e) this.f45826e.get(i17)).f444335e = a(((wb.e) this.f45826e.get(i17)).f444332b);
            ((wb.e) this.f45826e.get(i17)).f444336f = a(((wb.e) this.f45826e.get(i17)).f444333c);
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (int i18 = 0; i18 < this.f45826e.size(); i18++) {
            java.lang.String str = ((wb.e) this.f45826e.get(i18)).f444334d;
            if (!str.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str);
            }
            java.lang.String str2 = ((wb.e) this.f45826e.get(i18)).f444335e;
            if (!str2.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str2);
            }
            java.lang.String str3 = ((wb.e) this.f45826e.get(i18)).f444336f;
            if (!str3.isEmpty()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(str3);
            }
        }
        return stringBuffer.toString();
    }

    public int begin() {
        return com.qq.wx.voice.embed.recognizer.GrammarNative.begin();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int checkFiles(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qq.wx.voice.embed.recognizer.Grammar.checkFiles(android.content.Context, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public int end() {
        return com.qq.wx.voice.embed.recognizer.GrammarNative.end();
    }

    public int getResult(wb.a aVar) {
        int result = com.qq.wx.voice.embed.recognizer.GrammarNative.getResult(this);
        if (result < 0) {
            return result;
        }
        wb.a aVar2 = this.f45823b;
        aVar.f444327a = aVar2.f444327a;
        if (aVar2.f444328b == null) {
            aVar.f444328b = null;
            return 0;
        }
        for (int i17 = 0; i17 < this.f45826e.size(); i17++) {
            if (((wb.e) this.f45826e.get(i17)).f444334d.compareTo(this.f45823b.f444328b) == 0 || ((wb.e) this.f45826e.get(i17)).f444335e.compareTo(this.f45823b.f444328b) == 0 || ((wb.e) this.f45826e.get(i17)).f444336f.compareTo(this.f45823b.f444328b) == 0) {
                aVar.f444328b = ((wb.e) this.f45826e.get(i17)).f444331a;
                break;
            }
        }
        return 0;
    }

    public int init(java.util.ArrayList arrayList) {
        if (this.f45825d) {
            return 0;
        }
        if (arrayList == null) {
            return org.chromium.net.NetError.ERR_INVALID_REDIRECT;
        }
        try {
            com.tencent.cso.CsoLoader.g(java.lang.String.valueOf(mDataPath) + "/" + mSo);
            this.f45826e = arrayList;
            try {
                if (com.qq.wx.voice.embed.recognizer.GrammarNative.init(mDataPath.getBytes(), mData.getBytes(), a().toString().getBytes("GBK")) < 0) {
                    return -101;
                }
                this.f45825d = true;
                return 0;
            } catch (java.io.UnsupportedEncodingException unused) {
                return -101;
            }
        } catch (java.lang.Exception unused2) {
            return -205;
        }
    }

    public void onGetResult(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            if (bArr != null) {
                this.f45823b.f444327a = new java.lang.String(bArr, "GBK");
            } else {
                this.f45823b.f444327a = null;
            }
            if (bArr3 == null) {
                this.f45823b.f444328b = null;
            } else {
                this.f45823b.f444328b = new java.lang.String(bArr3, "GBK");
            }
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }

    public int recognize(byte[] bArr, int i17) {
        return com.qq.wx.voice.embed.recognizer.GrammarNative.recognize(bArr, i17);
    }

    public int update(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            return org.chromium.net.NetError.ERR_INVALID_REDIRECT;
        }
        this.f45826e = arrayList;
        try {
            return com.qq.wx.voice.embed.recognizer.GrammarNative.update(a().getBytes("GBK")) < 0 ? -106 : 0;
        } catch (java.io.UnsupportedEncodingException unused) {
            return -106;
        }
    }

    private static java.lang.String a(java.lang.String str) {
        return new java.lang.String(str).replaceAll("[^(a-zA-Z0-9\\u4e00-\\u9fa5)]", "").replaceAll("0", "零").replaceAll("1", "一").replaceAll("2", "二").replaceAll("3", "三").replaceAll("4", "四").replaceAll("5", "五").replaceAll("6", "六").replaceAll("7", "七").replaceAll("8", "八").replaceAll("9", "九");
    }
}
