package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class m1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269777d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269777d = activityC19519x7af4daf3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
        boolean z17 = true;
        if (hVar != null) {
            java.lang.String h17 = hVar.h();
            hz4.i iVar = hVar.f367951i;
            java.lang.String a17 = iVar.a(h17);
            boolean g17 = hVar.g();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3 c6447xbd8a5a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3();
            c6447xbd8a5a3.f137877d = 16;
            c6447xbd8a5a3.f137879f = c6447xbd8a5a3.b("noteid", a17, true);
            c6447xbd8a5a3.f137880g = g17 ? 1 : 0;
            c6447xbd8a5a3.f137878e = c6447xbd8a5a3.b("sessionID", iVar.f367958a, true);
            c6447xbd8a5a3.k();
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                java.lang.String n17 = c6447xbd8a5a3.n();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269777d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC19519x7af4daf3.mo55332x76847179(), 1, false);
        k0Var.f293425z = new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.C19527x616d3fd();
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.n1(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.o1(this);
        if (activityC19519x7af4daf3.f269697y0 == 2) {
            mz4.d dVar = activityC19519x7af4daf3.J1;
            if (dVar.f414767f < 1 && dVar.f414766e < 1) {
                z17 = false;
            }
            if (!z17) {
                android.view.View findViewById = activityC19519x7af4daf3.findViewById(com.p314xaae8f345.mm.R.id.f564015fq);
                if (findViewById != null) {
                    findViewById.setTag(com.p314xaae8f345.mm.R.id.nwn, "1");
                }
                return false;
            }
        }
        android.view.View findViewById2 = activityC19519x7af4daf3.findViewById(com.p314xaae8f345.mm.R.id.f564015fq);
        if (findViewById2 != null) {
            findViewById2.setTag(com.p314xaae8f345.mm.R.id.nwn, "0");
        }
        if (activityC19519x7af4daf3.f269697y0 == 2) {
            activityC19519x7af4daf3.b5();
            mz4.a0 a0Var = activityC19519x7af4daf3.f269688s;
            if (a0Var != null) {
                a0Var.f414753a.dismiss();
            }
            activityC19519x7af4daf3.f269687r.setVisibility(8);
            if (activityC19519x7af4daf3.C1) {
                nz4.y.h().c();
            }
        }
        activityC19519x7af4daf3.f269674J.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.w1(this, k0Var), 100L);
        return false;
    }
}
