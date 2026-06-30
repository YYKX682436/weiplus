package mi5;

/* loaded from: classes3.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.e0 f408338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l15.c f408339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(mi5.e0 e0Var, l15.c cVar) {
        super(1);
        this.f408338d = e0Var;
        this.f408339e = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a11.c holder = (a11.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        mi5.e0 e0Var = this.f408338d;
        android.view.View view = holder.f82037a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        e0Var.c(context, this.f408339e, holder.f82038b, holder.f82039c, mi5.a0.f408326d);
        mi5.e0 e0Var2 = this.f408338d;
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        e0Var2.d(context2, this.f408339e, holder.f82038b, holder.f82039c, new mi5.b0(holder));
        return jz5.f0.f384359a;
    }
}
