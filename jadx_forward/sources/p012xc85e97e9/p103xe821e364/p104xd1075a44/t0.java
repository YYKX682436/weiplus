package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseIntArray f93757a = new android.util.SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public boolean f93758b = false;

    public int a(int i17, int i18) {
        int c17 = c(i17);
        int i19 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < i17; i28++) {
            int c18 = c(i28);
            i19 += c18;
            if (i19 == i18) {
                i27++;
                i19 = 0;
            } else if (i19 > i18) {
                i27++;
                i19 = c18;
            }
        }
        return i19 + c17 > i18 ? i27 + 1 : i27;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0051 -> B:22:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0053 -> B:22:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0055 -> B:22:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.c(r9)
            r1 = 0
            if (r0 != r10) goto L8
            return r1
        L8:
            boolean r2 = r8.f93758b
            if (r2 == 0) goto L46
            android.util.SparseIntArray r2 = r8.f93757a
            int r3 = r2.size()
            if (r3 <= 0) goto L46
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = r1
        L1b:
            if (r5 > r3) goto L2d
            int r6 = r5 + r3
            int r6 = r6 >>> 1
            int r7 = r2.keyAt(r6)
            if (r7 >= r9) goto L2a
            int r5 = r6 + 1
            goto L1b
        L2a:
            int r3 = r6 + (-1)
            goto L1b
        L2d:
            int r5 = r5 + r4
            if (r5 < 0) goto L3a
            int r3 = r2.size()
            if (r5 >= r3) goto L3a
            int r4 = r2.keyAt(r5)
        L3a:
            if (r4 < 0) goto L46
            int r2 = r2.get(r4)
            int r3 = r8.c(r4)
            int r2 = r2 + r3
            goto L56
        L46:
            r2 = r1
            r4 = r2
        L48:
            if (r4 >= r9) goto L59
            int r3 = r8.c(r4)
            int r2 = r2 + r3
            if (r2 != r10) goto L53
            r2 = r1
            goto L56
        L53:
            if (r2 <= r10) goto L56
            r2 = r3
        L56:
            int r4 = r4 + 1
            goto L48
        L59:
            int r0 = r0 + r2
            if (r0 > r10) goto L5d
            return r2
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.t0.b(int, int):int");
    }

    public abstract int c(int i17);

    public void d() {
        this.f93757a.clear();
    }
}
