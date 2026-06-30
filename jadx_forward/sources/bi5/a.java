package bi5;

/* loaded from: classes12.dex */
public final class a extends of3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // of3.b, lf3.m
    public void W6() {
        super.W6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + rf3.f.class.getSimpleName() + " for interface: " + sf3.f.class.getSimpleName());
        if (!sf3.f.class.isAssignableFrom(rf3.f.class)) {
            throw new java.lang.IllegalArgumentException((rf3.f.class.getSimpleName() + " does not implement " + sf3.f.class.getSimpleName()).toString());
        }
        V6(rf3.f.class);
        pf5.a0.b(rf3.f.class, sf3.f.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegoBaseUI", "Importing implementation: " + rf3.b.class.getSimpleName() + " for interface: " + sf3.e.class.getSimpleName());
        if (sf3.e.class.isAssignableFrom(rf3.b.class)) {
            V6(rf3.b.class);
            pf5.a0.b(rf3.b.class, sf3.e.class);
        } else {
            throw new java.lang.IllegalArgumentException((rf3.b.class.getSimpleName() + " does not implement " + sf3.e.class.getSimpleName()).toString());
        }
    }

    @Override // of3.b
    public of3.a b7() {
        return new of3.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(bi5.b.class));
    }
}
