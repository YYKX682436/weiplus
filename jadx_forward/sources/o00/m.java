package o00;

/* loaded from: classes.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f423401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f423402e;

    public m(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f423401d = c0Var;
        this.f423402e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/gift/ui/EcsGiftSendThanksLogicUI$showConfirmDialog$1$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f423401d.f391645d = true;
        this.f423402e.q();
        yj0.a.h(this, "com/tencent/mm/feature/ecs/gift/ui/EcsGiftSendThanksLogicUI$showConfirmDialog$1$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
