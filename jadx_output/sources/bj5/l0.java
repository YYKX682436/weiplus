package bj5;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.r0 f21196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(bj5.r0 r0Var) {
        super(1);
        this.f21196d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        java.util.LinkedList linkedList = state.f446319o;
        bj5.r0 r0Var = this.f21196d;
        if (dVar != null && (dVar instanceof wi5.c)) {
            bj5.r0.U6(r0Var, 1, linkedList.size());
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.a)) {
            bj5.r0.U6(r0Var, 0, linkedList.size());
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.b0)) {
            wi5.b0 b0Var = (wi5.b0) dVar3;
            int i17 = r0Var.f21224h;
            int i18 = b0Var.f446280b;
            r0Var.f21224h = i17 + i18;
            java.util.ArrayList arrayList = r0Var.f21228o;
            int i19 = b0Var.f446281c;
            arrayList.add(bj5.r0.T6(r0Var, 2, i18, i19));
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectContactReportUIC", "onCreate: SelectChatroomCountAction:count:" + b0Var.f446280b + " userNameCount:" + i19);
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof wi5.r0)) {
            wi5.r0 r0Var2 = (wi5.r0) dVar4;
            int i27 = r0Var.f21224h;
            int i28 = r0Var2.f446337b;
            r0Var.f21224h = i27 + i28;
            java.util.ArrayList arrayList2 = r0Var.f21228o;
            int i29 = r0Var2.f446338c;
            arrayList2.add(bj5.r0.T6(r0Var, 3, i28, i29));
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectContactReportUIC", "onCreate: SelectLabelCountAction:count:" + r0Var2.f446337b + " userNameCount:" + i29);
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof wi5.y0)) {
            r0Var.f21226m++;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectContactReportUIC", "onCreate: UnSelectUserActionFromFooterView " + ((wi5.y0) dVar5).f446365b);
        }
        j75.d dVar6 = state.f298066d;
        if (dVar6 != null && (dVar6 instanceof wi5.m)) {
            r0Var.f21225i = true;
        }
        if (dVar6 != null && (dVar6 instanceof wi5.z0)) {
            r0Var.f21227n += ((wi5.z0) dVar6).f446370b;
        }
        return jz5.f0.f302826a;
    }
}
