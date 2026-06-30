package zy2;

/* loaded from: classes2.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.k7 f559008a;

    /* renamed from: b, reason: collision with root package name */
    public final zy2.l7 f559009b;

    /* renamed from: c, reason: collision with root package name */
    public final zy2.n7 f559010c;

    public m7(zy2.k7 autoScrollTipsStatus, zy2.l7 dislikeEduTipsStatus, zy2.n7 longPressQuickReleaseTipsStatus, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        autoScrollTipsStatus = (i17 & 1) != 0 ? new zy2.k7(0, false, false, 7, null) : autoScrollTipsStatus;
        dislikeEduTipsStatus = (i17 & 2) != 0 ? new zy2.l7(false, false, 3, null) : dislikeEduTipsStatus;
        longPressQuickReleaseTipsStatus = (i17 & 4) != 0 ? new zy2.n7(false, 1, null) : longPressQuickReleaseTipsStatus;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autoScrollTipsStatus, "autoScrollTipsStatus");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dislikeEduTipsStatus, "dislikeEduTipsStatus");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longPressQuickReleaseTipsStatus, "longPressQuickReleaseTipsStatus");
        this.f559008a = autoScrollTipsStatus;
        this.f559009b = dislikeEduTipsStatus;
        this.f559010c = longPressQuickReleaseTipsStatus;
    }

    /* renamed from: equals */
    public boolean m179999xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.m7)) {
            return false;
        }
        zy2.m7 m7Var = (zy2.m7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559008a, m7Var.f559008a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559009b, m7Var.f559009b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559010c, m7Var.f559010c);
    }

    /* renamed from: hashCode */
    public int m180000x8cdac1b() {
        return (((this.f559008a.m179982x8cdac1b() * 31) + this.f559009b.m179988x8cdac1b()) * 31) + this.f559010c.m180003x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m180001x9616526c() {
        return "FeedTipsStatus(autoScrollTipsStatus=" + this.f559008a + ", dislikeEduTipsStatus=" + this.f559009b + ", longPressQuickReleaseTipsStatus=" + this.f559010c + ')';
    }
}
