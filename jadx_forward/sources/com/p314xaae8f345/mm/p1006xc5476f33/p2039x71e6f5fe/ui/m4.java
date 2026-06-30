package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes.dex */
public class m4 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee f241126b;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee activityC17320x20f578ee, java.lang.String str) {
        this.f241126b = activityC17320x20f578ee;
        this.f241125a = str;
    }

    @Override // db5.c1
    public void e(int i17) {
        java.lang.String str = this.f241125a;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("composeType", 4);
            intent.putExtra("toList", new java.lang.String[]{str + " " + str});
            j45.l.j(this.f241126b, "qqmail", ".ui.ComposeUI", intent, null);
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{str});
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee activityC17320x20f578ee = this.f241126b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17320x20f578ee, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$2", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17320x20f578ee.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17320x20f578ee, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$2", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
