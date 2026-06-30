package dk5;

/* loaded from: classes11.dex */
public class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 f316488d;

    public v0(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 activityC22566x6f3df1e3) {
        this.f316488d = activityC22566x6f3df1e3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 activityC22566x6f3df1e3 = this.f316488d;
        if (!activityC22566x6f3df1e3.I) {
            activityC22566x6f3df1e3.I = true;
            java.util.List t17 = activityC22566x6f3df1e3.F.t();
            java.util.Iterator it = ((java.util.ArrayList) t17).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = true;
                    break;
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) it.next())) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                activityC22566x6f3df1e3.w7(((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@chatroom").l("", t17));
            } else {
                activityC22566x6f3df1e3.w7(((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@im.chatroom").l("", t17));
            }
            if (activityC22566x6f3df1e3.E == 3) {
                activityC22566x6f3df1e3.H = true;
                java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.f219908a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13970, 1);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCreateChatroomUI", "Create the chatroom");
        return true;
    }
}
