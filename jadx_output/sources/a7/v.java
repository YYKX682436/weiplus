package a7;

/* loaded from: classes13.dex */
public class v implements a7.y {
    @Override // a7.y
    public java.lang.Class a() {
        return android.os.ParcelFileDescriptor.class;
    }

    @Override // a7.y
    public java.lang.Object b(java.io.File file) {
        return android.os.ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // a7.y
    public void c(java.lang.Object obj) {
        ((android.os.ParcelFileDescriptor) obj).close();
    }
}
