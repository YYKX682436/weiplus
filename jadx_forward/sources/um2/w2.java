package um2;

/* loaded from: classes3.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f510538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(android.view.ViewStub viewStub, fm2.c cVar) {
        super(0);
        this.f510538d = viewStub;
        this.f510539e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View inflate = this.f510538d.inflate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a1((android.view.ViewGroup) inflate, this.f510539e);
    }
}
