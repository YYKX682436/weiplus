package of3;

/* loaded from: classes12.dex */
public abstract class b extends lf3.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // lf3.m
    public void W6() {
        of3.d d76 = d7();
        int i17 = d76.f426630a;
        f06.d dVar = d76.f426631b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<out com.tencent.mm.plugin.media.LegoUIC>");
        java.lang.Class b17 = xz5.a.b(dVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + b17.getSimpleName() + " for interface: " + lf3.j.class.getSimpleName());
        if (!lf3.j.class.isAssignableFrom(b17)) {
            throw new java.lang.IllegalArgumentException((b17.getSimpleName() + " does not implement " + lf3.j.class.getSimpleName()).toString());
        }
        U6(i17, b17);
        pf5.a0.b(b17, lf3.j.class);
        of3.e c76 = c7();
        int i18 = c76.f426632a;
        f06.d dVar2 = c76.f426633b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<out com.tencent.mm.plugin.media.LegoUIC>");
        X6(this, i18, dVar2);
        f06.d implKClz = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(lf3.d0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(implKClz, "implKClz");
        V6(xz5.a.b(implKClz));
        java.lang.Class b18 = xz5.a.b(b7().a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + b18.getSimpleName() + " for interface: " + qf3.b.class.getSimpleName());
        if (!qf3.b.class.isAssignableFrom(b18)) {
            throw new java.lang.IllegalArgumentException((b18.getSimpleName() + " does not implement " + qf3.b.class.getSimpleName()).toString());
        }
        V6(b18);
        pf5.a0.b(b18, qf3.b.class);
        java.lang.Class b19 = xz5.a.b(Z6().a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + b19.getSimpleName() + " for interface: " + mf3.m.class.getSimpleName());
        if (!mf3.m.class.isAssignableFrom(b19)) {
            throw new java.lang.IllegalArgumentException((b19.getSimpleName() + " does not implement " + mf3.m.class.getSimpleName()).toString());
        }
        V6(b19);
        pf5.a0.b(b19, mf3.m.class);
        of3.c Y6 = Y6();
        if (Y6 != null) {
            java.lang.Class b27 = xz5.a.b(Y6.f426628a.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + b27.getSimpleName() + " for interface: " + sf3.e.class.getSimpleName());
            if (!sf3.e.class.isAssignableFrom(b27)) {
                throw new java.lang.IllegalArgumentException((b27.getSimpleName() + " does not implement " + sf3.e.class.getSimpleName()).toString());
            }
            V6(b27);
            pf5.a0.b(b27, sf3.e.class);
            java.lang.Class b28 = xz5.a.b(Y6.f426629b.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + b28.getSimpleName() + " for interface: " + sf3.f.class.getSimpleName());
            if (!sf3.f.class.isAssignableFrom(b28)) {
                throw new java.lang.IllegalArgumentException((b28.getSimpleName() + " does not implement " + sf3.f.class.getSimpleName()).toString());
            }
            V6(b28);
            pf5.a0.b(b28, sf3.f.class);
        }
        of3.f a76 = a7();
        if (a76 != null) {
            java.lang.Class b29 = xz5.a.b(a76.f426634a.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + b29.getSimpleName() + " for interface: " + gg3.a.class.getSimpleName());
            if (!gg3.a.class.isAssignableFrom(b29)) {
                throw new java.lang.IllegalArgumentException((b29.getSimpleName() + " does not implement " + gg3.a.class.getSimpleName()).toString());
            }
            V6(b29);
            pf5.a0.b(b29, gg3.a.class);
            java.lang.Class b37 = xz5.a.b(a76.f426635b.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + b37.getSimpleName() + " for interface: " + gg3.b.class.getSimpleName());
            if (gg3.b.class.isAssignableFrom(b37)) {
                V6(b37);
                pf5.a0.b(b37, gg3.b.class);
            } else {
                throw new java.lang.IllegalArgumentException((b37.getSimpleName() + " does not implement " + gg3.b.class.getSimpleName()).toString());
            }
        }
    }

    public of3.c Y6() {
        return null;
    }

    public of3.a Z6() {
        return new of3.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(mf3.g.class));
    }

    public of3.f a7() {
        return null;
    }

    public abstract of3.a b7();

    public of3.e c7() {
        return new of3.e(com.p314xaae8f345.mm.R.id.l3x, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(lf3.c0.class));
    }

    public of3.d d7() {
        return new of3.d(com.p314xaae8f345.mm.R.id.t4x, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(lf3.y.class));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ejp;
    }
}
