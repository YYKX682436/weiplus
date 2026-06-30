package ix5;

/* loaded from: classes12.dex */
public class e implements java.util.Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Enumeration f377162a;

    public e(java.util.Enumeration enumeration, ix5.d dVar) {
        this.f377162a = enumeration;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f377162a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public java.lang.Object nextElement() {
        java.lang.String name;
        java.util.zip.ZipEntry zipEntry = (java.util.zip.ZipEntry) this.f377162a.nextElement();
        if (zipEntry == null || (name = zipEntry.getName()) == null || !(name.contains("../") || name.contains("..\\"))) {
            return zipEntry;
        }
        throw new java.lang.SecurityException("非法entry路径:" + zipEntry.getName());
    }
}
