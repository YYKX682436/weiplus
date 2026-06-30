package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

/* loaded from: classes7.dex */
public final class j0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.j0 f165827d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.j0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        fj1.y yVar = (fj1.y) obj;
        fj1.y yVar2 = (fj1.y) obj2;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar, yVar2)) {
            return 0;
        }
        return yVar.hashCode() - yVar2.hashCode();
    }
}
