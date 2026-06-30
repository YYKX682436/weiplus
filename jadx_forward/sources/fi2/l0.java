package fi2;

/* loaded from: classes10.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f344416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f344417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(fi2.x0 x0Var, zi2.w wVar) {
        super(0);
        this.f344416d = x0Var;
        this.f344417e = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fi2.x0 x0Var = this.f344416d;
        android.content.Context context = x0Var.f344459d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new lj2.k(context, x0Var.f344460e.findViewById(com.p314xaae8f345.mm.R.id.tmi), this.f344417e);
    }
}
