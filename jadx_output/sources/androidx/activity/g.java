package androidx.activity;

/* loaded from: classes14.dex */
public abstract class g {
    private java.util.concurrent.CopyOnWriteArrayList<androidx.activity.a> mCancellables = new java.util.concurrent.CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public g(boolean z17) {
        this.mEnabled = z17;
    }

    public void addCancellable(androidx.activity.a aVar) {
        this.mCancellables.add(aVar);
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        java.util.Iterator<androidx.activity.a> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void removeCancellable(androidx.activity.a aVar) {
        this.mCancellables.remove(aVar);
    }

    public final void setEnabled(boolean z17) {
        this.mEnabled = z17;
    }
}
