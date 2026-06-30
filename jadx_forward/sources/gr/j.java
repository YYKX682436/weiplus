package gr;

/* loaded from: classes15.dex */
public final class j extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f356198b;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f356200d;

    /* renamed from: c, reason: collision with root package name */
    public final f21.e f356199c = new f21.e();

    /* renamed from: e, reason: collision with root package name */
    public final f21.h0 f356201e = new f21.h0();

    public j(boolean z17) {
        this.f356198b = z17;
    }

    @Override // gr.b
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        java.lang.String d17 = d(parser, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        f21.e eVar = this.f356199c;
        eVar.f340405e = d17;
        eVar.f340407g = c(parser, "reportType");
        eVar.f340410m = d(parser, "langs");
        java.lang.String d18 = d(parser, "BeginDate");
        java.lang.String d19 = d(parser, "EndDate");
        java.lang.String d27 = d(parser, "BeginTimeInterval");
        java.lang.String d28 = d(parser, "EndTimeInterval");
        super.a(parser);
        int i17 = 0;
        eVar.f340408h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a0(d18, 0);
        eVar.f340409i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a0(d19, 0);
        if (eVar.f340408h == 0 && eVar.f340409i == 0) {
            return;
        }
        int i18 = 86400;
        if (eVar.f340411n >= 3) {
            int D1 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d27) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(d27, 0) : 0;
            int D12 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d28) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(d28, 0) : 86400;
            int max = java.lang.Math.max(0, java.lang.Math.min(D1, 86400));
            i18 = java.lang.Math.max(0, java.lang.Math.min(D12, 86400));
            i17 = max;
        }
        eVar.f340408h += i17;
        eVar.f340409i += i18;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001e. Please report as an issue. */
    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        f21.h0 h0Var = this.f356201e;
        f21.e eVar = this.f356199c;
        switch (hashCode) {
            case -2105342875:
                if (tag.equals("MagicEmojiEffectId")) {
                    eVar.f340418u = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1565818326:
                if (tag.equals("MiniApp")) {
                    gr.l lVar = new gr.l();
                    lVar.a(parser);
                    eVar.f340419v = lVar.f356203b;
                    return;
                }
                g(parser);
                return;
            case -1289878496:
                if (tag.equals("LuckyBag")) {
                    gr.b0 b0Var = new gr.b0();
                    b0Var.a(parser);
                    f21.d0 d0Var = b0Var.f356195b;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f340385d)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1263, 0);
                    } else {
                        r4 = true;
                    }
                    if (r4) {
                        eVar.f340412o = d0Var;
                        return;
                    }
                    return;
                }
                g(parser);
                return;
            case -730941173:
                if (tag.equals("AnimType")) {
                    h0Var.f340441f = c(parser, "viewcount");
                    h0Var.f340442g = c(parser, "minSize");
                    h0Var.f340443h = c(parser, "maxSize");
                    h0Var.f340440e = e(parser);
                    return;
                }
                g(parser);
                return;
            case -671077817:
                if (tag.equals("FileName")) {
                    eVar.f340413p.add(h0Var);
                    h0Var.f340439d = f(parser);
                    return;
                }
                g(parser);
                return;
            case -585668469:
                if (tag.equals("EffectType")) {
                    eVar.f340417t = e(parser);
                    return;
                }
                g(parser);
                return;
            case -177232682:
                if (tag.equals("RedEnvelopeCover")) {
                    gr.m mVar = new gr.m();
                    mVar.a(parser);
                    eVar.f340416s = mVar.f356204b;
                    return;
                }
                g(parser);
                return;
            case 2211858:
                if (tag.equals("Game")) {
                    gr.i iVar = new gr.i();
                    iVar.a(parser);
                    eVar.f340415r = iVar.f356197b;
                    return;
                }
                g(parser);
                return;
            case 2622298:
                if (tag.equals("Type")) {
                    eVar.f340414q = e(parser);
                    return;
                }
                g(parser);
                return;
            case 524213478:
                if (tag.equals("TopAnim")) {
                    f21.l lVar2 = new f21.l();
                    lVar2.f340464d = c(parser, "width");
                    lVar2.f340465e = c(parser, "height");
                    java.lang.String d17 = d(parser, "blockDuration");
                    lVar2.f340466f = d17.length() == 0 ? 0.0d : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1(d17);
                    lVar2.f340467g = f(parser);
                    eVar.f340420w = lVar2;
                    return;
                }
                g(parser);
                return;
            case 849291753:
                if (tag.equals("KeyWord")) {
                    f21.f fVar = new f21.f();
                    fVar.f340425e = d(parser, "lang");
                    java.lang.String f17 = f(parser);
                    fVar.f340424d = f17;
                    if (f17.length() > 0) {
                        eVar.f340404d.add(fVar);
                        return;
                    }
                    return;
                }
                g(parser);
                return;
            case 947396446:
                if (tag.equals("ClientEggVersion")) {
                    if (this.f356198b) {
                        eVar.f340411n = e(parser);
                        return;
                    } else {
                        g(parser);
                        return;
                    }
                }
                g(parser);
                return;
            case 1552259586:
                if (tag.equals("SupportedCliVers")) {
                    gr.n nVar = new gr.n();
                    nVar.a(parser);
                    this.f356200d = nVar.f356205b;
                    return;
                }
                g(parser);
                return;
            case 2129029771:
                if (tag.equals("NewAnimType")) {
                    f21.h0 h0Var2 = new f21.h0();
                    h0Var2.f340441f = c(parser, "viewcount");
                    h0Var2.f340442g = c(parser, "minSize");
                    h0Var2.f340443h = c(parser, "maxSize");
                    h0Var2.f340439d = d(parser, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
                    h0Var2.f340440e = e(parser);
                    eVar.f340413p.add(h0Var2);
                    return;
                }
                g(parser);
                return;
            default:
                g(parser);
                return;
        }
    }
}
