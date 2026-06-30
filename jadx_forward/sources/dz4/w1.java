package dz4;

/* loaded from: classes.dex */
public final class w1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f326974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f326975b;

    public w1(android.app.Activity activity, android.content.Intent intent) {
        this.f326974a = activity;
        this.f326975b = intent;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            android.app.Activity activity = this.f326974a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4100);
            arrayList.add(this.f326975b);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/wenote/flutter/WeNoteFlutterFileHelper$handleJumpFilePicker$needRequestPermission$1", "onOp", "(Ljava/lang/Boolean;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
