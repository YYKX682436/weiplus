package b33;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b33.i f17666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b33.i iVar) {
        super(0);
        this.f17666d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f17666d.getIntent().getIntExtra("MediaTabInitTabSelectIndex", 0));
    }
}
