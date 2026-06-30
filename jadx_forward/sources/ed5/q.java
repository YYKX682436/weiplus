package ed5;

/* loaded from: classes5.dex */
public final class q extends ed5.s {

    /* renamed from: a, reason: collision with root package name */
    public final long f332911a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f332912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j17, android.view.View anchorView) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorView, "anchorView");
        this.f332911a = j17;
        this.f332912b = anchorView;
    }

    @Override // ed5.s
    public android.view.View a() {
        return this.f332912b;
    }

    /* renamed from: equals */
    public boolean m127338xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed5.q)) {
            return false;
        }
        ed5.q qVar = (ed5.q) obj;
        return this.f332911a == qVar.f332911a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332912b, qVar.f332912b);
    }

    /* renamed from: hashCode */
    public int m127339x8cdac1b() {
        return (java.lang.Long.hashCode(this.f332911a) * 31) + this.f332912b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127340x9616526c() {
        return "ContentItem(createTime=" + this.f332911a + ", anchorView=" + this.f332912b + ')';
    }
}
