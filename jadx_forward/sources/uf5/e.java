package uf5;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.k f508747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f508748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f508749f;

    public e(uf5.k kVar, java.util.ArrayList arrayList, java.util.HashSet hashSet) {
        this.f508747d = kVar;
        this.f508748e = arrayList;
        this.f508749f = hashSet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uf5.k kVar = this.f508747d;
        android.app.Activity activity = kVar.f508787a;
        if (activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7665x7a44761a = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).mo7595x9cdc264().m7665x7a44761a("halfScreenDialog");
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = m7665x7a44761a instanceof com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 ? (com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7) m7665x7a44761a : null;
            if (c22415x6ef905d7 != null) {
                try {
                    c22415x6ef905d7.u0().a();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        kVar.f508789c.mo149xb9724478(this.f508748e, this.f508749f);
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
