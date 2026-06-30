package gf0;

@j95.b
/* loaded from: classes15.dex */
public final class r extends i95.w implements qk.f8 {

    /* renamed from: d, reason: collision with root package name */
    public gf0.i f352764d;

    /* renamed from: e, reason: collision with root package name */
    public gf0.u f352765e = gf0.u.f352777d;

    /* renamed from: f, reason: collision with root package name */
    public double f352766f;

    /* renamed from: g, reason: collision with root package name */
    public double f352767g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6 f352768h;

    /* renamed from: i, reason: collision with root package name */
    public qk.e8 f352769i;

    /* renamed from: m, reason: collision with root package name */
    public qk.b8 f352770m;

    /* renamed from: n, reason: collision with root package name */
    public qk.c8 f352771n;

    /* renamed from: o, reason: collision with root package name */
    public qk.d8 f352772o;

    public void Ai(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.a(activity, "android.permission.RECORD_AUDIO", 80, "", "")) {
            pm0.v.X(new gf0.k(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingAudioRecorderService", "no permission");
        if (activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78748xe414e1d4(new gf0.q(activity));
        }
        wi("no_sys_permission", 1);
        qk.e8 e8Var = this.f352769i;
        if (e8Var != null) {
            e8Var.a(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x014f, code lost:
    
        if ("ok".equals(r2.f162853b) == true) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.r.Bi():void");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        this.f352765e = gf0.u.f352777d;
        gf0.s.f352773a = 0;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        this.f352765e = gf0.u.f352777d;
        gf0.s.f352773a = 0;
    }

    public final void wi(java.lang.String subKey, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subKey, "subKey");
        p3380x6a61f93.p3381xf512d0a5.C30482x21b84f06.m169260x21b3857a(7, "VoiceRecord", 6, "", subKey, i17);
    }
}
