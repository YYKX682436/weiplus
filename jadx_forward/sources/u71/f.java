package u71;

@j95.b(m140513x1e06fd29 = {e70.z.class})
/* loaded from: classes15.dex */
public final class f extends i95.w implements e70.q {

    /* renamed from: e, reason: collision with root package name */
    public boolean f506628e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f506627d = "MicroMsg.AffBizFeatureService:" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f506629f = jz5.h.b(u71.b.f506623d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f506630g = jz5.h.b(u71.e.f506626d);

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f506627d, "onAccountInitialized " + ((java.lang.Object) jz5.u.a(gm0.j1.b().h())));
        com.p314xaae8f345.p3118xeeebfacc.ur.C26859x197a4f78.Companion companion = com.p314xaae8f345.p3118xeeebfacc.ur.C26859x197a4f78.INSTANCE;
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_ur_profile_record_count", null);
        com.p314xaae8f345.p3118xeeebfacc.ur.C26859x197a4f78.Companion.m106110x90fa28b5(companion, aj6 == null ? 0 : java.lang.Integer.parseInt(aj6), 0, 0, 0, 0, 30, null);
        companion.m106113x8f7d381a(u71.t.f506645d);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f506627d, "onAccountReleased " + ((java.lang.Object) jz5.u.a(gm0.j1.b().h())));
        com.p314xaae8f345.p3118xeeebfacc.ur.C26859x197a4f78.INSTANCE.m106111xc84c5534();
        int i17 = w71.c.f524922d;
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 m170126x21ba9bf4 = p3380x6a61f93.p3386xf51b86f1.C30595x21b1b9df.m170126x21ba9bf4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m170126x21ba9bf4, "null cannot be cast to non-null type com.tencent.mm.plugin.aff_biz.ur.AffContextManager");
        p3380x6a61f93.p3386xf51b86f1.C30595x21b1b9df.m170123x21b3a542(((w71.c) ((w71.a) m170126x21ba9bf4)).m105978x2737f10(), gm0.j1.b().h());
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f506627d, "onCreate");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("mmskia");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("zidl2");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("aff_biz");
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37513xd8c8aba1();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("ilink_network");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("ilink2");
        u71.z.f506649a.a();
        ((d83.u) i95.n0.c(d83.u.class)).Di();
        wi();
    }

    public synchronized void wi() {
        if (this.f506628e) {
            return;
        }
        this.f506628e = true;
        ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Di();
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) this.f506630g).mo141623x754a37bb()).booleanValue();
        ((u71.a) ((jz5.n) this.f506629f).mo141623x754a37bb()).getClass();
        p3380x6a61f93.p3386xf51b86f1.C30606x21baa04f.m170228x21b29f16(booleanValue);
        if (((java.lang.Boolean) ((jz5.n) this.f506630g).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.m109135x9cf0d20b().m109145x33ebcb90("wechat", 0, 0);
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.m109135x9cf0d20b().m109145x33ebcb90("wechat", 2, 0);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.m109135x9cf0d20b().m109151x3a3a82ea("AffBizFeatureService-RACE", u71.d.f506625a);
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27057x3ebe40c7.m108930x9cf0d20b().m108932x4d8a06d2();
    }
}
