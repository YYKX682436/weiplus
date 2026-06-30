package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes9.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f163878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List list) {
        super(1);
        this.f163878d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 item = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.Iterator it = this.f163878d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (android.text.TextUtils.equals(item.f153336f, ((m31.q0) obj2).f404736d)) {
                break;
            }
        }
        m31.q0 q0Var = (m31.q0) obj2;
        return java.lang.Boolean.valueOf(q0Var != null ? q0Var.f404733a : false);
    }
}
