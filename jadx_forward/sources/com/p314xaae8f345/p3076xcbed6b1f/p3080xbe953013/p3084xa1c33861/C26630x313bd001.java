package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo */
/* loaded from: classes13.dex */
public class C26630x313bd001 {

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f297082md5;

    /* renamed from: name */
    public java.lang.String f55614x337a8b;

    /* renamed from: patchMd5 */
    public java.lang.String f55615x4955c816;

    /* renamed from: path */
    public java.lang.String f55616x346425;

    /* renamed from: rawCrc */
    public java.lang.String f55617xc816808c;

    public C26630x313bd001(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f55614x337a8b = str;
        this.f297082md5 = str2;
        this.f55617xc816808c = str4;
        this.f55615x4955c816 = str5;
        this.f55616x346425 = str3;
    }

    /* renamed from: checkDiffPatchInfo */
    public static boolean m104622x73671669(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26630x313bd001 c26630x313bd001) {
        if (c26630x313bd001 == null) {
            return false;
        }
        java.lang.String str = c26630x313bd001.f55614x337a8b;
        java.lang.String str2 = c26630x313bd001.f297082md5;
        return str != null && str.length() > 0 && str2 != null && str2.length() == 32;
    }

    /* renamed from: parseDiffPatchInfo */
    public static void m104623x116ae9e(java.lang.String str, java.util.ArrayList<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26630x313bd001> arrayList) {
        java.lang.String[] split;
        if (str == null || str.length() == 0) {
            return;
        }
        for (java.lang.String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && (split = str2.split(",", 5)) != null && split.length >= 5) {
                arrayList.add(new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26630x313bd001(split[0].trim(), split[2].trim(), split[1].trim(), split[3].trim(), split[4].trim()));
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m104624x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55614x337a8b);
        stringBuffer.append(",");
        stringBuffer.append(this.f55616x346425);
        stringBuffer.append(",");
        stringBuffer.append(this.f297082md5);
        stringBuffer.append(",");
        stringBuffer.append(this.f55617xc816808c);
        stringBuffer.append(",");
        stringBuffer.append(this.f55615x4955c816);
        return stringBuffer.toString();
    }
}
