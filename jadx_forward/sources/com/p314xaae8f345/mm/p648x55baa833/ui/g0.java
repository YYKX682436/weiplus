package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class g0 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f145704d;

    public g0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f145704d = activityC10332x8a1129f5;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomInfoUI", "quitChatroom errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f145704d.A)) {
            if (this.f424756a == 0) {
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p648x55baa833.ui.f0(this));
                return;
            } else {
                this.f145704d.i7();
                com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y6(this.f145704d, fVar);
                return;
            }
        }
        this.f145704d.i7();
        if (this.f424756a == 0) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.X6(this.f145704d);
        } else {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y6(this.f145704d, fVar);
        }
    }
}
