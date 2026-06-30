package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class m0 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f145884f;

    public m0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5, java.lang.String str, java.lang.String str2) {
        this.f145884f = activityC10332x8a1129f5;
        this.f145882d = str;
        this.f145883e = str2;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        o65.f fVar = (o65.f) bVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[2] = str;
        objArr[3] = fVar != null ? java.lang.Integer.valueOf(fVar.f424756a) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomInfoUI", "deleteChatroomImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f145884f;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(activityC10332x8a1129f5.A)) {
            activityC10332x8a1129f5.i7();
            if (this.f424756a == 0) {
                com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Z6(activityC10332x8a1129f5, this.f145883e);
                return;
            } else {
                com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y6(activityC10332x8a1129f5, fVar);
                return;
            }
        }
        if (this.f424756a != 0) {
            activityC10332x8a1129f5.i7();
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y6(activityC10332x8a1129f5, fVar);
            return;
        }
        r45.sb0 sb0Var = new r45.sb0();
        r45.du5 du5Var = new r45.du5();
        java.lang.String str2 = this.f145882d;
        du5Var.f454289d = str2 != null ? str2 : "";
        du5Var.f454290e = true;
        sb0Var.f467138d = du5Var;
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.h hVar = new com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.h(true);
        activityC10332x8a1129f5.U = hVar;
        xg3.p0 p0Var = new xg3.p0(7, sb0Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(p0Var);
        hVar.f273799f = new e21.k(linkedList);
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a aVar = activityC10332x8a1129f5.U;
        aVar.f273781d = new com.p314xaae8f345.mm.p648x55baa833.ui.l0(this);
        aVar.b();
    }
}
