package uf5;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f508753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f508754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f508755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uf5.h f508756g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uf5.k f508757h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f508758i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f508759m;

    public f(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.util.ArrayList arrayList, java.util.HashSet hashSet, uf5.h hVar, uf5.k kVar, android.widget.ImageView imageView, android.widget.Button button) {
        this.f508753d = k3Var;
        this.f508754e = arrayList;
        this.f508755f = hashSet;
        this.f508756g = hVar;
        this.f508757h = kVar;
        this.f508758i = imageView;
        this.f508759m = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$adapter$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f508753d.m8183xf806b362();
        if (m8183xf806b362 == -1) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$adapter$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.ArrayList arrayList2 = this.f508754e;
        java.lang.String str = (java.lang.String) arrayList2.get(m8183xf806b362);
        java.util.HashSet hashSet = this.f508755f;
        if (hashSet.contains(str)) {
            hashSet.remove(str);
        } else {
            hashSet.add(str);
        }
        this.f508756g.m8147xed6e4d18(m8183xf806b362);
        android.widget.ImageView selectAllCb = this.f508758i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(selectAllCb, "$selectAllCb");
        uf5.k kVar = this.f508757h;
        uf5.k.a(kVar, selectAllCb, hashSet, arrayList2);
        android.widget.Button setLabelBtn = this.f508759m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(setLabelBtn, "$setLabelBtn");
        uf5.k.b(kVar, setLabelBtn, hashSet);
        kVar.f508788b.mo149xb9724478(arrayList2, hashSet);
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$adapter$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
