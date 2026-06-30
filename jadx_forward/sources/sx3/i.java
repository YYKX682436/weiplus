package sx3;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx3.m f495091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f495092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sx3.m mVar, int i17) {
        super(0);
        this.f495091d = mVar;
        this.f495092e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List m82898xfb7e5820;
        t45.e0 e0Var;
        t45.f fVar;
        java.util.List m82898xfb7e58202;
        java.util.List m82898xfb7e58203;
        sx3.m mVar = this.f495091d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mVar.f495101g;
        if (c22848x6ddd90cf != null && (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) != null) {
            int i17 = this.f495092e;
            ox3.f fVar2 = (ox3.f) m82898xfb7e5820.get(i17);
            if (fVar2 != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f435481a;
                sx3.q qVar = (sx3.q) zVar.a(activity).a(sx3.q.class);
                qVar.getClass();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = qVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class)).O6();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = qVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                sx3.m mVar2 = (sx3.m) zVar.a(activity3).a(sx3.m.class);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = mVar2.f495101g;
                ox3.f fVar3 = (c22848x6ddd90cf2 == null || (m82898xfb7e58203 = c22848x6ddd90cf2.m82898xfb7e5820()) == null) ? null : (ox3.f) m82898xfb7e58203.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.ringtone.data.RingtoneConvertData");
                ox3.g gVar = (ox3.g) fVar3;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = mVar2.f495101g;
                if (c22848x6ddd90cf3 != null && (m82898xfb7e58202 = c22848x6ddd90cf3.m82898xfb7e5820()) != null) {
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf4 = mVar2.f495101g;
                if (c22848x6ddd90cf4 != null) {
                    c22848x6ddd90cf4.m8155x27702c4(i17);
                }
                t45.g gVar2 = gVar.f431282d.f497150f;
                if (gVar2 != null && (fVar = gVar2.f497093d) != null) {
                    java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(fVar.f497082d);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
                    wx3.a.a(3L, r07, 2L);
                }
                t45.f0 f0Var = gVar.f431282d.f497149e;
                if (f0Var != null && (e0Var = f0Var.f497084d) != null) {
                    wx3.a.a(3L, java.lang.String.valueOf(e0Var.f497080d), 1L);
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = qVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
                sx3.b bVar = (sx3.b) zVar.a(activity4).a(sx3.b.class);
                bVar.getClass();
                vx3.i i18 = vx3.l.E.i(((ox3.g) fVar2).f431282d);
                if (i18 != null) {
                    bVar.f495082g.remove(i18.e());
                    p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(bVar.f495083h).remove(fVar2);
                }
                p3325xe03a0797.p3326xc267989b.l.d(qVar.mo144225x95f74600(), null, null, new sx3.o(fVar2, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
