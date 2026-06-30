package en5;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f337002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f337003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.util.ArrayList arrayList, yz5.l lVar) {
        super(1);
        this.f337002d = arrayList;
        this.f337003e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e0.u0 LazyRow = (e0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(LazyRow, "$this$LazyRow");
        java.util.ArrayList arrayList = this.f337002d;
        e0.r0.b(LazyRow, arrayList.size(), null, null, u0.j.c(-1528827042, true, new en5.n(arrayList, this.f337003e)), 6, null);
        return jz5.f0.f384359a;
    }
}
