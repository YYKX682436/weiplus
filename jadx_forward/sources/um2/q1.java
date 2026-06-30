package um2;

/* loaded from: classes3.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f510459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(um2.x5 x5Var, android.view.ViewStub viewStub, fm2.c cVar) {
        super(0);
        this.f510458d = x5Var;
        this.f510459e = viewStub;
        this.f510460f = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f510458d.f101138b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View inflate = this.f510459e.inflate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        fm2.c cVar = this.f510460f;
        return new fe2.q((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112, (android.view.ViewGroup) inflate, cVar, cVar);
    }
}
