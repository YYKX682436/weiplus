package rn4;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn4.c f479494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn4.d f479496f;

    public a(rn4.d dVar, rn4.c cVar, int i17) {
        this.f479496f = dVar;
        this.f479494d = cVar;
        this.f479495e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/adapter/LanguageChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn4.d dVar = this.f479496f;
        android.widget.ImageView imageView = dVar.f479503f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rn4.c cVar = this.f479494d;
        cVar.f479500e.setVisibility(0);
        dVar.f479503f = cVar.f479500e;
        dVar.f479502e = this.f479495e;
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/adapter/LanguageChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
