package de2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f310908a;

    public e(int i17, int i18, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f310908a = (i19 & 4) != 0 ? false : z17;
    }

    /* renamed from: equals */
    public boolean m124112xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de2.e)) {
            return false;
        }
        de2.e eVar = (de2.e) obj;
        eVar.getClass();
        return this.f310908a == eVar.f310908a;
    }

    /* renamed from: hashCode */
    public int m124113x8cdac1b() {
        return (((java.lang.Integer.hashCode(0) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Boolean.hashCode(this.f310908a);
    }

    /* renamed from: toString */
    public java.lang.String m124114x9616526c() {
        return "RowStatus(top=0, height=0, isOccupy=" + this.f310908a + ')';
    }
}
