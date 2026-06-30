package xr3;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xr3.i f537753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm f537754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f537755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f537756g;

    public f(xr3.i iVar, r45.mm mmVar, int i17, int i18) {
        this.f537753d = iVar;
        this.f537754e = mmVar;
        this.f537755f = i17;
        this.f537756g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.q qVar = this.f537753d.f537762e;
        if (qVar != null) {
            r45.mm data = this.f537754e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "$data");
            qVar.mo147xb9724478(data, java.lang.Integer.valueOf(this.f537755f), java.lang.Integer.valueOf(this.f537756g));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
