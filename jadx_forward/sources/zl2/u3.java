package zl2;

/* loaded from: classes3.dex */
public final class u3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f555520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(boolean z17) {
        super(1);
        this.f555520d = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        zl2.r4 r4Var = zl2.r4.f555483a;
        it.post(new zl2.f4("FinderLiveUtil", it, this.f555520d));
        return jz5.f0.f384359a;
    }
}
