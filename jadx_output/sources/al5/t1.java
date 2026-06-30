package al5;

/* loaded from: classes4.dex */
public class t1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f6028d;

    public t1(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView) {
        this.f6028d = mMNeat7extView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        boolean z17 = com.tencent.mm.ui.widget.MMNeat7extView.S;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f6028d;
        if (z17) {
            android.content.Context context = mMNeat7extView.getContext();
            java.lang.String charSequence = mMNeat7extView.a().toString();
            mMNeat7extView.getClass();
            java.lang.String replaceAll = charSequence.replaceAll(com.tencent.mm.ui.widget.MMNeat7extView.T, "*");
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
            dp.a.makeText(context, sb6.toString(), 1).show();
        }
        android.view.View.OnLongClickListener onLongClickListener = mMNeat7extView.N;
        if (onLongClickListener == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        boolean onLongClick = onLongClickListener.onLongClick(view);
        yj0.a.i(onLongClick, this, "com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
