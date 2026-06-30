package hl5;

/* loaded from: classes15.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl5.f f363654d;

    public d(hl5.f fVar) {
        this.f363654d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cedit/menu/OperateWindow$MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null || (view.getTag() instanceof nl5.z)) {
            nl5.z zVar = (nl5.z) view.getTag();
            hl5.f fVar = this.f363654d;
            int m81687x6f2c472c = fVar.f363658f.f363667i.m81687x6f2c472c();
            int m81686xffd93625 = fVar.f363658f.f363667i.m81686xffd93625();
            fVar.f363657e.a(view, zVar, fVar.f363658f.f363667i.mo81602xfb85ada3().subSequence(java.lang.Math.min(m81687x6f2c472c, m81686xffd93625), java.lang.Math.max(m81687x6f2c472c, m81686xffd93625)).toString());
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/cedit/menu/OperateWindow$MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
