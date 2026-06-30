package io;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.z0 f374961d;

    public s(em.z0 z0Var) {
        this.f374961d = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingQuoteView$onUpdateViewModel$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f374961d.b().performClick();
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingQuoteView$onUpdateViewModel$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
