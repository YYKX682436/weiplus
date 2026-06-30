package df2;

/* loaded from: classes3.dex */
public final class rs extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs(df2.lt ltVar) {
        super(0);
        this.f312798d = ltVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.lt ltVar = this.f312798d;
        android.view.ViewGroup viewGroup = ltVar.f312237J;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.e4 e4Var = ml2.e4.f408911g;
            r0Var.Qk(e4Var);
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.class)).f198524q = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = ltVar.f372632e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
            if (k0Var != null) {
                qo0.c.a(k0Var, qo0.b.f446924o, null, 2, null);
            }
            te2.t8.f499973a.a(3, ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).U4, ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410340g2, true);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var2 = (ml2.r0) c17;
            km2.n nVar = dk2.ef.H;
            ml2.r0.Ck(r0Var2, activity, e4Var, nVar != null ? nVar.f390693l : null, false, null, 24, null);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Rj().y0();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Nj().J0();
        }
        return jz5.f0.f384359a;
    }
}
