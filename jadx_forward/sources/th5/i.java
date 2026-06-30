package th5;

/* loaded from: classes12.dex */
public final class i extends of3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // of3.b, lf3.m
    public void W6() {
        super.W6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + th5.g0.class.getSimpleName() + " for interface: " + sf3.f.class.getSimpleName());
        if (!sf3.f.class.isAssignableFrom(th5.g0.class)) {
            throw new java.lang.IllegalArgumentException((th5.g0.class.getSimpleName() + " does not implement " + sf3.f.class.getSimpleName()).toString());
        }
        V6(th5.g0.class);
        pf5.a0.b(th5.g0.class, sf3.f.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + zh5.a0.class.getSimpleName() + " for interface: " + sf3.e.class.getSimpleName());
        if (!sf3.e.class.isAssignableFrom(zh5.a0.class)) {
            throw new java.lang.IllegalArgumentException((zh5.a0.class.getSimpleName() + " does not implement " + sf3.e.class.getSimpleName()).toString());
        }
        V6(zh5.a0.class);
        pf5.a0.b(zh5.a0.class, sf3.e.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + th5.p0.class.getSimpleName() + " for interface: " + vf3.a.class.getSimpleName());
        if (!vf3.a.class.isAssignableFrom(th5.p0.class)) {
            throw new java.lang.IllegalArgumentException((th5.p0.class.getSimpleName() + " does not implement " + vf3.a.class.getSimpleName()).toString());
        }
        V6(th5.p0.class);
        pf5.a0.b(th5.p0.class, vf3.a.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + th5.z0.class.getSimpleName() + " for interface: " + bg3.f.class.getSimpleName());
        if (!bg3.f.class.isAssignableFrom(th5.z0.class)) {
            throw new java.lang.IllegalArgumentException((th5.z0.class.getSimpleName() + " does not implement " + bg3.f.class.getSimpleName()).toString());
        }
        V6(th5.z0.class);
        pf5.a0.b(th5.z0.class, bg3.f.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + th5.r0.class.getSimpleName() + " for interface: " + dg3.m.class.getSimpleName());
        if (!dg3.m.class.isAssignableFrom(th5.r0.class)) {
            throw new java.lang.IllegalArgumentException((th5.r0.class.getSimpleName() + " does not implement " + dg3.m.class.getSimpleName()).toString());
        }
        V6(th5.r0.class);
        pf5.a0.b(th5.r0.class, dg3.m.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + th5.k.class.getSimpleName() + " for interface: " + zf3.a.class.getSimpleName());
        if (zf3.a.class.isAssignableFrom(th5.k.class)) {
            V6(th5.k.class);
            pf5.a0.b(th5.k.class, zf3.a.class);
        } else {
            throw new java.lang.IllegalArgumentException((th5.k.class.getSimpleName() + " does not implement " + zf3.a.class.getSimpleName()).toString());
        }
    }

    @Override // of3.b
    public of3.c Y6() {
        return null;
    }

    @Override // of3.b
    public of3.a Z6() {
        return new of3.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(th5.q0.class));
    }

    @Override // of3.b
    public of3.a b7() {
        return new of3.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(th5.f.class));
    }

    @Override // of3.b
    public of3.e c7() {
        return new of3.e(com.p314xaae8f345.mm.R.id.l3x, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(th5.u0.class));
    }
}
