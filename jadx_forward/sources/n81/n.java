package n81;

/* loaded from: classes7.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f417159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j17) {
        super(1);
        this.f417159d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n81.e it = (n81.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int e17 = c01.id.e();
        long j17 = this.f417159d;
        if (j17 > 0) {
            long j18 = e17;
            long j19 = it.f417148b;
            if (j18 > j19) {
                return java.lang.Boolean.valueOf(j18 - j19 > j17);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
