package zs5;

/* loaded from: classes15.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f556936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs5.y f556937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f556938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, zs5.y yVar, long j18) {
        super(0);
        this.f556936d = j17;
        this.f556937e = yVar;
        this.f556938f = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        at5.b bVar;
        zs5.y yVar = this.f556937e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = yVar.f557041i;
        long j17 = this.f556936d;
        if ((d1Var != null && j17 == d1Var.f298518d) && (bVar = yVar.f557056x) != null) {
            bVar.c(j17, this.f556938f);
        }
        return jz5.f0.f384359a;
    }
}
