package ng1;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418475a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f418476b;

    public m(java.lang.String appId, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f418475a = appId;
        this.f418476b = z17;
    }

    /* renamed from: equals */
    public boolean m149556xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1.m)) {
            return false;
        }
        ng1.m mVar = (ng1.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418475a, mVar.f418475a) && this.f418476b == mVar.f418476b;
    }

    /* renamed from: hashCode */
    public int m149557x8cdac1b() {
        return (this.f418475a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f418476b);
    }

    /* renamed from: toString */
    public java.lang.String m149558x9616526c() {
        return "WALaunchCheckDemoInfoParams(appId=" + this.f418475a + ", warmLaunch=" + this.f418476b + ')';
    }
}
