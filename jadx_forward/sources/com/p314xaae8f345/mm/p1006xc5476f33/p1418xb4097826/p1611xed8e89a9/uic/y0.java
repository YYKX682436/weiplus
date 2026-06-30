package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 f205907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 c14881xed239a47) {
        super(0);
        this.f205907d = c14881xed239a47;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.aw0 aw0Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        r45.uw2 uw2Var;
        ya2.b2 b17 = ya2.h.f542017a.b(this.f205907d.m58635x6c03c64c());
        if (b17 == null || (aw0Var = b17.f69303xb62cee) == null || (m75941xfb821914 = aw0Var.m75941xfb821914(0)) == null) {
            return null;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.zv0) obj).m75939xb282bd08(0) == 5) {
                break;
            }
        }
        r45.zv0 zv0Var = (r45.zv0) obj;
        if (zv0Var == null || (uw2Var = (r45.uw2) zv0Var.m75936x14adae67(5)) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(uw2Var.m75939xb282bd08(0));
    }
}
