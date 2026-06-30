package l3;

/* loaded from: classes15.dex */
public class g implements l3.h {

    /* renamed from: a, reason: collision with root package name */
    public static final l3.g f396832a = new l3.g();

    @Override // l3.h
    public int a(java.lang.CharSequence charSequence, int i17, int i18) {
        int i19 = i18 + i17;
        int i27 = 2;
        while (i17 < i19 && i27 == 2) {
            byte directionality = java.lang.Character.getDirectionality(charSequence.charAt(i17));
            l3.f fVar = l3.k.f396835a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i27 = 2;
                            break;
                    }
                    i17++;
                }
                i27 = 0;
                i17++;
            }
            i27 = 1;
            i17++;
        }
        return i27;
    }
}
