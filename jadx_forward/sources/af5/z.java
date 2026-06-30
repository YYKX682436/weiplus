package af5;

/* loaded from: classes9.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.o f86198d;

    public z(z01.o oVar) {
        this.f86198d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderLiveMvvmView$onUpdateViewModel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te5.t tVar = te5.t.f500282a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        z01.o oVar = this.f86198d;
        x05.k kVar = oVar.f550667d;
        if (kVar == null) {
            kVar = new x05.k();
        }
        oVar.getClass();
        tVar.h(view, kVar, "");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderLiveMvvmView$onUpdateViewModel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
