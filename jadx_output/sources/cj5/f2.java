package cj5;

/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(cj5.l2 l2Var) {
        super(1);
        this.f42118d = l2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6;
        j75.f stateCenter2;
        j75.f stateCenter3;
        j75.f stateCenter4;
        android.view.View view;
        xm3.t0 t0Var;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "InitAction");
            cj5.l2 l2Var = this.f42118d;
            zm3.a T6 = l2Var.T6();
            if (T6 != null) {
                ym3.f T62 = T6.T6();
                xm3.n0 n0Var = new xm3.n0();
                n0Var.f455362g = 6;
                com.tencent.mm.ui.mvvm.list.SelectContactMvvmList selectContactMvvmList = new com.tencent.mm.ui.mvvm.list.SelectContactMvvmList(T62, n0Var, l2Var.getActivity());
                xm3.t0 t0Var2 = new xm3.t0(selectContactMvvmList, new in5.s() { // from class: com.tencent.mm.ui.mvvm.uic.base.SelectContactMainRecycleViewUIC$buildItemConvertFactory$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        ri5.h hVar = ri5.j.I;
                        if (type == ri5.j.f396106p0) {
                            return new ri5.c();
                        }
                        if (type == ri5.j.M) {
                            return new ri5.k();
                        }
                        boolean z17 = true;
                        if (type != ri5.j.K && type != ri5.j.N) {
                            z17 = false;
                        }
                        return z17 ? new ri5.a() : type == ri5.j.f396105J ? new ri5.p() : new ri5.g();
                    }
                }, false);
                t0Var2.B = (cj5.g2) ((jz5.n) l2Var.f42186i).getValue();
                l2Var.f42185h = t0Var2;
                j75.e eVar = h0Var.f298067a;
                if (eVar != null && (eVar instanceof wi5.i0)) {
                    wi5.i0 i0Var = (wi5.i0) eVar;
                    for (yz5.a aVar : i0Var.f446295a) {
                        if (aVar != null && (view = (android.view.View) aVar.invoke()) != null && (t0Var = l2Var.f42185h) != null) {
                            in5.n0.U(t0Var, view, view.hashCode(), false, 4, null);
                        }
                    }
                    v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) l2Var.f42182e).getValue(), null, new cj5.c2(selectContactMvvmList, l2Var, i0Var, null), 1, null);
                }
                l2Var.Y6().k().setAdapter(l2Var.f42185h);
                l2Var.Y6().k().setLayoutManager((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) l2Var.f42184g).getValue());
                com.tencent.mm.view.recyclerview.WxRecyclerView k17 = l2Var.Y6().k();
                androidx.recyclerview.widget.z zVar = new androidx.recyclerview.widget.z();
                zVar.f12171f = 0L;
                k17.setItemAnimator(zVar);
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = l2Var.P6();
                if (P62 != null && (stateCenter4 = P62.getStateCenter()) != null) {
                    stateCenter4.B3(new wi5.p());
                }
            }
            l2Var.Y6().k().setOnTouchListener(new cj5.d2(l2Var));
            l2Var.Y6().k().i(new cj5.e2(l2Var));
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P63 = l2Var.P6();
            if (P63 != null && (stateCenter3 = P63.getStateCenter()) != null) {
                cj5.x1 x1Var = new cj5.x1(l2Var);
                cj5.y1 y1Var = new cj5.y1(l2Var);
                com.tencent.mm.view.recyclerview.WxRecyclerView k18 = l2Var.Y6().k();
                kotlin.jvm.internal.o.f(k18, "getSelectContactRv(...)");
                stateCenter3.B3(new wi5.q(x1Var, y1Var, k18));
            }
            if (h0Var.f446292b && (P6 = l2Var.P6()) != null && (stateCenter2 = P6.getStateCenter()) != null) {
                stateCenter2.B3(new wi5.e());
            }
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P64 = l2Var.P6();
            if (P64 != null && (stateCenter = P64.getStateCenter()) != null) {
                stateCenter.B3(new wi5.s());
            }
            ((jz5.n) l2Var.f42190p).getValue();
        }
        return jz5.f0.f302826a;
    }
}
