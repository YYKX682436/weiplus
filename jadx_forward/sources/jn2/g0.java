package jn2;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f382148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.m0 f382149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f382150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(jn2.m0 m0Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382149e = m0Var;
        this.f382150f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jn2.g0(this.f382149e, this.f382150f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f382148d;
        jn2.m0 m0Var = this.f382149e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                zl2.r4.f555483a.h3(m0Var.f199716e, true);
                sf2.x xVar = m0Var.I;
                java.util.List list = this.f382150f;
                this.f382148d = 1;
                obj = xVar.l7(list, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            zl2.r4.f555483a.h3(m0Var.f199716e, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(m0Var, false, 1, null);
            if (booleanValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongEditPanel", "Reorder songs success");
                m0Var.I.s7(false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorSingSongEditPanel", "Reorder songs failed");
                db5.t7.m(m0Var.f199716e, "网络错误，请稍后再试");
                m0Var.I.s7(false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorSingSongEditPanel", "Reorder songs exception: " + e17.getMessage());
            zl2.r4.f555483a.h3(m0Var.f199716e, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(m0Var, false, 1, null);
            db5.t7.m(m0Var.f199716e, "网络错误，请稍后再试");
            m0Var.I.s7(false);
        }
        return jz5.f0.f384359a;
    }
}
