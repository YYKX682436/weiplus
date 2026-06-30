package qe5;

/* loaded from: classes8.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f443728d;

    public u(qe5.z zVar) {
        this.f443728d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$setupDefaultOpenButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qe5.z.T6(this.f443728d);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$setupDefaultOpenButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
