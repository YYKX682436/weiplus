package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class s3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10344x9fa852c8 f146033d;

    public s3(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10344x9fa852c8 activityC10344x9fa852c8) {
        this.f146033d = activityC10344x9fa852c8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "menu click");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10344x9fa852c8 activityC10344x9fa852c8 = this.f146033d;
        rn.h hVar = activityC10344x9fa852c8.f145313p;
        hVar.f66388x66b87861 = rn.h.u0(hVar.f479137t);
        activityC10344x9fa852c8.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "doAlterWxApp()");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (activityC10344x9fa852c8.f145313p.f479137t.size() > 0) {
            java.util.Iterator it = activityC10344x9fa852c8.f145313p.f479137t.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a = (com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) it.next();
                r45.wt5 wt5Var = new r45.wt5();
                wt5Var.f470982d = c10329x6f52684a.f145215d;
                wt5Var.f470983e = "";
                linkedList.add(wt5Var);
            }
        }
        kn.a0 a0Var = new kn.a0(activityC10344x9fa852c8.f145315r, linkedList);
        gm0.j1.d().g(a0Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC10344x9fa852c8.f145308h;
        if (u3Var == null) {
            activityC10344x9fa852c8.f145308h = db5.e1.Q(activityC10344x9fa852c8, activityC10344x9fa852c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10344x9fa852c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, true, new com.p314xaae8f345.mm.p648x55baa833.ui.t3(activityC10344x9fa852c8, a0Var));
            return true;
        }
        if (u3Var.isShowing()) {
            return true;
        }
        activityC10344x9fa852c8.f145308h.show();
        return true;
    }
}
