package ac2;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f3040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ac2.t tVar, java.lang.String str) {
        super(1);
        this.f3040d = tVar;
        this.f3041e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ac2.t tVar = this.f3040d;
        tVar.U = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("失败 ");
        sb6.append(this.f3041e);
        sb6.append(' ');
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(' ');
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        tVar.x0(sb6.toString());
        return jz5.f0.f302826a;
    }
}
