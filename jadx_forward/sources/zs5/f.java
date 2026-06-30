package zs5;

/* loaded from: classes15.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f556884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f556885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y f556886f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zs5.y yVar, byte[] bArr, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar2) {
        super(0);
        this.f556884d = yVar;
        this.f556885e = bArr;
        this.f556886f = yVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        at5.b bVar = this.f556884d.f557056x;
        if (bVar != null) {
            bVar.d(this.f556885e, this.f556886f);
        }
        return jz5.f0.f384359a;
    }
}
