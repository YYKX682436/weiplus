package um2;

/* loaded from: classes3.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f510546d = x5Var;
        this.f510547e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f510546d.f101138b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        fm2.c cVar = this.f510547e;
        android.view.View findViewById = cVar.findViewById(com.p314xaae8f345.mm.R.id.evv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112, (android.view.ViewGroup) findViewById, cVar);
    }
}
