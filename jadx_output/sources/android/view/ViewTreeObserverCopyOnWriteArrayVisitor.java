package android.view;

/* loaded from: classes10.dex */
public interface ViewTreeObserverCopyOnWriteArrayVisitor<T> {
    T add(T t17);

    void clear();

    void end();

    void remove(T t17);

    int size();
}
