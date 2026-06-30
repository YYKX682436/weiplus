package l3;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f396816e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f396817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f396818b;

    /* renamed from: c, reason: collision with root package name */
    public int f396819c;

    /* renamed from: d, reason: collision with root package name */
    public char f396820d;

    static {
        for (int i17 = 0; i17 < 1792; i17++) {
            f396816e[i17] = java.lang.Character.getDirectionality(i17);
        }
    }

    public a(java.lang.CharSequence charSequence, boolean z17) {
        this.f396817a = charSequence;
        this.f396818b = charSequence.length();
    }

    public byte a() {
        int i17 = this.f396819c - 1;
        java.lang.CharSequence charSequence = this.f396817a;
        char charAt = charSequence.charAt(i17);
        this.f396820d = charAt;
        if (java.lang.Character.isLowSurrogate(charAt)) {
            int codePointBefore = java.lang.Character.codePointBefore(charSequence, this.f396819c);
            this.f396819c -= java.lang.Character.charCount(codePointBefore);
            return java.lang.Character.getDirectionality(codePointBefore);
        }
        this.f396819c--;
        char c17 = this.f396820d;
        return c17 < 1792 ? f396816e[c17] : java.lang.Character.getDirectionality(c17);
    }
}
