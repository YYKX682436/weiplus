package ip;

/* loaded from: classes8.dex */
public class i extends ip.h {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f375101f;

    public i(int i17) {
        super(i17);
        this.f375101f = new java.util.HashMap();
        ip.f fVar = new ip.f(1, "MPConfig", new java.lang.String[]{"reportOnLeaveDomains", "domain"}, true, false);
        if (1 == this.f375097a) {
            ((java.util.ArrayList) this.f375099c).add(fVar);
        }
        ip.f fVar2 = new ip.f(1, "MPConfig", new java.lang.String[]{"FullScreenMpLinkPrefixList", "MpLinkPrefix"}, true, true);
        if (1 == this.f375097a) {
            ((java.util.ArrayList) this.f375099c).add(fVar2);
        }
    }
}
