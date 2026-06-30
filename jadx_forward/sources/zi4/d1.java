package zi4;

/* loaded from: classes11.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.e1 f554737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(zi4.e1 e1Var) {
        super(0);
        this.f554737d = e1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zi4.e1 e1Var = this.f554737d;
        java.lang.ref.WeakReference weakReference = e1Var.f554714e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (context == null || !(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e1Var.f554740g, "jumpSelectStatusIconPage: failed");
        } else {
            bi4.d1 d1Var = new bi4.d1();
            d1Var.f436475i = 17L;
            bi4.o1.f102608a.b((android.app.Activity) context, d1Var, 1001);
        }
        return jz5.f0.f384359a;
    }
}
