package df;

/* loaded from: classes13.dex */
public class e1 extends android.content.res.Resources {
    public e1(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        android.content.res.Configuration configuration = super.getConfiguration();
        configuration.fontScale = 1.0f;
        return configuration;
    }
}
