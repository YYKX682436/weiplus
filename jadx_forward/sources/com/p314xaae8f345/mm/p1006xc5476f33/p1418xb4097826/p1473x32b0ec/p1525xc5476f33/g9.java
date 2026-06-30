package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class g9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 f194182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2.c f194183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var, xh2.c cVar) {
        super(0);
        this.f194182d = o9Var;
        this.f194183e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        kn0.p pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var = this.f194182d;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = o9Var.f195250r;
        xh2.c cVar = this.f194183e;
        java.util.LinkedList linkedList = cVar.f536064a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            xh2.a aVar = (xh2.a) it.next();
            java.lang.String b17 = aVar.b();
            xh2.i iVar = aVar.f536054b;
            arrayList.add(new jo0.a(b17, new hn5.b(iVar.f364142a, iVar.f364143b, iVar.f364144c, iVar.f364145d), false));
        }
        in0.q B1 = o9Var.B1();
        if (B1 != null && (pVar = B1.D) != null && pVar.f391122i) {
            z17 = true;
        }
        c10849x610a91e1.d(arrayList, cVar.f536065b, z17);
        return jz5.f0.f384359a;
    }
}
