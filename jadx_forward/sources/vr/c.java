package vr;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f520928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vr.g gVar) {
        super(0);
        this.f520928d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vr.g gVar = this.f520928d;
        gVar.f520938c.animate().translationY(gVar.f520938c.getHeight()).withEndAction(new vr.b(gVar)).setDuration(300L).start();
        return jz5.f0.f384359a;
    }
}
