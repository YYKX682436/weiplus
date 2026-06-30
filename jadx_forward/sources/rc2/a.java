package rc2;

/* loaded from: classes2.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc2.f f475460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rc2.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f475460d = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rc2.a(this.f475460d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rc2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.cn2 cn2Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rc2.f fVar = this.f475460d;
        in5.s0 s0Var = fVar.f475474d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i : null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (abstractC14490x69736cb5 == null) {
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) s0Var.p(com.p314xaae8f345.mm.R.id.fs6) : null;
        if (c15324x3354d808 == null) {
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = abstractC14490x69736cb5.getFeedObject();
        java.util.LinkedList m75941xfb821914 = (feedObject2 == null || (feedObject = feedObject2.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (cn2Var = (r45.cn2) m76806xdef68064.m75936x14adae67(52)) == null) ? null : cn2Var.m75941xfb821914(1);
        fVar.V6();
        if ((m75941xfb821914 != null ? m75941xfb821914.size() : 0) > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("drawBlockBoxesForBulletComment: block_boxes_bulletcomment size = ");
            sb6.append(m75941xfb821914 != null ? new java.lang.Integer(m75941xfb821914.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", sb6.toString());
            android.graphics.Rect T6 = fVar.T6(c15324x3354d808);
            if (m75941xfb821914 != null) {
                java.util.ArrayList<r45.jl6> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb821914) {
                    if (((r45.jl6) obj2).m75941xfb821914(0).size() >= 4) {
                        arrayList.add(obj2);
                    }
                }
                for (r45.jl6 jl6Var : arrayList) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jl6Var);
                    android.graphics.Rect O6 = rc2.f.O6(fVar, jl6Var, T6);
                    fVar.U6(O6, "block_boxes_bulletcomment");
                    in5.s0 s0Var2 = fVar.f475474d;
                    rc2.f.P6(fVar, s0Var2 != null ? s0Var2.f3639x46306858 : null, O6);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "drawBlockBoxesForBulletComment: finished drawing " + ((java.util.ArrayList) fVar.f475475e).size() + " rectangles");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "drawBlockBoxesForBulletComment: block_boxes_bulletcomment is empty or null");
        }
        return f0Var;
    }
}
