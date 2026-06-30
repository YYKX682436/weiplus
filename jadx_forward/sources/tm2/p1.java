package tm2;

/* loaded from: classes3.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f502099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f502100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.view.ViewStub viewStub, fm2.b bVar) {
        super(0);
        this.f502099d = viewStub;
        this.f502100e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View inflate = this.f502099d.inflate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w60((android.view.ViewGroup) inflate, this.f502100e);
    }
}
