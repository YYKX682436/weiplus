package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class h8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 f166172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f166173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f166174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f166175g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 r8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f166172d = r8Var;
        this.f166173e = c11667xc7e59dd6;
        this.f166174f = atomicReference;
        this.f166175g = countDownLatch;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811> it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 r8Var = this.f166172d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = this.f166173e;
        r8Var.getClass();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 interfaceC11654xe38d2811 : it) {
            if (interfaceC11654xe38d2811 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) {
                java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e> it6 = c11667xc7e59dd6.iterator();
                while (true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ab abVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ab) it6;
                    if (!abVar.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = abVar.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) obj2).f33454x337a8b, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) interfaceC11654xe38d2811).f33454x337a8b)) {
                        break;
                    }
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) obj2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) interfaceC11654xe38d2811;
                c11656xaf63146e.f33455xe121c411 = c11656xaf63146e2.f33455xe121c411;
                c11656xaf63146e.f156905md5 = c11656xaf63146e2.f156905md5;
            } else if (interfaceC11654xe38d2811 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7 = c11667xc7e59dd6.f156937i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11670x2ef26cc7);
                c11670x2ef26cc7.d((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847) interfaceC11654xe38d2811);
            }
        }
        this.f166174f.set(this.f166173e);
        this.f166175g.countDown();
        return jz5.f0.f384359a;
    }
}
