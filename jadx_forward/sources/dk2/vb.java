package dk2;

/* loaded from: classes3.dex */
public final class vb implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.ac f315778a;

    public vb(dk2.ac acVar) {
        this.f315778a = acVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        dk2.ac acVar = this.f315778a;
        if (b17) {
            r45.ab2 ab2Var = (r45.ab2) ke2.o0.f388509v.a(fVar, new r45.ab2());
            java.lang.String m75945x2fec8307 = ab2Var != null ? ab2Var.m75945x2fec8307(0) : null;
            java.lang.String str = acVar.f314736g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type ");
            r45.bd5 bd5Var = acVar.f314730a;
            sb6.append(bd5Var != null ? java.lang.Integer.valueOf(bd5Var.m75939xb282bd08(13)) : null);
            sb6.append(" productID ");
            sb6.append(acVar.f314731b);
            sb6.append(" success wording ");
            sb6.append(m75945x2fec8307);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(acVar.f314732c);
                e4Var.f293309c = m75945x2fec8307;
                e4Var.c();
            }
            acVar.f314735f.mo152xb9724478();
        } else {
            java.lang.String str2 = acVar.f314736g;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("type ");
            r45.bd5 bd5Var2 = acVar.f314730a;
            sb7.append(bd5Var2 != null ? java.lang.Integer.valueOf(bd5Var2.m75939xb282bd08(13)) : null);
            sb7.append(" productID ");
            sb7.append(acVar.f314731b);
            sb7.append(" fail errType ");
            sb7.append(fVar.f152148a);
            sb7.append(" errCode ");
            sb7.append(fVar.f152149b);
            sb7.append(" errMsg ");
            sb7.append(fVar.f152150c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
        }
        return jz5.f0.f384359a;
    }
}
