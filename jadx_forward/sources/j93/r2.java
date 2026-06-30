package j93;

/* loaded from: classes.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.v2 f380023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(j93.v2 v2Var) {
        super(1);
        this.f380023d = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        j93.v2 v2Var = this.f380023d;
        if (dVar != null && (dVar instanceof wi5.c)) {
            v2Var.f380051e.clear();
            v2Var.f380051e.addAll(state.f527852o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelRemoveContactUIC", "showRemoveTipsBottomSheet() called");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) v2Var.m80379x76847179(), 1, true);
            k0Var.f293405n = new j93.s2(1, v2Var);
            k0Var.f293414s = new j93.t2(1, v2Var);
            k0Var.v();
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            if (v2Var.f380056m) {
                v2Var.f380056m = false;
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) v2Var.f380050d).mo141623x754a37bb()).k();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
                b93.q.f100138a.a(0, 2, 1, 23, v2Var.f380052f, v2Var.T6(), 0, 0, (a17 == null || (arrayList = a17.f233598o) == null) ? 0 : arrayList.size(), 0);
                v2Var.f380055i = 0;
                v2Var.f380054h = 0;
                v2Var.f380053g = false;
            }
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.y0)) {
            v2Var.f380054h++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.SelectContactReportUIC", "onCreate: UnSelectUserActionFromFooterView " + ((wi5.y0) dVar3).f527898b);
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof wi5.m)) {
            v2Var.f380053g = true;
        }
        if (dVar4 != null && (dVar4 instanceof wi5.z0)) {
            v2Var.f380055i += java.lang.Math.abs(((wi5.z0) dVar4).f527903b);
        }
        return jz5.f0.f384359a;
    }
}
