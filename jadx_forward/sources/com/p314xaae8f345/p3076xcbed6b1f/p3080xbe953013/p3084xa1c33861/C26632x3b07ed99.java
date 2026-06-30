package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo */
/* loaded from: classes13.dex */
public class C26632x3b07ed99 {

    /* renamed from: destMd5InArt */
    public final java.lang.String f55754xf2f170e2;

    /* renamed from: destMd5InDvm */
    public final java.lang.String f55755xf2f17c9a;

    /* renamed from: dexDiffMd5 */
    public final java.lang.String f55756x635e8322;

    /* renamed from: dexMode */
    public final java.lang.String f55757x5d084e5a;

    /* renamed from: isJarMode */
    public final boolean f55758x70b709d4;

    /* renamed from: newOrPatchedDexCrC */
    public final java.lang.String f55759x32a83d01;

    /* renamed from: oldDexCrC */
    public final java.lang.String f55760x406a9b24;

    /* renamed from: path */
    public final java.lang.String f55761x346425;

    /* renamed from: rawName */
    public final java.lang.String f55762x3abe52d3;

    /* renamed from: realName */
    public final java.lang.String f55763xccb84949;

    public C26632x3b07ed99(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f55762x3abe52d3 = str;
        this.f55761x346425 = str2;
        this.f55755xf2f17c9a = str3;
        this.f55754xf2f170e2 = str4;
        this.f55756x635e8322 = str5;
        this.f55760x406a9b24 = str6;
        this.f55759x32a83d01 = str7;
        this.f55757x5d084e5a = str8;
        if (!str8.equals(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55632x65da1656)) {
            if (!str8.equals(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463)) {
                throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("can't recognize dex mode:".concat(str8));
            }
            this.f55758x70b709d4 = false;
            this.f55763xccb84949 = str;
            return;
        }
        this.f55758x70b709d4 = true;
        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104687x81f6e9b5(str)) {
            this.f55763xccb84949 = str;
            return;
        }
        this.f55763xccb84949 = str + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55691xbc9c2a15;
    }

    /* renamed from: checkDexDiffPatchInfo */
    public static boolean m104626x9aafc0e2(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed99) {
        if (c26632x3b07ed99 == null) {
            return false;
        }
        java.lang.String str = c26632x3b07ed99.f55762x3abe52d3;
        java.lang.String str2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104754x7b9a1122() ? c26632x3b07ed99.f55754xf2f170e2 : c26632x3b07ed99.f55755xf2f17c9a;
        return str != null && str.length() > 0 && str2 != null && str2.length() == 32;
    }

    /* renamed from: parseDexDiffPatchInfo */
    public static void m104627xbfd1408d(java.lang.String str, java.util.ArrayList<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99> arrayList) {
        java.lang.String[] split;
        if (str == null || str.length() == 0) {
            return;
        }
        for (java.lang.String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && (split = str2.split(",", 8)) != null && split.length >= 8) {
                arrayList.add(new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99(split[0].trim(), split[1].trim(), split[2].trim(), split[3].trim(), split[4].trim(), split[5].trim(), split[6].trim(), split[7].trim()));
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m104628x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55762x3abe52d3);
        stringBuffer.append(",");
        stringBuffer.append(this.f55761x346425);
        stringBuffer.append(",");
        stringBuffer.append(this.f55755xf2f17c9a);
        stringBuffer.append(",");
        stringBuffer.append(this.f55754xf2f170e2);
        stringBuffer.append(",");
        stringBuffer.append(this.f55760x406a9b24);
        stringBuffer.append(",");
        stringBuffer.append(this.f55759x32a83d01);
        stringBuffer.append(",");
        stringBuffer.append(this.f55756x635e8322);
        stringBuffer.append(",");
        stringBuffer.append(this.f55757x5d084e5a);
        return stringBuffer.toString();
    }
}
