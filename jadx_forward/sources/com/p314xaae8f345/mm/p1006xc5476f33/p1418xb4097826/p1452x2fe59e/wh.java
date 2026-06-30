package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class wh implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192510a;

    public wh(int i17) {
        this.f192510a = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.nw1 m76794xd0557130;
        r45.nw1 m76794xd05571302;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgiGetFinderFeedComment errCode:");
        sb6.append(fVar.f152149b);
        sb6.append(" errType:");
        sb6.append(fVar.f152148a);
        sb6.append(" url:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        sb6.append((c19792x256d2725 == null || (m76794xd05571302 = c19792x256d2725.m76794xd0557130()) == null) ? null : m76794xd05571302.m75945x2fec8307(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", sb6.toString());
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2)) != null) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            intent.putExtra("CURRENT_FEED_ID", c19792x256d27252 != null ? java.lang.Long.valueOf(c19792x256d27252.m76784x5db1b11()) : null);
            intent.putExtra("LAUNCH_WITH_ANIM", false);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", (c19792x256d27253 == null || (m76794xd0557130 = c19792x256d27253.m76794xd0557130()) == null) ? 0 : m76794xd0557130.m75939xb282bd08(42));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27254);
            arrayList.add(c19792x256d27254);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            y74Var.set(1, java.lang.Integer.valueOf(this.f192510a));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27255 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27255);
            y74Var.set(5, c19792x256d27255);
            wk0Var.set(6, y74Var);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((vd2.f1) e0Var).Ni(context, intent, arrayList, 0, wk0Var, null);
        }
        return jz5.f0.f384359a;
    }
}
