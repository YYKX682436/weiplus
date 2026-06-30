package q9;

/* loaded from: classes15.dex */
public class h extends q9.k {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f442389f = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public final q9.l f442390d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f442391e = new java.util.concurrent.atomic.AtomicReference(new q9.g());

    public h(q9.l lVar) {
        this.f442390d = lVar;
    }

    public static boolean a(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, java.lang.String str) {
        if (str != null) {
            java.lang.String str2 = c1601x7dc4e417.E;
            int i17 = t9.d0.f498031a;
            if (android.text.TextUtils.equals(str, str2 == null ? null : new java.util.Locale(str2).getLanguage())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(d9.k0 r16, int r17, int r18, boolean r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.f308903a
            r3.<init>(r4)
            r5 = 0
        Le:
            int r6 = r0.f308903a
            if (r5 >= r6) goto L1c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.add(r6)
            int r5 = r5 + 1
            goto Le
        L1c:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto La3
            if (r2 != r5) goto L25
            goto La3
        L25:
            r8 = r5
            r7 = 0
        L27:
            r9 = -1
            r10 = 1
            com.google.android.exoplayer2.Format[] r11 = r0.f308904b
            if (r7 >= r6) goto L80
            r11 = r11[r7]
            int r12 = r11.f125617p
            if (r12 <= 0) goto L7d
            int r13 = r11.f125618q
            if (r13 <= 0) goto L7d
            if (r19 == 0) goto L47
            if (r12 <= r13) goto L3d
            r14 = r10
            goto L3e
        L3d:
            r14 = 0
        L3e:
            if (r1 <= r2) goto L41
            goto L42
        L41:
            r10 = 0
        L42:
            if (r14 == r10) goto L47
            r10 = r1
            r14 = r2
            goto L49
        L47:
            r14 = r1
            r10 = r2
        L49:
            int r15 = r12 * r10
            int r4 = r13 * r14
            if (r15 < r4) goto L5a
            android.graphics.Point r10 = new android.graphics.Point
            int r15 = t9.d0.f498031a
            int r4 = r4 + r12
            int r4 = r4 + r9
            int r4 = r4 / r12
            r10.<init>(r14, r4)
            goto L65
        L5a:
            android.graphics.Point r4 = new android.graphics.Point
            int r12 = t9.d0.f498031a
            int r15 = r15 + r13
            int r15 = r15 + r9
            int r15 = r15 / r13
            r4.<init>(r15, r10)
            r10 = r4
        L65:
            int r4 = r11.f125617p
            int r9 = r4 * r13
            int r11 = r10.x
            float r11 = (float) r11
            r12 = 1065017672(0x3f7ae148, float:0.98)
            float r11 = r11 * r12
            int r11 = (int) r11
            if (r4 < r11) goto L7d
            int r4 = r10.y
            float r4 = (float) r4
            float r4 = r4 * r12
            int r4 = (int) r4
            if (r13 < r4) goto L7d
            if (r9 >= r8) goto L7d
            r8 = r9
        L7d:
            int r7 = r7 + 1
            goto L27
        L80:
            if (r8 == r5) goto La3
            int r0 = r3.size()
            int r0 = r0 - r10
        L87:
            if (r0 < 0) goto La3
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r1 = r11[r1]
            int r1 = r1.q()
            if (r1 == r9) goto L9d
            if (r1 <= r8) goto La0
        L9d:
            r3.remove(r0)
        La0:
            int r0 = r0 + (-1)
            goto L87
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.h.b(d9.k0, int, int, boolean):java.util.List");
    }

    public static boolean c(int i17, boolean z17) {
        int i18 = i17 & 7;
        return i18 == 4 || (z17 && i18 == 3);
    }

    public static boolean d(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i17, q9.f fVar) {
        if (!c(i17, false) || c1601x7dc4e417.f125625x != fVar.f442386a || c1601x7dc4e417.f125626y != fVar.f442387b) {
            return false;
        }
        java.lang.String str = fVar.f442388c;
        return str == null || android.text.TextUtils.equals(str, c1601x7dc4e417.f125613i);
    }

    public static boolean e(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        if (!c(i17, false) || (i17 & i18) == 0) {
            return false;
        }
        if (str != null && !t9.d0.a(c1601x7dc4e417.f125613i, str)) {
            return false;
        }
        int i29 = c1601x7dc4e417.f125617p;
        if (i29 != -1 && i29 > i19) {
            return false;
        }
        int i37 = c1601x7dc4e417.f125618q;
        if (i37 != -1 && i37 > i27) {
            return false;
        }
        int i38 = c1601x7dc4e417.f125609e;
        return i38 == -1 || i38 <= i28;
    }
}
