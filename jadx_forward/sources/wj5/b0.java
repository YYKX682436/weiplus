package wj5;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.e0 f528314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 f528315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f528316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xj5.n f528317g;

    public b0(wj5.e0 e0Var, com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3, in5.s0 s0Var, xj5.n nVar) {
        this.f528314d = e0Var;
        this.f528315e = c21455x9ab6ec3;
        this.f528316f = s0Var;
        this.f528317g = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 tvCancel = this.f528315e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tvCancel, "$tvCancel");
        wj5.e0 e0Var = this.f528314d;
        if (e0Var.q(tvCancel)) {
            ak5.g0 g0Var = (ak5.g0) i95.n0.c(ak5.g0.class);
            android.content.Context context = this.f528316f.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xj5.n nVar = this.f528317g;
            g0Var.Ai(context, 2, nVar.f536448u, null);
            nVar.f536430e = 4;
        } else {
            if (!e0Var.q(tvCancel)) {
                java.lang.String string = tvCancel.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jza);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                int h17 = i65.a.h(tvCancel.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                int color = tvCancel.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5);
                tvCancel.tText = string;
                tvCancel.tTextColor = color;
                tvCancel.tPaddingLeft = h17;
                tvCancel.tPaddingRight = h17;
                tvCancel.tBackgroundRes = com.p314xaae8f345.mm.R.C30861xcebc809e.afm;
                tvCancel.tBackgroundShow = true;
                tvCancel.tDuration = 200L;
                tvCancel.b(true);
                tvCancel.setTag(java.lang.Boolean.TRUE);
            }
            e0Var.r(tvCancel);
            java.lang.ref.WeakReference weakReference = wj5.e0.f528326h;
            if (weakReference != null && (c21455x9ab6ec3 = (com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3) weakReference.get()) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21455x9ab6ec3, tvCancel)) {
                e0Var.p(c21455x9ab6ec3, true);
            }
            wj5.e0.f528326h = new java.lang.ref.WeakReference(tvCancel);
        }
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
