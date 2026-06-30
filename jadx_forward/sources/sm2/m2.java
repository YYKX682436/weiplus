package sm2;

/* loaded from: classes3.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f491095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(android.view.ViewStub viewStub, fm2.a aVar) {
        super(0);
        this.f491095d = viewStub;
        this.f491096e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View inflate = this.f491095d.inflate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20((android.view.ViewGroup) inflate, this.f491096e);
    }
}
