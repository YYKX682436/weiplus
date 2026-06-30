package bg2;

/* loaded from: classes3.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f102076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.cg f102077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f102078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f102079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f102080i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(bg2.x0 x0Var, dk2.cg cgVar, boolean z17, boolean z18, r45.ch1 ch1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102076e = x0Var;
        this.f102077f = cgVar;
        this.f102078g = z17;
        this.f102079h = z18;
        this.f102080i = ch1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.u0(this.f102076e, this.f102077f, this.f102078g, this.f102079h, this.f102080i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b;
        byte[] bArr;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f102075d;
        bg2.x0 x0Var = this.f102076e;
        int i18 = 0;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.sp2 sp2Var = new r45.sp2();
            sp2Var.set(1, db2.t4.f309704a.a(6888));
            uc2.f fVar = (uc2.f) x0Var.O6(uc2.f.class);
            sp2Var.set(2, (fVar == null || (bArr = ((bg2.d2) fVar).f101559y) == null) ? null : new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length));
            tc2.g gVar = x0Var.f498674d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
            if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59240x7c94657b = feedObject.m59240x7c94657b()) != null) {
                sp2Var.set(5, java.lang.Long.valueOf(m59240x7c94657b.m76784x5db1b11()));
                sp2Var.set(6, m59240x7c94657b.m76803x6c285d75());
                r45.nw1 m76794xd0557130 = m59240x7c94657b.m76794xd0557130();
                sp2Var.set(4, java.lang.Long.valueOf(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L));
            }
            sp2Var.set(7, 2);
            in5.s0 s0Var = gVar.f498682i;
            if (s0Var == null || (context = s0Var.f374654e) == null || (str = xy2.c.e(context)) == null) {
                str = "";
            }
            sp2Var.set(8, str);
            sp2Var.set(3, this.f102080i);
            com.p314xaae8f345.mm.p944x882e457a.i d17 = sp2Var.d();
            this.f102075d = 1;
            obj = rm0.h.b(d17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var.f102146e, "[likeDanmaku] errCode:" + fVar2.f152149b + ", errType:" + fVar2.f152148a);
        if (!fVar2.b()) {
            dk2.cg cgVar = this.f102077f;
            boolean z17 = this.f102078g;
            cgVar.B(z17);
            cgVar.d(this.f102079h);
            if (z17) {
                i18 = cgVar.s() + 1;
            } else {
                int s17 = cgVar.s() - 1;
                if (s17 >= 0) {
                    i18 = s17;
                }
            }
            cgVar.w(i18);
        }
        return jz5.f0.f384359a;
    }
}
