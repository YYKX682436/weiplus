package vw3;

/* loaded from: classes11.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI f522454e;

    public d0(java.lang.String str, com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI repairerChatroomDebugUI) {
        this.f522453d = str;
        this.f522454e = repairerChatroomDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p75.n0 n0Var = dm.x1.N;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("spamStatus", (java.lang.Integer) 1);
        p75.m0 j17 = dm.x1.Q.j(this.f522453d);
        p75.h1 j18 = dm.x1.N.j(contentValues);
        j18.b(j17);
        int f17 = j18.a().f(dm.x1.Y1.Q4());
        com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI repairerChatroomDebugUI = this.f522454e;
        if (f17 > 0) {
            android.widget.Toast.makeText((android.content.Context) repairerChatroomDebugUI, (java.lang.CharSequence) "本地封禁成功", 0).show();
        } else {
            android.widget.Toast.makeText((android.content.Context) repairerChatroomDebugUI, (java.lang.CharSequence) "本地封禁失败", 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
