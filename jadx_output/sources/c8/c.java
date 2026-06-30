package c8;

/* loaded from: classes8.dex */
public class c extends java.lang.RuntimeException {
    public c(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + java.util.Arrays.toString(strArr) + ", but only found: " + java.util.Arrays.toString(strArr2) + ".");
    }
}
