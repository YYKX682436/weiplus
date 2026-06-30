package az0;

/* loaded from: classes5.dex */
public final class g5 implements com.tencent.maas.MJMaasCore.TemplateServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final az0.g5 f15498a = new az0.g5();

    @Override // com.tencent.maas.MJMaasCore.TemplateServiceProvider
    public final com.tencent.maas.model.MJTemplateMetadata onRequestTemplateMetadata(java.lang.String it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "onRequestTemplateMetadata name:".concat(it));
        if (az0.i5.f15573q == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MaasManager", "you have not set templateProvider!!!");
        }
        com.tencent.maas.MJMaasCore.TemplateServiceProvider templateServiceProvider = az0.i5.f15573q;
        if (templateServiceProvider != null) {
            return templateServiceProvider.onRequestTemplateMetadata(it);
        }
        return null;
    }
}
