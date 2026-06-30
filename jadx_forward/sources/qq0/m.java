package qq0;

@j95.b
/* loaded from: classes7.dex */
public final class m extends i95.w implements qq0.i {

    /* renamed from: d, reason: collision with root package name */
    public final qq0.k f447432d = new qq0.k(this);

    /* renamed from: e, reason: collision with root package name */
    public final rq0.b f447433e = new rq0.b();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f447434f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f447435g = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sclStartUpCover");

    public boolean Ai(java.lang.String bizName, java.lang.String frameSetId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(wi(bizName, frameSetId));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    public boolean Bi(java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        jc3.u0 u0Var = jc3.u0.f380529a;
        return jc3.u0.f380538j.contains(vq0.b.c(bizName));
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(this.f447432d);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40968xa01141ab(this.f447432d);
    }

    public java.lang.String wi(java.lang.String bizName, java.lang.String frameSetId) {
        com.p314xaae8f345.mm.vfs.r6 s17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f447433e.a(bizName));
        sb6.append('/');
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        android.content.res.Configuration configuration = resources.getConfiguration();
        jz5.l lVar = new jz5.l("uiMode", java.lang.Integer.valueOf(resources.getConfiguration().uiMode));
        jz5.l lVar2 = new jz5.l("fontScale", java.lang.Float.valueOf(configuration.fontScale));
        jz5.l lVar3 = new jz5.l("density", java.lang.Float.valueOf(resources.getDisplayMetrics().density));
        jz5.l lVar4 = new jz5.l("windowWidth", java.lang.Integer.valueOf(resources.getDisplayMetrics().widthPixels));
        android.os.LocaleList locales = configuration.getLocales();
        boolean z17 = false;
        java.util.Set entrySet = kz5.c1.i(lVar, lVar2, lVar3, lVar4, new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, locales.get(0).getLanguage())).entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.lang.String g07 = kz5.n0.g0(entrySet, "-", null, null, 0, null, qq0.l.f447431d, 30, null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(vq0.b.c(bizName));
        sb7.append('/');
        java.lang.String b17 = vq0.a.b(frameSetId);
        java.lang.String q07 = r26.n0.q0(frameSetId, "-", frameSetId);
        sb7.append(r26.n0.s0(q07, "_", q07) + '_' + b17);
        sb7.append('/');
        sb7.append(g07);
        sb7.append(".png");
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclStartupCoverService", "coverLocalPath " + sb8);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(sb8);
        com.p314xaae8f345.mm.vfs.r6 s18 = r6Var.s();
        if (s18 != null && !s18.m()) {
            z17 = true;
        }
        if (z17 && (s17 = r6Var.s()) != null) {
            s17.J();
        }
        return sb8;
    }
}
