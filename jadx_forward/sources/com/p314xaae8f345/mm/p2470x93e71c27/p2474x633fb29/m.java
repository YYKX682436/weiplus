package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes11.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f270906e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m(this.f270906e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f270905d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270755z) {
                java.lang.String str = this.f270906e;
                if (b0Var.C(str)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270755z = true;
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(str);
                    this.f270905d = 1;
                    obj = b0Var.d(7, linkedList, null, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.qk qkVar = (r45.qk) obj;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270755z = false;
        java.util.LinkedList<r45.lk> linkedList2 = qkVar != null ? qkVar.f465596d : null;
        if (linkedList2 == null) {
            return f0Var;
        }
        for (r45.lk lkVar : linkedList2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lkVar.f461067e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFinderLiveLogic", "checkLiveRedDotNotify live stop!");
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var3 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
                b0Var3.x(lkVar);
                java.lang.String str2 = lkVar.f461066d;
                java.lang.String str3 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270750u;
                if (str3 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str3)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270750u = null;
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270751v = null;
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270752w = null;
                }
                b0Var3.w();
                b0Var3.E();
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.x(lkVar);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270752w = lkVar.f461071i;
            }
        }
        return f0Var;
    }
}
