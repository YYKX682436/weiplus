package df2;

/* loaded from: classes3.dex */
public final class ei implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.fi f311596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.q12 f311598c;

    public ei(df2.fi fiVar, java.lang.String str, r45.q12 q12Var) {
        this.f311596a = fiVar;
        this.f311597b = str;
        this.f311598c = q12Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        df2.fi fiVar = this.f311596a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fiVar.f311676m, "CgiFinderLiveGetUserGameConfig errType=" + fVar.f152148a + " errCode=" + fVar.f152149b);
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            java.util.LinkedList m75941xfb821914 = ((r45.hv1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getGame_user_info_list(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.n73 n73Var = (r45.n73) next;
                r45.z53 z53Var = (r45.z53) n73Var.m75936x14adae67(1);
                boolean z17 = false;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z53Var != null ? z53Var.m75945x2fec8307(0) : null)) {
                    r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z53Var2 != null ? z53Var2.m75945x2fec8307(0) : null, this.f311597b)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    obj2 = next;
                    break;
                }
            }
            r45.n73 n73Var2 = (r45.n73) obj2;
            fiVar.f311678o = n73Var2;
            if (n73Var2 != null) {
                fiVar.d7(this.f311598c);
                fiVar.c7(fiVar.b7(n73Var2));
            }
        }
        return jz5.f0.f384359a;
    }
}
