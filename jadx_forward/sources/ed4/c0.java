package ed4;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ed4.c0 f332822a = new ed4.c0();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(int r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "getWording"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.WsFoldWordManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r2 = 1
            java.lang.String r3 = "getString(...)"
            if (r7 == r2) goto L6e
            r4 = 3
            if (r7 == r4) goto L61
            r4 = 5
            r5 = 2131776871(0x7f105567, float:1.9185227E38)
            if (r7 == r4) goto L57
            r4 = 15
            if (r7 == r4) goto L4d
            r4 = 28
            r5 = 2131776867(0x7f105563, float:1.9185218E38)
            if (r7 == r4) goto L43
            r4 = 50
            if (r7 == r4) goto L39
            r4 = 54
            if (r7 == r4) goto L6e
            r4 = 59
            if (r7 == r4) goto L2f
            java.lang.String r4 = ""
            goto L7a
        L2f:
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r4 = i65.a.r(r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
            goto L7a
        L39:
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r4 = i65.a.r(r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
            goto L7a
        L43:
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r4 = i65.a.r(r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
            goto L7a
        L4d:
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r4 = i65.a.r(r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
            goto L7a
        L57:
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r4 = i65.a.r(r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
            goto L7a
        L61:
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r5 = 2131776866(0x7f105562, float:1.9185216E38)
            java.lang.String r4 = i65.a.r(r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
            goto L7a
        L6e:
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r5 = 2131776868(0x7f105564, float:1.918522E38)
            java.lang.String r4 = i65.a.r(r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
        L7a:
            int r5 = r4.length()
            if (r5 != 0) goto L82
            r5 = r2
            goto L83
        L82:
            r5 = 0
        L83:
            if (r5 == 0) goto L9e
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 2131776863(0x7f10555f, float:1.918521E38)
            java.lang.String r4 = r2.getString(r5, r4)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
            goto Lc4
        L9e:
            if (r8 <= r2) goto Lc4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 2131776869(0x7f105565, float:1.9185223E38)
            java.lang.String r3 = r3.getString(r5, r4)
            r2.append(r3)
            java.lang.String r4 = r2.toString()
        Lc4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[getWording] type = "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = ", size = "
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = ", wording = "
            r2.append(r7)
            r2.append(r4)
            java.lang.String r7 = r2.toString()
            java.lang.String r8 = "WsFoldWord"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ed4.c0.a(int, int):java.lang.String");
    }
}
