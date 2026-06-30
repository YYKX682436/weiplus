package jf5;

/* loaded from: classes11.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spanned f380988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f380989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.text.Spanned spanned, int i17) {
        super(1);
        this.f380988d = spanned;
        this.f380989e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jf5.k it = (jf5.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.text.Spanned spanned = this.f380988d;
        int spanStart = spanned.getSpanStart(it);
        int spanEnd = spanned.getSpanEnd(it);
        int i17 = this.f380989e;
        return java.lang.Boolean.valueOf(spanStart <= i17 && i17 < spanEnd);
    }
}
