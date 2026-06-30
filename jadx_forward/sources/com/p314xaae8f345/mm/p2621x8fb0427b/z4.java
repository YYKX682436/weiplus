package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes12.dex */
public class z4 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.z4 f277924j = new com.p314xaae8f345.mm.p2621x8fb0427b.z4();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f277926b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f277925a = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f277927c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f277928d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f277929e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f277930f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f277931g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f277932h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Comparator f277933i = new com.p314xaae8f345.mm.p2621x8fb0427b.a5(this);

    public final void a(java.util.ArrayList arrayList, int i17) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z85.j jVar = (z85.j) it.next();
            java.lang.String str = jVar.f68947x225aa2b6;
            java.lang.String str2 = jVar.f68951x4b6e68b9;
            java.lang.String str3 = jVar.f68950x225e3613;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                java.lang.String lowerCase = str.toLowerCase();
                java.util.HashMap hashMap = this.f277930f;
                if (hashMap.containsKey(lowerCase)) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap.get(lowerCase);
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(new com.p314xaae8f345.mm.p2621x8fb0427b.c5(this, str2, i17, -1, -1));
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(new com.p314xaae8f345.mm.p2621x8fb0427b.c5(this, str2, i17, -1, -1));
                    hashMap.put(lowerCase, arrayList3);
                }
                boolean equals = str3.equals(this.f277926b);
                java.util.HashMap hashMap2 = this.f277927c;
                if (equals) {
                    hashMap2.put(str2, lowerCase);
                } else if (str3.equals("default") && !hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, lowerCase);
                }
            }
        }
    }

    public final void b() {
        java.util.HashMap hashMap = this.f277927c;
        if (hashMap != null) {
            hashMap.clear();
        }
        java.util.HashMap hashMap2 = this.f277928d;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        java.util.HashMap hashMap3 = this.f277929e;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        synchronized (this) {
            this.f277930f.clear();
            this.f277931g.clear();
        }
    }

    public java.lang.String c(java.lang.String str) {
        java.util.HashMap hashMap = this.f277927c;
        if (hashMap != null && hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "getCurLangDesc: from map");
            return (java.lang.String) hashMap.get(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "getCurLangDesc: from db");
        z85.k a17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().a();
        a17.getClass();
        java.lang.String format = java.lang.String.format("select %s from %s where %s=?", "desc", "EmojiInfoDesc", "md5_lang");
        java.lang.String[] strArr = {str + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().toLowerCase()};
        l75.k0 k0Var = a17.f552338d;
        android.database.Cursor f17 = k0Var.f(format, strArr, 2);
        java.lang.String string = f17.moveToFirst() ? f17.getString(f17.getColumnIndex("desc")) : null;
        f17.close();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            android.database.Cursor f18 = k0Var.f(format, new java.lang.String[]{str + "default"}, 2);
            if (f18.moveToFirst()) {
                string = f18.getString(f18.getColumnIndex("desc"));
            }
            f18.close();
        }
        return string;
    }

    public boolean d() {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_custom_emoji_recognition, false) || ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            return false;
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.toUpperCase().equals("CN");
    }

    public boolean e() {
        return (!d() || com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.wi() || (c01.z1.j() & 1152921504606846976L) == 0) ? false : true;
    }

    public final boolean f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f277931g.containsKey(str)) {
            return true;
        }
        if (this.f277932h <= 0 || str.length() > 32 || e()) {
            return false;
        }
        int a17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.a(str);
        return (a17 <= 0 || a17 != str.length()) ? str.length() + a17 >= this.f277932h * 2 : str.length() >= this.f277932h;
    }

    public void g() {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p2621x8fb0427b.b5(this), "MicroMsg.emoji.EmojiDescNewMgr|newinit");
    }

    public void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "setCustomEmotionRecognitionEnabled: enabled=" + z17);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new z85.g0(z17, null), 3, null);
        long j17 = c01.z1.j();
        c01.z1.Q(java.lang.Long.valueOf(z17 ? j17 | 1152921504606846976L : j17 & (-1152921504606846977L)));
        g();
    }

    public final java.lang.String i(java.lang.String str) {
        java.lang.String replace = str.toLowerCase().replace(" ", "");
        if (replace == null) {
            return null;
        }
        char[] charArray = replace.toCharArray();
        for (int i17 = 0; i17 < charArray.length; i17++) {
            char c17 = charArray[i17];
            if (c17 == 12288) {
                charArray[i17] = ' ';
            } else if (c17 > 65280 && c17 < 65375) {
                charArray[i17] = (char) (c17 - 65248);
            }
        }
        return new java.lang.String(charArray);
    }
}
