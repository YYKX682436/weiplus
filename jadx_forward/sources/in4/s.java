package in4;

/* loaded from: classes8.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 f374524d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 c18765xae0673c5) {
        this.f374524d = c18765xae0673c5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f374524d.b();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
