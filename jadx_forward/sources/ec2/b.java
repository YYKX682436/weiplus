package ec2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f332484a;

    public b(java.lang.Boolean bool) {
        this.f332484a = bool;
    }

    /* renamed from: equals */
    public boolean m127249xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec2.b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332484a, ((ec2.b) obj).f332484a);
    }

    /* renamed from: hashCode */
    public int m127250x8cdac1b() {
        java.lang.Boolean bool = this.f332484a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127251x9616526c() {
        return "FinderFeedFlowAdExtra(isHiddenAdsTag=" + this.f332484a + ')';
    }
}
