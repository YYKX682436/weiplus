package bw4;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 f106470d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3) {
        this.f106470d = c19227x8f71d8b3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/widget/SOSEditTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3 = this.f106470d;
        if (c19227x8f71d8b3.m80966xdb574fcd() != null) {
            c19227x8f71d8b3.m80966xdb574fcd().requestFocus();
            c19227x8f71d8b3.s();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
