package f93;

/* loaded from: classes3.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f341900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(f93.p5 p5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f341900d = p5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f93.j5(this.f341900d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        f93.j5 j5Var = (f93.j5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        f93.p5 p5Var = this.f341900d;
        p5Var.f341962u.append((java.lang.CharSequence) (" (" + p5Var.A.size() + ')'));
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) p5Var.f341965x).mo141623x754a37bb();
        if (textView != null) {
            textView.setText(p5Var.f341962u);
        }
        android.view.View view = (android.view.View) ((jz5.n) p5Var.f341964w).mo141623x754a37bb();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/LabelDetailDialog$initView$2$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/LabelDetailDialog$initView$2$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((f93.e5) ((jz5.n) p5Var.B).mo141623x754a37bb()).m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
