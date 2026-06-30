package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class zb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac f157634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar) {
        super(0);
        this.f157634d = acVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean hasNext;
        boolean hasNext2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847> list;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = this.f157634d;
        acVar.f156977c.g(acVar.f156976b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7 = this.f157634d.f156977c.f156937i;
        if (c11670x2ef26cc7 != null) {
            c11670x2ef26cc7.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar2 = this.f157634d;
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(this.f157634d.f156977c.f156935g.size() + 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = this.f157634d.f156977c;
        c11667xc7e59dd6.getClass();
        boolean z17 = false;
        boolean z18 = false;
        java.util.Iterator it = null;
        while (true) {
            if (z18) {
                if (it == null) {
                    it = c11667xc7e59dd6.f156935g.iterator();
                }
                hasNext = it.hasNext();
            } else {
                hasNext = true;
            }
            if (!hasNext) {
                break;
            }
            if (z18) {
                c11656xaf63146e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) it.next();
            } else {
                c11656xaf63146e2 = c11667xc7e59dd6;
                z18 = true;
            }
            arrayMap.put(c11656xaf63146e2.f33454x337a8b, c11656xaf63146e2);
        }
        acVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd62 = this.f157634d.f156977c;
        c11667xc7e59dd62.getClass();
        java.util.Iterator it6 = null;
        while (true) {
            if (z17) {
                if (it6 == null) {
                    it6 = c11667xc7e59dd62.f156935g.iterator();
                }
                hasNext2 = it6.hasNext();
            } else {
                hasNext2 = true;
            }
            if (!hasNext2) {
                return jz5.f0.f384359a;
            }
            if (z17) {
                c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) it6.next();
            } else {
                c11656xaf63146e = c11667xc7e59dd62;
                z17 = true;
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(c11656xaf63146e.f33455xe121c411)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac.b(this.f157634d, c11656xaf63146e);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc72 = this.f157634d.f156977c.f156937i;
                if (c11670x2ef26cc72 != null) {
                    java.lang.String name = c11656xaf63146e.f33454x337a8b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    list = c11670x2ef26cc72.b(name);
                } else {
                    list = null;
                }
                if (list == null) {
                    list = kz5.p0.f395529d;
                }
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 : list) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar3 = this.f157634d;
                    java.lang.String name2 = c11656xaf63146e.f33454x337a8b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac.m(acVar3, name2, c11669x3195c847);
                }
            }
        }
    }
}
