package wj2;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f528238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f528239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(wj2.w wVar, android.view.MotionEvent motionEvent) {
        super(0);
        this.f528238d = wVar;
        this.f528239e = motionEvent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wj2.w wVar = this.f528238d;
        wVar.E++;
        wVar.N(this.f528239e);
        return jz5.f0.f384359a;
    }
}
