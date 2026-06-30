package e0;

/* loaded from: classes14.dex */
public final class l implements t1.d, s1.f {

    /* renamed from: d, reason: collision with root package name */
    public final e0.f1 f327172d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.j f327173e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f327174f;

    /* renamed from: g, reason: collision with root package name */
    public final p2.s f327175g;

    public l(e0.f1 state, e0.j beyondBoundsInfo, boolean z17, p2.s layoutDirection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beyondBoundsInfo, "beyondBoundsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        this.f327172d = state;
        this.f327173e = beyondBoundsInfo;
        this.f327174f = z17;
        this.f327175g = layoutDirection;
    }

    public static final boolean b(e0.i iVar, e0.l lVar) {
        return iVar.f327129b < lVar.f327172d.f().a() - 1;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final boolean a(e0.i iVar, int i17) {
        if (!(i17 == 1)) {
            if (i17 == 2) {
                return b(iVar, this);
            }
            boolean z17 = i17 == 5;
            boolean z18 = this.f327174f;
            if (!z17) {
                if (!(i17 == 6)) {
                    boolean z19 = i17 == 3;
                    p2.s sVar = this.f327175g;
                    if (z19) {
                        int ordinal = sVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new jz5.j();
                            }
                            if (!z18) {
                                return b(iVar, this);
                            }
                            if (iVar.f327128a <= 0) {
                                return false;
                            }
                        } else {
                            if (z18) {
                                return b(iVar, this);
                            }
                            if (iVar.f327128a <= 0) {
                                return false;
                            }
                        }
                    } else {
                        if (!(i17 == 4)) {
                            throw new java.lang.IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                        int ordinal2 = sVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new jz5.j();
                            }
                            if (z18) {
                                return b(iVar, this);
                            }
                            if (iVar.f327128a <= 0) {
                                return false;
                            }
                        } else {
                            if (!z18) {
                                return b(iVar, this);
                            }
                            if (iVar.f327128a <= 0) {
                                return false;
                            }
                        }
                    }
                } else {
                    if (!z18) {
                        return b(iVar, this);
                    }
                    if (iVar.f327128a <= 0) {
                        return false;
                    }
                }
            } else {
                if (z18) {
                    return b(iVar, this);
                }
                if (iVar.f327128a <= 0) {
                    return false;
                }
            }
        } else if (iVar.f327128a <= 0) {
            return false;
        }
        return true;
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return s1.h.f483545a;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        return this;
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
