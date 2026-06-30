package t82;

/* loaded from: classes12.dex */
public final class s extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public long f497940d;

    /* renamed from: e, reason: collision with root package name */
    public final int f497941e;

    /* renamed from: f, reason: collision with root package name */
    public final v82.b f497942f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f497943g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f497941e = -1;
        this.f497942f = new v82.b();
    }

    public final void O6(int i17, boolean z17) {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(t82.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        int Q6 = ((t82.d) a17).Q6();
        int i18 = 0;
        int i19 = this.f497941e;
        if (i19 == 1) {
            i18 = 2;
        } else {
            if (i19 == 0) {
                i18 = 1;
            }
        }
        v82.b bVar = this.f497942f;
        java.lang.String str = bVar.f515606g;
        int i27 = bVar.f515607h;
        if (!z17) {
            i27 = (int) (bVar.f515611l - bVar.f515610k);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        bVar.f515600a = i17;
        bVar.f515602c = i18;
        bVar.f515601b = 2;
        bVar.f515605f = 10;
        bVar.f515603d = ((int) (java.lang.System.currentTimeMillis() - this.f497940d)) / 1000;
        bVar.f515606g = str;
        bVar.f515607h = i27;
        bVar.f515609j = Q6;
        bVar.b();
        this.f497943g = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f497940d = java.lang.System.currentTimeMillis();
        java.lang.String a17 = v82.b.a();
        v82.b bVar = this.f497942f;
        bVar.f515606g = a17;
        bVar.f515610k = this.f497940d;
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(m80379x76847179(), new o04.e(r45.fq0.class, 17, true));
        bVar.e((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(m80379x76847179(), 17, r45.fq0.class));
        this.f497943g = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (this.f497943g) {
            return;
        }
        O6(1, false);
    }
}
