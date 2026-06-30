package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class MutableStateObservable<T> extends androidx.camera.core.impl.StateObservable<T> {
    private MutableStateObservable(java.lang.Object obj, boolean z17) {
        super(obj, z17);
    }

    public static <T> androidx.camera.core.impl.MutableStateObservable<T> withInitialError(java.lang.Throwable th6) {
        return new androidx.camera.core.impl.MutableStateObservable<>(th6, true);
    }

    public static <T> androidx.camera.core.impl.MutableStateObservable<T> withInitialState(T t17) {
        return new androidx.camera.core.impl.MutableStateObservable<>(t17, false);
    }

    public void setError(java.lang.Throwable th6) {
        updateStateAsError(th6);
    }

    public void setState(T t17) {
        updateState(t17);
    }
}
