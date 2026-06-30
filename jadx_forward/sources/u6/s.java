package u6;

/* loaded from: classes7.dex */
public class s extends u6.b {
    @Override // u6.e
    public java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // u6.b
    public void c(java.lang.Object obj) {
        ((java.io.InputStream) obj).close();
    }

    @Override // u6.b
    public java.lang.Object d(android.content.res.AssetManager assetManager, java.lang.String str) {
        return assetManager.open(str);
    }
}
