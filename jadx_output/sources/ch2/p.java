package ch2;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.q f41434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ch2.q qVar) {
        super(0);
        this.f41434d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new mh2.u1(context, new ch2.o(this.f41434d), true);
    }
}
