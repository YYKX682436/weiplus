package ud2;

/* loaded from: classes10.dex */
public final class a implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f508109d;

    /* renamed from: e, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f508110e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f508111f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f508112g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f508113h;

    /* renamed from: i, reason: collision with root package name */
    public final ud2.o f508114i;

    public a(android.content.Context context, int i17, java.util.Map map, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2, java.lang.String anchorUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        this.f508109d = context;
        this.f508110e = c28688xe8dbe4c2;
        this.f508111f = anchorUsername;
        this.f508112g = "ShopWindowVideoView";
        android.view.View view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9_, (android.view.ViewGroup) null);
        this.f508113h = view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "view");
        ud2.o oVar = new ud2.o(view, this);
        v65.i.c(oVar.f508173g, null, new ud2.i(oVar, null), 1, null);
        this.f508114i = oVar;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(this);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        ud2.o oVar = this.f508114i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f508169c, "dispose");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = oVar.f508172f;
        c14522x8ffd8962.mo58404x360802();
        c14522x8ffd8962.mo58389x41012807();
        c14522x8ffd8962.r("completelyQuit");
        mn0.b0 b0Var = c14522x8ffd8962.player;
        if (b0Var != null) {
            ((mn0.y) b0Var).w();
        }
        p012xc85e97e9.p093xedfae76a.y d17 = oVar.d(oVar.f508168b.mo31848xfb86a31b());
        if (d17 == null || (mo273xed6858b4 = d17.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.c(oVar.f508178l);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        android.view.View view = this.f508113h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "view");
        return view;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff methodCall, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result p17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject3;
        r45.nw1 m76794xd05571302;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject4;
        r45.nw1 m76794xd05571303;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodCall, "methodCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f508112g, "on Method " + methodCall.f71610xbfc5d0e1 + " call, args = " + methodCall.f71609x86ac7956);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(methodCall.f71610xbfc5d0e1, "sendJSEvent")) {
            java.lang.Object obj = methodCall.f71609x86ac7956;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
            java.lang.Object obj2 = ((java.util.HashMap) obj).get(ya.b.f77491x8758c4e1);
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, "resume");
            ig2.r rVar = null;
            ud2.o oVar = this.f508114i;
            if (b17) {
                oVar.getClass();
                v65.i.c(oVar.f508173g, null, new ud2.n(oVar, null), 1, null);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, "stop")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = oVar.f508172f;
                if (c14522x8ffd8962.mo58387xc00617a4()) {
                    c14522x8ffd8962.mo58388x65825f6();
                    return;
                }
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, "enterLive")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd89622 = oVar.f508172f;
                boolean mo58387xc00617a4 = c14522x8ffd89622.mo58387xc00617a4();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = oVar.f508170d;
                boolean z17 = (c14994x9b99c079 == null || (feedObject4 = c14994x9b99c079.getFeedObject()) == null || (m76794xd05571303 = feedObject4.m76794xd0557130()) == null || m76794xd05571303.m75939xb282bd08(2) != 1) ? false : true;
                boolean z18 = c14522x8ffd89622.isFirstFrameRendered;
                android.view.TextureView mo46536x4ee17f0a = c14522x8ffd89622.m58380x356ded51().mo46536x4ee17f0a();
                boolean z19 = (mo46536x4ee17f0a != null ? mo46536x4ee17f0a.getSurfaceTexture() : null) != null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = oVar.f508170d;
                boolean z27 = pm0.v.z((c14994x9b99c0792 == null || (feedObject3 = c14994x9b99c0792.getFeedObject()) == null || (m76794xd05571302 = feedObject3.m76794xd0557130()) == null) ? 0 : (int) m76794xd05571302.m75942xfb822ef2(32), 256);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f508169c, "isPlaying = " + mo58387xc00617a4 + ", isFirstRendered = " + z18 + ", isSurfaceTextureAvailable = " + z19);
                if (mo58387xc00617a4 && z18 && !z27 && z17 && z19) {
                    ud2.a aVar = oVar.f508168b;
                    android.view.View mo31848xfb86a31b = aVar.mo31848xfb86a31b();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = oVar.f508170d;
                    if (c14994x9b99c0793 != null && (feedObject = c14994x9b99c0793.getFeedObject()) != null) {
                        long m76784x5db1b11 = feedObject.m76784x5db1b11();
                        ez2.a aVar2 = ez2.a.f339398q;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0794 = oVar.f508170d;
                        ig2.j jVar = new ig2.j(aVar2, m76784x5db1b11, (c14994x9b99c0794 == null || (feedObject2 = c14994x9b99c0794.getFeedObject()) == null || (m76794xd0557130 = feedObject2.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0), mo31848xfb86a31b, c14522x8ffd89622.getF212290z(), c14522x8ffd89622.getA(), c14522x8ffd89622.getB(), c14522x8ffd89622.e(), c14522x8ffd89622.m58380x356ded51().mo46536x4ee17f0a(), false, false);
                        jVar.f372921m = aVar.mo31848xfb86a31b();
                        rVar = ig2.m.f372926a.i(aVar.f508109d, jVar);
                    }
                }
                if (rVar != null) {
                    rVar.g(new ud2.e(oVar));
                }
            }
        }
    }
}
