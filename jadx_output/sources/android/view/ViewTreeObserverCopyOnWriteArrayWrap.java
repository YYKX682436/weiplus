package android.view;

/* loaded from: classes10.dex */
public class ViewTreeObserverCopyOnWriteArrayWrap<T> extends android.view.ViewTreeObserver.CopyOnWriteArray<T> {
    final android.view.ViewTreeObserverCopyOnWriteArrayVisitor<T> mVisitor;

    public ViewTreeObserverCopyOnWriteArrayWrap(android.view.ViewTreeObserverCopyOnWriteArrayVisitor<T> viewTreeObserverCopyOnWriteArrayVisitor) {
        this.mVisitor = viewTreeObserverCopyOnWriteArrayVisitor;
    }

    public void add(T t17) {
        T add = this.mVisitor.add(t17);
        if (add != null) {
            super.add(add);
        } else {
            super.add(t17);
        }
    }

    public void clear() {
        this.mVisitor.clear();
        super.clear();
    }

    public void end() {
        this.mVisitor.end();
        super.end();
    }

    public void remove(T t17) {
        this.mVisitor.remove(t17);
        super.remove(t17);
    }

    public int size() {
        int size = this.mVisitor.size();
        return size >= 0 ? size : super.size();
    }
}
