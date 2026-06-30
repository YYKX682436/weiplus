package p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: androidx.window.core.Version$bigInteger$2 */
/* loaded from: classes13.dex */
public final class C1198xaeb41198 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: this$0 */
    final /* synthetic */ p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1197x782db4b8 f3799xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198xaeb41198(p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1197x782db4b8 c1197x782db4b8) {
        super(0);
        this.f3799xcbdd23aa = c1197x782db4b8;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.math.BigInteger mo152xb9724478() {
        return java.math.BigInteger.valueOf(this.f3799xcbdd23aa.getMajor()).shiftLeft(32).or(java.math.BigInteger.valueOf(this.f3799xcbdd23aa.getMinor())).shiftLeft(32).or(java.math.BigInteger.valueOf(this.f3799xcbdd23aa.getPatch()));
    }
}
