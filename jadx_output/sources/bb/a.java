package bb;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class a {
    public static java.lang.Object get(com.google.firebase.components.ComponentContainer componentContainer, java.lang.Class cls) {
        com.google.firebase.inject.Provider provider = componentContainer.getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }
}
