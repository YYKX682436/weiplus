package du0;

/* loaded from: classes5.dex */
public final class b1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final float f324861d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f324862e;

    /* renamed from: f, reason: collision with root package name */
    public du0.w0 f324863f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f324864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f324861d = j65.q.a(m80379x76847179()).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
        this.f324862e = jz5.h.b(new du0.y0(activity));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dvg, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s9t);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s9s);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rwt);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rws);
        textView.setText(j65.q.a(inflate.getContext()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.o89));
        textView2.setText(j65.q.a(inflate.getContext()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.o88));
        textView3.setText(j65.q.a(inflate.getContext()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.o86));
        textView4.setText(j65.q.a(inflate.getContext()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.o87));
        textView3.setOnClickListener(new du0.z0(this));
        textView4.setOnClickListener(new du0.a1(this));
        this.f324864g = inflate;
    }

    public final void O6() {
        android.view.View view = this.f324864g;
        if (view.getParent() == null) {
            return;
        }
        android.view.View view2 = this.f324864g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/common/uic/MusicRecommendedUseUIC", "disAppearView$plugin_mj_template_release", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/common/uic/MusicRecommendedUseUIC", "disAppearView$plugin_mj_template_release", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationY(0.0f);
        view.animate().translationY(this.f324861d).alpha(0.0f).setDuration(200L).withEndAction(new du0.x0(this)).start();
        du0.w0 w0Var = this.f324863f;
        if (w0Var != null) {
            ((gx0.e6) w0Var).a(false);
        }
    }
}
