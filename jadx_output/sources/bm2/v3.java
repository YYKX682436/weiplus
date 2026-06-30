package bm2;

/* loaded from: classes3.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f22381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.n3 f22382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f22383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(bm2.a4 a4Var, bm2.n3 n3Var, ce2.i iVar) {
        super(0);
        this.f22381d = a4Var;
        this.f22382e = n3Var;
        this.f22383f = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tg2.h hVar = this.f22381d.f21768h;
        if (hVar != null) {
            android.view.View view = this.f22382e.f22220d;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            hVar.f((android.view.ViewGroup) view, this.f22383f);
        }
        return jz5.f0.f302826a;
    }
}
