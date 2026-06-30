package a7;

/* loaded from: classes13.dex */
public class l implements t6.d {
    @Override // t6.d
    public boolean b(java.lang.Object obj, java.io.File file, t6.l lVar) {
        try {
            q7.c.b((java.nio.ByteBuffer) obj, file);
            return true;
        } catch (java.io.IOException unused) {
            android.util.Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
