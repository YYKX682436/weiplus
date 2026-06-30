package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes.dex */
public class z1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f269850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f269851b;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, android.content.Context context, android.content.Intent intent) {
        this.f269850a = context;
        this.f269851b = intent;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public void mo14305x341c20(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            android.app.Activity activity = (android.app.Activity) this.f269850a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4100);
            arrayList.add(this.f269851b);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$62", "onOp", "(Ljava/lang/Boolean;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
