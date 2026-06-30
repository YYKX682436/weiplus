package ck3;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f42482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f42483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f42485g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.app.Activity activity, android.widget.ImageView imageView, android.view.View view, android.widget.TextView textView) {
        super(1);
        this.f42482d = activity;
        this.f42483e = imageView;
        this.f42484f = view;
        this.f42485g = textView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAnimHelper", "onAnimationEnd");
        it.removeAllListeners();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAnimHelper", "animEnd");
        android.view.View view = this.f42484f;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hbl);
        android.app.Activity activity = this.f42482d;
        android.content.res.Resources resources = activity.getResources();
        textView.setText(resources != null ? resources.getString(com.tencent.mm.R.string.oa9) : null);
        textView.setVisibility(0);
        textView.setAlpha(0.0f);
        textView.animate().alpha(1.0f).setDuration(600L).setStartDelay(100L).start();
        android.widget.TextView textView2 = this.f42485g;
        textView2.animate().alpha(0.0f).setDuration(600L).setStartDelay(100L).setListener(new ck3.a(new ck3.d(activity, this.f42483e, textView2, view), new ck3.e(activity, view, textView2))).start();
        return jz5.f0.f302826a;
    }
}
