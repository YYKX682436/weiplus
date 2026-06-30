package k13;

/* loaded from: classes10.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(k13.l1 l1Var) {
        super(0);
        this.f384764d = l1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return ((android.os.PowerManager) ((jz5.n) this.f384764d.f384747h).mo141623x754a37bb()).newWakeLock(26, "wx:MsgWindowLock");
    }
}
