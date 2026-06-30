package zd5;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd5.g f553211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f553212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f553213f;

    public f(zd5.g gVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        this.f553211d = gVar;
        this.f553212e = k3Var;
        this.f553213f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiAllResultAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zd5.g gVar = this.f553211d;
        yz5.q qVar = gVar.f553217g;
        if (qVar != null) {
            android.view.View itemView = this.f553212e.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            int i17 = this.f553213f;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Object obj = gVar.f553216f.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            qVar.mo147xb9724478(itemView, valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiAllResultAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
