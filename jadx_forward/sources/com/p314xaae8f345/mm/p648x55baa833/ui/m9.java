package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public final class m9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 f145905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0) {
        super(0);
        this.f145905d = activityC10359x5d5d51f0;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0.f145403q;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0 = this.f145905d;
        activityC10359x5d5d51f0.getClass();
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        java.lang.String string = activityC10359x5d5d51f0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lns);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String X6 = activityC10359x5d5d51f0.X6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X6, "<get-roomId>(...)");
        java.util.ArrayList arrayList = activityC10359x5d5d51f0.f145410m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next()).d1());
        }
        android.content.Intent Ai = ((qd0.q0) e1Var).Ai(activityC10359x5d5d51f0, string, X6, arrayList2, kz5.p0.f395529d, true);
        Ai.putExtra("block_contact", c01.z1.r());
        Ai.putExtra("max_limit_num", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("RoomLimitWatchMemberMax"), 4) - arrayList.size());
        Ai.putExtra("too_many_member_tip_string", activityC10359x5d5d51f0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6k, java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("RoomLimitWatchMemberMax"), 4))));
        Ai.putExtra("too_many_member_tip_ok_string", activityC10359x5d5d51f0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        activityC10359x5d5d51f0.startActivityForResult(Ai, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "goToAddFollowerMember");
        return jz5.f0.f384359a;
    }
}
