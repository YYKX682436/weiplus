package ck3;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f124012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f124014f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.app.Activity activity, android.view.View view, android.widget.TextView textView) {
        super(1);
        this.f124012d = activity;
        this.f124013e = view;
        this.f124014f = textView;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAnimHelper", "onAnimationCancel");
        it.removeAllListeners();
        ck3.j.f124022a.a(this.f124012d, this.f124013e, this.f124014f);
        return jz5.f0.f384359a;
    }
}
