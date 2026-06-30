package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareResPatchInfo */
/* loaded from: classes13.dex */
public class C26640xcfe0bdb5 {

    /* renamed from: arscBaseCrc */
    public java.lang.String f55912x49932fc2 = null;

    /* renamed from: resArscMd5 */
    public java.lang.String f55918x295b92bd = null;

    /* renamed from: addRes */
    public java.util.ArrayList<java.lang.String> f55911xab35f83f = new java.util.ArrayList<>();

    /* renamed from: deleteRes */
    public java.util.ArrayList<java.lang.String> f55913xea9e56f5 = new java.util.ArrayList<>();

    /* renamed from: modRes */
    public java.util.ArrayList<java.lang.String> f55916xc04b223e = new java.util.ArrayList<>();

    /* renamed from: storeRes */
    public java.util.HashMap<java.lang.String, java.io.File> f55919x66598fff = new java.util.HashMap<>();

    /* renamed from: largeModRes */
    public java.util.ArrayList<java.lang.String> f55915x9ae73159 = new java.util.ArrayList<>();

    /* renamed from: largeModMap */
    public java.util.HashMap<java.lang.String, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5.LargeModeInfo> f55914x9ae71e15 = new java.util.HashMap<>();

    /* renamed from: patterns */
    public java.util.HashSet<java.util.regex.Pattern> f55917x4a4486e3 = new java.util.HashSet<>();

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareResPatchInfo$LargeModeInfo */
    /* loaded from: classes13.dex */
    public static class LargeModeInfo {
        public long crc;

        /* renamed from: md5, reason: collision with root package name */
        public java.lang.String f297083md5 = null;

        /* renamed from: file */
        public java.io.File f55920x2ff57c = null;
    }

    /* renamed from: checkFileInPattern */
    public static boolean m104709x9f02a067(java.util.HashSet<java.util.regex.Pattern> hashSet, java.lang.String str) {
        if (hashSet.isEmpty()) {
            return false;
        }
        java.util.Iterator<java.util.regex.Pattern> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: checkResPatchInfo */
    public static boolean m104710x9cff9d7e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5 c26640xcfe0bdb5) {
        java.lang.String str;
        return (c26640xcfe0bdb5 == null || (str = c26640xcfe0bdb5.f55918x295b92bd) == null || str.length() != 32) ? false : true;
    }

    /* renamed from: convertToPatternString */
    private static java.util.regex.Pattern m104711x97292ad3(java.lang.String str) {
        if (str.contains(".")) {
            str = str.replaceAll("\\.", "\\\\.");
        }
        if (str.contains("?")) {
            str = str.replaceAll("\\?", "\\.");
        }
        if (str.contains("*")) {
            str = str.replace("*", ".*");
        }
        return java.util.regex.Pattern.compile(str);
    }

    /* renamed from: parseAllResPatchInfo */
    public static void m104712xcaf9564(java.lang.String str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5 c26640xcfe0bdb5) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String[] split = str.split("\n");
        int i17 = 0;
        while (i17 < split.length) {
            java.lang.String str2 = split[i17];
            if (str2 != null && str2.length() > 0) {
                if (str2.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55723x4b2069b9)) {
                    java.lang.String[] split2 = str2.split(",", 3);
                    c26640xcfe0bdb5.f55912x49932fc2 = split2[1];
                    c26640xcfe0bdb5.f55918x295b92bd = split2[2];
                } else if (str2.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55721x17f2df2a)) {
                    for (int parseInt = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt > 0; parseInt--) {
                        i17++;
                        c26640xcfe0bdb5.f55917x4a4486e3.add(m104711x97292ad3(split[i17]));
                    }
                } else if (str2.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55712x5776fbfb)) {
                    for (int parseInt2 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt2 > 0; parseInt2--) {
                        i17++;
                        c26640xcfe0bdb5.f55911xab35f83f.add(split[i17]);
                    }
                } else if (str2.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55718xc1591d9c)) {
                    for (int parseInt3 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt3 > 0; parseInt3--) {
                        i17++;
                        c26640xcfe0bdb5.f55916xc04b223e.add(split[i17]);
                    }
                } else if (str2.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55715x6ac7f0b8)) {
                    for (int parseInt4 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt4 > 0; parseInt4--) {
                        i17++;
                        java.lang.String[] split3 = split[i17].split(",", 3);
                        java.lang.String str3 = split3[0];
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5.LargeModeInfo largeModeInfo = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5.LargeModeInfo();
                        largeModeInfo.f297083md5 = split3[1];
                        largeModeInfo.crc = java.lang.Long.parseLong(split3[2]);
                        c26640xcfe0bdb5.f55915x9ae73159.add(str3);
                        c26640xcfe0bdb5.f55914x9ae71e15.put(str3, largeModeInfo);
                    }
                } else if (str2.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55714x23574fe5)) {
                    for (int parseInt5 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt5 > 0; parseInt5--) {
                        i17++;
                        c26640xcfe0bdb5.f55913xea9e56f5.add(split[i17]);
                    }
                } else if (str2.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55722x36e113fb)) {
                    for (int parseInt6 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt6 > 0; parseInt6--) {
                        i17++;
                        c26640xcfe0bdb5.f55919x66598fff.put(split[i17], null);
                    }
                }
            }
            i17++;
        }
    }

    /* renamed from: parseResPatchInfoFirstLine */
    public static void m104713x1a85821b(java.lang.String str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5 c26640xcfe0bdb5) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String str2 = str.split("\n")[0];
        if (str2 == null || str2.length() <= 0) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("res meta Corrupted:".concat(str));
        }
        java.lang.String[] split = str2.split(",", 3);
        c26640xcfe0bdb5.f55912x49932fc2 = split[1];
        c26640xcfe0bdb5.f55918x295b92bd = split[2];
    }

    /* renamed from: toString */
    public java.lang.String m104714x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("resArscMd5:" + this.f55918x295b92bd + "\n");
        stringBuffer.append("arscBaseCrc:" + this.f55912x49932fc2 + "\n");
        java.util.Iterator<java.util.regex.Pattern> it = this.f55917x4a4486e3.iterator();
        while (it.hasNext()) {
            stringBuffer.append(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55721x17f2df2a + it.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it6 = this.f55911xab35f83f.iterator();
        while (it6.hasNext()) {
            stringBuffer.append("addedSet:" + it6.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it7 = this.f55916xc04b223e.iterator();
        while (it7.hasNext()) {
            stringBuffer.append("modifiedSet:" + it7.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it8 = this.f55915x9ae73159.iterator();
        while (it8.hasNext()) {
            stringBuffer.append("largeModifiedSet:" + it8.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it9 = this.f55913xea9e56f5.iterator();
        while (it9.hasNext()) {
            stringBuffer.append("deletedSet:" + it9.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it10 = this.f55919x66598fff.keySet().iterator();
        while (it10.hasNext()) {
            stringBuffer.append("storeSet:" + it10.next() + "\n");
        }
        return stringBuffer.toString();
    }
}
