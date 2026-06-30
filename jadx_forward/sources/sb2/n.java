package sb2;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f486959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f486960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f486961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, in5.s0 s0Var, android.content.Intent intent) {
        super(0);
        this.f486959d = zfVar;
        this.f486960e = s0Var;
        this.f486961f = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.s0 s0Var = this.f486960e;
        java.lang.Object obj = s0Var.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
        android.content.Intent intent = this.f486961f;
        this.f486959d.S1((so2.j5) obj, s0Var, true, intent);
        return jz5.f0.f384359a;
    }
}
