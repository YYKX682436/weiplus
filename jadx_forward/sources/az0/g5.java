package az0;

/* loaded from: classes5.dex */
public final class g5 implements com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final az0.g5 f97031a = new az0.g5();

    @Override // com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider
    /* renamed from: onRequestTemplateMetadata */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4122x30130586 mo9344x9a8f6999(java.lang.String it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "onRequestTemplateMetadata name:".concat(it));
        if (az0.i5.f97106q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasManager", "you have not set templateProvider!!!");
        }
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider templateServiceProvider = az0.i5.f97106q;
        if (templateServiceProvider != null) {
            return templateServiceProvider.mo9344x9a8f6999(it);
        }
        return null;
    }
}
