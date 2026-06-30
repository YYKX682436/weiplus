package pl5;

/* loaded from: classes5.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final android.text.SpannableStringBuilder a(android.text.SpannableStringBuilder builder, int i17, int i18, int i19, yz5.p hasEmoji) {
        pl5.b bVar;
        boolean z17;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hasEmoji, "hasEmoji");
        int length = builder.length() - i17;
        java.lang.Object[] objArr = i18 == i19;
        int i27 = i19 + 1;
        if (i18 < 0 || i19 > length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MessageTruncateGradient", "invalid input,content size = " + builder.length() + ",colonIndex = " + i17 + ",contentStart = " + i18 + ",contentEnd = {" + i19 + '}');
            return builder;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(builder.subSequence(0, i17));
        pl5.b bVar2 = pl5.b.f438272d;
        java.lang.String spannableStringBuilder2 = builder.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spannableStringBuilder2, "toString(...)");
        if (i18 > 0 && i27 < length) {
            bVar = pl5.b.f438272d;
            int i28 = i27 + i17;
            if (b(spannableStringBuilder2, i28)) {
                int i29 = i28 - 1;
                if (b(spannableStringBuilder2, i29) && !((java.lang.Boolean) hasEmoji.mo149xb9724478(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28 + 1))).booleanValue()) {
                    z18 = false;
                    int i37 = i18 + i17;
                    int i38 = i37 - 1;
                    z17 = b(spannableStringBuilder2, i38) || !b(spannableStringBuilder2, i37) || ((java.lang.Boolean) hasEmoji.mo149xb9724478(java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i37 + 1))).booleanValue();
                    spannableStringBuilder.append(builder.subSequence(i37 - (!z17 ? 1 : 0), i28 + ((!z18 || objArr == true) ? 0 : 1)));
                }
            }
            z18 = true;
            int i372 = i18 + i17;
            int i382 = i372 - 1;
            if (b(spannableStringBuilder2, i382)) {
            }
            spannableStringBuilder.append(builder.subSequence(i372 - (!z17 ? 1 : 0), i28 + ((!z18 || objArr == true) ? 0 : 1)));
        } else if (i18 == 0 && i27 < length) {
            bVar = pl5.b.f438274f;
            int i39 = i27 + i17;
            if (b(spannableStringBuilder2, i39)) {
                int i47 = i39 - 1;
                if (b(spannableStringBuilder2, i47) && !((java.lang.Boolean) hasEmoji.mo149xb9724478(java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i39 + 1))).booleanValue()) {
                    z18 = false;
                    spannableStringBuilder.append(builder.subSequence(i17, i39 + (!z18 ? 1 : 0)));
                    z17 = false;
                }
            }
            z18 = true;
            spannableStringBuilder.append(builder.subSequence(i17, i39 + (!z18 ? 1 : 0)));
            z17 = false;
        } else if (i18 <= 0 || i27 != length) {
            bVar = pl5.b.f438275g;
            spannableStringBuilder.clear();
            spannableStringBuilder.append((java.lang.CharSequence) builder);
            z17 = false;
            z18 = false;
        } else {
            bVar = pl5.b.f438273e;
            int i48 = i18 + i17;
            int i49 = i48 - 1;
            z17 = (b(spannableStringBuilder2, i49) && b(spannableStringBuilder2, i48) && !((java.lang.Boolean) hasEmoji.mo149xb9724478(java.lang.Integer.valueOf(i49), java.lang.Integer.valueOf(i48 + 1))).booleanValue()) ? false : true;
            spannableStringBuilder.append(builder.subSequence(i48 - (!z17 ? 1 : 0), i27 + i17));
            z18 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MessageTruncateGradient", "clipContentText case = " + bVar + ",hasEmojiBefore  = " + z17 + ",hasEmojiAfter = " + z18);
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            if (!z17) {
                spannableStringBuilder.setSpan(new pl5.a(true), i17, i17 + 2, 17);
            }
            if (!z18 && objArr == false) {
                spannableStringBuilder.setSpan(new pl5.a(false), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
            }
        } else if (ordinal != 1) {
            if (ordinal == 2 && !z18) {
                spannableStringBuilder.setSpan(new pl5.a(false), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
            }
        } else if (!z17) {
            spannableStringBuilder.setSpan(new pl5.a(true), i17, i17 + 2, 17);
        }
        return spannableStringBuilder;
    }

    public static final boolean b(java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        if (i17 >= 0 && i17 < str.length()) {
            char charAt = str.charAt(i17);
            if (!java.lang.Character.isHighSurrogate(charAt) && !java.lang.Character.isLowSurrogate(charAt)) {
                return true;
            }
        }
        return false;
    }
}
