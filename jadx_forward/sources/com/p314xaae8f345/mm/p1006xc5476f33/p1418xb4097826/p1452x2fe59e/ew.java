package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ew {
    public ew(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(int i17) {
        return i17 > 99 ? "99+" : java.lang.String.valueOf(i17);
    }

    public final java.lang.CharSequence b(android.content.Context context, int i17, int i18, int i19, int i27) {
        if (i17 == 1 && i18 == 0 && i19 == 0) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eo8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (i17 > 1 && i18 == 0 && i19 == 0) {
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573458eo1, a(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        if (i17 >= 1 && i18 == 0 && i19 > 0) {
            java.lang.String string3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eno, a(i27));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
            return string3;
        }
        if ((i17 < 1 && i19 <= 0) || i18 <= 0) {
            return "";
        }
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        java.lang.String string4 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573482er1, a(i18));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        return hc2.x0.k(string4, context2, '#', com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0094, code lost:
    
        if (r3.f186860a == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() {
        /*
            r9 = this;
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC
            r2 = 0
            int r7 = r0.r(r1, r2)
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC
            int r0 = r0.r(r1, r2)
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC
            int r1 = r1.r(r3, r2)
            gm0.b0 r3 = gm0.j1.u()
            com.tencent.mm.storage.n3 r3 = r3.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC
            int r3 = r3.r(r4, r2)
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC
            int r5 = r4.r(r5, r2)
            int r0 = r0 + r1
            int r6 = r0 + r3
            int r0 = r7 + r6
            int r8 = r0 + r5
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r3 = 14
            int r1 = i65.a.b(r1, r3)
            float r1 = (float) r1
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            float r3 = i65.a.q(r3)
            float r1 = r1 * r3
            r0.setTextSize(r1)
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.p314xaae8f345.mm.ui.bk.r0(r0, r1)
            if (r8 <= 0) goto L84
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r1 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r1)
            r3 = r9
            java.lang.CharSequence r1 = r3.d(r4, r5, r6, r7, r8)
            java.lang.String r1 = r1.toString()
            float r1 = r0.measureText(r1)
            int r1 = (int) r1
            goto L85
        L84:
            r1 = r2
        L85:
            com.tencent.mm.plugin.finder.extension.reddot.aa r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a
            androidx.lifecycle.j0 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.E
            java.lang.Object r3 = r3.mo3195x754a37bb()
            com.tencent.mm.plugin.finder.extension.reddot.z9 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) r3
            if (r3 == 0) goto L97
            r4 = 1
            boolean r3 = r3.f186860a
            if (r3 != r4) goto L97
            goto L98
        L97:
            r4 = r2
        L98:
            if (r4 == 0) goto Lb1
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131767405(0x7f10306d, float:1.9166027E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            float r0 = r0.measureText(r2)
            int r2 = (int) r0
        Lb1:
            if (r1 <= r2) goto Lb5
            r0 = r1
            goto Lb6
        Lb5:
            r0 = r2
        Lb6:
            com.tencent.mm.plugin.finder.feed.ew r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.M1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "bubbleWidth :"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " privateMsgWidth:"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " width:"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FinderTimelinePresenter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165397(0x7f0700d5, float:1.794501E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131166985(0x7f070709, float:1.794823E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            if (r0 <= r1) goto Lfb
            int r2 = r2 + r0
            int r2 = r2 - r1
        Lfb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ew.c():int");
    }

    public final java.lang.CharSequence d(android.content.Context context, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i18 == 0) {
            if (i17 > 0) {
                return b(context, i17, i18, i19, i27);
            }
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eno, a(i19));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (i19 == 0) {
            if (i17 > 0) {
                return b(context, i17, i18, i19, i27);
            }
            int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eny, a(i18));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            return hc2.x0.k(string2, context2, '#', com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        }
        if (i17 > 0) {
            return b(context, i17, i18, i19, i27);
        }
        int dimension2 = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        java.lang.String string3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573482er1, a(i27));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        return hc2.x0.k(string3, context3, '#', com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230, dimension2, dimension2, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
    }
}
