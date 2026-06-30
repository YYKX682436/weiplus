package df2;

/* loaded from: classes3.dex */
public final class c6 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.d6 f311393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f311394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f311395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f311396d;

    public c6(df2.d6 d6Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f311393a = d6Var;
        this.f311394b = z17;
        this.f311395c = c0Var;
        this.f311396d = qVar;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f311395c;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f311396d.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        int i17;
        df2.d6 d6Var = this.f311393a;
        mm2.c1 c1Var = (mm2.c1) d6Var.m56788xbba4bfc0(mm2.c1.class);
        if (this.f311394b) {
            int i18 = (int) ((mm2.c1) d6Var.m56788xbba4bfc0(mm2.c1.class)).f410399q;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            i17 = i18 | 131072;
        } else {
            int i19 = (int) ((mm2.c1) d6Var.m56788xbba4bfc0(mm2.c1.class)).f410399q;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            i17 = i19 & (-131073);
        }
        c1Var.p8(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f311395c;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f311396d.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
    }
}
