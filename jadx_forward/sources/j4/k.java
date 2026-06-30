package j4;

/* loaded from: classes12.dex */
public abstract class k {
    public static void a(final java.lang.Runnable runnable) {
        android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: j4.k$$a
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j17) {
                runnable.run();
            }
        });
    }
}
