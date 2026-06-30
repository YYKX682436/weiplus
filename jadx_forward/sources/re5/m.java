package re5;

/* loaded from: classes.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.s f476116d;

    public m(re5.s sVar) {
        this.f476116d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerActionBarUIC$initActionBar$1$3$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        re5.s sVar = this.f476116d;
        sVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) sVar.m80379x76847179(), 1, false);
        k0Var.f293405n = new re5.g(sVar);
        k0Var.f293414s = new re5.h(sVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerActionBarUIC$initActionBar$1$3$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
