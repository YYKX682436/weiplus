package x51;

/* loaded from: classes7.dex */
public class s1 {
    /* renamed from: toString */
    public java.lang.String m175028x9616526c() {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 3; i17 < stackTrace.length; i17++) {
            if (stackTrace[i17].getClassName().contains("com.tencent.mm")) {
                sb6.append("[");
                sb6.append(stackTrace[i17].getClassName().substring(15));
                sb6.append(":");
                sb6.append(stackTrace[i17].getMethodName());
                sb6.append("(" + stackTrace[i17].getLineNumber() + ")]");
            }
        }
        return sb6.toString();
    }
}
