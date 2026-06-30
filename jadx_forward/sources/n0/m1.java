package n0;

/* loaded from: classes14.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.i3[] f415148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f415149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f415150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n0.i3[] i3VarArr, yz5.p pVar, int i17) {
        super(2);
        this.f415148d = i3VarArr;
        this.f415149e = pVar;
        this.f415150f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        n0.i3[] i3VarArr = this.f415148d;
        n0.i3[] i3VarArr2 = (n0.i3[]) java.util.Arrays.copyOf(i3VarArr, i3VarArr.length);
        int i17 = this.f415150f | 1;
        n0.n1.a(i3VarArr2, this.f415149e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
