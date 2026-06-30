package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes13.dex */
public final class Version$bigInteger$2 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ androidx.window.core.Version this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Version$bigInteger$2(androidx.window.core.Version version) {
        super(0);
        this.this$0 = version;
    }

    @Override // yz5.a
    public final java.math.BigInteger invoke() {
        return java.math.BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(java.math.BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(java.math.BigInteger.valueOf(this.this$0.getPatch()));
    }
}
