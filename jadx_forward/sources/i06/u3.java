package i06;

/* loaded from: classes15.dex */
public final class u3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.w3 f368295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f368296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(i06.w3 w3Var, yz5.a aVar) {
        super(0);
        this.f368295d = w3Var;
        this.f368296e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        f06.z zVar;
        i06.w3 w3Var = this.f368295d;
        java.util.List u07 = w3Var.f368313d.u0();
        if (u07.isEmpty()) {
            return kz5.p0.f395529d;
        }
        jz5.g a17 = jz5.h.a(jz5.i.f384363e, new i06.t3(w3Var));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(u07, 10));
        int i17 = 0;
        for (java.lang.Object obj : u07) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            f26.l2 l2Var = (f26.l2) obj;
            if (l2Var.b()) {
                zVar = f06.z.f339992c;
            } else {
                f26.o0 mo128949xfb85f7b0 = l2Var.mo128949xfb85f7b0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
                i06.w3 w3Var2 = new i06.w3(mo128949xfb85f7b0, this.f368296e != null ? new i06.s3(w3Var, i17, a17) : null);
                int ordinal = l2Var.c().ordinal();
                if (ordinal == 0) {
                    zVar = new f06.z(f06.a0.f339968d, w3Var2);
                } else if (ordinal == 1) {
                    zVar = new f06.z(f06.a0.f339969e, w3Var2);
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    zVar = new f06.z(f06.a0.f339970f, w3Var2);
                }
            }
            arrayList.add(zVar);
            i17 = i18;
        }
        return arrayList;
    }
}
