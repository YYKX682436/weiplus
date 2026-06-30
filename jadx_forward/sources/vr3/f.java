package vr3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f521161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f521162b;

    public f(int i17, int i18) {
        this.f521161a = i17;
        this.f521162b = i18;
    }

    /* renamed from: equals */
    public boolean m172538xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr3.f)) {
            return false;
        }
        vr3.f fVar = (vr3.f) obj;
        return this.f521161a == fVar.f521161a && this.f521162b == fVar.f521162b;
    }

    /* renamed from: hashCode */
    public int m172539x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f521161a) * 31) + java.lang.Integer.hashCode(this.f521162b);
    }

    /* renamed from: toString */
    public java.lang.String m172540x9616526c() {
        return "DeleteData(appMsgId=" + this.f521161a + ", index=" + this.f521162b + ')';
    }
}
