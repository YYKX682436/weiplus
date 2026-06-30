package i33;

/* loaded from: classes10.dex */
public final class g extends i33.c implements i33.n1 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369721f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f369722g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f369723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369721f = "MicroMsg.AlbumConfirmButtonUIC";
        this.f369723h = jz5.h.b(new i33.f(activity));
    }

    @Override // i33.n1
    public android.widget.TextView Y2() {
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f369723h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-btnConfirm>(...)");
        return textView;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78544x817a68f5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
    }

    @Override // i33.n1
    public void q6(java.lang.String btnString, yz5.a aVar, com.p314xaae8f345.mm.ui.fb style) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btnString, "btnString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        super.q6(btnString, aVar, style);
        this.f369722g = true;
    }
}
