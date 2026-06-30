package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes9.dex */
public class o4 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee f241136a;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee activityC17320x20f578ee) {
        this.f241136a = activityC17320x20f578ee;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee activityC17320x20f578ee = this.f241136a;
        if (i17 == 0) {
            c01.sc.d().a(10238, 1);
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT", android.provider.ContactsContract.Contacts.CONTENT_URI);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee.V6(activityC17320x20f578ee, intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee activityC17320x20f578ee2 = this.f241136a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC17320x20f578ee2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17320x20f578ee2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC17320x20f578ee2, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i17 != 1) {
            return;
        }
        c01.sc.d().a(10239, 1);
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent2.setType("vnd.android.cursor.item/person");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee.V6(activityC17320x20f578ee, intent2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee activityC17320x20f578ee3 = this.f241136a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC17320x20f578ee3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17320x20f578ee3.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC17320x20f578ee3, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
