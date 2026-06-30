package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class xb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f157588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac f157589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar) {
        super(0);
        this.f157588d = linkedList;
        this.f157589e = acVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        java.util.Iterator it = this.f157588d.iterator();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = this.f157589e;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 interfaceC11654xe38d2811 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811) it.next();
            if (!(interfaceC11654xe38d2811 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) && (interfaceC11654xe38d2811 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7 = acVar.f156977c.f156937i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11670x2ef26cc7);
                c11670x2ef26cc7.d((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847) interfaceC11654xe38d2811);
                it.remove();
            }
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811> linkedList = this.f157588d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar2 = this.f157589e;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 interfaceC11654xe38d28112 : linkedList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC11654xe38d28112, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) interfaceC11654xe38d28112;
            java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e> it6 = acVar2.f156977c.iterator();
            while (true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ab abVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ab) it6;
                if (!abVar.hasNext()) {
                    obj = null;
                    break;
                }
                obj = abVar.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) obj).f33454x337a8b, c11656xaf63146e.f33454x337a8b)) {
                    break;
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) obj;
            c11656xaf63146e2.f33455xe121c411 = c11656xaf63146e.f33455xe121c411;
            c11656xaf63146e2.f156905md5 = c11656xaf63146e.f156905md5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac.b(acVar2, c11656xaf63146e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc72 = acVar2.f156977c.f156937i;
            if (c11670x2ef26cc72 != null) {
                java.lang.String name = c11656xaf63146e.f33454x337a8b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847> b17 = c11670x2ef26cc72.b(name);
                if (b17 != null) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 : b17) {
                        java.lang.String name2 = c11656xaf63146e.f33454x337a8b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac.m(acVar2, name2, c11669x3195c847);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
