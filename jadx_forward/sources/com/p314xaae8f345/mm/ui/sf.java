package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class sf implements yb5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f291390d;

    public sf(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        this.f291390d = c21427xe5bb8a3;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        boolean z17;
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f291390d;
        try {
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LauncherUI.NewChattingTabUI", e17, "", new java.lang.Object[0]);
            new android.os.Handler().post(new com.p314xaae8f345.mm.ui.rf(this, e17));
        }
        if (!c21427xe5bb8a3.f278547a.isFinishing() && !c21427xe5bb8a3.f278547a.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI logic start");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (c21427xe5bb8a3.f278549c == null) {
                com.p314xaae8f345.mm.ui.C21427xe5bb8a3.e(c21427xe5bb8a3, new android.content.Intent().putExtra("Chat_User", ""), true);
                c21427xe5bb8a3.f278549c.setVisibility(8);
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) ((com.p314xaae8f345.mm.ui.C21374x812c2fd3) c21427xe5bb8a3.f278548b).f278294t.f278468o.get(0);
                if (c22376x88ed722d != null) {
                    c22376x88ed722d.s0();
                }
                db5.m9.a(true, new android.content.Intent().putExtra("classname", com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getName().concat("")));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI logic use %dms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (!c21427xe5bb8a3.f278547a.isDestroyed() && !c21427xe5bb8a3.f278547a.isFinishing()) {
            z17 = false;
        }
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI but activity finished isDestroyed[%b]", objArr);
        return false;
    }
}
