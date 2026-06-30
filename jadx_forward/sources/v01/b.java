package v01;

/* loaded from: classes7.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 f513730d;

    public b(com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6) {
        this.f513730d = c11118xe5a619d6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initBanBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6 = this.f513730d;
        android.content.Context mo7438x76847179 = c11118xe5a619d6.mo7438x76847179();
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = c11118xe5a619d6.f152399n;
        if (mo7438x76847179 != null && bVar != null) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            java.lang.String str = bVar.f299429o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getBanUrl(...)");
            ((ox.g) oVar).tj(mo7438x76847179, str);
        }
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initBanBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
