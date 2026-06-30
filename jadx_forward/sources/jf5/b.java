package jf5;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf5.c f380970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380971e;

    public b(jf5.c cVar, java.lang.String str) {
        this.f380970d = cVar;
        this.f380971e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jf5.c cVar = this.f380970d;
        android.content.Intent intent = new android.content.Intent(cVar.f380973a.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_Id", cVar.f380974b.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", cVar.f380974b.Q0());
        intent.putExtra("Retr_Msg_content", this.f380971e);
        intent.putExtra("Retr_Msg_Type", 4);
        intent.putExtra("scene_from", 17);
        yb5.d dVar = cVar.f380973a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/ChattingSelectionActionDelegate$onRetransmitSelection$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/ChattingSelectionActionDelegate$onRetransmitSelection$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
