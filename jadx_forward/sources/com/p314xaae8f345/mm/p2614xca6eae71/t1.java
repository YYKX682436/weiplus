package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class t1 {

    /* renamed from: n, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2614xca6eae71.t1 f274909n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f274910o;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String[] f274917a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f274918b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f274919c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f274920d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f274921e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f274922f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f274923g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f274924h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f274925i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public boolean f274926j = true;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2614xca6eae71.m1 f274927k = new com.p314xaae8f345.mm.p2614xca6eae71.m1();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f274928l = true;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2614xca6eae71.n1 f274908m = new com.p314xaae8f345.mm.p2614xca6eae71.n1(null);

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f274911p = lp0.b.h() + "emoji/newemoji/";

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f274912q = lp0.b.h() + "emoji/qqemoji/";

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f274913r = "assets:///newemoji/";

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f274914s = "assets:///emoji/qqemoji/";

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f274915t = "config.conf";

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f274916u = "newemoji-config.xml";

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t1(android.content.Context r19, p3321xbce91901.jvm.p3324x21ffc6bd.i r20) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2614xca6eae71.t1.<init>(android.content.Context, kotlin.jvm.internal.i):void");
    }

    public static final com.p314xaae8f345.mm.p2614xca6eae71.t1 a() {
        return f274908m.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2614xca6eae71.t1.b(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final android.graphics.drawable.Drawable c(int i17) {
        java.lang.String str = i17 + ".wxam";
        gr.q.f356209a.getClass();
        android.graphics.Bitmap c17 = gr.q.f356210b.c(str);
        if (c17 == null) {
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N("assets:///emoji/qqemoji/" + str, 0, -1);
            com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.Companion companion = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE;
            boolean z17 = this.f274928l;
            c17 = companion.m43680x46823488(N, str, z17);
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQSmileyManager", "qqemoji decoder error");
            } else {
                gr.q.f356209a.getClass();
                gr.q.f356210b.e(str, z17, c17);
            }
        }
        return new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), c17);
    }

    public final com.p314xaae8f345.mm.p2614xca6eae71.h1 d(java.lang.CharSequence charSequence, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence)) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        this.f274927k.b(charSequence, i17, -1, new com.p314xaae8f345.mm.p2614xca6eae71.q1(i17, h0Var));
        return (com.p314xaae8f345.mm.p2614xca6eae71.h1) h0Var.f391656d;
    }

    public final android.graphics.drawable.Drawable e(com.p314xaae8f345.mm.p2614xca6eae71.h1 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i17 = item.f274799a;
        return i17 >= 0 ? c(i17) : b(item.f274802d);
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df f(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df c21054xf494c2df = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df) this.f274924h.get(key);
        if (c21054xf494c2df == null) {
            c21054xf494c2df = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df) this.f274925i.get(key);
        }
        if (c21054xf494c2df != null) {
            return c21054xf494c2df;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", "getSmileyInfo failed. smiley map no contains key:%s", r26.i0.t(key, "\\", "\\\\", false));
        return null;
    }

    public final synchronized void g(boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f274927k = new com.p314xaae8f345.mm.p2614xca6eae71.m1();
        java.util.Collection<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df> values = this.f274924h.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df c21054xf494c2df : values) {
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var = this.f274927k;
            int i17 = c21054xf494c2df.f67255x4a55a2ce;
            java.lang.String field_key = c21054xf494c2df.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key, "field_key");
            java.lang.String field_key2 = c21054xf494c2df.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key2, "field_key");
            m1Var.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i17, field_key, field_key2, c21054xf494c2df.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var2 = this.f274927k;
            int i18 = c21054xf494c2df.f67255x4a55a2ce;
            java.lang.String field_key3 = c21054xf494c2df.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key3, "field_key");
            java.lang.String field_qqValue = c21054xf494c2df.f67256x93f014ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_qqValue, "field_qqValue");
            m1Var2.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i18, field_key3, field_qqValue, c21054xf494c2df.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var3 = this.f274927k;
            int i19 = c21054xf494c2df.f67255x4a55a2ce;
            java.lang.String field_key4 = c21054xf494c2df.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key4, "field_key");
            java.lang.String field_cnValue = c21054xf494c2df.f67249xaa3a4d81;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_cnValue, "field_cnValue");
            m1Var3.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i19, field_key4, field_cnValue, c21054xf494c2df.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var4 = this.f274927k;
            int i27 = c21054xf494c2df.f67255x4a55a2ce;
            java.lang.String field_key5 = c21054xf494c2df.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key5, "field_key");
            java.lang.String field_twValue = c21054xf494c2df.f67258x3cdfda69;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_twValue, "field_twValue");
            m1Var4.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i27, field_key5, field_twValue, c21054xf494c2df.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var5 = this.f274927k;
            int i28 = c21054xf494c2df.f67255x4a55a2ce;
            java.lang.String field_key6 = c21054xf494c2df.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key6, "field_key");
            java.lang.String field_enValue = c21054xf494c2df.f67251x1406c403;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_enValue, "field_enValue");
            m1Var5.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i28, field_key6, field_enValue, c21054xf494c2df.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var6 = this.f274927k;
            int i29 = c21054xf494c2df.f67255x4a55a2ce;
            java.lang.String field_key7 = c21054xf494c2df.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key7, "field_key");
            java.lang.String field_thValue = c21054xf494c2df.f67257x23472918;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_thValue, "field_thValue");
            m1Var6.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i29, field_key7, field_thValue, c21054xf494c2df.f67252xf1e8cfcc));
        }
        this.f274925i.clear();
        if (!z17) {
            gr.q.f356209a.getClass();
            gr.q.f356210b.a(this.f274928l);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f274911p;
        sb6.append(str);
        java.lang.String str2 = f274915t;
        sb6.append(str2);
        int d17 = rr.t.d(sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String str3 = f274913r;
        sb7.append(str3);
        sb7.append(str2);
        int d18 = rr.t.d(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(str);
        java.lang.String str4 = f274916u;
        sb8.append(str4);
        java.lang.String sb9 = sb8.toString();
        java.lang.String str5 = str3 + str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", "updateSmiley: local:%s, asset:%s", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(d18));
        if (d17 <= 0 || d17 < d18 || !com.p314xaae8f345.mm.vfs.w6.j(sb9)) {
            this.f274923g = new java.util.ArrayList();
        } else {
            this.f274926j = false;
            java.util.ArrayList c17 = rr.t.c(new com.p314xaae8f345.mm.vfs.r6(sb9));
            this.f274923g = c17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", "updateSmiley: local size: %s", java.lang.Integer.valueOf(c17.size()));
        }
        if (this.f274923g.size() <= 0) {
            this.f274926j = true;
            java.util.ArrayList c18 = rr.t.c(new com.p314xaae8f345.mm.vfs.r6(str5));
            this.f274923g = c18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", "updateSmiley: asset size: %s", java.lang.Integer.valueOf(c18.size()));
        }
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df c21054xf494c2df2 : this.f274923g) {
            java.util.HashMap hashMap = this.f274925i;
            java.lang.String field_key8 = c21054xf494c2df2.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key8, "field_key");
            hashMap.put(field_key8, c21054xf494c2df2);
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var7 = this.f274927k;
            int i37 = c21054xf494c2df2.f67255x4a55a2ce;
            java.lang.String field_key9 = c21054xf494c2df2.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key9, "field_key");
            java.lang.String field_key10 = c21054xf494c2df2.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key10, "field_key");
            m1Var7.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i37, field_key9, field_key10, c21054xf494c2df2.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var8 = this.f274927k;
            int i38 = c21054xf494c2df2.f67255x4a55a2ce;
            java.lang.String field_key11 = c21054xf494c2df2.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key11, "field_key");
            java.lang.String field_qqValue2 = c21054xf494c2df2.f67256x93f014ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_qqValue2, "field_qqValue");
            m1Var8.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i38, field_key11, field_qqValue2, c21054xf494c2df2.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var9 = this.f274927k;
            int i39 = c21054xf494c2df2.f67255x4a55a2ce;
            java.lang.String field_key12 = c21054xf494c2df2.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key12, "field_key");
            java.lang.String field_cnValue2 = c21054xf494c2df2.f67249xaa3a4d81;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_cnValue2, "field_cnValue");
            m1Var9.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i39, field_key12, field_cnValue2, c21054xf494c2df2.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var10 = this.f274927k;
            int i47 = c21054xf494c2df2.f67255x4a55a2ce;
            java.lang.String field_key13 = c21054xf494c2df2.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key13, "field_key");
            java.lang.String field_twValue2 = c21054xf494c2df2.f67258x3cdfda69;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_twValue2, "field_twValue");
            m1Var10.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i47, field_key13, field_twValue2, c21054xf494c2df2.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var11 = this.f274927k;
            int i48 = c21054xf494c2df2.f67255x4a55a2ce;
            java.lang.String field_key14 = c21054xf494c2df2.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key14, "field_key");
            java.lang.String field_enValue2 = c21054xf494c2df2.f67251x1406c403;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_enValue2, "field_enValue");
            m1Var11.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i48, field_key14, field_enValue2, c21054xf494c2df2.f67252xf1e8cfcc));
            com.p314xaae8f345.mm.p2614xca6eae71.m1 m1Var12 = this.f274927k;
            int i49 = c21054xf494c2df2.f67255x4a55a2ce;
            java.lang.String field_key15 = c21054xf494c2df2.f67254x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key15, "field_key");
            java.lang.String field_thValue2 = c21054xf494c2df2.f67257x23472918;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_thValue2, "field_thValue");
            m1Var12.a(new com.p314xaae8f345.mm.p2614xca6eae71.h1(i49, field_key15, field_thValue2, c21054xf494c2df2.f67252xf1e8cfcc));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", "updateSmiley end use time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
