package cp4;

/* loaded from: classes8.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.z f302612d;

    public t(cp4.z zVar) {
        this.f302612d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.z zVar = this.f302612d;
        yz5.p m122420x49859b91 = zVar.m122420x49859b91();
        if (m122420x49859b91 != null) {
            m122420x49859b91.mo149xb9724478(java.lang.Integer.valueOf(zVar.f302629d), zVar.f302631f.f302623e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
