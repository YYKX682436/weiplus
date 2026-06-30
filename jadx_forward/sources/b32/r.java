package b32;

/* loaded from: classes8.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f f99181d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f c13398x3b5ffc2f) {
        this.f99181d = c13398x3b5ffc2f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f99181d.f180248q.setText("");
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
