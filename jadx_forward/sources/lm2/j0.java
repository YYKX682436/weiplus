package lm2;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f400941a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f400942b;

    /* renamed from: c, reason: collision with root package name */
    public long f400943c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qn f400944d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f400945e;

    public j0(java.lang.String boxId, java.util.ArrayList dataList, long j17, r45.qn bindBoxContext, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindBoxContext, "bindBoxContext");
        this.f400941a = boxId;
        this.f400942b = dataList;
        this.f400943c = j17;
        this.f400944d = bindBoxContext;
        this.f400945e = str;
    }

    /* renamed from: equals */
    public boolean m146007xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm2.j0)) {
            return false;
        }
        lm2.j0 j0Var = (lm2.j0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400941a, j0Var.f400941a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400942b, j0Var.f400942b) && this.f400943c == j0Var.f400943c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400944d, j0Var.f400944d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400945e, j0Var.f400945e);
    }

    /* renamed from: hashCode */
    public int m146008x8cdac1b() {
        int hashCode = ((((((this.f400941a.hashCode() * 31) + this.f400942b.hashCode()) * 31) + java.lang.Long.hashCode(this.f400943c)) * 31) + this.f400944d.hashCode()) * 31;
        java.lang.String str = this.f400945e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m146009x9616526c() {
        return "BoxMsgInfo(boxId=" + this.f400941a + ", dataList=" + this.f400942b + ", lastEnterTimeStamp=" + this.f400943c + ", bindBoxContext=" + this.f400944d + ", boxName=" + this.f400945e + ')';
    }
}
