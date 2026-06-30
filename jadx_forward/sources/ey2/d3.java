package ey2;

/* loaded from: classes2.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ym5 f338875a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f338876b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f338877c;

    /* renamed from: d, reason: collision with root package name */
    public long f338878d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f338879e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f338880f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f338881g;

    /* renamed from: h, reason: collision with root package name */
    public long f338882h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f338883i;

    /* renamed from: j, reason: collision with root package name */
    public int f338884j;

    /* renamed from: k, reason: collision with root package name */
    public long f338885k;

    public d3(r45.ym5 session, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        session = (i17 & 1) != 0 ? new r45.ym5() : session;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        this.f338875a = session;
    }

    /* renamed from: toString */
    public java.lang.String m128332x9616526c() {
        java.lang.StringBuilder sb6;
        if (this.f338881g) {
            sb6 = new java.lang.StringBuilder();
            sb6.append("left exposed time=" + this.f338882h + " isExp=" + this.f338880f + " count=" + this.f338884j + ' ' + this.f338883i);
        } else {
            sb6 = null;
        }
        if (this.f338877c) {
            if (sb6 == null) {
                sb6 = new java.lang.StringBuilder();
            }
            sb6.append("right exposed time=" + this.f338878d + " isExp=" + this.f338876b + ' ' + this.f338879e);
        }
        java.lang.String sb7 = sb6 != null ? sb6.toString() : null;
        return sb7 == null ? "" : sb7;
    }
}
