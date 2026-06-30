package ef5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ef5.c f334029a = new ef5.c();

    public final android.text.SpannableString a(java.lang.String code, java.util.List tokens, v11.x highlightColors) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(code, "code");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokens, "tokens");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highlightColors, "highlightColors");
        android.text.SpannableString spannableString = new android.text.SpannableString(code);
        java.util.Iterator it = tokens.iterator();
        while (it.hasNext()) {
            gf5.y yVar = (gf5.y) it.next();
            gf5.z tokenType = yVar.f353002c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
            switch (tokenType.ordinal()) {
                case 0:
                    i17 = -4958209;
                    break;
                case 1:
                    i17 = -14254183;
                    break;
                case 2:
                case 12:
                    i17 = -16748351;
                    break;
                case 3:
                    i17 = -3653568;
                    break;
                case 4:
                    i17 = -16153000;
                    break;
                case 5:
                    i17 = -16744448;
                    break;
                case 6:
                    i17 = highlightColors.f514020a;
                    break;
                case 7:
                case 10:
                    i17 = -8823258;
                    break;
                case 8:
                    i17 = -8388608;
                    break;
                case 9:
                    i17 = -40634;
                    break;
                case 11:
                    i17 = -14442241;
                    break;
                default:
                    throw new jz5.j();
            }
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(i17), yVar.f353000a, yVar.f353001b, 33);
        }
        return spannableString;
    }
}
