package id2;

/* loaded from: classes.dex */
public final class i2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f372142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f372143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f372145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372146h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(v65.n nVar, com.p314xaae8f345.mm.p944x882e457a.f fVar, android.content.Context context, boolean z17, id2.u3 u3Var) {
        super(0);
        this.f372142d = nVar;
        this.f372143e = fVar;
        this.f372144f = context;
        this.f372145g = z17;
        this.f372146h = u3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ix0 ix0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f372143e;
        this.f372142d.a(java.lang.Boolean.valueOf(xg2.g.e(fVar)));
        if (xg2.g.e(fVar)) {
            java.util.Iterator it = ((r45.m02) fVar.f152151d).m75941xfb821914(1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    ix0Var = null;
                    break;
                }
                ix0Var = (r45.ix0) it.next();
                if (ix0Var.m75939xb282bd08(0) == 15) {
                    break;
                }
            }
            if (ix0Var != null) {
                int m75939xb282bd08 = ix0Var.m75939xb282bd08(1);
                android.content.Context context = this.f372144f;
                if (m75939xb282bd08 == 0) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ix0Var.m75934xbce7f2f(3);
                    if (m75934xbce7f2f != null) {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = m75934xbce7f2f.f273689a.length > 0 ? m75934xbce7f2f : null;
                        if (gVar != null) {
                            r45.z02 z02Var = new r45.z02();
                            z02Var.mo11468x92b714fd(gVar.g());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "#executeUpload finally done. new remain: " + z02Var.m75939xb282bd08(0));
                            if (this.f372145g) {
                                java.lang.String string = this.f372146h.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573300e65);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                                e4Var.f293309c = string;
                                e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
                                e4Var.c();
                            }
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "#executeUpload fail: " + ix0Var.m75939xb282bd08(1));
                    int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var2.f293309c = ix0Var.m75945x2fec8307(2);
                    e4Var2.c();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
