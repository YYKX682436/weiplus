package qe;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.f f443459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qe.f fVar) {
        super(0);
        this.f443459d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qe.f fVar = this.f443459d;
        qe.f.a(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CronetHttpNativeInstallHelper", "httpBinding lazy init, loading native library");
        sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        return new qe.c(fVar);
    }
}
