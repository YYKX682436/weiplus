package df;

/* loaded from: classes15.dex */
public final class v implements df.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f311094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.z f311095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f311096c;

    public v(p3325xe03a0797.p3326xc267989b.q qVar, df.z zVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079) {
        this.f311094a = qVar;
        this.f311095b = zVar;
        this.f311096c = enumC28568xbdfb1079;
        ((p3325xe03a0797.p3326xc267989b.r) qVar).m(new df.u(zVar, enumC28568xbdfb1079, this));
    }

    @Override // df.q
    public void a() {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f311094a;
        if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
        df.z.b(this.f311095b, this.f311096c, this);
    }
}
