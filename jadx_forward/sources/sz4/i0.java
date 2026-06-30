package sz4;

/* loaded from: classes12.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz4.k0 f495734d;

    public i0(sz4.k0 k0Var) {
        this.f495734d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sz4.k0 k0Var = this.f495734d;
        iz4.l lVar = k0Var.F;
        if (lVar != null && lVar.f377654y.booleanValue()) {
            k0Var.F.f377655z = java.lang.Boolean.TRUE;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
