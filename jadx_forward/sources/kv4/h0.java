package kv4;

/* loaded from: classes12.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv4.j f394235d;

    public h0(mv4.j jVar) {
        this.f394235d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachVerticalEntryViewItem$bindData$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rv4.c0 c0Var = (rv4.c0) this.f394235d;
        rv4.w wVar = c0Var.f481981b;
        wVar.f413208b.c(c0Var.a(ov4.d.f430742h));
        java.lang.Integer num = c0Var.f481984e;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = c0Var.f481985f;
        wVar.f413208b.c(new ov4.a(intValue, 0, num2 != null ? num2.intValue() : 14, null, 0, wVar.f413207a, 0, 90, null));
        c0Var.getClass();
        su4.j2 j2Var = new su4.j2();
        java.lang.Integer num3 = c0Var.f481985f;
        j2Var.f494472b = num3 != null ? num3.intValue() : 14;
        j2Var.f494476f = true;
        j2Var.A = !c0Var.f481988i;
        java.lang.Integer num4 = c0Var.f481984e;
        j2Var.f494473c = num4 != null ? num4.intValue() : 0;
        j2Var.f494475e = c0Var.f481981b.f413207a;
        j2Var.f494489s = "57:::" + ((rv4.b0) c0Var.f481980a).f481976f;
        j2Var.f494471a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        j2Var.f494478h = true;
        j2Var.f494479i = false;
        j2Var.f494491u = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachVerticalEntryViewItem$bindData$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
