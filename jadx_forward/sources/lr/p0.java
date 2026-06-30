package lr;

/* loaded from: classes8.dex */
public final class p0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f402106c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f402107d;

    public p0(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d layoutManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        this.f402106c = adapter;
        this.f402107d = layoutManager;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.t0
    public int c(int i17) {
        switch (this.f402106c.mo863xcdaf1228(i17)) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return this.f402107d.f93394w;
            case 3:
            case 6:
            default:
                return 1;
        }
    }
}
