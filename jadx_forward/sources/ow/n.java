package ow;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ow.n f430792a = new ow.n();

    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(info.j(), "msg", null);
        if (d17 == null) {
            d17 = kz5.q0.f395534d;
        }
        bw.j jVar = (bw.j) i95.n0.c(bw.j.class);
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar2 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();
        jVar2.f300520u = info.mo78013xfb85f7b0();
        jVar2.f300508f = info.Q0();
        jVar2.f300509g = info.I0();
        jVar2.F = info.m124847x74d37ac6();
        jVar2.f300510h = info.mo78012x3fdd41df();
        boolean z17 = false;
        jVar2.f300511i = info.P0() == 4 ? 1 : 0;
        jVar2.f300512m = -1;
        jVar2.G = info.mo78013xfb85f7b0() == -1879048173 ? 2 : info.mo78013xfb85f7b0() == 436207665 ? 3 : 1;
        jVar2.f300519t = info.j();
        jVar2.f300522w = info.G;
        jVar2.f300512m = -1;
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.template_id");
        if (str == null) {
            str = "";
        }
        jVar2.H = str;
        jVar2.A = i17;
        e31.k a17 = e31.n.f328620a.a("name_biz");
        if (a17 != null && true == ((g31.l) a17).f349627g) {
            z17 = true;
        }
        if (z17 && bw.i.accepted == ((zv.o0) jVar).Di(info)) {
            jVar2.f300505J = 1;
        }
        return jVar2;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 b(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j bizMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMsgInfo, "bizMsgInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.f275465l2 = bizMsgInfo.f300506d;
        f9Var.m124849x5361953a(bizMsgInfo.F);
        f9Var.o1(bizMsgInfo.f300509g);
        int i17 = bizMsgInfo.G;
        if (i17 > 0) {
            if (i17 == 1) {
                r2 = 318767153;
            } else if (i17 == 3) {
                r2 = 436207665;
            }
            f9Var.m124850x7650bebc(r2);
        } else {
            f9Var.m124850x7650bebc(bizMsgInfo.f300520u != 2 ? 318767153 : -1879048173);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNoticeMsgRepository", "convertNoticeBizMsgInfoToMsgInfo compatible logic");
        }
        f9Var.r1((bizMsgInfo.f300511i & 1) == 1 ? 4 : 3);
        f9Var.j1(0);
        f9Var.e1(bizMsgInfo.f300510h);
        f9Var.u1(bizMsgInfo.f300508f);
        f9Var.d1(bizMsgInfo.f300519t);
        f9Var.u3(bizMsgInfo.f300522w);
        return f9Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 c() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0 c18 = yw.a3.f547799a.c();
        java.util.LinkedList linkedList = (c18 == null || (c17 = c18.c(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 1)) == null) ? null : c17.f300531d;
        if (linkedList != null) {
            for (int size = linkedList.size() - 1; -1 < size; size--) {
                ow.n nVar = f430792a;
                java.lang.Object obj = linkedList.get(size);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                arrayList.add(nVar.b((com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j) obj));
            }
        }
        if (arrayList.size() == 1) {
            return (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.n.d(com.tencent.wechat.mm.brand_service.j):void");
    }
}
