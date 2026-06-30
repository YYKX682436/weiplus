package wo;

/* loaded from: classes12.dex */
public class s implements java.io.FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        return java.util.regex.Pattern.matches("cpu[0-9]", file.getName());
    }
}
