package rp4;

/* loaded from: classes10.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f480149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(rp4.f0 f0Var) {
        super(2);
        this.f480149d = f0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String taskId = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        pm0.v.X(new rp4.b0(taskId, this.f480149d, intValue));
        return jz5.f0.f384359a;
    }
}
