package l85;

@j95.b
/* loaded from: classes10.dex */
public final class d0 extends i95.w implements l85.g0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f398677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f398678e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f398679f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Integer f398680g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f398681h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f398682i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f398683m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f398684n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f398685o;

    public final java.lang.String Ai(bw5.yc ycVar) {
        if (ycVar == null) {
            return "null";
        }
        return "{disableFinderbox=" + ycVar.f116964d + ", useReddotV2Cgi=" + ycVar.f116965e + ", enablePreloadCacheFeature=" + ycVar.f116966f + '}';
    }

    public byte[] Bi(boolean z17) {
        byte[] bArr;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        byte[] bArr2;
        if (!z17 && (bArr2 = this.f398685o) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFinderConfigToBoxSpi", "getBoxConfig from cache, config=" + Ai(Ri(bArr2)));
            return bArr2;
        }
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).getClass();
        java.util.LinkedList m75941xfb821914 = g92.b.f351302e.k2().d().m75941xfb821914(24);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            bArr = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "finderboxconfig")) {
                break;
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null && (m75934xbce7f2f = yy0Var.m75934xbce7f2f(1)) != null) {
            bArr = m75934xbce7f2f.g();
        }
        this.f398685o = bArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFinderConfigToBoxSpi", "getBoxConfig from finderConfigList, forceRefresh=" + z17 + ", config=" + Ai(Ri(bArr)));
        return bArr;
    }

    public final boolean Di(e42.c0 c0Var, yz5.a aVar, yz5.l lVar, boolean z17) {
        java.lang.Boolean bool = (java.lang.Boolean) aVar.mo152xb9724478();
        if (bool != null) {
            java.util.Objects.toString(c0Var);
            return bool.booleanValue();
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(c0Var, z17);
        lVar.mo146xb9724478(java.lang.Boolean.valueOf(fj6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFinderConfigToBoxSpi", "getExpValueWithCache: key=" + c0Var + " newValue=" + fj6);
        return fj6;
    }

    public final int Ni(e42.c0 c0Var, yz5.a aVar, yz5.l lVar, int i17) {
        java.lang.Integer num = (java.lang.Integer) aVar.mo152xb9724478();
        if (num != null) {
            java.util.Objects.toString(c0Var);
            return num.intValue();
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(c0Var, i17);
        lVar.mo146xb9724478(java.lang.Integer.valueOf(Ni));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFinderConfigToBoxSpi", "getExpValueWithCache: key=" + c0Var + " newValue=" + Ni);
        return Ni;
    }

    public final bw5.yc Ri(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new bw5.yc().mo11468x92b714fd(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BoxFinderConfigToBoxSpi", "parseFinderBoxConfig error: " + e17.getMessage());
            return null;
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFinderConfigToBoxSpi", "onAccountReleased, current useFinderCgi: " + this.f398678e + ", current enableFinderBox: " + this.f398677d + ", current disableOftenContact: " + this.f398679f + ", current isNewUI: " + this.f398680g + ", current recommentFeedCacheTime: " + this.f398681h + ", current boxKeepOnlyOneMsg: " + this.f398682i + ", current coverUseImageRatio: " + this.f398683m + ", current preloadSecondPage: " + this.f398684n);
        this.f398678e = null;
        this.f398677d = null;
        this.f398679f = null;
        this.f398680g = null;
        this.f398681h = null;
        this.f398682i = null;
        this.f398683m = null;
        this.f398684n = null;
        this.f398685o = null;
    }

    public boolean wi() {
        boolean z17 = false;
        boolean Di = Di(e42.c0.clicfg_finder_enable_finder_box_android, new l85.r(this), new l85.s(this), false);
        bw5.yc Ri = Ri(this.f398685o);
        boolean z18 = Ri != null ? Ri.f116964d : false;
        if (Di && !z18) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFinderConfigToBoxSpi", "enableFinderBox exptEnabled=" + Di + " configDisabled=" + z18 + " result=" + z17 + ", config=" + Ai(Ri));
        return z17;
    }
}
