package tv0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f503779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f503780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f503781f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tv0.j0 j0Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503780e = j0Var;
        this.f503781f = c4181x2248e1a3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tv0.w(this.f503780e, this.f503781f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tv0.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f503779d;
        tv0.j0 j0Var = this.f503780e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = j0Var.F;
            if (r2Var != null) {
                this.f503779d = 1;
                if (((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                j0Var.l7(j0Var.s7());
                float f17 = j0Var.B;
                android.view.ViewGroup w76 = j0Var.w7();
                long v76 = j0Var.v7();
                float f18 = 1;
                float f19 = f17 * f18;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f503781f;
                float f27 = f19 / c4181x2248e1a3.q1().m32427xfb854877().f129332x;
                float f28 = f19 / c4181x2248e1a3.q1().m32427xfb854877().f129333y;
                float f29 = 2;
                float f37 = ((f18 - c4181x2248e1a3.q1().m32427xfb854877().f129332x) / f29) - c4181x2248e1a3.q1().m32426x28f8d21c().f129332x;
                float f38 = ((f18 - c4181x2248e1a3.q1().m32427xfb854877().f129333y) / f29) - c4181x2248e1a3.q1().m32426x28f8d21c().f129333y;
                w76.setScaleX(f27);
                w76.setScaleY(f28);
                w76.setTranslationX(d1.k.d(v76) * f27 * f37);
                w76.setTranslationY(d1.k.b(v76) * f28 * f38);
                j0Var.z7();
                j0Var.k7();
                yw0.p m76 = j0Var.m7();
                m76.f548113c = yw0.o.f548109d;
                ((yw0.l) m76.f548120a).a();
                yw0.b n76 = j0Var.n7();
                n76.f548064i = yw0.a.f548054d;
                ((yw0.l) n76.f548120a).a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CropMaterialReferenceDrawer", "beginTrackingCropArea: ");
                j0Var.o7().u7().setText(j65.q.a(j0Var.m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtn));
                j0Var.o7().u7().setVisibility(0);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f503779d = 2;
        if (p3325xe03a0797.p3326xc267989b.k1.b(200L, this) == aVar) {
            return aVar;
        }
        j0Var.l7(j0Var.s7());
        float f172 = j0Var.B;
        android.view.ViewGroup w762 = j0Var.w7();
        long v762 = j0Var.v7();
        float f182 = 1;
        float f192 = f172 * f182;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a32 = this.f503781f;
        float f272 = f192 / c4181x2248e1a32.q1().m32427xfb854877().f129332x;
        float f282 = f192 / c4181x2248e1a32.q1().m32427xfb854877().f129333y;
        float f292 = 2;
        float f372 = ((f182 - c4181x2248e1a32.q1().m32427xfb854877().f129332x) / f292) - c4181x2248e1a32.q1().m32426x28f8d21c().f129332x;
        float f382 = ((f182 - c4181x2248e1a32.q1().m32427xfb854877().f129333y) / f292) - c4181x2248e1a32.q1().m32426x28f8d21c().f129333y;
        w762.setScaleX(f272);
        w762.setScaleY(f282);
        w762.setTranslationX(d1.k.d(v762) * f272 * f372);
        w762.setTranslationY(d1.k.b(v762) * f282 * f382);
        j0Var.z7();
        j0Var.k7();
        yw0.p m762 = j0Var.m7();
        m762.f548113c = yw0.o.f548109d;
        ((yw0.l) m762.f548120a).a();
        yw0.b n762 = j0Var.n7();
        n762.f548064i = yw0.a.f548054d;
        ((yw0.l) n762.f548120a).a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CropMaterialReferenceDrawer", "beginTrackingCropArea: ");
        j0Var.o7().u7().setText(j65.q.a(j0Var.m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtn));
        j0Var.o7().u7().setVisibility(0);
        return jz5.f0.f384359a;
    }
}
