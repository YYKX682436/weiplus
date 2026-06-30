package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 f203902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var) {
        super(1);
        this.f203902d = s1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.Iterator it = this.f203902d.f203955b.f203829a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((so2.j5) obj2).mo2128x1ed62e84() == item.mo2128x1ed62e84()) {
                break;
            }
        }
        return java.lang.Boolean.valueOf(obj2 != null);
    }
}
