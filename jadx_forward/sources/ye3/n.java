package ye3;

/* loaded from: classes15.dex */
public final class n extends dm.w7 {
    public static final l75.e0 Q = dm.w7.m125659x3593deb(ye3.n.class);

    /* renamed from: equals */
    public boolean m176886xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof ye3.n) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f69010xaca5bdda, ((ye3.n) obj).f69010xaca5bdda);
        }
        return false;
    }

    @Override // dm.w7, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return Q;
    }

    /* renamed from: hashCode */
    public int m176887x8cdac1b() {
        return this.f69010xaca5bdda.hashCode();
    }

    public final java.lang.String t0() {
        return ze3.a.f553311a.a(this.f69010xaca5bdda, this.f69016x4b6e88aa);
    }

    /* renamed from: toString */
    public java.lang.String m176888x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f69010xaca5bdda);
        sb6.append(", ");
        sb6.append(this.f69005xc56863e8);
        sb6.append(' ');
        sb6.append(this.f69011x84465715);
        sb6.append(" state:");
        sb6.append(this.f69013x29d3a50c);
        sb6.append(" specFormat=");
        sb6.append(this.f69012x42ba17f7);
        sb6.append(" cacheSize=");
        sb6.append(this.f69004x799e9d9e);
        sb6.append(" totalSize=");
        sb6.append(this.f69014x78351860);
        sb6.append(" percent=");
        long j17 = this.f69014x78351860;
        sb6.append(j17 <= 0 ? 0 : (int) ((((float) this.f69004x799e9d9e) / ((float) j17)) * 100));
        sb6.append(", ");
        sb6.append(t0());
        sb6.append(", ");
        sb6.append(this.f69016x4b6e88aa);
        return sb6.toString();
    }
}
