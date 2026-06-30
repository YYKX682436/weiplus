package aa1;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f84016a = new java.util.HashMap();

    public java.lang.String a(java.lang.String str) {
        return (java.lang.String) ((java.util.HashMap) this.f84016a).get(str);
    }

    public void b(java.lang.String str, java.lang.String str2) {
        ((java.util.HashMap) this.f84016a).put(str, str2);
    }

    /* renamed from: toString */
    public java.lang.String m885x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f84016a).entrySet()) {
            sb6.append(entry.getKey());
            sb6.append(":");
            sb6.append(entry.getValue());
            sb6.append("\n");
        }
        if (sb6.length() > 1) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        return sb6.toString();
    }
}
