package r35;

/* loaded from: classes5.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.i3 f450607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f450609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450610g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f450611h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.my6 f450612i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r35.a f450613m;

    public e(r35.a aVar, db5.i3 i3Var, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, r45.my6 my6Var) {
        this.f450613m = aVar;
        this.f450607d = i3Var;
        this.f450608e = i17;
        this.f450609f = i18;
        this.f450610g = str;
        this.f450611h = m1Var;
        this.f450612i = my6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/AddContact$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f450607d.B();
        this.f450613m.j(this.f450608e, this.f450609f, this.f450610g, this.f450611h, this.f450612i.f462466g);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/AddContact$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
