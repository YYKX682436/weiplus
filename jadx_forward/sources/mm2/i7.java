package mm2;

/* loaded from: classes3.dex */
public final class i7 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.y23 f410677a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.hw0 f410678b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410679c;

    /* renamed from: d, reason: collision with root package name */
    public long f410680d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hd5 f410681e;

    public i7(r45.y23 y23Var, r45.hw0 hw0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        y23Var = (i17 & 1) != 0 ? null : y23Var;
        hw0Var = (i17 & 2) != 0 ? null : hw0Var;
        this.f410677a = y23Var;
        this.f410678b = hw0Var;
        this.f410679c = -1;
        if (y23Var != null) {
            this.f410679c = 0;
            long m75942xfb822ef2 = y23Var.m75942xfb822ef2(0);
            if (y23Var != null) {
                y23Var.set(0, java.lang.Long.valueOf(m75942xfb822ef2));
            } else if (hw0Var != null) {
                hw0Var.set(0, java.lang.Long.valueOf(m75942xfb822ef2));
            }
            this.f410680d = m75942xfb822ef2;
            a((r45.hd5) y23Var.m75936x14adae67(24));
            return;
        }
        if (hw0Var != null) {
            this.f410679c = 3;
            long m75942xfb822ef22 = hw0Var.m75942xfb822ef2(0);
            if (y23Var != null) {
                y23Var.set(0, java.lang.Long.valueOf(m75942xfb822ef22));
            } else if (hw0Var != null) {
                hw0Var.set(0, java.lang.Long.valueOf(m75942xfb822ef22));
            }
            this.f410680d = m75942xfb822ef22;
            a((r45.hd5) hw0Var.m75936x14adae67(13));
        }
    }

    public final void a(r45.hd5 hd5Var) {
        r45.y23 y23Var = this.f410677a;
        if (y23Var != null) {
            y23Var.set(24, hd5Var);
        } else {
            r45.hw0 hw0Var = this.f410678b;
            if (hw0Var != null) {
                hw0Var.set(13, hd5Var);
            }
        }
        this.f410681e = hd5Var;
    }
}
