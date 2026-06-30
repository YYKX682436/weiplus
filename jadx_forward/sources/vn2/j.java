package vn2;

/* loaded from: classes2.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.l03 f519843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v65.n f519844c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f519845d;

    public j(java.lang.String str, r45.l03 l03Var, v65.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        this.f519842a = str;
        this.f519843b = l03Var;
        this.f519844c = nVar;
        this.f519845d = jbVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        vn2.u0 u0Var = vn2.u0.f519920a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchImpl result,resp size=");
        boolean z17 = true;
        sb6.append(((r45.m03) fVar.f152151d).m75941xfb821914(1).size());
        sb6.append(",tabTYpe=");
        r45.l03 l03Var = this.f519843b;
        sb6.append(l03Var.m75939xb282bd08(10));
        sb6.append(", pullType=");
        sb6.append(l03Var.m75939xb282bd08(5));
        sb6.append(",errType=");
        sb6.append(fVar.f152148a);
        sb6.append(",errCode=");
        sb6.append(fVar.f152149b);
        sb6.append(",errMsg=");
        sb6.append(fVar.f152150c);
        sb6.append('!');
        u0Var.m(this.f519842a, sb6.toString());
        r45.l03 l03Var2 = this.f519843b;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c(l03Var2, (r45.m03) resp, fVar.f152148a, fVar.f152149b, fVar.f152150c);
        if (fVar.b()) {
            yr2.a aVar = yr2.a.f546192a;
            r45.m03 m03Var = cVar.f202439b;
            r45.sq2 sq2Var = (r45.sq2) m03Var.m75936x14adae67(5);
            java.util.LinkedList m75941xfb821914 = m03Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            aVar.b(sq2Var, m75941xfb821914, 7017);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList m75941xfb8219142 = m03Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                boolean z18 = false;
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = h90Var.a(c19792x256d2725, 2097152);
                int m75939xb282bd08 = l03Var.m75939xb282bd08(10);
                if (m75939xb282bd08 == 23) {
                    linkedList.add(cu2.u.f303974a.o(a17, 4));
                } else if (m75939xb282bd08 == 24) {
                    linkedList.add(cu2.u.f303974a.o(a17, 11003));
                } else if (m75939xb282bd08 == 28) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f519845d;
                    if (jbVar != null && jbVar.m55856xfb85f7b0() == 400000) {
                        linkedList.add(cu2.u.f303974a.o(a17, 4));
                    } else {
                        if (jbVar != null && jbVar.m55856xfb85f7b0() == 400001) {
                            z18 = true;
                        }
                        if (z18) {
                            linkedList.add(cu2.u.f303974a.o(a17, 11003));
                        }
                    }
                }
            }
            cVar.m56420x2a5f836b(linkedList);
            cVar.m56421x73095078(m03Var.m75934xbce7f2f(2));
            cVar.m56423xd4b4a5a1(l03Var.m75939xb282bd08(5));
            if (cVar.getErrType() == 0 && cVar.getErrCode() == 0 && m03Var.m75939xb282bd08(3) == 0) {
                z17 = false;
            }
            cVar.m56419xdac5ee4d(z17);
            cVar.m56425xf28d7bcd(l03Var);
        }
        this.f519844c.a(cVar);
        return jz5.f0.f384359a;
    }
}
