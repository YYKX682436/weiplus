package ch5;

/* loaded from: classes3.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(2);
        this.f41620d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String event = (java.lang.String) obj;
        java.lang.String data = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        yz5.p pVar = (yz5.p) ((jz5.n) this.f41620d.K).getValue();
        if (pVar != null) {
            pVar.invoke(event, data);
        }
        return jz5.f0.f302826a;
    }
}
