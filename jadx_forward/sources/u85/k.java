package u85;

/* loaded from: classes.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f507248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f507249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.os.Bundle bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        super(1);
        this.f507248d = bundle;
        this.f507249e = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.os.Bundle bundle = this.f507248d;
        bundle.putBoolean("task_result", booleanValue);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f507249e;
        if (rVar != null) {
            rVar.a(bundle);
        }
        return jz5.f0.f384359a;
    }
}
