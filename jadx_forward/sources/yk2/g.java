package yk2;

/* loaded from: classes3.dex */
public abstract class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f544324d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lk2 f544325e;

    public g(android.view.ViewGroup root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f544324d = root;
        root.setOnClickListener(this);
        root.setVisibility(c());
    }

    public void a(r45.lk2 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f544325e = response;
    }

    public final java.lang.String b() {
        java.lang.String num;
        android.content.Context context = this.f544324d.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context : null;
        return (abstractActivityC15087xee12defa == null || (num = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()).toString()) == null) ? "" : num;
    }

    public abstract int c();

    public abstract void d();

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/personal/LivePersonalItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f544324d.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            d();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/personal/LivePersonalItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
