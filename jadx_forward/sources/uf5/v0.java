package uf5;

/* loaded from: classes4.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d f508843d;

    public v0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d) {
        this.f508843d = abstractActivityC22347xd7e8b37d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f508843d.W6();
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
