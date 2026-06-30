package jf5;

/* loaded from: classes11.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spanned f380997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f380998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.text.Spanned spanned, int i17) {
        super(1);
        this.f380997d = spanned;
        this.f380998e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jf5.k it = (jf5.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f380997d.getSpanEnd(it) == this.f380998e);
    }
}
