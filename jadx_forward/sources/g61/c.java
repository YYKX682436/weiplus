package g61;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5272x37c9dd82 c5272x37c9dd82 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5272x37c9dd82) abstractC20979x809547d1;
        am.b3 b3Var = c5272x37c9dd82.f135596g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CloseAAEventIListener", "closeAAEvent callback, billNo: %s, chatroom: %s", b3Var.f87744a, b3Var.f87745b);
        am.b3 b3Var2 = c5272x37c9dd82.f135596g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b3Var2.f87744a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b3Var2.f87745b)) {
            return false;
        }
        h61.s sVar = new h61.s();
        h61.p pVar = sVar.f360700a;
        pVar.getClass();
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1530, pVar);
        java.lang.String str = b3Var2.f87744a;
        java.lang.String str2 = b3Var2.f87745b;
        long j17 = b3Var2.f87746c;
        h61.q qVar = sVar.f360702c;
        qVar.getClass();
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        km5.q qVar2 = new km5.q();
        qVar2.y(str, 3, str2, valueOf);
        qVar2.n(qVar);
        ((km5.q) qVar2.q(new g61.b(this, sVar))).s(new g61.a(this, sVar));
        return false;
    }
}
