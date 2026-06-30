package androidx.paging.compose;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f11724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f11725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.paging.compose.e eVar, yz5.p pVar) {
        super(1);
        this.f11724d = eVar;
        this.f11725e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.Object obj2 = ((g4.u0) ((n0.q4) this.f11724d.f11717b).getValue()).get(intValue);
        return obj2 == null ? new androidx.paging.compose.PagingPlaceholderKey(intValue) : this.f11725e.invoke(java.lang.Integer.valueOf(intValue), obj2);
    }
}
