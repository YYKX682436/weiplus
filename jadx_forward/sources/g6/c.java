package g6;

/* loaded from: classes14.dex */
public final class c implements g6.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f350562b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f350563c;

    public c(int i17, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 100 : i17;
        z17 = (i18 & 2) != 0 ? false : z17;
        this.f350562b = i17;
        this.f350563c = z17;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // g6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(g6.f r13, c6.l r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.c.a(g6.f, c6.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: equals */
    public boolean m130938xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof g6.c) {
                if (this.f350562b == ((g6.c) obj).f350562b) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m130939x8cdac1b() {
        return java.lang.Integer.hashCode(this.f350562b);
    }

    /* renamed from: toString */
    public java.lang.String m130940x9616526c() {
        return "CrossfadeTransition(durationMillis=" + this.f350562b + ')';
    }
}
