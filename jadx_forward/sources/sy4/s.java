package sy4;

/* loaded from: classes5.dex */
public abstract class s {
    public static java.lang.String a(java.util.HashMap hashMap, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!hashMap.containsKey(str)) {
            return sb6.toString();
        }
        sb6.append((java.lang.String) hashMap.get(str));
        sb6.append(";");
        int i17 = 1;
        while (true) {
            java.lang.String str2 = str + "_" + i17;
            if (!hashMap.containsKey(str2)) {
                return sb6.toString();
            }
            sb6.append((java.lang.String) hashMap.get(str2));
            sb6.append(";");
            i17++;
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return (str + "_" + str2).toLowerCase();
    }
}
