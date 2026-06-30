package kh;

/* loaded from: classes12.dex */
public final class y2 extends kh.a3 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f389485f;

    /* renamed from: g, reason: collision with root package name */
    public final int f389486g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(java.lang.String pattern, int i17) {
        super(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
        this.f389485f = pattern;
        this.f389486g = i17;
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadIdCard, "threadIdCard");
        java.lang.String str = threadIdCard.f389332a;
        java.lang.String str2 = this.f389485f;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2 + 'J')) {
                return 0;
            }
        }
        return this.f389486g;
    }

    public /* synthetic */ y2(java.lang.String str, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i18 & 2) != 0 ? 1 : i17);
    }
}
