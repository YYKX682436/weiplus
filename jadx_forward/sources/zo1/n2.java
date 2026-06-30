package zo1;

/* loaded from: classes5.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f556232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b f556233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556234g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f556235h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wo1.i1 f556236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b activityC12870x21c4817b, java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, wo1.i1 i1Var) {
        super(0);
        this.f556231d = u3Var;
        this.f556232e = i17;
        this.f556233f = activityC12870x21c4817b;
        this.f556234g = str;
        this.f556235h = gVar;
        this.f556236i = i1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f556231d.hide();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Di("packagesUpdated", "");
        if (this.f556232e == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b activityC12870x21c4817b = this.f556233f;
            android.widget.TextView textView = activityC12870x21c4817b.f174373f;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameTv");
                throw null;
            }
            textView.setText(this.f556234g);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f556235h;
            if (gVar == null && (gVar = activityC12870x21c4817b.f174372e) == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                throw null;
            }
            activityC12870x21c4817b.f174372e = gVar;
            this.f556236i.hide();
        }
        return jz5.f0.f384359a;
    }
}
