package sj3;

/* loaded from: classes9.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.t f490265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 f490266e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812, sj3.t tVar) {
        this.f490266e = c16584x79838812;
        this.f490265d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f490266e.findViewById(com.p314xaae8f345.mm.R.id.k6o) != null) {
            this.f490265d.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
