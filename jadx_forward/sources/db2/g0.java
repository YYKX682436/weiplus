package db2;

/* loaded from: classes2.dex */
public final class g0 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f309511t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.z11 f309512u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0(r45.qt2 r28, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r29, com.p314xaae8f345.mm.p2495xc50a8b8b.g r30, java.util.List r31, java.util.List r32, int r33, int r34, int r35, long r36, com.p314xaae8f345.mm.p2495xc50a8b8b.g r38) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.g0.<init>(r45.qt2, com.tencent.mm.protocal.protobuf.FinderObject, com.tencent.mm.protobuf.g, java.util.List, java.util.List, int, int, int, long, com.tencent.mm.protobuf.g):void");
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.a21 resp = (r45.a21) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(' ');
        java.util.LinkedList object = resp.f451189d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object, "object");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(object, 10));
        java.util.Iterator it = object.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderEnhanceStream", sb6.toString());
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.a21 resp = (r45.a21) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> object = resp.f451189d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object, "object");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(object, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : object) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var = this.f309512u.f473116d;
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }
}
