package nh5;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nh5.c0 f418696d;

    public u(nh5.c0 c0Var) {
        this.f418696d = c0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UI: ");
        nh5.c0 c0Var = this.f418696d;
        java.lang.Object mo141623x754a37bb = ((jz5.n) c0Var.f418663d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        sb6.append((java.lang.Object) ((android.widget.TextView) mo141623x754a37bb).getText());
        sb6.append("; TYPE: ");
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) c0Var.f418664e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        sb6.append((java.lang.Object) ((android.widget.TextView) mo141623x754a37bb2).getText());
        sb6.append("; ID: ");
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) c0Var.f418665f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        sb6.append((java.lang.Object) ((android.widget.TextView) mo141623x754a37bb3).getText());
        sb6.append("; EglContext: ");
        sb6.append((java.lang.Object) c0Var.i().getText());
        sb6.append("; java: ");
        sb6.append((java.lang.Object) c0Var.j().getText());
        sb6.append("; native: ");
        sb6.append((java.lang.Object) c0Var.k().getText());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(sb6.toString());
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "已复制", 0).show();
        yj0.a.i(true, this, "com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
