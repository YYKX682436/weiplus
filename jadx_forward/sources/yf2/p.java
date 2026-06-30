package yf2;

/* loaded from: classes3.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf2.q f543296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543297b;

    public p(yf2.q qVar, java.lang.String str) {
        this.f543296a = qVar;
        this.f543297b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        yf2.q qVar = this.f543296a;
        if (i17 == 0 && fVar.f152149b == 0) {
            java.util.LinkedList m75941xfb821914 = ((r45.hv1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getGame_user_info_list(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r45.n73 n73Var = (r45.n73) obj2;
                r45.z53 z53Var = (r45.z53) n73Var.m75936x14adae67(1);
                boolean z17 = false;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z53Var != null ? z53Var.m75945x2fec8307(0) : null)) {
                    r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z53Var2 != null ? z53Var2.m75945x2fec8307(0) : null, this.f543297b)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    break;
                }
            }
            r45.n73 n73Var2 = (r45.n73) obj2;
            if (n73Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f543302m, "no game match");
            } else {
                java.lang.String str = qVar.f543302m;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh url:");
                r45.z53 z53Var3 = (r45.z53) n73Var2.m75936x14adae67(1);
                sb6.append(z53Var3 != null ? z53Var3.m75945x2fec8307(17) : null);
                sb6.append(", hasSet:");
                r45.z53 z53Var4 = (r45.z53) n73Var2.m75936x14adae67(1);
                sb6.append(z53Var4 != null ? java.lang.Boolean.valueOf(z53Var4.m75933x41a8a7f2(16)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f543302m, "CGI error");
        }
        return jz5.f0.f384359a;
    }
}
