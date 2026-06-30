package hn;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f363863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f363864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f363865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f363866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg3.i3 f363867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363868i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vg3.j3 f363869m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p944x882e457a.o oVar, int i17, int i18, vg3.i3 i3Var, android.content.Context context, vg3.j3 j3Var) {
        super(0);
        this.f363863d = h0Var;
        this.f363864e = oVar;
        this.f363865f = i17;
        this.f363866g = i18;
        this.f363867h = i3Var;
        this.f363868i = context;
        this.f363869m = j3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ie mo11484xe92ab0a8;
        r45.du5 du5Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f363863d.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f363864e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
        r45.da daVar = fVar instanceof r45.da ? (r45.da) fVar : null;
        int i17 = this.f363865f;
        vg3.j3 j3Var = this.f363869m;
        android.content.Context context = this.f363868i;
        if (i17 == 0 && this.f363866g == 0 && daVar != null) {
            gd0.e eVar = (gd0.e) i95.n0.c(gd0.e.class);
            vg3.i3 i3Var = this.f363867h;
            ((fd0.e) eVar).wi(i3Var.f518251m).m(i3Var.f518251m).b();
            db5.t7.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayf));
            if (j3Var != null) {
                j3Var.a(true, "", null);
            }
        } else {
            java.lang.String str = (daVar == null || (mo11484xe92ab0a8 = daVar.mo11484xe92ab0a8()) == null || (du5Var = mo11484xe92ab0a8.f458493e) == null) ? null : du5Var.f454289d;
            if (str == null) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aye);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            if (j3Var != null) {
                j3Var.a(false, str, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
