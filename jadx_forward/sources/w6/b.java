package w6;

/* loaded from: classes13.dex */
public class b implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(new w6.a(this, runnable), "glide-active-resources");
    }
}
