package ix5;

/* loaded from: classes12.dex */
public class f extends java.util.zip.ZipFile {
    @Override // java.util.zip.ZipFile
    public java.util.Enumeration entries() {
        return new ix5.e(super.entries(), null);
    }
}
