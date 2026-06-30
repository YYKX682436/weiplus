package ck3;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f124015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f124016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f124018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.app.Activity activity, android.widget.ImageView imageView, android.view.View view, android.widget.TextView textView) {
        super(1);
        this.f124015d = activity;
        this.f124016e = imageView;
        this.f124017f = view;
        this.f124018g = textView;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAnimHelper", "onAnimationEnd");
        it.removeAllListeners();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAnimHelper", "animEnd");
        android.view.View view = this.f124017f;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hbl);
        android.app.Activity activity = this.f124015d;
        android.content.res.Resources resources = activity.getResources();
        textView.setText(resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oa9) : null);
        textView.setVisibility(0);
        textView.setAlpha(0.0f);
        textView.animate().alpha(1.0f).setDuration(600L).setStartDelay(100L).start();
        android.widget.TextView textView2 = this.f124018g;
        textView2.animate().alpha(0.0f).setDuration(600L).setStartDelay(100L).setListener(new ck3.a(new ck3.d(activity, this.f124016e, textView2, view), new ck3.e(activity, view, textView2))).start();
        return jz5.f0.f384359a;
    }
}
