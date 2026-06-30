package ur2;

/* loaded from: classes10.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f511929d;

    public g(ur2.o oVar) {
        this.f511929d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ur2.o oVar = this.f511929d;
        oVar.a();
        yz5.l lVar = oVar.f511942f;
        if (lVar != null) {
            android.text.Editable text = oVar.f511948o.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            lVar.mo146xb9724478(str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
