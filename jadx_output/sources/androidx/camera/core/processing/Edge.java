package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public class Edge<T> implements m3.a {
    private m3.a mListener;

    @Override // m3.a
    public void accept(T t17) {
        kotlin.jvm.internal.o.e(this.mListener, "Listener is not set.");
        this.mListener.accept(t17);
    }

    public void setListener(m3.a aVar) {
        this.mListener = aVar;
    }
}
