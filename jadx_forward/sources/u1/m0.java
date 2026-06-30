package u1;

/* loaded from: classes14.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.w f505156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0.i f505157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(u1.w wVar, o0.i iVar) {
        super(2);
        this.f505156d = wVar;
        this.f505157e = iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        u1.i1 i1Var;
        u1.j1 lastProvider = (u1.j1) obj;
        z0.s mod = (z0.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastProvider, "lastProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mod, "mod");
        boolean z17 = mod instanceof t1.b;
        u1.w wVar = this.f505156d;
        if (z17) {
            t1.b bVar = (t1.b) mod;
            wVar.getClass();
            o0.i iVar = this.f505157e;
            int i18 = iVar.f423385f;
            if (i18 > 0) {
                java.lang.Object[] objArr = iVar.f423383d;
                i17 = 0;
                do {
                    if (((u1.i1) objArr[i17]).f505136e == bVar) {
                        break;
                    }
                    i17++;
                } while (i17 < i18);
            }
            i17 = -1;
            if (i17 < 0) {
                i1Var = new u1.i1(lastProvider, bVar);
            } else {
                i1Var = (u1.i1) iVar.m(i17);
                i1Var.getClass();
                i1Var.f505135d = lastProvider;
            }
            lastProvider.f505146i.b(i1Var);
        }
        if (!(mod instanceof t1.d)) {
            return lastProvider;
        }
        t1.d dVar = (t1.d) mod;
        wVar.getClass();
        u1.j1 j1Var = lastProvider.f505143f;
        while (j1Var != null && j1Var.f505142e != dVar) {
            j1Var = j1Var.f505143f;
        }
        if (j1Var == null) {
            j1Var = new u1.j1(wVar, dVar);
        } else {
            u1.j1 j1Var2 = j1Var.f505144g;
            if (j1Var2 != null) {
                j1Var2.f505143f = j1Var.f505143f;
            }
            u1.j1 j1Var3 = j1Var.f505143f;
            if (j1Var3 != null) {
                j1Var3.f505144g = j1Var2;
            }
        }
        j1Var.f505143f = lastProvider.f505143f;
        u1.j1 j1Var4 = lastProvider.f505143f;
        if (j1Var4 != null) {
            j1Var4.f505144g = j1Var;
        }
        lastProvider.f505143f = j1Var;
        j1Var.f505144g = lastProvider;
        return j1Var;
    }
}
