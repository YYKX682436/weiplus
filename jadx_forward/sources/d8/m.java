package d8;

/* loaded from: classes7.dex */
public class m implements java.util.concurrent.ThreadFactory {
    public m(d8.o oVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "native_image_decode_net");
    }
}
