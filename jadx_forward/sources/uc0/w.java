package uc0;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f507826a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f507827b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f507828c;

    public w(boolean z17, java.lang.String str, boolean z18) {
        this.f507826a = z17;
        this.f507827b = str;
        this.f507828c = z18;
    }

    /* renamed from: equals */
    public boolean m167822xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0.w)) {
            return false;
        }
        uc0.w wVar = (uc0.w) obj;
        return this.f507826a == wVar.f507826a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f507827b, wVar.f507827b) && this.f507828c == wVar.f507828c;
    }

    /* renamed from: hashCode */
    public int m167823x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f507826a) * 31;
        java.lang.String str = this.f507827b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f507828c);
    }

    /* renamed from: toString */
    public java.lang.String m167824x9616526c() {
        return "VerifyMsg(isSend=" + this.f507826a + ", content=" + this.f507827b + ", hasImg=" + this.f507828c + ')';
    }
}
