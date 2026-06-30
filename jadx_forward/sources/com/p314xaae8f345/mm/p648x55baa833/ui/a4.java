package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class a4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x3 f145561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.c4 f145562e;

    public a4(com.p314xaae8f345.mm.p648x55baa833.ui.c4 c4Var, com.p314xaae8f345.mm.p648x55baa833.ui.x3 x3Var) {
        this.f145562e = c4Var;
        this.f145561d = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.w3 w3Var = this.f145562e.f145605h;
        if (w3Var != null) {
            int m8183xf806b362 = this.f145561d.m8183xf806b362();
            com.p314xaae8f345.mm.p648x55baa833.ui.n3 n3Var = (com.p314xaae8f345.mm.p648x55baa833.ui.n3) w3Var;
            n3Var.getClass();
            java.lang.Object tag = view.getTag();
            if (tag instanceof com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) {
                boolean booleanValue = ((java.lang.Boolean) ((android.view.ViewGroup) view.getParent()).getTag()).booleanValue();
                com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a = (com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) tag;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "iRecentUseToolsCallback click stick:%s", java.lang.Boolean.valueOf(booleanValue));
                com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10344x9fa852c8 activityC10344x9fa852c8 = n3Var.f145920a;
                if (booleanValue) {
                    c10329x6f52684a.f145217f = c01.id.c();
                    activityC10344x9fa852c8.f145313p.f479137t.remove(c10329x6f52684a);
                    activityC10344x9fa852c8.f145314q.addFirst(c10329x6f52684a);
                    activityC10344x9fa852c8.f145309i.m8155x27702c4(m8183xf806b362);
                    activityC10344x9fa852c8.f145312o.m8149x8b456734(0);
                } else if (activityC10344x9fa852c8.f145313p.v0()) {
                    db5.e1.E(activityC10344x9fa852c8, activityC10344x9fa852c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572362az1), "", activityC10344x9fa852c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, null);
                } else {
                    activityC10344x9fa852c8.f145313p.f479137t.addLast(c10329x6f52684a);
                    activityC10344x9fa852c8.f145314q.remove(c10329x6f52684a);
                    activityC10344x9fa852c8.f145309i.m8149x8b456734(activityC10344x9fa852c8.f145313p.f479137t.size() - 1);
                    activityC10344x9fa852c8.f145312o.m8155x27702c4(m8183xf806b362);
                }
                if (booleanValue && !activityC10344x9fa852c8.f145313p.v0()) {
                    com.p314xaae8f345.mm.p648x55baa833.ui.c4 c4Var = activityC10344x9fa852c8.f145312o;
                    c4Var.f145603f = true;
                    c4Var.m8146xced61ae5();
                } else if (!booleanValue && activityC10344x9fa852c8.f145313p.v0()) {
                    com.p314xaae8f345.mm.p648x55baa833.ui.c4 c4Var2 = activityC10344x9fa852c8.f145312o;
                    c4Var2.f145603f = false;
                    c4Var2.m8146xced61ae5();
                }
                activityC10344x9fa852c8.f145316s = true;
                activityC10344x9fa852c8.U6();
                activityC10344x9fa852c8.V6();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "iRecentUseToolsCallback click");
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
