package hn;

/* loaded from: classes4.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f363834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f363835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f363836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f363837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg3.i3 f363838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vg3.h3 f363839i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363840m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p944x882e457a.o oVar, int i17, int i18, vg3.i3 i3Var, vg3.h3 h3Var, android.content.Context context) {
        super(0);
        this.f363834d = h0Var;
        this.f363835e = oVar;
        this.f363836f = i17;
        this.f363837g = i18;
        this.f363838h = i3Var;
        this.f363839i = h3Var;
        this.f363840m = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ie mo11484xe92ab0a8;
        r45.du5 du5Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f363834d.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f363835e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
        r45.i8 i8Var = fVar instanceof r45.i8 ? (r45.i8) fVar : null;
        int i17 = this.f363836f;
        vg3.h3 h3Var = this.f363839i;
        if (i17 == 0 && this.f363837g == 0 && i8Var != null) {
            gd0.e eVar = (gd0.e) i95.n0.c(gd0.e.class);
            vg3.i3 i3Var = this.f363838h;
            ((fd0.e) eVar).wi(i3Var.f518251m).m(i3Var.f518251m).b();
            if (h3Var != null) {
                h3Var.a(true, "", i8Var.f458337d);
            }
        } else {
            java.lang.String str = (i8Var == null || (mo11484xe92ab0a8 = i8Var.mo11484xe92ab0a8()) == null || (du5Var = mo11484xe92ab0a8.f458493e) == null) ? null : du5Var.f454289d;
            if (str == null) {
                str = this.f363840m.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572356ay1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            if (h3Var != null) {
                h3Var.a(false, str, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
