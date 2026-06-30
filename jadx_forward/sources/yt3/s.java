package yt3;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f547190d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547191e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f547192f;

    public s(android.view.View view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547190d = view;
        this.f547191e = status;
        this.f547192f = "MicroMsg.EditFinishPlugin";
        view.setOnClickListener(this);
        android.widget.Button button = view instanceof android.widget.Button ? (android.widget.Button) view : null;
        if (button != null) {
            button.setTextSize(0, i65.a.f(view.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.m(view.getContext()));
        }
    }

    public final void a(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.Integer num3) {
        int intValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f547192f, str + ' ' + num3);
        android.view.View view = this.f547190d;
        if (num != null && num.intValue() != 0) {
            view.setBackgroundResource(num.intValue());
        }
        if (num3 != null && (intValue = num3.intValue()) > 0) {
            view.getLayoutParams().height = intValue;
        }
        if (num2 != null && num2.intValue() != 0 && (view instanceof android.widget.TextView)) {
            android.widget.TextView textView = (android.widget.TextView) view;
            textView.setTextColor(b3.l.m9702x7444d5ad(textView.getContext(), num2.intValue()));
        }
        if ((str == null || str.length() == 0) || !(view instanceof android.widget.TextView)) {
            return;
        }
        ((android.widget.TextView) view).setText(str);
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        android.view.View view = this.f547190d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f547192f, "on click edit finish");
        nu3.i.f421751a.b(12);
        nu3.i.f421754d.f142407i = java.lang.System.currentTimeMillis();
        ut3.f fVar = ut3.f.f512709c;
        android.content.Context context = this.f547190d.getContext();
        yt3.r rVar = new yt3.r(this);
        ut3.d dVar = fVar.f512710a;
        if (!(dVar != null ? dVar.c5(context, fVar.f512711b, rVar) : false)) {
            ju3.d0.k(this.f547191e, ju3.c0.B1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        android.view.View view = this.f547190d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
