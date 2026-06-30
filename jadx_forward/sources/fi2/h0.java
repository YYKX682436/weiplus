package fi2;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f344371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f344372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(fi2.x0 x0Var, zi2.w wVar) {
        super(0);
        this.f344371d = x0Var;
        this.f344372e = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f344371d.f344459d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        zi2.w wVar = this.f344372e;
        return new dj2.c(context, wVar, wVar);
    }
}
