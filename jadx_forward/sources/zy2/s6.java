package zy2;

/* loaded from: classes2.dex */
public interface s6 extends i95.m {
    static /* synthetic */ android.text.SpannableString H3(zy2.s6 s6Var, java.lang.CharSequence charSequence, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseRichText");
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        return ((ht2.y0) s6Var).mj(charSequence, i17, z17);
    }

    static android.text.SpannableStringBuilder J7(zy2.s6 s6Var, int i17, android.text.Spannable prefix, android.content.Context context, boolean z17, int i18, int i19, boolean z18, int i27, java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatRecommendDescSpannable");
        }
        if ((i27 & 16) != 0) {
            i18 = 0;
        }
        if ((i27 & 32) != 0) {
            i19 = -1;
        }
        if ((i27 & 64) != 0) {
            z18 = false;
        }
        ((ht2.y0) s6Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(prefix);
        spannableStringBuilder.length();
        if (z17) {
            int i28 = z18 ? com.p314xaae8f345.mm.R.raw.f79745xc84de94e : com.p314xaae8f345.mm.R.raw.f80124xebd44b8e;
            if (i18 == 0) {
                i18 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6);
            }
            drawable = com.p314xaae8f345.mm.ui.uk.e(context, i28, i18);
            if (i19 == -1) {
                i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185862p;
            }
            drawable.setBounds(0, 0, i19, i19);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
        } else {
            drawable = null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(spannableStringBuilder);
        if (drawable != null) {
            spannableStringBuilder2.setSpan(new al5.w(drawable, 1), prefix.length(), prefix.length() + 1, 17);
        }
        return spannableStringBuilder2;
    }

    static android.text.SpannableStringBuilder Ne(zy2.s6 s6Var, int i17, java.lang.String prefix, android.content.Context context, boolean z17, int i18, int i19, boolean z18, int i27, java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatRecommendDesc");
        }
        if ((i27 & 16) != 0) {
            i18 = 0;
        }
        if ((i27 & 32) != 0) {
            i19 = -1;
        }
        if ((i27 & 64) != 0) {
            z18 = false;
        }
        ((ht2.y0) s6Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(prefix);
        sb6.length();
        if (z17) {
            int i28 = z18 ? com.p314xaae8f345.mm.R.raw.f79745xc84de94e : com.p314xaae8f345.mm.R.raw.f80124xebd44b8e;
            if (i18 == 0) {
                i18 = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6);
            }
            drawable = com.p314xaae8f345.mm.ui.uk.e(context, i28, i18);
            if (i19 == -1) {
                i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185862p;
            }
            drawable.setBounds(0, 0, i19, i19);
            sb6.append(" ");
        } else {
            drawable = null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(sb6);
        if (drawable != null) {
            spannableStringBuilder.setSpan(new al5.w(drawable, 1), prefix.length(), prefix.length() + 1, 17);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01bb A[Catch: Exception -> 0x0359, TryCatch #1 {Exception -> 0x0359, blocks: (B:32:0x00e3, B:38:0x010e, B:39:0x0113, B:42:0x0121, B:45:0x012c, B:48:0x0135, B:52:0x0141, B:56:0x0199, B:58:0x01b4, B:60:0x01c3, B:62:0x01c9, B:66:0x01d2, B:69:0x024c, B:70:0x0274, B:72:0x027a, B:77:0x02ae, B:79:0x02b4, B:82:0x02c0, B:85:0x02d1, B:90:0x02dd, B:95:0x031b, B:99:0x0332, B:109:0x01bb, B:115:0x0351), top: B:26:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[Catch: Exception -> 0x010b, TryCatch #0 {Exception -> 0x010b, blocks: (B:20:0x0063, B:25:0x0075, B:28:0x00c3, B:30:0x00cc, B:34:0x00ee, B:36:0x0105, B:37:0x0108, B:110:0x00d4, B:117:0x0355), top: B:19:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[Catch: Exception -> 0x010b, TRY_ENTER, TryCatch #0 {Exception -> 0x010b, blocks: (B:20:0x0063, B:25:0x0075, B:28:0x00c3, B:30:0x00cc, B:34:0x00ee, B:36:0x0105, B:37:0x0108, B:110:0x00d4, B:117:0x0355), top: B:19:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: Exception -> 0x0359, TRY_ENTER, TryCatch #1 {Exception -> 0x0359, blocks: (B:32:0x00e3, B:38:0x010e, B:39:0x0113, B:42:0x0121, B:45:0x012c, B:48:0x0135, B:52:0x0141, B:56:0x0199, B:58:0x01b4, B:60:0x01c3, B:62:0x01c9, B:66:0x01d2, B:69:0x024c, B:70:0x0274, B:72:0x027a, B:77:0x02ae, B:79:0x02b4, B:82:0x02c0, B:85:0x02d1, B:90:0x02dd, B:95:0x031b, B:99:0x0332, B:109:0x01bb, B:115:0x0351), top: B:26:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0199 A[EDGE_INSN: B:55:0x0199->B:56:0x0199 BREAK  A[LOOP:0: B:39:0x0113->B:52:0x0141], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b4 A[Catch: Exception -> 0x0359, TryCatch #1 {Exception -> 0x0359, blocks: (B:32:0x00e3, B:38:0x010e, B:39:0x0113, B:42:0x0121, B:45:0x012c, B:48:0x0135, B:52:0x0141, B:56:0x0199, B:58:0x01b4, B:60:0x01c3, B:62:0x01c9, B:66:0x01d2, B:69:0x024c, B:70:0x0274, B:72:0x027a, B:77:0x02ae, B:79:0x02b4, B:82:0x02c0, B:85:0x02d1, B:90:0x02dd, B:95:0x031b, B:99:0x0332, B:109:0x01bb, B:115:0x0351), top: B:26:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c9 A[Catch: Exception -> 0x0359, TryCatch #1 {Exception -> 0x0359, blocks: (B:32:0x00e3, B:38:0x010e, B:39:0x0113, B:42:0x0121, B:45:0x012c, B:48:0x0135, B:52:0x0141, B:56:0x0199, B:58:0x01b4, B:60:0x01c3, B:62:0x01c9, B:66:0x01d2, B:69:0x024c, B:70:0x0274, B:72:0x027a, B:77:0x02ae, B:79:0x02b4, B:82:0x02c0, B:85:0x02d1, B:90:0x02dd, B:95:0x031b, B:99:0x0332, B:109:0x01bb, B:115:0x0351), top: B:26:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027a A[Catch: Exception -> 0x0359, TryCatch #1 {Exception -> 0x0359, blocks: (B:32:0x00e3, B:38:0x010e, B:39:0x0113, B:42:0x0121, B:45:0x012c, B:48:0x0135, B:52:0x0141, B:56:0x0199, B:58:0x01b4, B:60:0x01c3, B:62:0x01c9, B:66:0x01d2, B:69:0x024c, B:70:0x0274, B:72:0x027a, B:77:0x02ae, B:79:0x02b4, B:82:0x02c0, B:85:0x02d1, B:90:0x02dd, B:95:0x031b, B:99:0x0332, B:109:0x01bb, B:115:0x0351), top: B:26:0x00c1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.text.SpannableString l6(zy2.s6 r23, java.lang.CharSequence r24, int r25, boolean r26, java.util.regex.Pattern r27, int r28, boolean r29, yz5.a r30, int r31, java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zy2.s6.l6(zy2.s6, java.lang.CharSequence, int, boolean, java.util.regex.Pattern, int, boolean, yz5.a, int, java.lang.Object):android.text.SpannableString");
    }
}
