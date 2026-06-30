package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class c50 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c50(java.util.LinkedList linkedList) {
        super(1);
        this.f199499d = linkedList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.il1 resultItem = (r45.il1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultItem, "resultItem");
        java.util.Iterator it = this.f199499d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.il1) obj2).m75945x2fec8307(0), resultItem.m75945x2fec8307(0))) {
                break;
            }
        }
        return java.lang.Boolean.valueOf(obj2 != null);
    }
}
