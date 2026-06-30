package v01;

/* loaded from: classes11.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 f513740d;

    public i(com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6) {
        this.f513740d = c11118xe5a619d6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initSinglePublishBtn$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6.f152398q;
        com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6 = this.f513740d;
        if (c11118xe5a619d6.t0()) {
            com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6.r0(c11118xe5a619d6, tk.u.f501407h);
        } else {
            com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6.r0(c11118xe5a619d6, tk.u.f501405f);
        }
        em.e eVar = c11118xe5a619d6.f152401p;
        if (eVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar.e().getVisibility() == 0) {
            em.e eVar2 = c11118xe5a619d6.f152401p;
            if (eVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            eVar2.e().setVisibility(4);
            rm.c0 c0Var = (rm.c0) i95.n0.c(rm.c0.class);
            int i18 = rm.c0.f478892h1;
            ((t01.m) c0Var).Ai(1);
        }
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initSinglePublishBtn$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
