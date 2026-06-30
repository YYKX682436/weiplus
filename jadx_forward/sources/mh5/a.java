package mh5;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f408028a = new java.util.HashMap(100);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wp0.b a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r23, java.lang.String r24, java.lang.String r25, android.graphics.RectF r26) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh5.a.a(com.tencent.mm.storage.f9, java.lang.String, java.lang.String, android.graphics.RectF):wp0.b");
    }

    public static wp0.b b(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, yb5.d dVar, android.view.View view) {
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicEmojiUtils", "hy: not valid msgId");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (!z17) {
            return a(Li, str2, str3, null);
        }
        android.graphics.RectF d17 = d(Li, str2, z18, dVar, view);
        if (z18 && d17 == null) {
            return null;
        }
        return a(Li, str2, str3, d17);
    }

    public static java.util.List c(yb5.d dVar, boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea;
        sb5.z zVar;
        int mo79389x2ce24761;
        int mo75762xe81a1f0f;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicEmojiUtils", "hy: chatting context lost");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar.f542250l;
        if (!(abstractC21611x7536149b instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) || (zVar = (c21628xcedb13ea = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) abstractC21611x7536149b).f279801s) == null || (mo75762xe81a1f0f = c21628xcedb13ea.C0().mo75762xe81a1f0f()) <= (mo79389x2ce24761 = c21628xcedb13ea.mo79389x2ce24761())) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        int i17 = 0;
        for (int i18 = 0; i18 <= mo75762xe81a1f0f - mo79389x2ce24761; i18++) {
            android.view.View m75885x6a486239 = c21628xcedb13ea.C0().m75885x6a486239(i18);
            if (m75885x6a486239 instanceof android.view.ViewGroup) {
                java.lang.Object tag = m75885x6a486239.getTag();
                if (tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).mo75871xfb80e389((i18 + mo79389x2ce24761) - i17);
                    if (mo75871xfb80e389 != null) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) tag;
                        if (g0Var.mo79945xb0f558d7() != null) {
                            arrayList.add(new android.util.Pair(mo75871xfb80e389, g0Var));
                            if (z17) {
                                android.view.ViewGroup viewGroup = (android.view.ViewGroup) m75885x6a486239;
                                android.view.View mo79945xb0f558d7 = g0Var.mo79945xb0f558d7();
                                ((android.view.ViewGroup) viewGroup.getParent()).setClipToPadding(false);
                                ((android.view.ViewGroup) viewGroup.getParent()).setClipChildren(false);
                                while (mo79945xb0f558d7 != viewGroup) {
                                    mo79945xb0f558d7 = (android.view.View) mo79945xb0f558d7.getParent();
                                    if (mo79945xb0f558d7 instanceof android.view.ViewGroup) {
                                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) mo79945xb0f558d7;
                                        viewGroup2.setClipChildren(false);
                                        viewGroup2.setClipToPadding(false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i17++;
        }
        return arrayList;
    }

    public static android.graphics.RectF d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String animKey, boolean z17, yb5.d dVar, android.view.View view) {
        int[] iArr;
        int width;
        int height;
        android.view.View O0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).O0(f9Var.m124847x74d37ac6());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = O0 != null ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) O0.getTag() : null;
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicEmojiUtils", "hy: msg item not found!");
            return null;
        }
        int[] iArr2 = new int[2];
        if (view == null) {
            iArr2[1] = 0;
            iArr2[0] = 0;
        } else {
            view.getLocationInWindow(iArr2);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(animKey)) {
            android.view.View mo79945xb0f558d7 = g0Var.mo79945xb0f558d7();
            if (mo79945xb0f558d7 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEmojiUtils", "hy: not having main view");
                return null;
            }
            iArr = new int[2];
            mo79945xb0f558d7.getLocationInWindow(iArr);
            width = mo79945xb0f558d7.getWidth();
            height = mo79945xb0f558d7.getHeight();
        } else {
            xq.b bVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta) ((sb5.p0) dVar.f542241c.a(sb5.p0.class))).f281522x;
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sa saVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sa) bVar;
            saVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animKey, "animKey");
            android.graphics.RectF rectF = new android.graphics.RectF();
            android.view.View b17 = saVar.b(m124847x74d37ac6);
            if (b17 != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 a17 = saVar.a(b17, animKey);
                if ((a17 != null ? a17.mo84153x22f21e20() : null) != null) {
                    android.graphics.RectF a18 = xq.a.f537502a.a(a17);
                    int[] iArr3 = new int[2];
                    a17.getLocationInWindow(iArr3);
                    int i17 = iArr3[0];
                    int i18 = iArr3[1];
                    rectF.set(a18);
                    rectF.offset(i17 + a17.getPaddingLeft(), i18 + a17.getPaddingTop());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(saVar.f281465b.f281506e, "updateView: no layout");
                }
            }
            iArr = new int[]{(int) rectF.left, (int) rectF.top};
            width = (int) rectF.width();
            height = (int) rectF.height();
        }
        if (z17) {
            android.graphics.Point point = new android.graphics.Point(view.getWidth(), view.getHeight());
            int i19 = iArr2[0];
            int i27 = iArr2[1];
            android.graphics.Rect rect = new android.graphics.Rect(i19, i27, point.x + i19, point.y + i27);
            int i28 = iArr[0];
            int i29 = iArr[1];
            if (!new android.graphics.Rect(i28, i29, width + i28, height + i29).intersect(rect)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicEmojiUtils", "hy: main view not in the window location");
                return null;
            }
        }
        if (iArr.length < 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicEmojiUtils", "hy: window or view lost");
            return null;
        }
        float f17 = iArr[0] - iArr2[0];
        float f18 = iArr[1] - iArr2[1];
        return new android.graphics.RectF(f17, f18, width + f17, height + f18);
    }
}
