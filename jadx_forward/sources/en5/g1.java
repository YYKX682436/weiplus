package en5;

/* loaded from: classes5.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.util.ArrayList arrayList, yz5.l lVar) {
        super(1);
        this.f336950d = arrayList;
        this.f336951e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e0.u0 LazyColumn = (e0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(LazyColumn, "$this$LazyColumn");
        java.util.ArrayList arrayList = this.f336950d;
        e0.r0.b(LazyColumn, arrayList.size(), null, null, u0.j.c(1666582332, true, new en5.f1(arrayList, this.f336951e)), 6, null);
        return jz5.f0.f384359a;
    }
}
