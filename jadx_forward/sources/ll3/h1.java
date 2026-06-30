package ll3;

/* loaded from: classes5.dex */
public class h1 implements ll3.g1 {

    /* renamed from: d, reason: collision with root package name */
    public long f400712d;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f400710b = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f400709a = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f400711c = 0;

    public static int b(java.lang.String str, int i17) {
        if (str == null) {
            return i17;
        }
        try {
            return str.length() <= 0 ? i17 : java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.LyricObj", e17, "getInt", new java.lang.Object[0]);
            return i17;
        }
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) ? str : str2.length() >= str.length() + (-1) ? "" : str.substring(str2.length(), str.length() - 1);
    }

    public static ll3.h1 f(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, boolean z18, boolean z19) {
        java.lang.String str5;
        java.util.regex.Matcher matcher;
        long j17;
        int i17;
        int i18;
        ll3.h1 h1Var = new ll3.h1();
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        int i19 = 0;
        int i27 = 1;
        long j18 = 0;
        java.util.ArrayList arrayList = h1Var.f400709a;
        if (K0) {
            ll3.f1 f1Var = new ll3.f1();
            f1Var.f400700a = 0L;
            if (z18) {
                f1Var.f400701b = str4;
            } else if (z17) {
                f1Var.f400701b = "";
            } else {
                f1Var.f400701b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_0);
            }
            if (f1Var.f400701b != null) {
                arrayList.add(f1Var);
            }
        } else {
            if (str != null) {
                java.lang.String str6 = " ";
                java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("(\\[((\\d{2}:\\d{2}(\\.\\d{2}){0,1}\\])|(al:|ar:|by:|offset:|re:|ti:|ve:))[^\\[]*)").matcher(str.replaceAll("\n", " ").replaceAll("\r", " "));
                while (matcher2.find()) {
                    java.lang.String group = matcher2.group();
                    matcher2.start();
                    matcher2.end();
                    if (group == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.LyricObj", "parserLine fail: lrcMgr or str is null");
                    } else if (group.startsWith("[ti:")) {
                        c(group, "[ti:");
                    } else if (group.startsWith("[ar:")) {
                        c(group, "[ar:");
                    } else if (group.startsWith("[al:")) {
                        c(group, "[al:");
                    } else if (group.startsWith("[by:")) {
                        c(group, "[by:");
                    } else if (group.startsWith("[offset:")) {
                        h1Var.f400712d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(c(group, "[offset:"), j18);
                    } else if (group.startsWith("[re:")) {
                        c(group, "[re:");
                    } else if (group.startsWith("[ve:")) {
                        c(group, "[ve:");
                    } else {
                        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\[(\\d{2}:\\d{2}(\\.\\d{2}){0,1})\\]");
                        java.util.regex.Matcher matcher3 = compile.matcher(group);
                        ll3.f1 f1Var2 = new ll3.f1();
                        while (matcher3.find()) {
                            if (matcher3.groupCount() > 0) {
                                try {
                                    java.lang.String[] split = matcher3.group(i27).split(":");
                                    int b17 = b(split[i19], i19);
                                    if (split.length > i27) {
                                        java.lang.String[] split2 = split[i27].split("\\.");
                                        i18 = b(split2[i19], i19);
                                        i17 = split2.length > i27 ? b(split2[i27], 0) : 0;
                                    } else {
                                        i17 = 0;
                                        i18 = 0;
                                    }
                                    str5 = str6;
                                    matcher = matcher2;
                                    j17 = (b17 * 60 * 1000) + (i18 * 1000) + (i17 * 10);
                                } catch (java.lang.Exception e17) {
                                    str5 = str6;
                                    matcher = matcher2;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.LyricObj", e17, "", new java.lang.Object[0]);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.LyricObj", "strToLong error: %s", e17.getLocalizedMessage());
                                    j17 = 0;
                                }
                                f1Var2.f400700a = j17;
                            } else {
                                str5 = str6;
                                matcher = matcher2;
                            }
                            java.lang.String[] split3 = compile.split(group);
                            java.util.LinkedList linkedList = h1Var.f400710b;
                            if (split3 == null || split3.length <= 0) {
                                linkedList.add(java.lang.Long.valueOf(f1Var2.f400700a));
                                str6 = str5;
                                matcher2 = matcher;
                                i19 = 0;
                                i27 = 1;
                                j18 = 0;
                                break;
                            }
                            java.lang.String str7 = split3[split3.length - 1];
                            if (str7 != null) {
                                str7 = str7.trim();
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                                str7 = str5;
                            }
                            f1Var2.f400701b = str7;
                            for (int i28 = 0; i28 < linkedList.size(); i28++) {
                                ((java.lang.Long) linkedList.get(i28)).longValue();
                            }
                            linkedList.clear();
                            if (!f1Var2.a()) {
                                int size = arrayList.size();
                                while (true) {
                                    size--;
                                    if (size < 0 || ((ll3.f1) arrayList.get(size)).f400700a == f1Var2.f400700a) {
                                        break;
                                    }
                                    if (((ll3.f1) arrayList.get(size)).f400700a < f1Var2.f400700a) {
                                        arrayList.add(size + 1, f1Var2);
                                        break;
                                    }
                                }
                                if (size < 0) {
                                    arrayList.add(0, f1Var2);
                                }
                            }
                            str6 = str5;
                            matcher2 = matcher;
                            i19 = 0;
                            i27 = 1;
                            j18 = 0;
                        }
                    }
                }
                if (h1Var.f400712d != 0) {
                    for (int i29 = 0; i29 < arrayList.size(); i29++) {
                        ((ll3.f1) arrayList.get(i29)).f400700a += h1Var.f400712d;
                    }
                    h1Var.f400712d = 0L;
                }
                for (int i37 = 0; i37 < arrayList.size() - 1; i37++) {
                    ((ll3.f1) arrayList.get(i37)).getClass();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.LyricObj", "parserLrc: but lrc or lrcMgr is null");
            }
            arrayList.size();
        }
        if (z19) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
            } else {
                ll3.f1 f1Var3 = new ll3.f1();
                f1Var3.f400700a = 0L;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                f1Var3.f400701b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k57, c01.a2.e(str3));
                if (arrayList.isEmpty()) {
                    arrayList.add(f1Var3);
                } else if (arrayList.size() == 1) {
                    arrayList.add(0, f1Var3);
                    ((ll3.f1) arrayList.get(1)).f400700a = 5000L;
                } else {
                    arrayList.add(0, f1Var3);
                    ((ll3.f1) arrayList.get(1)).f400700a = (((ll3.f1) arrayList.get(2)).f400700a >> 2) * 3;
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && z19) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
            } else {
                ll3.f1 f1Var4 = new ll3.f1();
                f1Var4.f400700a = 0L;
                f1Var4.f400701b = str2;
                if (arrayList.isEmpty()) {
                    arrayList.add(f1Var4);
                } else if (arrayList.size() == 1) {
                    arrayList.add(0, f1Var4);
                    ((ll3.f1) arrayList.get(1)).f400700a = 5000L;
                } else {
                    arrayList.add(0, f1Var4);
                    ((ll3.f1) arrayList.get(1)).f400700a = (((ll3.f1) arrayList.get(2)).f400700a >> 2) * 3;
                }
            }
        }
        android.os.SystemClock.elapsedRealtime();
        return h1Var;
    }

    public int a(long j17) {
        java.util.ArrayList arrayList = this.f400709a;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.LyricObj", "getCurIndex: but sentence list is empty");
            return -1;
        }
        if (((ll3.f1) arrayList.get(this.f400711c)).f400700a <= j17) {
            int size = arrayList.size() - 1;
            for (int i17 = this.f400711c; i17 < size; i17++) {
                if (((ll3.f1) arrayList.get(i17)).f400700a <= j17 && j17 < ((ll3.f1) arrayList.get(i17 + 1)).f400700a) {
                    this.f400711c = i17;
                    return i17;
                }
            }
            this.f400711c = size;
        } else {
            for (int i18 = this.f400711c; i18 > 0; i18--) {
                if (((ll3.f1) arrayList.get(i18)).f400700a >= j17) {
                    int i19 = i18 - 1;
                    if (j17 > ((ll3.f1) arrayList.get(i19)).f400700a) {
                        this.f400711c = i19;
                        return i19;
                    }
                }
            }
            this.f400711c = 0;
        }
        return this.f400711c;
    }

    public ll3.f1 d(int i17) {
        if (i17 < 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.f400709a;
        if (i17 >= arrayList.size()) {
            return null;
        }
        return (ll3.f1) arrayList.get(i17);
    }

    public int e() {
        return this.f400709a.size();
    }
}
