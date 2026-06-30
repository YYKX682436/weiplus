package r26;

/* loaded from: classes10.dex */
public final class e implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f450407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f450408b;

    /* renamed from: c, reason: collision with root package name */
    public final int f450409c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f450410d;

    public e(java.lang.CharSequence input, int i17, int i18, yz5.p getNextMatch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getNextMatch, "getNextMatch");
        this.f450407a = input;
        this.f450408b = i17;
        this.f450409c = i18;
        this.f450410d = getNextMatch;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new r26.d(this);
    }
}
