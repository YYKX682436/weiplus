package so2;

/* loaded from: classes2.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public so2.r4 f492125a;

    /* renamed from: b, reason: collision with root package name */
    public r45.gp2 f492126b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ag f492127c;

    /* renamed from: d, reason: collision with root package name */
    public r45.qt2 f492128d;

    public s4(so2.r4 state, r45.gp2 gp2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ag hideReason, r45.qt2 qt2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        state = (i17 & 1) != 0 ? so2.r4.f492108e : state;
        gp2Var = (i17 & 2) != 0 ? null : gp2Var;
        hideReason = (i17 & 4) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ag.f213170e : hideReason;
        qt2Var = (i17 & 8) != 0 ? null : qt2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hideReason, "hideReason");
        this.f492125a = state;
        this.f492126b = gp2Var;
        this.f492127c = hideReason;
        this.f492128d = qt2Var;
    }

    /* renamed from: equals */
    public boolean m164945xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.s4)) {
            return false;
        }
        so2.s4 s4Var = (so2.s4) obj;
        return this.f492125a == s4Var.f492125a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492126b, s4Var.f492126b) && this.f492127c == s4Var.f492127c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492128d, s4Var.f492128d);
    }

    /* renamed from: hashCode */
    public int m164946x8cdac1b() {
        int hashCode = this.f492125a.hashCode() * 31;
        r45.gp2 gp2Var = this.f492126b;
        int hashCode2 = (((hashCode + (gp2Var == null ? 0 : gp2Var.hashCode())) * 31) + this.f492127c.hashCode()) * 31;
        r45.qt2 qt2Var = this.f492128d;
        return hashCode2 + (qt2Var != null ? qt2Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164947x9616526c() {
        return "FinderPopupTips(state=" + this.f492125a + ", finderPopup=" + this.f492126b + ", hideReason=" + this.f492127c + ", lastReportContextObj=" + this.f492128d + ')';
    }
}
