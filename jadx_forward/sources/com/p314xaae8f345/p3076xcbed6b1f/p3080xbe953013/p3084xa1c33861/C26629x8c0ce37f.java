package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo */
/* loaded from: classes13.dex */
public class C26629x8c0ce37f {

    /* renamed from: name */
    public java.lang.String f55611x337a8b;

    /* renamed from: patchMd5 */
    public java.lang.String f55612x4955c816;

    /* renamed from: path */
    public java.lang.String f55613x346425;

    public C26629x8c0ce37f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f55611x337a8b = str2;
        this.f55612x4955c816 = str3;
        this.f55613x346425 = str;
    }

    /* renamed from: checkDiffPatchInfo */
    public static boolean m104619x73671669(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f c26629x8c0ce37f) {
        if (c26629x8c0ce37f == null) {
            return false;
        }
        java.lang.String str = c26629x8c0ce37f.f55611x337a8b;
        java.lang.String str2 = c26629x8c0ce37f.f55612x4955c816;
        return str != null && str.length() > 0 && str2 != null && str2.length() == 32;
    }

    /* renamed from: parseDiffPatchInfo */
    public static void m104620x116ae9e(java.lang.String str, java.util.ArrayList<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f> arrayList) {
        java.lang.String[] split;
        if (str == null || arrayList == null) {
            return;
        }
        for (java.lang.String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && (split = str2.split(",", 4)) != null && split.length >= 3) {
                arrayList.add(new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f(split[1].trim(), split[0].trim(), split[2].trim()));
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m104621x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55611x337a8b);
        stringBuffer.append(",");
        stringBuffer.append(this.f55613x346425);
        stringBuffer.append(",");
        stringBuffer.append(this.f55612x4955c816);
        return stringBuffer.toString();
    }
}
