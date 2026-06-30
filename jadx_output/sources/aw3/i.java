package aw3;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final aw3.i f14843a = new aw3.i();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.LinkedList r27, int r28, dl.f0 r29) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw3.i.a(java.util.LinkedList, int, dl.f0):void");
    }

    public final void b(java.util.LinkedList textItemList, int i17, dl.f0 artists) {
        int i18;
        int i19;
        java.lang.String str;
        java.util.Iterator it;
        r45.ji0 ji0Var;
        xk0.f L;
        boolean z17;
        java.lang.String str2 = "#FFFFFF";
        java.lang.String str3 = "restoreEditorItemWithSnapShot: ";
        kotlin.jvm.internal.o.g(textItemList, "textItemList");
        kotlin.jvm.internal.o.g(artists, "artists");
        java.util.Iterator it6 = textItemList.iterator();
        while (it6.hasNext()) {
            r45.ji0 ji0Var2 = (r45.ji0) it6.next();
            try {
                java.lang.String str4 = ji0Var2.f377825g;
                if (str4 == null) {
                    str4 = str2;
                }
                i18 = android.graphics.Color.parseColor(str4);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.StickerEditor.InitWorker", str3 + e17);
                i18 = 0;
            }
            try {
                java.lang.String str5 = ji0Var2.f377826h;
                if (str5 == null) {
                    str5 = str2;
                }
                i19 = android.graphics.Color.parseColor(str5);
            } catch (java.lang.IllegalArgumentException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.StickerEditor.InitWorker", str3 + e18);
                i19 = -1;
            }
            java.lang.String str6 = ji0Var2.f377829n;
            if (str6 == null) {
                str6 = "";
            }
            r45.he6 he6Var = ji0Var2.f377832q;
            boolean z18 = he6Var != null && he6Var.f376099e > 0 && he6Var.f376100f > 0 && he6Var.f376098d;
            r45.di0 di0Var = ji0Var2.f377833r;
            boolean z19 = di0Var != null ? di0Var.f372502d : false;
            boolean z27 = di0Var != null ? di0Var.f372503e : false;
            java.lang.String str7 = str2;
            if (he6Var == null || !z18) {
                str = str3;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                android.graphics.Matrix h17 = artists.h();
                kotlin.jvm.internal.o.f(h17, "getMainMatrix(...)");
                java.lang.String str8 = ((um.g) artists.d()).A3(false) + "";
                android.graphics.Rect c17 = artists.c();
                kotlin.jvm.internal.o.f(c17, "getBoardRect(...)");
                android.graphics.Rect rect = artists.f235042d;
                kotlin.jvm.internal.o.f(rect, "getMaxInteractRect(...)");
                it = it6;
                ji0Var = ji0Var2;
                L = artists.L(context, h17, str8, c17, rect, new android.text.SpannableString(str6), i18, 0, "");
                yk0.a aVar = (yk0.a) L;
                aVar.B = z27;
                aVar.A = z19;
            } else {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                android.graphics.Matrix h18 = artists.h();
                kotlin.jvm.internal.o.f(h18, "getMainMatrix(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                str = str3;
                sb6.append(((um.g) artists.d()).A3(false));
                sb6.append("");
                java.lang.String id6 = sb6.toString();
                android.graphics.Rect c18 = artists.c();
                kotlin.jvm.internal.o.f(c18, "getBoardRect(...)");
                android.graphics.Rect rect2 = artists.f235042d;
                kotlin.jvm.internal.o.f(rect2, "getMaxInteractRect(...)");
                android.text.SpannableString spannableString = new android.text.SpannableString(str6);
                r45.he6 he6Var2 = ji0Var2.f377832q;
                kotlin.jvm.internal.o.d(he6Var2);
                int i27 = he6Var2.f376099e;
                r45.he6 he6Var3 = ji0Var2.f377832q;
                kotlin.jvm.internal.o.d(he6Var3);
                int i28 = he6Var3.f376100f;
                kotlin.jvm.internal.o.g(id6, "id");
                L = new xk0.b(context2, h18, id6, c18, rect2, spannableString, i18, 0, "", z19, z27, new android.util.Size(i27, i28));
                it = it6;
                ji0Var = ji0Var2;
            }
            if (L instanceof xk0.o) {
                int i29 = ji0Var.f377824f;
                if (i29 == 2) {
                    ((xk0.o) L).f454998J = true;
                } else if (i29 == 3) {
                    ((xk0.o) L).I = i19;
                }
                xk0.o oVar = (xk0.o) L;
                oVar.setTextSize(17.0f);
                z17 = false;
                oVar.K = false;
                oVar.G.f43450d = Integer.MAX_VALUE;
            } else {
                z17 = false;
            }
            float width = ji0Var.f377822d * artists.f235041c.width();
            float height = ji0Var.f377823e * artists.f235041c.height();
            android.graphics.Rect rect3 = artists.f235042d;
            L.h(width, height, ji0Var.f377828m, ji0Var.f377827i, 0);
            L.x((artists.f235042d.width() * 0.5f) + rect3.left, (rect3.height() * 0.5f) + artists.f235042d.top);
            if (i17 != 1) {
                L.f454960r = z17;
            }
            java.util.Stack e19 = ((um.g) artists.d()).e(z17);
            if (e19 != null) {
                e19.add(L);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StickerEditor.InitWorker", "restoreEditorItemWithSnapShot: textItem x=" + width + ", y=" + height + ", x yPercent:[" + ji0Var.f377822d + ", " + ji0Var.f377823e + "], scale=" + L.f454957o + ", rotate=" + L.f454957o);
            it6 = it;
            str2 = str7;
            str3 = str;
        }
    }
}
