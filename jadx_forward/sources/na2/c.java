package na2;

/* loaded from: classes2.dex */
public final class c extends x92.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // x92.e, x92.r
    public void R6() {
        super.R6();
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.e9f);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(na2.a.f417485d);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.e9d);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new na2.b(this));
        }
    }

    @Override // x92.e
    public v92.g X6() {
        return new v92.g(m158354x19263085());
    }

    @Override // x92.e
    public java.lang.String Y6() {
        return "";
    }
}
