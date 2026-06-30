package nl5;

/* loaded from: classes15.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.o f419860d;

    public m(nl5.o oVar) {
        this.f419860d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/edittext/MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null || (view.getTag() instanceof nl5.z)) {
            nl5.z zVar = (nl5.z) view.getTag();
            nl5.o oVar = this.f419860d;
            oVar.f419866f.a(view, zVar, !android.text.TextUtils.isEmpty(oVar.f419865e.f419780c) ? oVar.f419865e.f419780c : "");
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/edittext/MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
