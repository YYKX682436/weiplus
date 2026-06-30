package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u f166736a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u();

    /* renamed from: b, reason: collision with root package name */
    public static final ik1.j f166737b = new ik1.j();

    /* renamed from: c, reason: collision with root package name */
    public static final ik1.j f166738c = new ik1.j();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v a(int i17, java.lang.String instanceId, boolean z17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        ik1.j jVar = f166738c;
        ik1.j jVar2 = f166737b;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q(i17, instanceId, h0Var);
            if (jVar2.d(qVar)) {
                java.lang.Object obj3 = h0Var.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v) obj3;
            }
            if (jVar.d(qVar)) {
                java.lang.Object obj4 = h0Var.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v) obj4;
            }
        } else {
            java.util.Iterator<E> it = jVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v) obj;
                if (vVar.f166773d == i17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f166770a, instanceId)) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v vVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v) obj;
            if (vVar2 != null) {
                return vVar2;
            }
            java.util.Iterator<E> it6 = jVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v vVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v) obj2;
                if (vVar3.f166773d == i17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar3.f166770a, instanceId)) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v vVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v) obj2;
            if (vVar4 != null) {
                return vVar4;
            }
        }
        return null;
    }
}
