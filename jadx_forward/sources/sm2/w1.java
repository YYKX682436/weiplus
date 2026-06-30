package sm2;

/* loaded from: classes3.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f491296d = o4Var;
        this.f491297e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f491296d.f101127b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type android.app.Activity");
        android.view.View findViewById = activityC0065xcd7aa112.findViewById(com.p314xaae8f345.mm.R.id.evz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w5((android.view.ViewGroup) findViewById, this.f491297e);
    }
}
