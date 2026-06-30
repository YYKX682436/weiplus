package com.tencent.mm.plugin.backup.roambackup.roamlite;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/roamlite/RoamLitePackageListUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "Lmo1/r;", "state", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class RoamLitePackageListUI extends com.tencent.mm.ui.MMComposeActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f92709f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f92710d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f92711e;

    public RoamLitePackageListUI() {
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(mo1.p.f330319a);
        this.f92710d = a17;
        this.f92711e = kotlinx.coroutines.flow.l.b(a17);
    }

    public static final void V6(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI roamLitePackageListUI, n0.o oVar, int i17) {
        com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLitePackageListUI roamLitePackageListUI2;
        boolean z17;
        roamLitePackageListUI.getClass();
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1773484831);
        java.lang.Object obj = n0.e1.f333492a;
        kotlinx.coroutines.flow.f3 f3Var = roamLitePackageListUI.f92711e;
        kotlin.jvm.internal.o.g(f3Var, "<this>");
        y0Var.U(-1439883919);
        oz5.m mVar = oz5.m.f350329d;
        java.lang.Object value = ((kotlinx.coroutines.flow.l2) f3Var).getValue();
        y0Var.U(-606625098);
        n0.y4 y4Var = new n0.y4(mVar, f3Var, null);
        y0Var.U(-1703169085);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f333620a) {
            y17 = n0.s4.c(value, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        n0.d2.e(f3Var, mVar, new n0.u4(y4Var, v2Var, null), y0Var, 72);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(false);
        z0.p pVar = z0.p.f468921d;
        z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        z0.t c17 = a0.b.c(e17, rz0.a.b(com.tencent.mm.R.color.f478489a, context), null, 2, null);
        y0Var.U(-483455358);
        s1.t0 a17 = d0.j0.a(d0.p.f225186d, z0.a.f468900l, y0Var, 0);
        y0Var.U(-1323940314);
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
        p2.f fVar = (p2.f) y0Var.i(h3Var);
        n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
        p2.s sVar = (p2.s) y0Var.i(h3Var2);
        n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(c17);
        boolean z18 = y0Var.f333761b instanceof n0.e;
        if (!z18) {
            n0.l.a();
            throw null;
        }
        y0Var.X();
        if (y0Var.L) {
            y0Var.j(aVar);
        } else {
            y0Var.i0();
        }
        y0Var.f333784y = false;
        yz5.p pVar2 = u1.f.f423590e;
        n0.i5.a(y0Var, a17, pVar2);
        yz5.p pVar3 = u1.f.f423589d;
        n0.i5.a(y0Var, fVar, pVar3);
        yz5.p pVar4 = u1.f.f423591f;
        n0.i5.a(y0Var, sVar, pVar4);
        yz5.p pVar5 = u1.f.f423592g;
        n0.i5.a(y0Var, k4Var, pVar5);
        y0Var.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-1163856341);
        z0.b bVar = z0.a.f468901m;
        androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
        tz0.c.a(mo1.t.f330334d, new d0.t0(bVar, e3Var), null, null, false, "刷新已绑定的设备", null, y0Var, 196614, 92);
        d0.e3.a(d0.a3.g(pVar, 8), y0Var, 6);
        z0.t e18 = d0.a3.e(pVar, 0.0f, 1, null);
        y0Var.U(733328855);
        s1.t0 c18 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
        y0Var.U(-1323940314);
        p2.f fVar2 = (p2.f) y0Var.i(h3Var);
        p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
        androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
        yz5.q a19 = s1.g0.a(e18);
        if (!z18) {
            n0.l.a();
            throw null;
        }
        y0Var.X();
        if (y0Var.L) {
            y0Var.j(aVar);
        } else {
            y0Var.i0();
        }
        y0Var.f333784y = false;
        n0.i5.a(y0Var, c18, pVar2);
        n0.i5.a(y0Var, fVar2, pVar3);
        n0.i5.a(y0Var, sVar2, pVar4);
        n0.i5.a(y0Var, k4Var2, pVar5);
        y0Var.n();
        ((u0.i) a19).invoke(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-2137368960);
        mo1.r rVar = (mo1.r) v2Var.getValue();
        if (kotlin.jvm.internal.o.b(rVar, mo1.p.f330319a)) {
            y0Var.U(97708281);
            l0.o1.a(new d0.q(z0.a.f468893e, false, e3Var), 0L, 0.0f, y0Var, 0, 6);
            z17 = false;
            y0Var.o(false);
            roamLitePackageListUI2 = roamLitePackageListUI;
        } else if (rVar instanceof mo1.o) {
            y0Var.U(97708443);
            mo1.r rVar2 = (mo1.r) v2Var.getValue();
            kotlin.jvm.internal.o.e(rVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.roamlite.PackageListDataState.Error");
            roamLitePackageListUI2 = roamLitePackageListUI;
            roamLitePackageListUI2.T6(((mo1.o) rVar2).f330313a, new mo1.u(roamLitePackageListUI2), y0Var, 512);
            z17 = false;
            y0Var.o(false);
        } else {
            roamLitePackageListUI2 = roamLitePackageListUI;
            if (rVar instanceof mo1.q) {
                y0Var.U(97708661);
                mo1.r rVar3 = (mo1.r) v2Var.getValue();
                kotlin.jvm.internal.o.e(rVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.roamlite.PackageListDataState.Success");
                roamLitePackageListUI2.U6(((mo1.q) rVar3).f330322a, mo1.v.f330338d, y0Var, 568);
                z17 = false;
                y0Var.o(false);
            } else {
                z17 = false;
                y0Var.U(97709374);
                y0Var.o(false);
            }
        }
        y0Var.o(z17);
        y0Var.o(z17);
        y0Var.o(true);
        y0Var.o(z17);
        y0Var.o(z17);
        y0Var.o(z17);
        y0Var.o(z17);
        y0Var.o(true);
        y0Var.o(z17);
        y0Var.o(z17);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new mo1.w(roamLitePackageListUI2, i17);
        }
    }

    public final void T6(java.lang.String error, yz5.a onRetry, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        kotlin.jvm.internal.o.g(error, "error");
        kotlin.jvm.internal.o.g(onRetry, "onRetry");
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-1230319723);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(error) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.e(onRetry) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i19 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            float f17 = 16;
            z0.t f18 = d0.a2.f(d0.a3.e(pVar, 0.0f, 1, null), f17);
            d0.p pVar2 = d0.p.f225183a;
            d0.e eVar = d0.p.f225188f;
            int i27 = z0.d.f468903a;
            z0.b bVar = z0.a.f468901m;
            y0Var2.U(-483455358);
            s1.t0 a17 = d0.j0.a(eVar, bVar, y0Var2, 54);
            y0Var2.U(-1323940314);
            p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(f18);
            if (!(y0Var2.f333761b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar);
            } else {
                y0Var2.i0();
            }
            y0Var2.f333784y = false;
            fVar2.getClass();
            n0.i5.a(y0Var2, a17, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
            y0Var2.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            l0.e5.c("Error: ".concat(error), null, ((l0.i) y0Var2.i(l0.k.f314314a)).c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 0, 0, 65530);
            d0.e3.a(d0.a3.g(pVar, f17), y0Var2, 6);
            yz5.q qVar = mo1.c.f330271a;
            y0Var = y0Var2;
            l0.h.a(onRetry, null, false, null, null, null, null, null, null, mo1.c.f330271a, y0Var2, ((i18 >> 3) & 14) | 805306368, ac1.g.CTRL_INDEX);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new mo1.s(this, error, onRetry, i17);
        }
    }

    public final void U6(java.util.List list, yz5.p pVar, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1640259240);
        java.lang.Object obj = n0.e1.f333492a;
        int i18 = z0.t.f468922q1;
        float f17 = 8;
        e0.f.a(d0.a2.j(d0.a3.e(z0.p.f468921d, 0.0f, 1, null), f17, 0.0f, f17, 0.0f, 10, null), null, null, false, null, null, null, false, new mo1.d0(list, pVar), y0Var, 6, 254);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new mo1.e0(this, list, pVar, i17);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(this, null, 0, 6, null);
        composeView.setContent(u0.j.c(-345292663, true, new mo1.f0(this)));
        return composeView;
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new mo1.h0(this));
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new mo1.g0(this, null), 3, null);
    }
}
