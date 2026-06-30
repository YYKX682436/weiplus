package vu0;

/* loaded from: classes5.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ne4 f521619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r45.ne4 ne4Var) {
        super(1);
        this.f521619d = ne4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.me4 me4Var;
        java.util.LinkedList linkedList;
        ru0.h uniqueHexKey = (ru0.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueHexKey, "uniqueHexKey");
        jz5.g gVar = ru0.m.f481222a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        r45.ne4 ne4Var = this.f521619d;
        if (ne4Var != null) {
            java.util.LinkedList linkedList2 = ne4Var.f462844e;
            if (!((linkedList2 == null || (me4Var = (r45.me4) kz5.n0.a0(linkedList2, 0)) == null || (linkedList = me4Var.f461945f) == null || !linkedList.isEmpty()) ? false : true)) {
                if (!ru0.m.a().m()) {
                    ru0.m.a().J();
                }
                com.p314xaae8f345.mm.vfs.r6 r6Var = uniqueHexKey.f481208a;
                if (!r6Var.m()) {
                    r6Var.J();
                }
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(uniqueHexKey.f481209b, false, true);
                com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var.f294699d;
                if (l17 != null && !l17.isEmpty()) {
                    java.lang.String str = z7Var.f294812f;
                    z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str + '/' + l17, z7Var.f294813g, z7Var.f294814h);
                }
                com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                jz5.f0 f0Var2 = null;
                com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(z7Var, null);
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        byte[] D = pm0.v.D(ne4Var);
                        if (D != null) {
                            java.io.OutputStream I = com.p314xaae8f345.mm.vfs.w6.I(z7Var, b3Var.m(z7Var, m17), false);
                            try {
                                I.write(D);
                                vz5.b.a(I, null);
                                f0Var2 = f0Var;
                            } finally {
                            }
                        }
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var2);
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                }
            }
        }
        return f0Var;
    }
}
