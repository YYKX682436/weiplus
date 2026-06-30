package gg1;

/* loaded from: classes7.dex */
public final class h1 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gg1.k1 f353100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.lang.Object obj, gg1.k1 k1Var) {
        super(obj);
        this.f353100b = k1Var;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        x91.h hVar = (x91.h) obj2;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((x91.h) obj, hVar) || hVar.f534180a == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new gg1.l1(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L(), hVar, 2));
        java.util.Iterator it = this.f353100b.f353124d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            gg1.i iVar = (gg1.i) it.next();
            iVar.f353102b = false;
            iVar.f353104d = false;
            x91.c cVar = iVar.f353101a.f534180a;
            java.lang.String str = cVar != null ? cVar.f534174i : null;
            x91.c cVar2 = this.f353100b.b().f534180a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, cVar2 != null ? cVar2.f534174i : null)) {
                iVar.f353104d = true;
                iVar.f353103c = false;
                iVar.f353102b = true;
            }
        }
        for (gg1.i iVar2 : this.f353100b.f353125e) {
            iVar2.f353102b = false;
            iVar2.f353104d = false;
            x91.c cVar3 = iVar2.f353101a.f534180a;
            java.lang.String str2 = cVar3 != null ? cVar3.f534174i : null;
            x91.c cVar4 = this.f353100b.b().f534180a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, cVar4 != null ? cVar4.f534174i : null)) {
                iVar2.f353104d = true;
                iVar2.f353103c = false;
                iVar2.f353102b = true;
            }
        }
        yz5.a aVar = this.f353100b.f353126f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
