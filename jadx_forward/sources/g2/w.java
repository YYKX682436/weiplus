package g2;

/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f349283a;

    /* renamed from: b, reason: collision with root package name */
    public g2.i f349284b;

    /* renamed from: c, reason: collision with root package name */
    public int f349285c;

    /* renamed from: d, reason: collision with root package name */
    public int f349286d;

    public w(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f349283a = text;
        this.f349285c = -1;
        this.f349286d = -1;
    }

    public final int a() {
        g2.i iVar = this.f349284b;
        return iVar == null ? this.f349283a.length() : (this.f349283a.length() - (this.f349286d - this.f349285c)) + (iVar.f349241a - (iVar.f349244d - iVar.f349243c));
    }

    public final void b(int i17, int i18, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        g2.i iVar = this.f349284b;
        if (iVar == null) {
            int max = java.lang.Math.max(255, text.length() + 128);
            char[] cArr = new char[max];
            int min = java.lang.Math.min(i17, 64);
            int min2 = java.lang.Math.min(this.f349283a.length() - i18, 64);
            int i19 = i17 - min;
            g2.j.a(this.f349283a, cArr, 0, i19, i17);
            int i27 = max - min2;
            int i28 = min2 + i18;
            g2.j.a(this.f349283a, cArr, i27, i18, i28);
            g2.j.a(text, cArr, min, 0, text.length());
            this.f349284b = new g2.i(cArr, min + text.length(), i27);
            this.f349285c = i19;
            this.f349286d = i28;
            return;
        }
        int i29 = this.f349285c;
        int i37 = i17 - i29;
        int i38 = i18 - i29;
        if (i37 < 0 || i38 > iVar.f349241a - (iVar.f349244d - iVar.f349243c)) {
            this.f349283a = m130712x9616526c();
            this.f349284b = null;
            this.f349285c = -1;
            this.f349286d = -1;
            b(i17, i18, text);
            return;
        }
        int length = text.length() - (i38 - i37);
        int i39 = iVar.f349244d - iVar.f349243c;
        if (length > i39) {
            int i47 = length - i39;
            int i48 = iVar.f349241a;
            do {
                i48 *= 2;
            } while (i48 - iVar.f349241a < i47);
            char[] cArr2 = new char[i48];
            kz5.v.i(iVar.f349242b, cArr2, 0, 0, iVar.f349243c);
            int i49 = iVar.f349241a;
            int i57 = iVar.f349244d;
            int i58 = i49 - i57;
            int i59 = i48 - i58;
            kz5.v.i(iVar.f349242b, cArr2, i59, i57, i58 + i57);
            iVar.f349242b = cArr2;
            iVar.f349241a = i48;
            iVar.f349244d = i59;
        }
        int i66 = iVar.f349243c;
        if (i37 < i66 && i38 <= i66) {
            int i67 = i66 - i38;
            char[] cArr3 = iVar.f349242b;
            kz5.v.i(cArr3, cArr3, iVar.f349244d - i67, i38, i66);
            iVar.f349243c = i37;
            iVar.f349244d -= i67;
        } else if (i37 >= i66 || i38 < i66) {
            int i68 = iVar.f349244d;
            int i69 = i68 - i66;
            int i76 = i37 + i69;
            char[] cArr4 = iVar.f349242b;
            kz5.v.i(cArr4, cArr4, i66, i68, i76);
            iVar.f349243c += i76 - i68;
            iVar.f349244d = i38 + i69;
        } else {
            iVar.f349244d = i38 + (iVar.f349244d - i66);
            iVar.f349243c = i37;
        }
        g2.j.a(text, iVar.f349242b, iVar.f349243c, 0, text.length());
        iVar.f349243c += text.length();
    }

    /* renamed from: toString */
    public java.lang.String m130712x9616526c() {
        g2.i iVar = this.f349284b;
        if (iVar == null) {
            return this.f349283a;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.CharSequence) this.f349283a, 0, this.f349285c);
        sb6.append(iVar.f349242b, 0, iVar.f349243c);
        char[] cArr = iVar.f349242b;
        int i17 = iVar.f349244d;
        sb6.append(cArr, i17, iVar.f349241a - i17);
        java.lang.String str = this.f349283a;
        sb6.append((java.lang.CharSequence) str, this.f349286d, str.length());
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "sb.toString()");
        return sb7;
    }
}
