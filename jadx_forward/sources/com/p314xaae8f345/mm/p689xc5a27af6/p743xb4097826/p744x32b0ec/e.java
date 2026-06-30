package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f148207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.z2 f148208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.ne0 f148209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f148210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148211h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f148212i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c00.z2 z2Var, bw5.ne0 ne0Var, int i17, java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f148208e = z2Var;
        this.f148209f = ne0Var;
        this.f148210g = i17;
        this.f148211h = str;
        this.f148212i = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.e(this.f148208e, this.f148209f, this.f148210g, this.f148211h, this.f148212i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f148207d;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f148212i;
        boolean z18 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                c00.z2 z2Var = this.f148208e;
                bw5.ne0 ne0Var = this.f148209f;
                int i18 = this.f148210g;
                this.f148207d = 1;
                obj = ((b00.r) z2Var).vj(ne0Var, i18, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            bw5.qe0 qe0Var = (bw5.qe0) obj;
            if (qe0Var != null) {
                z17 = qe0Var.b() != null && qe0Var.b().f113128f == 1 && qe0Var.b().f113127e == 1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Check result: productId=");
                sb6.append(this.f148211h);
                sb6.append(", isLiving=");
                sb6.append(qe0Var.b().f113128f);
                sb6.append(", isProductInLivingRoom=");
                sb6.append(qe0Var.b().f113127e);
                sb6.append(", displayable=");
                sb6.append(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckEcsProductWxaCoverWidgetDisplayableTask", sb6.toString());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CheckEcsProductWxaCoverWidgetDisplayableTask", "requestProductCardInfo returned null");
                z17 = false;
            }
            if (!z17) {
                z18 = false;
            }
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(java.lang.String.valueOf(z18)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CheckEcsProductWxaCoverWidgetDisplayableTask", th6, "Check exception in coroutine", new java.lang.Object[0]);
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("false"));
        }
        return jz5.f0.f384359a;
    }
}
