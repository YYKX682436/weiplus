package ac2;

/* loaded from: classes2.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f84573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ac2.t tVar, java.lang.String str) {
        super(1);
        this.f84573d = tVar;
        this.f84574e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ac2.t tVar = this.f84573d;
        tVar.U = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("失败 ");
        sb6.append(this.f84574e);
        sb6.append(' ');
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(' ');
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        tVar.x0(sb6.toString());
        return jz5.f0.f384359a;
    }
}
