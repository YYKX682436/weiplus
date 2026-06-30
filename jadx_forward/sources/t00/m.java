package t00;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f495846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f495847b;

    public m(java.lang.String actionName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionName, "actionName");
        this.f495846a = actionName;
        this.f495847b = i17;
    }

    /* renamed from: equals */
    public boolean m165561xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t00.m)) {
            return false;
        }
        t00.m mVar = (t00.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f495846a, mVar.f495846a) && this.f495847b == mVar.f495847b;
    }

    /* renamed from: hashCode */
    public int m165562x8cdac1b() {
        return (this.f495846a.hashCode() * 31) + java.lang.Integer.hashCode(this.f495847b);
    }

    /* renamed from: toString */
    public java.lang.String m165563x9616526c() {
        return "EcsActionInfo(actionName=" + this.f495846a + ", supportVersion=" + this.f495847b + ')';
    }
}
