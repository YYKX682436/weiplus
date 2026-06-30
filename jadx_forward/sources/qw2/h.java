package qw2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 f448661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 c15211x75b8b4d3) {
        super(2);
        this.f448661d = c15211x75b8b4d3;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qw2.f fVar;
        qw2.f fVar2;
        ((java.lang.Number) obj).intValue();
        t85.d lensItem = (t85.d) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensItem, "lensItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 c15211x75b8b4d3 = this.f448661d;
        r45.p64 p64Var = lensItem.f497989a;
        c15211x75b8b4d3.f212345y = p64Var;
        c15211x75b8b4d3.f212344x = p64Var.f464325d;
        qw2.l lVar = c15211x75b8b4d3.f212343w;
        java.util.Iterator it = lVar.f448668d.iterator();
        while (it.hasNext()) {
            qw2.k kVar = (qw2.k) it.next();
            if (kVar != null && (fVar2 = kVar.f448667c) != null) {
                java.lang.String str = c15211x75b8b4d3.f212344x;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar2.f448656f, str)) {
                    fVar2.f448656f = str;
                    java.util.Iterator it6 = fVar2.f448654d.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((t85.d) it6.next()).f497989a.f464325d, str)) {
                            break;
                        }
                        i17++;
                    }
                    int i18 = fVar2.f448655e;
                    if (i18 != i17) {
                        fVar2.f448657g = false;
                        fVar2.m8147xed6e4d18(i18);
                        fVar2.f448655e = i17;
                        fVar2.m8147xed6e4d18(i17);
                    }
                }
            }
        }
        fp0.u c17 = c15211x75b8b4d3.f212344x == null ? fp0.u.f346823f : u85.i.f507240a.c(p64Var);
        if (c17 == fp0.u.f346823f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3.A(c15211x75b8b4d3, c17);
        } else {
            java.util.Iterator it7 = lVar.f448668d.iterator();
            while (it7.hasNext()) {
                qw2.k kVar2 = (qw2.k) it7.next();
                if (kVar2 != null && (fVar = kVar2.f448667c) != null) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f448656f, c15211x75b8b4d3.f212344x) && !fVar.f448657g) {
                        fVar.f448657g = true;
                        fVar.m8147xed6e4d18(fVar.f448655e);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
