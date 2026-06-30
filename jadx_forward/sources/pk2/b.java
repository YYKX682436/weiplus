package pk2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f437093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pk2.o9 o9Var, long j17) {
        super(0);
        this.f437092d = o9Var;
        this.f437093e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Boolean.valueOf((((mm2.c1) this.f437092d.c(mm2.c1.class)).f410399q & this.f437093e) == 0);
    }
}
