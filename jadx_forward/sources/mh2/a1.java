package mh2;

/* loaded from: classes10.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f407828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jh2.c f407830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(mh2.f1 f1Var, int i17, jh2.c cVar) {
        super(1);
        this.f407828d = f1Var;
        this.f407829e = i17;
        this.f407830f = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        if (list != null) {
            pm0.v.X(new mh2.z0(this.f407828d, list, this.f407829e, this.f407830f));
        }
        return jz5.f0.f384359a;
    }
}
