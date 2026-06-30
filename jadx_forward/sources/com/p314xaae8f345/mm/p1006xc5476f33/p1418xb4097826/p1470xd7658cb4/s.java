package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class s implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u f192999d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u uVar) {
        this.f192999d = uVar;
    }

    @Override // cw2.ea
    /* renamed from: onVideoPause */
    public void mo1057x65d3157a() {
    }

    @Override // cw2.ea
    /* renamed from: onVideoPlay */
    public void mo1058x4d9b9b30() {
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        java.lang.Object obj;
        java.lang.Object obj2;
        long j19 = j17 / 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p pVar = this.f192999d.f193003f;
        java.util.ArrayList arrayList = pVar.f192989c;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d) obj2;
            if (j19 >= ((long) dVar.f192960d.m75939xb282bd08(0)) && j19 < ((long) dVar.f192960d.m75939xb282bd08(1))) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d dVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d) obj2;
        if (dVar2 == null) {
            java.util.ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator2.previous();
                if (j19 >= ((long) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d) previous).f192960d.m75939xb282bd08(0))) {
                    obj = previous;
                    break;
                }
            }
            pVar.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d) obj);
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.f192992f, dVar2)) {
            pVar.f192992f = dVar2;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = pVar.f192991e;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf.m8146xced61ae5();
            pVar.b(dVar2);
        }
        pVar.f192994h = -1;
    }
}
