package cg2;

/* loaded from: classes3.dex */
public final class f implements rl5.n {
    public f(rl5.r rVar) {
    }

    @Override // rl5.n
    public final android.view.View a(android.content.Context context, android.view.MenuItem menuItem) {
        android.widget.TextView textView;
        jz5.f0 f0Var = null;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.e__, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        c22699x3dcdb352.setImageDrawable(menuItem.getIcon());
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q().r()).booleanValue()) {
            java.lang.CharSequence title = ((db5.h4) menuItem).getTitle();
            if (title != null) {
                if (!(title.length() > 0)) {
                    title = null;
                }
                if (title != null && (textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o3b)) != null) {
                    textView.setText(title);
                    textView.setVisibility(0);
                    f0Var = jz5.f0.f384359a;
                }
            }
            if (f0Var == null) {
                inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                inflate.setPadding(inflate.getPaddingLeft(), (int) ((inflate.getMeasuredHeight() - c22699x3dcdb352.getMeasuredHeight()) / 2.0f), inflate.getPaddingRight(), inflate.getPaddingBottom());
                android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.o3b);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/danmaku/FinderLiveFeedDanmakuPopupHelper$show$1$1", "create", "(Landroid/content/Context;Landroid/view/MenuItem;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/convert/danmaku/FinderLiveFeedDanmakuPopupHelper$show$1$1", "create", "(Landroid/content/Context;Landroid/view/MenuItem;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        int i17 = ((db5.h4) menuItem).f309911v;
        if (i17 != 0) {
            c22699x3dcdb352.m82040x7541828(i17);
        }
        return inflate;
    }
}
