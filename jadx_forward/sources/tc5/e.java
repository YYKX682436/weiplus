package tc5;

/* loaded from: classes10.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f499090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f499091d;

    public e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        this.f499090c = c1163xf1deaba4;
        this.f499091d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.t0
    public int c(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f499090c.mo7946xf939df19();
        if (mo7946xf939df19 == null) {
            return 1;
        }
        int mo863xcdaf1228 = mo7946xf939df19.mo863xcdaf1228(i17);
        if (mo863xcdaf1228 == -1 || mo863xcdaf1228 == 0) {
            return this.f499091d;
        }
        return 1;
    }
}
