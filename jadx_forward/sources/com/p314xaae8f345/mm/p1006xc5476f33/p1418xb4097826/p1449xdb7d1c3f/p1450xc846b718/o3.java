package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class o3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.o3 f187270d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.o3();

    public o3() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        boolean z17;
        boolean z18 = false;
        r45.vs2 vs2Var = (r45.vs2) ((r45.gz2) obj).m75936x14adae67(0);
        if (vs2Var != null && (linkedList = vs2Var.f470022g) != null) {
            if (!linkedList.isEmpty()) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) it.next()).f455425i, "FinderEntrance")) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                z18 = true;
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
