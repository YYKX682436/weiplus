package yx0;

/* loaded from: classes5.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f548804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(yz5.l lVar, yx0.b8 b8Var) {
        super(2);
        this.f548804d = lVar;
        this.f548805e = b8Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        this.f548804d.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue && !booleanValue2) {
            this.f548805e.mo11001x57429eec();
        }
        return jz5.f0.f384359a;
    }
}
