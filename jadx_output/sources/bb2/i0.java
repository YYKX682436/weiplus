package bb2;

/* loaded from: classes3.dex */
public final class i0 implements rl5.n {
    public i0(rl5.r rVar) {
    }

    @Override // rl5.n
    public final android.view.View a(android.content.Context context, android.view.MenuItem menuItem) {
        android.widget.TextView textView;
        jz5.f0 f0Var = null;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c_5, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        weImageView.setImageDrawable(menuItem.getIcon());
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q().r()).booleanValue()) {
            java.lang.CharSequence title = ((db5.h4) menuItem).getTitle();
            if (title != null) {
                if (!(title.length() > 0)) {
                    title = null;
                }
                if (title != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o3b)) != null) {
                    textView.setText(title);
                    textView.setVisibility(0);
                    f0Var = jz5.f0.f302826a;
                }
            }
            if (f0Var == null) {
                inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                inflate.setPadding(inflate.getPaddingLeft(), (int) ((inflate.getMeasuredHeight() - weImageView.getMeasuredHeight()) / 2.0f), inflate.getPaddingRight(), inflate.getPaddingBottom());
                android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.o3b);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/FinderBulletPopupManager$show$1$1", "create", "(Landroid/content/Context;Landroid/view/MenuItem;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/bullet/FinderBulletPopupManager$show$1$1", "create", "(Landroid/content/Context;Landroid/view/MenuItem;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        int i17 = ((db5.h4) menuItem).f228378v;
        if (i17 != 0) {
            weImageView.setIconColor(i17);
        }
        return inflate;
    }
}
