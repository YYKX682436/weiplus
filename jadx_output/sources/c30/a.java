package c30;

/* loaded from: classes12.dex */
public final class a implements com.tencent.wcdb.core.Transaction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f38089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c30.e f38090b;

    public a(yz5.l lVar, c30.e eVar) {
        this.f38089a = lVar;
        this.f38090b = eVar;
    }

    @Override // com.tencent.wcdb.core.Transaction
    public final boolean insideTransaction(com.tencent.wcdb.core.Handle it) {
        kotlin.jvm.internal.o.g(it, "it");
        return ((java.lang.Boolean) this.f38089a.invoke(this.f38090b)).booleanValue();
    }
}
