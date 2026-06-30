package cb;

/* loaded from: classes13.dex */
public final class e extends cb.c {
    public e(int i17, int i18, android.os.Bundle bundle) {
        super(i17, 1, bundle);
    }

    @Override // cb.c
    public final void c(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        a(bundle2);
    }

    @Override // cb.c
    public final boolean d() {
        return false;
    }
}
