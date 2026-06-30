package ec3;

/* loaded from: classes9.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ec3.g1 g1Var) {
        super(0);
        this.f332621d = g1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ec3.g1 g1Var = this.f332621d;
        g1Var.getClass();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g1Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        android.widget.RelativeLayout relativeLayout = activityC16373x8a110f13 != null ? activityC16373x8a110f13.f227824z : null;
        float b17 = i65.a.b(g1Var.m80379x76847179(), 8);
        if (relativeLayout != null) {
            relativeLayout.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (relativeLayout != null) {
            relativeLayout.setClipToOutline(true);
        }
        return jz5.f0.f384359a;
    }
}
