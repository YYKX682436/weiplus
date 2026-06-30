package dv2;

/* loaded from: classes10.dex */
public final class e1 extends dv2.o1 {

    /* renamed from: p, reason: collision with root package name */
    public int f325372p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f325373q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f325374r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f325374r = jz5.h.b(dv2.d1.f325364d);
    }

    @Override // dv2.o1
    public boolean Q6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209584z3).mo141623x754a37bb()).r()).intValue() == 1;
    }

    @Override // dv2.o1
    public int R6() {
        return 1;
    }

    @Override // dv2.o1
    public int S6() {
        return 20007;
    }

    @Override // dv2.o1
    public void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 preCheckInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 preCheckCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preCheckInfo, "preCheckInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preCheckCallback, "preCheckCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostSafePreCheckUIC", "[preCheckInner] needWatermarkDet:" + this.f325373q + ", watermarkFlag:" + this.f325372p);
        if (!(!this.f325373q || this.f325372p > 0)) {
            pf5.e.m158343xd39de650(this, null, null, new dv2.c1(this, preCheckInfo, preCheckCallback, null), 3, null);
            return;
        }
        int i17 = this.f325372p;
        r45.yx5 yx5Var = new r45.yx5();
        r45.dy5 dy5Var = new r45.dy5();
        dy5Var.f454392h = i17;
        yx5Var.f473013h = dy5Var;
        byte[] mo14344x5f01b1f6 = yx5Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        preCheckInfo.f183739b = mo14344x5f01b1f6;
        super.T6(preCheckInfo, preCheckCallback);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("key_post_has_show_safe_dialog", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostSafePreCheckUIC", "[onCreate] hasShowSafeDialog:" + booleanExtra);
        if (booleanExtra) {
            this.f325450d++;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        if (m158354x19263085().isFinishing() && Q6()) {
            if ((!this.f325373q || this.f325372p > 0) || !ub2.n.f507617a.a()) {
                return;
            }
            ub2.k kVar = (ub2.k) ((jz5.n) this.f325374r).mo141623x754a37bb();
            kVar.getClass();
            kVar.b(new ub2.f(kVar, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f325374r = jz5.h.b(dv2.d1.f325364d);
    }
}
