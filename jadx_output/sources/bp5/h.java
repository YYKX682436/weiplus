package bp5;

/* loaded from: classes14.dex */
public interface h {
    default boolean getImpellerEnabled() {
        return false;
    }

    boolean getNeedRecreate();

    android.util.Size getRenderSize();

    java.lang.Object getRenderTarget();

    void setNeedRecreate(boolean z17);
}
