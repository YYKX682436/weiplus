package uf5;

/* loaded from: classes8.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f508773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f508774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf5.h f508775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uf5.k f508776g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f508777h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f508778i;

    public i(java.util.HashSet hashSet, java.util.ArrayList arrayList, uf5.h hVar, uf5.k kVar, android.widget.ImageView imageView, android.widget.Button button) {
        this.f508773d = hashSet;
        this.f508774e = arrayList;
        this.f508775f = hVar;
        this.f508776g = kVar;
        this.f508777h = imageView;
        this.f508778i = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$selectAllListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashSet hashSet = this.f508773d;
        int size = hashSet.size();
        java.util.ArrayList arrayList2 = this.f508774e;
        if (size < arrayList2.size()) {
            hashSet.addAll(arrayList2);
        } else {
            hashSet.clear();
        }
        this.f508775f.m8151xc67946d3(0, arrayList2.size());
        android.widget.ImageView selectAllCb = this.f508777h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(selectAllCb, "$selectAllCb");
        uf5.k kVar = this.f508776g;
        uf5.k.a(kVar, selectAllCb, hashSet, arrayList2);
        android.widget.Button setLabelBtn = this.f508778i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(setLabelBtn, "$setLabelBtn");
        uf5.k.b(kVar, setLabelBtn, hashSet);
        kVar.f508788b.mo149xb9724478(arrayList2, hashSet);
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$selectAllListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
