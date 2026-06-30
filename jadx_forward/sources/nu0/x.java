package nu0;

/* loaded from: classes5.dex */
public final class x implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g f421665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f421666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f421667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421668d;

    public x(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g gVar, int i17, int i18, nu0.q0 q0Var) {
        this.f421665a = gVar;
        this.f421666b = i17;
        this.f421667c = i18;
        this.f421668d = q0Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.g
    public final void a(java.lang.String[] strArr, java.lang.String str) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c2;
        this.f421665a.a(strArr, str);
        if (!(str == null || str.length() == 0)) {
            return;
        }
        int i17 = this.f421667c;
        int i18 = this.f421666b;
        int i19 = (i17 + i18) - 1;
        if (i18 > i19) {
            return;
        }
        while (true) {
            nu0.q0 q0Var = this.f421668d;
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef82 = q0Var.f421608r;
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e = (!(i18 >= 0 && i18 < ((c4063x855a1ef82 == null || (m33150x5a8a256c2 = c4063x855a1ef82.m33150x5a8a256c()) == null) ? 0 : m33150x5a8a256c2.length)) || (c4063x855a1ef8 = q0Var.f421608r) == null || (m33150x5a8a256c = c4063x855a1ef8.m33150x5a8a256c()) == null) ? null : m33150x5a8a256c[i18];
            if (c4060x7aac656e != null) {
                q0Var.g7(i18, c4060x7aac656e, new nu0.w(q0Var, i18, i19));
            }
            if (i18 == i19) {
                return;
            } else {
                i18++;
            }
        }
    }
}
