package db2;

/* loaded from: classes2.dex */
public final class v1 extends az2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(java.lang.String username, int i17, long j17, long j18, java.lang.String sessionBuffer, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionBuffer, "sessionBuffer");
        r45.mb1 mb1Var = new r45.mb1();
        mb1Var.f461852d = username;
        mb1Var.f461854f = i17;
        mb1Var.f461856h = j17;
        mb1Var.f461857i = j18;
        db2.t4 t4Var = db2.t4.f309704a;
        r45.kv0 a17 = t4Var.a(11847);
        mb1Var.f461853e = a17;
        t4Var.j(a17, j17, sessionBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        t70Var.j1().l();
        if (((java.lang.Boolean) t70Var.j1().r()).booleanValue()) {
            mb1Var.f461859n = 4L;
        }
        if (((java.lang.Boolean) t70Var.s0().r()).booleanValue()) {
            mb1Var.f461859n |= 8;
        }
        r45.nb1 nb1Var = new r45.nb1();
        nb1Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = nb1Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = mb1Var;
        lVar.f152198b = nb1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderhomepage";
        lVar.f152200d = 11847;
        p(lVar.a());
    }

    @Override // az2.o
    public boolean B() {
        return true;
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.LinkedList<r45.ob1> linkedList;
        r45.h72 h72Var;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> linkedList2;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> linkedList3;
        r45.nb1 resp = (r45.nb1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.pb1 pb1Var = resp.f462760d;
        if (pb1Var != null && (linkedList = pb1Var.f464453d) != null) {
            for (r45.ob1 ob1Var : linkedList) {
                int i17 = ob1Var.f463643d;
                if (i17 == 2) {
                    r45.o23 o23Var = ob1Var.f463646g;
                    if (o23Var != null && (linkedList3 = o23Var.f463375d) != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
                        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : linkedList3) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                            arrayList2.add(h90Var.a(c19792x256d2725, 0));
                        }
                        arrayList.addAll(arrayList2);
                    }
                } else if (i17 == 6 && (h72Var = ob1Var.f463653q) != null && (linkedList2 = h72Var.f457446d) != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                    for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 : linkedList2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27252);
                        arrayList3.add(h90Var2.a(c19792x256d27252, 0));
                    }
                    arrayList.addAll(arrayList3);
                }
            }
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderHomePageRequest");
        r45.kv0 kv0Var = ((r45.mb1) fVar).f461853e;
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }
}
