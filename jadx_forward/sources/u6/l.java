package u6;

/* loaded from: classes7.dex */
public class l extends u6.b {
    @Override // u6.e
    public java.lang.Class a() {
        return android.os.ParcelFileDescriptor.class;
    }

    @Override // u6.b
    public void c(java.lang.Object obj) {
        ((android.os.ParcelFileDescriptor) obj).close();
    }

    @Override // u6.b
    public java.lang.Object d(android.content.res.AssetManager assetManager, java.lang.String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
