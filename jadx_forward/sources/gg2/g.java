package gg2;

/* loaded from: classes2.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg2.m f353210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gg2.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f353210e = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gg2.g(this.f353210e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gg2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object q17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.lang.String m59299x6bf53a6c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject3;
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f353209d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            gg2.m mVar = this.f353210e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = mVar.f353197a.f498681h;
            long j17 = 0;
            long m59251x5db1b11 = (abstractC14490x69736cb5 == null || (feedObject4 = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject4.m59251x5db1b11();
            tc2.g gVar = mVar.f353197a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
            if (abstractC14490x69736cb52 != null && (feedObject2 = abstractC14490x69736cb52.getFeedObject()) != null && (feedObject3 = feedObject2.getFeedObject()) != null && (m76794xd0557130 = feedObject3.m76794xd0557130()) != null) {
                j17 = m76794xd0557130.m75942xfb822ef2(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = gVar.f498681h;
            java.lang.String str = (abstractC14490x69736cb53 == null || (feedObject = abstractC14490x69736cb53.getFeedObject()) == null || (m59299x6bf53a6c = feedObject.m59299x6bf53a6c()) == null) ? "" : m59299x6bf53a6c;
            this.f353209d = 1;
            ((b92.d1) zbVar).getClass();
            q17 = st2.g3.f493859a.q(m59251x5db1b11, j17, 2, str, this);
            if (q17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            q17 = obj;
        }
        r45.nd2 nd2Var = (r45.nd2) q17;
        r45.cp1 cp1Var = new r45.cp1();
        byte[] g17 = (nd2Var == null || (m75934xbce7f2f = nd2Var.m75934xbce7f2f(1)) == null) ? null : m75934xbce7f2f.g();
        if (g17 != null) {
            try {
                cp1Var.mo11468x92b714fd(g17);
                return cp1Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        return null;
    }
}
