package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class p0 extends oz5.a implements oz5.f {

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.o0 f392096d = new p3325xe03a0797.p3326xc267989b.o0(null);

    public p0() {
        super(oz5.e.f431860d);
    }

    public abstract void D(oz5.l lVar, java.lang.Runnable runnable);

    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        D(lVar, runnable);
    }

    public boolean I(oz5.l lVar) {
        return !(this instanceof p3325xe03a0797.p3326xc267989b.b4);
    }

    public p3325xe03a0797.p3326xc267989b.p0 J(int i17) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l.a(i17);
        return new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.k(this, i17);
    }

    @Override // oz5.a, oz5.l
    public oz5.i get(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (key instanceof oz5.b) {
            oz5.b bVar = (oz5.b) key;
            oz5.j key2 = mo7094xb5884f29();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key2, "key");
            if (key2 == bVar || bVar.f431856e == key2) {
                oz5.i iVar = (oz5.i) bVar.f431855d.mo146xb9724478(this);
                if (iVar instanceof oz5.i) {
                    return iVar;
                }
            }
        } else if (oz5.e.f431860d == key) {
            return this;
        }
        return null;
    }

    @Override // oz5.a, oz5.l
    /* renamed from: minusKey */
    public oz5.l mo7095xafa9a7cf(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        boolean z17 = key instanceof oz5.b;
        oz5.m mVar = oz5.m.f431862d;
        if (z17) {
            oz5.b bVar = (oz5.b) key;
            oz5.j key2 = mo7094xb5884f29();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key2, "key");
            if ((key2 == bVar || bVar.f431856e == key2) && ((oz5.i) bVar.f431855d.mo146xb9724478(this)) != null) {
                return mVar;
            }
        } else if (oz5.e.f431860d == key) {
            return mVar;
        }
        return this;
    }

    /* renamed from: toString */
    public java.lang.String mo143973x9616526c() {
        return getClass().getSimpleName() + '@' + p3325xe03a0797.p3326xc267989b.c1.a(this);
    }
}
