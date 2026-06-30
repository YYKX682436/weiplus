package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f146145d;

    public w0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f146145d = activityC10332x8a1129f5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f146145d;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(activityC10332x8a1129f5.A);
        activityC10332x8a1129f5.F = z07;
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomInfoUI", "member is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f69107x5be1edb3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomInfoUI", "roomowner is null");
            return;
        }
        activityC10332x8a1129f5.f145230o.mo50305x3d8a09a2(0);
        activityC10332x8a1129f5.B = activityC10332x8a1129f5.F.f69107x5be1edb3.equals(c01.z1.r());
        if (activityC10332x8a1129f5.f145224f) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = activityC10332x8a1129f5.f145234s;
        java.lang.String str = activityC10332x8a1129f5.F.f69107x5be1edb3;
        lz.f fVar = c19662x4f7a67f3.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.D = str;
        }
    }

    /* renamed from: toString */
    public java.lang.String m43550x9616526c() {
        return super.toString() + "|onNotifyChange";
    }
}
