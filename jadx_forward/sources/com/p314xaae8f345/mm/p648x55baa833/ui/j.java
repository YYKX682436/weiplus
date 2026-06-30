package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f145770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.k f145771e;

    public j(com.p314xaae8f345.mm.p648x55baa833.ui.k kVar, java.util.List list) {
        this.f145771e = kVar;
        this.f145770d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.k kVar = this.f145771e;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = kVar.f145795d;
        int i17 = activityC10332x8a1129f5.C;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f52 = kVar.f145795d;
        if (i17 <= 1) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC10332x8a1129f5.f145226h).m("del_selector_btn", true);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = activityC10332x8a1129f52.f145234s;
            c19662x4f7a67f3.T(true);
            c19662x4f7a67f3.V(false);
            c19662x4f7a67f3.Y(false);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = activityC10332x8a1129f5.f145234s;
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(activityC10332x8a1129f52.p7());
            c19662x4f7a67f32.Y(false);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = activityC10332x8a1129f52.f145234s;
        java.lang.String str = activityC10332x8a1129f52.A;
        boolean z17 = activityC10332x8a1129f52.f145229n;
        r35.e2 e2Var = new r35.e2() { // from class: com.tencent.mm.chatroom.ui.j$$a
            @Override // r35.e2
            public final void a() {
                final com.p314xaae8f345.mm.p648x55baa833.ui.j jVar = com.p314xaae8f345.mm.p648x55baa833.ui.j.this;
                jVar.getClass();
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.chatroom.ui.j$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p648x55baa833.ui.j jVar2 = com.p314xaae8f345.mm.p648x55baa833.ui.j.this;
                        jVar2.getClass();
                        r35.v1.L = r35.v1.K;
                        com.p314xaae8f345.mm.p648x55baa833.ui.k kVar2 = jVar2.f145771e;
                        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f53 = kVar2.f145795d;
                        boolean z18 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y;
                        activityC10332x8a1129f53.y7();
                        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f54 = kVar2.f145795d;
                        activityC10332x8a1129f54.t7();
                        activityC10332x8a1129f54.l7();
                    }
                });
            }
        };
        lz.f fVar = c19662x4f7a67f33.M;
        if (fVar != null) {
            r35.u1 u1Var = (r35.u1) fVar;
            u1Var.f450811j = str;
            java.util.List list = this.f145770d;
            if (list == null) {
                list = new java.util.ArrayList(0);
            }
            r35.v1 v1Var = u1Var.f450807f;
            v1Var.f450840z = true;
            v1Var.f450823f = list;
            v1Var.F = z17;
            v1Var.f450822e = e2Var;
            u1Var.a(str);
        }
        activityC10332x8a1129f52.f145234s.W(true);
        activityC10332x8a1129f52.m79335xcc101dd9().postOnAnimation(new java.lang.Runnable() { // from class: com.tencent.mm.chatroom.ui.j$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p648x55baa833.ui.k kVar2 = com.p314xaae8f345.mm.p648x55baa833.ui.j.this.f145771e;
                kVar2.f145795d.m79335xcc101dd9().smoothScrollToPositionFromTop(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) kVar2.f145795d.f145226h).o("roominfo_contact_anchor"), 0, 0);
            }
        });
    }
}
