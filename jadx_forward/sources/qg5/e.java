package qg5;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.p f444486d;

    public e(qg5.p pVar) {
        this.f444486d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/ChatRecordsAnalyzeStagingDialog$createBodyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "User clicked detail button");
        qg5.p pVar = this.f444486d;
        jt.x xVar = (jt.x) ((jz5.n) pVar.f444657f).mo141623x754a37bb();
        android.content.Context context = pVar.f444652a;
        ((jb0.g) xVar).Di(context, pVar.f444653b, 9, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pd_), true);
        qg5.p.a(pVar, 3, pVar.b());
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/ChatRecordsAnalyzeStagingDialog$createBodyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
