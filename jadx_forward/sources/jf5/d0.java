package jf5;

/* loaded from: classes.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf5.e0 f380978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380979e;

    public d0(jf5.e0 e0Var, java.lang.String str) {
        this.f380978d = e0Var;
        this.f380979e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jf5.e0 e0Var = this.f380978d;
        android.content.Intent intent = new android.content.Intent(e0Var.f380982a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_Id", e0Var.f380983b.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", e0Var.f380983b.Q0());
        intent.putExtra("Retr_Msg_content", this.f380979e);
        intent.putExtra("Retr_Msg_Type", 4);
        intent.putExtra("scene_from", 17);
        android.app.Activity activity = e0Var.f380982a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/PreviewSelectionActionDelegate$onRetransmitSelection$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/PreviewSelectionActionDelegate$onRetransmitSelection$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
