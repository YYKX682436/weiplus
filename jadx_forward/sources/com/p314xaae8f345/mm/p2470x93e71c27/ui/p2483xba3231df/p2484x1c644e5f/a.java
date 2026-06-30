package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f272479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.c f272480e;

    public a(java.util.List list, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.c cVar) {
        this.f272479d = list;
        this.f272480e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/otherway/halfscreen/MultiShareHeaderUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = this.f272479d;
        if (list != null) {
            i95.m c17 = i95.n0.c(jt.x.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            jt.x.X5((jt.x) c17, this.f272480e.m80379x76847179(), list, 7, null, false, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/otherway/halfscreen/MultiShareHeaderUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
