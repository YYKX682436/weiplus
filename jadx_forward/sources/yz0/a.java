package yz0;

/* loaded from: classes15.dex */
public final class a extends dm.x7 {
    public static final l75.e0 Y = dm.x7.m125685x3593deb(yz0.a.class);

    /* renamed from: equals */
    public boolean m178094xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof yz0.a) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f69132xaca5bdda, ((yz0.a) obj).f69132xaca5bdda);
        }
        return false;
    }

    @Override // dm.x7, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = Y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    /* renamed from: hashCode */
    public int m178095x8cdac1b() {
        return this.f69132xaca5bdda.hashCode();
    }

    public final java.lang.String t0() {
        return zz0.a.f559229a.a("", this.f69135xbaadf794, this.f69140x4b6e88aa);
    }

    /* renamed from: toString */
    public java.lang.String m178096x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f69132xaca5bdda);
        sb6.append(", ");
        sb6.append(this.f69126xc56863e8);
        sb6.append(' ');
        sb6.append(this.f69133x84465715);
        sb6.append(" state:");
        sb6.append(this.f69137x29d3a50c);
        sb6.append(" specFormat=");
        sb6.append(this.f69136x42ba17f7);
        sb6.append(" cacheSize=");
        sb6.append(this.f69125x799e9d9e);
        sb6.append(" totalSize=");
        sb6.append(this.f69138x78351860);
        sb6.append(" percent=");
        long j17 = this.f69138x78351860;
        sb6.append(j17 <= 0 ? 0 : (int) ((((float) this.f69125x799e9d9e) / ((float) j17)) * 100));
        sb6.append(", ");
        sb6.append(t0());
        sb6.append(", ");
        sb6.append(this.f69140x4b6e88aa);
        return sb6.toString();
    }
}
