package io;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf5.c f374942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ em.w0 f374943e;

    public i(mf5.c cVar, em.w0 w0Var) {
        this.f374942d = cVar;
        this.f374943e = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingFunctionGuideItemView$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick, viewModel: ");
        mf5.c cVar = this.f374942d;
        sb6.append(cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFunctionGuideItemView", sb6.toString());
        java.lang.String str = cVar.f407714f;
        if (str != null) {
            if (!(r26.n0.u0(str).toString().length() > 0)) {
                str = null;
            }
            if (str != null) {
                bc0.i iVar = (bc0.i) i95.n0.c(bc0.i.class);
                android.content.Context context = this.f374943e.f336416a.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ((qv.c0) iVar).bj(context, str, null);
                yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingFunctionGuideItemView$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingFunctionGuideItemView$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
