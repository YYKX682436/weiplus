package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class z2 implements p3325xe03a0797.p3326xc267989b.k2 {

    /* renamed from: _exceptionsHolder */
    private volatile /* synthetic */ java.lang.Object f72757xb764c32f = null;

    /* renamed from: _isCompleting */
    private volatile /* synthetic */ int f72758xe3c84a5f;

    /* renamed from: _rootCause */
    private volatile /* synthetic */ java.lang.Object f72759x7200bb28;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.h3 f392242d;

    public z2(p3325xe03a0797.p3326xc267989b.h3 h3Var, boolean z17, java.lang.Throwable th6) {
        this.f392242d = h3Var;
        this.f72758xe3c84a5f = z17 ? 1 : 0;
        this.f72759x7200bb28 = th6;
    }

    @Override // p3325xe03a0797.p3326xc267989b.k2
    public boolean a() {
        return ((java.lang.Throwable) this.f72759x7200bb28) == null;
    }

    public final void b(java.lang.Throwable th6) {
        java.lang.Throwable th7 = (java.lang.Throwable) this.f72759x7200bb28;
        if (th7 == null) {
            this.f72759x7200bb28 = th6;
            return;
        }
        if (th6 == th7) {
            return;
        }
        java.lang.Object obj = this.f72757xb764c32f;
        if (obj == null) {
            this.f72757xb764c32f = th6;
            return;
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (obj instanceof java.util.ArrayList) {
                ((java.util.ArrayList) obj).add(th6);
                return;
            } else {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th6 == obj) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th6);
        this.f72757xb764c32f = arrayList;
    }

    public final java.lang.Throwable c() {
        return (java.lang.Throwable) this.f72759x7200bb28;
    }

    public final boolean d() {
        return ((java.lang.Throwable) this.f72759x7200bb28) != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean e() {
        return this.f72758xe3c84a5f;
    }

    @Override // p3325xe03a0797.p3326xc267989b.k2
    public p3325xe03a0797.p3326xc267989b.h3 f() {
        return this.f392242d;
    }

    public final boolean g() {
        return this.f72757xb764c32f == p3325xe03a0797.p3326xc267989b.d3.f391698e;
    }

    public final java.util.List h(java.lang.Throwable th6) {
        java.util.ArrayList arrayList;
        java.lang.Object obj = this.f72757xb764c32f;
        if (obj == null) {
            arrayList = new java.util.ArrayList(4);
        } else if (obj instanceof java.lang.Throwable) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (java.util.ArrayList) obj;
        }
        java.lang.Throwable th7 = (java.lang.Throwable) this.f72759x7200bb28;
        if (th7 != null) {
            arrayList.add(0, th7);
        }
        if (th6 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(th6, th7)) {
            arrayList.add(th6);
        }
        this.f72757xb764c32f = p3325xe03a0797.p3326xc267989b.d3.f391698e;
        return arrayList;
    }

    public final void i(boolean z17) {
        this.f72758xe3c84a5f = z17 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* renamed from: toString */
    public java.lang.String m144129x9616526c() {
        return "Finishing[cancelling=" + d() + ", completing=" + ((boolean) this.f72758xe3c84a5f) + ", rootCause=" + ((java.lang.Throwable) this.f72759x7200bb28) + ", exceptions=" + this.f72757xb764c32f + ", list=" + this.f392242d + ']';
    }
}
