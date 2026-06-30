package ck3;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ck3.b f42464d = new ck3.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAnimHelper", "actionBarTitle doFadeInAnim onAnimationEnd");
        it.removeAllListeners();
        return jz5.f0.f302826a;
    }
}
