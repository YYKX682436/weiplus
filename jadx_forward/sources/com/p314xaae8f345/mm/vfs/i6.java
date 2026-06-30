package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class i6 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f294534a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f294535b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f294536c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.g6 f294537d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.k6[] f294538e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f294539f;

    public i6(int i17, java.lang.String basePath, yz5.p pVar, com.p314xaae8f345.mm.vfs.g6 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePath, "basePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f294534a = i17;
        this.f294535b = basePath;
        this.f294536c = pVar;
        this.f294537d = context;
        com.p314xaae8f345.mm.vfs.k6[] k6VarArr = {com.p314xaae8f345.mm.vfs.l2.f294586l};
        this.f294538e = k6VarArr;
        this.f294539f = kz5.v.f(k6VarArr);
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        pm5.i iVar;
        java.lang.Iterable b17;
        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
        if (x1Var == null) {
            return null;
        }
        boolean z17 = x1Var.f294769f;
        int i17 = this.f294534a;
        if (!z17) {
            return b(i17, null, x1Var);
        }
        java.lang.String str = this.f294535b + '/' + x1Var.f294765b;
        com.p314xaae8f345.mm.vfs.g6 g6Var = this.f294537d;
        java.lang.String str2 = (java.lang.String) g6Var.f294490b.get(str);
        boolean z18 = g6Var.f294494f;
        com.p314xaae8f345.mm.vfs.l6 l6Var = g6Var.f294495g;
        if (str2 != null) {
            com.p314xaae8f345.mm.vfs.m6 m6Var = (com.p314xaae8f345.mm.vfs.m6) g6Var.f294489a.remove(str2);
            if (m6Var == null) {
                return b(i17, null, x1Var);
            }
            int i18 = i17 | m6Var.f294607a;
            java.lang.String str3 = m6Var.f294608b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l6Var != null ? java.lang.Boolean.valueOf(l6Var.c(i18, str3, x1Var)) : null, java.lang.Boolean.FALSE)) {
                return null;
            }
            final com.p314xaae8f345.mm.vfs.h6 h6Var = l6Var != null ? new com.p314xaae8f345.mm.vfs.h6(l6Var, i18, m6Var) : null;
            com.p314xaae8f345.mm.vfs.b8 b8Var = h6Var != null ? new com.p314xaae8f345.mm.vfs.b8(h6Var) { // from class: com.tencent.mm.vfs.k2

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ yz5.l f294559a;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h6Var, "function");
                    this.f294559a = h6Var;
                }

                @Override // com.p314xaae8f345.mm.vfs.b8
                /* renamed from: accept */
                public final /* synthetic */ boolean mo82370xab27b508(java.lang.Object obj2) {
                    return ((java.lang.Boolean) this.f294559a.mo146xb9724478(obj2)).booleanValue();
                }
            } : null;
            com.p314xaae8f345.mm.vfs.q2 q2Var = m6Var.f294609c;
            java.lang.Iterable p17 = com.p314xaae8f345.mm.vfs.e8.p(q2Var, "", z18, b8Var);
            if (p17 == null) {
                return b(i18, null, x1Var);
            }
            pm5.l lVar = new pm5.l(p17, new com.p314xaae8f345.mm.vfs.j6(i18, str3, (yz5.p) g6Var.f294493e.get(str3)));
            com.p314xaae8f345.mm.vfs.x1 m17 = q2Var.m("");
            if (m17 == null || (b17 = b(1073741824 | i18, str3, m17)) == null) {
                b17 = b(i18, null, x1Var);
            }
            iVar = z18 ? new pm5.i(lVar, b17) : new pm5.i(b17, lVar);
        } else {
            java.lang.Integer num = (java.lang.Integer) g6Var.f294491c.get(str);
            int intValue = num != null ? num.intValue() : 0;
            if ((Integer.MIN_VALUE & intValue) != 0) {
                return null;
            }
            int i19 = i17 | (intValue & 268435455);
            java.lang.Iterable b18 = b(i19, null, x1Var);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l6Var != null ? java.lang.Boolean.valueOf(l6Var.c(i19, null, x1Var)) : null, java.lang.Boolean.FALSE)) {
                return null;
            }
            java.lang.Iterable d17 = x1Var.d();
            if (d17 == null) {
                return b18;
            }
            pm5.b bVar = new pm5.b(d17, new com.p314xaae8f345.mm.vfs.i6(i19, str, (yz5.p) g6Var.f294492d.get(str), g6Var));
            iVar = z18 ? new pm5.i(bVar, b18) : new pm5.i(b18, bVar);
        }
        return iVar;
    }

    public final java.lang.Iterable b(int i17, java.lang.String str, com.p314xaae8f345.mm.vfs.x1 x1Var) {
        yz5.p pVar = this.f294536c;
        if (pVar != null) {
            i17 = ((java.lang.Number) pVar.mo149xb9724478(x1Var, java.lang.Integer.valueOf(i17))).intValue();
        }
        this.f294538e[0] = new com.p314xaae8f345.mm.vfs.k6(i17, str, x1Var);
        return this.f294539f;
    }
}
