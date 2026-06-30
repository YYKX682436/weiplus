package fp;

/* loaded from: classes13.dex */
public class u implements java.security.PrivilegedAction {
    public u(java.lang.String str) {
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        java.lang.String property = java.lang.System.getProperty("file.encoding");
        if (property == null) {
            return null;
        }
        return property;
    }
}
