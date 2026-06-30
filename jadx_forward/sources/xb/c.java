package xb;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f534377a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f534378b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f534379c;

    public c(java.lang.String str) {
        int i17 = 0;
        if (str.contains(java.lang.Character.toString((char) 0))) {
            throw new java.lang.IllegalArgumentException("You cannot include TickerUtils.EMPTY_CHAR in the character list.");
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        this.f534377a = length;
        this.f534379c = new java.util.HashMap(length);
        for (int i18 = 0; i18 < length; i18++) {
            this.f534379c.put(java.lang.Character.valueOf(charArray[i18]), java.lang.Integer.valueOf(i18));
        }
        char[] cArr = new char[(length * 2) + 1];
        this.f534378b = cArr;
        cArr[0] = 0;
        while (i17 < length) {
            char[] cArr2 = this.f534378b;
            int i19 = i17 + 1;
            cArr2[i19] = charArray[i17];
            cArr2[length + 1 + i17] = charArray[i17];
            i17 = i19;
        }
    }

    public final int a(char c17) {
        if (c17 == 0) {
            return 0;
        }
        java.util.Map map = this.f534379c;
        if (!((java.util.HashMap) map).containsKey(java.lang.Character.valueOf(c17))) {
            return -1;
        }
        return ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Character.valueOf(c17))).intValue() + 1;
    }
}
