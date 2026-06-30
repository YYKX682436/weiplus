package v01;

/* loaded from: classes7.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 f513731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b f513732e;

    public c(com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar) {
        this.f513731d = c11118xe5a619d6;
        this.f513732e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initProfileBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(r01.l1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r01.l1.Zi((r01.l1) c17, this.f513731d.mo7430x19263085(), this.f513732e.f299423f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2.f34622x366c91de, false, 8, null);
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initProfileBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
