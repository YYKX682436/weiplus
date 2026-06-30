package qf2;

/* loaded from: classes.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f444169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f444170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444171g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, km2.q qVar, qf2.v0 v0Var, yz5.a aVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444168d = hVar;
        this.f444169e = qVar;
        this.f444170f = v0Var;
        this.f444171g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.x(this.f444168d, interfaceC29045xdcb5ca57, this.f444169e, this.f444170f, this.f444171g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.x xVar = (qf2.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        xVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f444168d).f535914b).f535912a;
        if (jVar == null || (str = jVar.f478959g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f478958f : 0;
        int i18 = jVar != null ? jVar.f478957e : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "apply pk response fail, errCode: " + i17 + " errMsg: " + str + " errType: " + i18);
        km2.q qVar = this.f444169e;
        if (qVar != null) {
            qVar.f390714l = 0;
        }
        if (str.length() == 0) {
            str = null;
        }
        qf2.v0 v0Var = this.f444170f;
        switch (i17) {
            case -200075:
                android.content.Context O6 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmc);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                }
                db5.t7.m123883x26a183b(O6, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409366t, v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmc), -1, -1);
                break;
            case -200074:
            default:
                android.content.Context O62 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dux);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                }
                db5.t7.m123883x26a183b(O62, str, 0).show();
                long m75942xfb822ef2 = ((mm2.e1) v0Var.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicWatcher", "onAnchorApplyMicPkFail errCode: " + i17 + " errType: " + i18 + " liveId: " + m75942xfb822ef2);
                pm0.z.b(xy2.b.f539688b, "micpk_anchorApplyMicFail", false, null, null, false, false, new dk2.pa(i17, i18, m75942xfb822ef2), 60, null);
                break;
            case -200073:
                android.content.Context O63 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmb);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                }
                db5.t7.m123883x26a183b(O63, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409366t, v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmb), -1, -1);
                break;
            case -200072:
                android.content.Context O64 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmd);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                }
                db5.t7.m123883x26a183b(O64, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409366t, v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmd), -1, -1);
                break;
            case -200071:
                android.content.Context O65 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmf);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                }
                db5.t7.m123883x26a183b(O65, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409366t, v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmf), -1, -1);
                break;
            case -200070:
                android.content.Context O66 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dme);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                }
                db5.t7.m123883x26a183b(O66, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409366t, v0Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dme), -1, -1);
                break;
        }
        yz5.a aVar2 = this.f444171g;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
