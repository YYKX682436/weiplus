package vv4;

/* loaded from: classes11.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75) {
        super(0);
        this.f522003d = activityC19216xc2476b75;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f522003d.getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "getIntent(...)");
        java.lang.Object a17 = ok5.d.a(intent, "ui_status");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.m0.f(a17, 2)) {
            return (yz5.p) a17;
        }
        return null;
    }
}
