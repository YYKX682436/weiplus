package zy2;

/* loaded from: classes2.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f559017a;

    public n7(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f559017a = (i17 & 1) != 0 ? false : z17;
    }

    /* renamed from: equals */
    public boolean m180002xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy2.n7) && this.f559017a == ((zy2.n7) obj).f559017a;
    }

    /* renamed from: hashCode */
    public int m180003x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f559017a);
    }

    /* renamed from: toString */
    public java.lang.String m180004x9616526c() {
        return "LongPressQuickReleaseTipsStatus(enableLongPressQuickReleaseItemHighlight=" + this.f559017a + ')';
    }
}
