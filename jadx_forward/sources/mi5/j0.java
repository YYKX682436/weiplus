package mi5;

/* loaded from: classes.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld5.b f408397d;

    public j0(ld5.b bVar) {
        this.f408397d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingMultiView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_Readonly", true).putExtra("Chat_BackBtnStyle", 0).putExtra("KMultiRecordPreviewViewModel", this.f408397d.m126747x696739c()).putExtra("kHalfScreenClearTop", false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        putExtra.putExtra("KHalfScreenUIC", ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).wi(4));
        ty.j0 j0Var = (ty.j0) i95.n0.c(ty.j0.class);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((sy.z) j0Var).wi(context, "preview@fackuser", putExtra);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingMultiView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
