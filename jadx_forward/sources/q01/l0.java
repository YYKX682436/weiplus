package q01;

/* loaded from: classes9.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f440843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j17) {
        super(1);
        this.f440843d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        q01.h0 it = (q01.h0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(it.f440823a);
        sb6.append(':');
        sb6.append(it.f440824b - this.f440843d);
        return sb6.toString();
    }
}
