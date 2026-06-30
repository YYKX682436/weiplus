package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f206238d;

    /* renamed from: e, reason: collision with root package name */
    public int f206239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 f206240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 f206241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206242h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 m3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 e4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f206240f = m3Var;
        this.f206241g = e4Var;
        this.f206242h = s4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.r3(this.f206240f, this.f206241g, this.f206242h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.r3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f206239e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 m3Var = this.f206240f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean m75933x41a8a7f2 = m3Var.f206157a.m75933x41a8a7f2(15);
            this.f206238d = m75933x41a8a7f2;
            this.f206239e = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 e4Var = this.f206241g;
            e4Var.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            s40.o0 o0Var = (s40.o0) i95.n0.c(s40.o0.class);
            r45.hx0 hx0Var = new r45.hx0();
            r45.t02 t02Var = new r45.t02();
            r45.h32 h32Var = m3Var.f206157a;
            t02Var.set(0, h32Var.m75945x2fec8307(4));
            t02Var.set(3, java.lang.Integer.valueOf(h32Var.m75933x41a8a7f2(15) ? 2 : 1));
            hx0Var.set(0, 10);
            hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(t02Var.mo14344x5f01b1f6()));
            pq5.g l17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) o0Var).wi(0L, 0L, 7, hx0Var).l();
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.o3(nVar));
            android.content.Context context = e4Var.f206063f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
            if (nVar.a() == aVar) {
                return aVar;
            }
            z17 = m75933x41a8a7f2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z17 = this.f206238d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String m75945x2fec8307 = m3Var.f206157a.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        boolean z18 = !z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206242h;
        java.util.List list = s4Var.f206293n;
        if (z18) {
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3) kz5.n0.X(list)).f206157a.m75933x41a8a7f2(15) ? com.p314xaae8f345.mm.R.C30867xcad56011.f574229oc5 : com.p314xaae8f345.mm.R.C30867xcad56011.oc8;
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.h(context2, context2.getString(i18));
        } else {
            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574211oc0));
        }
        s4Var.f206300u = true;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.r4());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r45.h32 h32Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3) it.next()).f206157a;
            h32Var2.set(15, java.lang.Boolean.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h32Var2.m75945x2fec8307(4), m75945x2fec8307) && z18));
            if (h32Var2.m75933x41a8a7f2(15)) {
                arrayList2.add(0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3(s4Var, h32Var2));
            } else {
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3(s4Var, h32Var2));
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        s4Var.e();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            linkedList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3) it6.next()).f206157a);
        }
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        java.util.List list2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189466d;
        list2.clear();
        list2.addAll(linkedList);
        return jz5.f0.f384359a;
    }
}
