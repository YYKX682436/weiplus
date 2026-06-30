package mx0;

/* loaded from: classes5.dex */
public final class k3 extends cu0.x {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f413628p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(c16993xacc19624, context, ignoreBackgroundTouchEvent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f413628p = "MicroMsg.ShootComposingMusicPicker";
    }

    @Override // cu0.x
    public cu0.y d(yz5.l ignoreBackgroundTouchEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        return new mx0.n3(this.f303884a, ignoreBackgroundTouchEvent);
    }

    @Override // cu0.x
    public java.lang.String j() {
        return this.f413628p;
    }

    @Override // cu0.x
    public boolean m() {
        if (!super.m()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f303888e;
        return !(c16997xb0aa383a != null && c16997xb0aa383a.f237252p == 7);
    }

    public final mx0.n3 o() {
        cu0.y g17 = g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerDrawerImpl");
        return (mx0.n3) g17;
    }
}
