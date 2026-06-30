package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e;

/* renamed from: androidx.camera.core.internal.compat.workaround.SurfaceSorter */
/* loaded from: classes14.dex */
public class C0866x489225b8 {

    /* renamed from: PRIORITY_MEDIA_CODEC_SURFACE */
    private static final int f2109xcaae00ee = 2;

    /* renamed from: PRIORITY_OTHERS */
    private static final int f2110x1bba8a5e = 1;

    /* renamed from: PRIORITY_PREVIEW_SURFACE */
    private static final int f2111x20f35e5b = 0;

    /* renamed from: mHasQuirk */
    private final boolean f2112x2c9ddcd1;

    public C0866x489225b8() {
        this.f2112x2c9ddcd1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0851xcf1a968b.get(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0860xfb86e57d.class) != null;
    }

    /* renamed from: getSurfacePriority */
    private int m6202xe3e19f3b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        if (abstractC0697x654a0293.m5404x2009e26d() == android.media.MediaCodec.class) {
            return 2;
        }
        return abstractC0697x654a0293.m5404x2009e26d() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.class ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sort$0 */
    public /* synthetic */ int m6203xf5108e27(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig2) {
        return m6202xe3e19f3b(outputConfig.mo5172xcf572877()) - m6202xe3e19f3b(outputConfig2.mo5172xcf572877());
    }

    /* renamed from: sort */
    public void m6204x35f59e(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig> list) {
        if (this.f2112x2c9ddcd1) {
            java.util.Collections.sort(list, new java.util.Comparator() { // from class: androidx.camera.core.internal.compat.workaround.SurfaceSorter$$a
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int m6203xf5108e27;
                    m6203xf5108e27 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0866x489225b8.this.m6203xf5108e27((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig) obj, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig) obj2);
                    return m6203xf5108e27;
                }
            });
        }
    }
}
