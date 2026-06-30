package nl5;

/* loaded from: classes15.dex */
public final class g0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.s0 f419804d;

    public g0(nl5.s0 s0Var) {
        this.f419804d = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        nl5.s0 s0Var = this.f419804d;
        android.view.View.OnLongClickListener onLongClickListener = s0Var.f419897o;
        boolean onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : false;
        if (s0Var.f419908z) {
            com.p314xaae8f345.mm.ui.yk.c("SelectableEditTextHelper", "onLongClick:" + s0Var.C, new java.lang.Object[0]);
            s0Var.getClass();
            java.lang.String BRAND = android.os.Build.BRAND;
            if (!android.text.TextUtils.isEmpty(BRAND)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BRAND, "BRAND");
                java.lang.String lowerCase = BRAND.toLowerCase();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.b("vivo", lowerCase);
            }
            if (s0Var.C) {
                yj0.a.i(false, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            if (onLongClick) {
                yj0.a.i(true, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            s0Var.D = true;
            s0Var.q(s0Var.E, s0Var.F, true);
            onLongClick = true;
        }
        yj0.a.i(onLongClick, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
