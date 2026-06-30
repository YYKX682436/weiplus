package ox3;

/* loaded from: classes10.dex */
public final class g implements ox3.f {

    /* renamed from: d, reason: collision with root package name */
    public final t45.n0 f431282d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f431283e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f431284f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f431285g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f431286h;

    public g(t45.n0 ringtoneInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ringtoneInfo, "ringtoneInfo");
        this.f431282d = ringtoneInfo;
        this.f431285g = "";
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        t45.e0 e0Var;
        int i17;
        t45.f fVar;
        t45.n0 n0Var = this.f431282d;
        int i18 = n0Var.f497148d;
        if (i18 == 1) {
            t45.f0 f0Var = n0Var.f497149e;
            if (f0Var == null || (e0Var = f0Var.f497084d) == null) {
                return 0L;
            }
            i17 = e0Var.f497080d;
        } else {
            if (i18 == 2) {
                t45.g gVar = n0Var.f497150f;
                if (gVar == null || (fVar = gVar.f497093d) == null) {
                    return 0L;
                }
                return fVar.f497082d;
            }
            if (i18 != 3) {
                return 0L;
            }
            i17 = c01.z1.f();
        }
        return i17;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
