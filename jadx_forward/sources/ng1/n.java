package ng1;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cc f418477a;

    /* renamed from: b, reason: collision with root package name */
    public final int f418478b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f418479c;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cc code, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(code, "code");
        this.f418477a = code;
        this.f418478b = i17;
        this.f418479c = str;
    }

    /* renamed from: equals */
    public boolean m149559xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1.n)) {
            return false;
        }
        ng1.n nVar = (ng1.n) obj;
        return this.f418477a == nVar.f418477a && this.f418478b == nVar.f418478b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418479c, nVar.f418479c);
    }

    /* renamed from: hashCode */
    public int m149560x8cdac1b() {
        int hashCode = ((this.f418477a.hashCode() * 31) + java.lang.Integer.hashCode(this.f418478b)) * 31;
        java.lang.String str = this.f418479c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m149561x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WALaunchCheckDemoInfoResult(code=");
        sb6.append(this.f418477a);
        sb6.append(", responseErrCode=");
        sb6.append(this.f418478b);
        sb6.append(", responseApplyExprPageUrl=");
        java.lang.String str = this.f418479c;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(')');
        return sb6.toString();
    }

    public /* synthetic */ n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cc ccVar, int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(ccVar, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? null : str);
    }
}
