package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes9.dex */
public final class ej {
    public ej(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void b(float f17, android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = (int) (layoutParams.width * f17);
        layoutParams.height = (int) (layoutParams.height * f17);
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.content.Context r36, hs.a r37) {
        /*
            Method dump skipped, instructions count: 2275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ej.a(android.content.Context, hs.a):android.view.View");
    }

    public final void c(android.view.View view, float f17, android.content.Context context) {
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i65.a.a(context, f17);
        }
        if (view == null) {
            return;
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
