package ze5;

/* loaded from: classes3.dex */
public final class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553441e;

    public e8(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f553440d = dVar;
        this.f553441e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.d dVar = this.f553440d;
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        boolean D = dVar.D();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553441e;
        intent.putExtra("Retr_Msg_content", c01.w9.l(D, f9Var.j(), f9Var.A0()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        java.lang.String d17 = te5.e2.d(f9Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            intent.putExtra("weAppSourceUserName", d17);
        }
        intent.putExtra("scene_from", 17);
        yb5.d dVar2 = this.f553440d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMarkdownMvvm$ChattingItemMarkdownFrom$onContextItemSelected$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar2.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMarkdownMvvm$ChattingItemMarkdownFrom$onContextItemSelected$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
