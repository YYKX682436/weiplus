package ck3;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f42479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f42481f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.app.Activity activity, android.view.View view, android.widget.TextView textView) {
        super(1);
        this.f42479d = activity;
        this.f42480e = view;
        this.f42481f = textView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAnimHelper", "onAnimationCancel");
        it.removeAllListeners();
        ck3.j.f42489a.a(this.f42479d, this.f42480e, this.f42481f);
        return jz5.f0.f302826a;
    }
}
