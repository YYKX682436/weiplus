package df2;

/* loaded from: classes3.dex */
public final class xn implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zn f313323d;

    public xn(df2.zn znVar) {
        this.f313323d = znVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        co0.s sVar;
        kn0.p pVar;
        km2.w wVar = (km2.w) obj;
        tn0.w0 w0Var = dk2.ef.f314911d;
        boolean z17 = (w0Var == null || (pVar = w0Var.D) == null || !pVar.f()) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMiniWindowController", "liveInfoChangeLiveData collect value " + wVar + " isFloatMode: " + z17);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            boolean z18 = wVar instanceof km2.h;
            df2.zn znVar = this.f313323d;
            if (z18) {
                znVar.getClass();
                java.lang.String str = ((km2.h) wVar).f390637a.f420251d;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((mm2.c1) znVar.m56788xbba4bfc0(mm2.c1.class)).m8(), str != null ? str : "")) {
                    tn0.w0 w0Var2 = dk2.ef.f314911d;
                    sVar = w0Var2 instanceof co0.s ? (co0.s) w0Var2 : null;
                    if (sVar != null) {
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614(context);
                        fo0.n nVar = sVar.f502300p;
                        if (nVar != null) {
                            nVar.c(c10850xc00cf614);
                        }
                        if (sVar.R1.f363942a == null) {
                            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                            sVar.Y0(context2, zl2.r4.f555483a.d0("LiveMiniWindowController"), new df2.vn(), ((mm2.c1) znVar.m56788xbba4bfc0(mm2.c1.class)).g8());
                        }
                        sVar.S0(1, c10850xc00cf614, df2.wn.f313235d);
                    }
                }
            } else if (wVar instanceof km2.a) {
                znVar.getClass();
                java.lang.String str2 = ((km2.a) wVar).f390581a.f420235c;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((mm2.c1) znVar.m56788xbba4bfc0(mm2.c1.class)).m8(), str2 != null ? str2 : "")) {
                    tn0.w0 w0Var3 = dk2.ef.f314911d;
                    sVar = w0Var3 instanceof co0.s ? (co0.s) w0Var3 : null;
                    if (sVar != null) {
                        sVar.T0(true);
                    }
                }
            }
        }
        return f0Var;
    }
}
