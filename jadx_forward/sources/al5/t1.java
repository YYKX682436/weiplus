package al5;

/* loaded from: classes4.dex */
public class t1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f87561d;

    public t1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039) {
        this.f87561d = c22624x85d69039;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        boolean z17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039.S;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f87561d;
        if (z17) {
            android.content.Context context = c22624x85d69039.getContext();
            java.lang.String charSequence = c22624x85d69039.a().toString();
            c22624x85d69039.getClass();
            java.lang.String replaceAll = charSequence.replaceAll(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039.T, "*");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(replaceAll);
            sb6.append("\n[");
            for (char c17 : replaceAll.toCharArray()) {
                if (c17 != '*') {
                    sb6.append("{\\u");
                    sb6.append(java.lang.String.format("%x", java.lang.Integer.valueOf(c17)));
                    sb6.append("}");
                }
            }
            sb6.append(']');
            dp.a.m125854x26a183b(context, sb6.toString(), 1).show();
        }
        android.view.View.OnLongClickListener onLongClickListener = c22624x85d69039.N;
        if (onLongClickListener == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        boolean onLongClick = onLongClickListener.onLongClick(view);
        yj0.a.i(onLongClick, this, "com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
