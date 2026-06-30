package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f187573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f187574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i17, java.util.HashSet hashSet) {
        super(1);
        this.f187573d = i17;
        this.f187574e = hashSet;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb target = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        int i17 = this.f187573d;
        java.util.HashSet hashSet = this.f187574e;
        boolean z17 = false;
        if (i17 == 1024) {
            java.lang.String field_tipsId = target.f65880x11c19d58;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tipsId, "field_tipsId");
            z17 = r26.n0.B(field_tipsId, "local_finder_msg_count", false);
            if (z17) {
                hashSet.add(target);
            }
        } else if ((target.m55856xfb85f7b0() != 2 && target.m55856xfb85f7b0() != 1) || target.N.m75939xb282bd08(25) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
            jbVar.f65880x11c19d58 = target.f65880x11c19d58;
            jbVar.f65875xb5fc3ab6 = target.f65875xb5fc3ab6;
            r45.vs2 vs2Var = new r45.vs2();
            vs2Var.f470020e = target.f65875xb5fc3ab6;
            jbVar.f65874xb5f7102a = vs2Var;
            java.util.LinkedList linkedList = target.f65874xb5f7102a.f470022g;
            if (linkedList != null) {
                vs2Var.f470022g.addAll(linkedList);
            }
            hashSet.add(jbVar);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
