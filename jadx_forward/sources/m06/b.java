package m06;

/* loaded from: classes16.dex */
public final class b extends f26.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m06.c f404124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m06.c cVar) {
        super(cVar.f404127h);
        this.f404124c = cVar;
    }

    @Override // f26.l
    public java.util.Collection c() {
        java.util.List<n16.b> i17;
        m06.c cVar = this.f404124c;
        m06.m mVar = cVar.f404129m;
        m06.i iVar = m06.i.f404136c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar, iVar)) {
            i17 = kz5.b0.c(m06.c.f404125r);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar, m06.j.f404137c)) {
            i17 = kz5.c0.i(m06.c.f404126s, new n16.b(l06.x.f396489k, iVar.a(cVar.f404130n)));
        } else {
            m06.l lVar = m06.l.f404139c;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar, lVar)) {
                i17 = kz5.b0.c(m06.c.f404125r);
            } else {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar, m06.k.f404138c)) {
                    int i18 = p26.a.f432973a;
                    throw new java.lang.IllegalStateException("should not be called".toString());
                }
                i17 = kz5.c0.i(m06.c.f404126s, new n16.b(l06.x.f396484f, lVar.a(cVar.f404130n)));
            }
        }
        o06.v0 e17 = ((r06.z0) cVar.f404128i).e();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i17, 10));
        for (n16.b bVar : i17) {
            o06.g a17 = o06.l0.a(e17, bVar);
            if (a17 == null) {
                throw new java.lang.IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            java.util.List L0 = kz5.n0.L0(cVar.f404133q, a17.g().mo9613x99879e0().size());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(L0, 10));
            java.util.Iterator it = L0.iterator();
            while (it.hasNext()) {
                arrayList2.add(new f26.n2(((o06.e2) it.next()).k()));
            }
            f26.r1.f340747e.getClass();
            arrayList.add(f26.r0.c(f26.r1.f340748f, a17, arrayList2));
        }
        return kz5.n0.S0(arrayList);
    }

    @Override // f26.l
    public o06.c2 e() {
        return o06.b2.f423461a;
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        return this.f404124c.f404133q;
    }

    @Override // f26.b, f26.c2
    public o06.j i() {
        return this.f404124c;
    }

    @Override // f26.c2
    public boolean j() {
        return true;
    }

    @Override // f26.b
    /* renamed from: l */
    public o06.g i() {
        return this.f404124c;
    }

    /* renamed from: toString */
    public java.lang.String m146596x9616526c() {
        return this.f404124c.m146598x9616526c();
    }
}
