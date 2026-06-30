package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f270888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f270890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f270891h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, java.lang.String str, int i17, yz5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f270888e = z17;
        this.f270889f = str;
        this.f270890g = i17;
        this.f270891h = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l(this.f270888e, this.f270889f, this.f270890g, this.f270891h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f270887d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str = this.f270889f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f270888e || com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.C(str)) {
                java.util.HashMap hashMap = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270733d;
                if (hashMap.containsKey(str)) {
                    return f0Var;
                }
                hashMap.put(str, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str);
                this.f270887d = 1;
                obj = b0Var.d(this.f270890g, linkedList, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.qk qkVar = (r45.qk) obj;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270733d.remove(str);
        java.util.LinkedList<r45.lk> linkedList2 = qkVar != null ? qkVar.f465596d : null;
        if (!(linkedList2 == null || linkedList2.isEmpty())) {
            for (r45.lk lkVar : linkedList2) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(lkVar.f461066d, str)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
                    java.lang.String str2 = lkVar.f461066d;
                    java.lang.String str3 = lkVar.f461067e;
                    java.lang.String e17 = b0Var2.e(str2);
                    if (e17 == null) {
                        e17 = "";
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e17, str3);
                    yz5.q qVar = this.f270891h;
                    if (z17) {
                        qVar.mo147xb9724478(str, lkVar.f461067e, java.lang.Boolean.TRUE);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFinderLiveLogic", "checkFinderLive data change bizUserName=" + lkVar.f461066d);
                        java.lang.String str4 = lkVar.f461067e;
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5195x575f32c5 c5195x575f32c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5195x575f32c5();
                        am.t0 t0Var = c5195x575f32c5.f135536g;
                        t0Var.f89485a = str;
                        t0Var.f89486b = str4;
                        c5195x575f32c5.b(android.os.Looper.getMainLooper());
                    } else {
                        qVar.mo147xb9724478(str, lkVar.f461067e, java.lang.Boolean.FALSE);
                    }
                    b0Var2.x(lkVar);
                }
            }
        }
        return f0Var;
    }
}
