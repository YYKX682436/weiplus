package zs5;

/* loaded from: classes15.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f557002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f557003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f557004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f557005g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f557006h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(zs5.y yVar, long j17, java.util.List list, java.util.List list2, android.os.Bundle bundle) {
        super(0);
        this.f557002d = yVar;
        this.f557003e = j17;
        this.f557004f = list;
        this.f557005g = list2;
        this.f557006h = bundle;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        at5.b bVar = this.f557002d.f557056x;
        if (bVar != null) {
            bVar.b(this.f557003e, this.f557004f, this.f557005g, kz5.p0.f395529d, this.f557006h);
        }
        zs5.c cVar = this.f557002d.f557049q;
        if (cVar != null) {
            zs5.y yVar = this.f557002d;
            long j17 = this.f557003e;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = cVar.f556861c;
            d1Var.f298526o = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DECODE_SUCCESS;
            yVar.a(j17, d1Var);
        }
        return jz5.f0.f384359a;
    }
}
