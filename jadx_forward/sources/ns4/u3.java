package ns4;

/* loaded from: classes8.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.b4 f421196d;

    public u3(ns4.b4 b4Var) {
        this.f421196d = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ot5.g.c("WeCoinSubscribePanel", "click info button");
        ns4.b4 b4Var = this.f421196d;
        b4Var.f420991r = true;
        ns4.e4 e4Var = new ns4.e4(b4Var.f420974a, b4Var.f420975b, new ns4.t3(b4Var));
        b4Var.f420976c.r(true);
        e4Var.f421047b.s();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
