package dk2;

/* loaded from: classes3.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(dk2.r4 r4Var) {
        super(0);
        this.f315279d = r4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context M = this.f315279d.M();
        android.app.Activity activity = M instanceof android.app.Activity ? (android.app.Activity) M : null;
        if (activity != null) {
            activity.finish();
        }
        return jz5.f0.f384359a;
    }
}
