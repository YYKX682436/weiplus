package rl5;

/* loaded from: classes4.dex */
public class f implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnCreateContextMenuListener f478846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl5.r f478847e;

    public f(rl5.r rVar, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f478847e = rVar;
        this.f478846d = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view long click", new java.lang.Object[0]);
        rl5.r rVar = this.f478847e;
        rVar.f478889z.clear();
        rVar.f478871f = view;
        this.f478846d.onCreateContextMenu(rVar.f478889z, view, null);
        if (view.getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[]) {
            int[] iArr = (int[]) view.getTag(com.p314xaae8f345.mm.R.id.ohu);
            if (iArr == null) {
                rVar.m();
            } else {
                rVar.n(iArr[0], iArr[1]);
            }
        } else {
            rVar.m();
        }
        view.setTag(com.p314xaae8f345.mm.R.id.qgm, java.lang.Boolean.TRUE);
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
