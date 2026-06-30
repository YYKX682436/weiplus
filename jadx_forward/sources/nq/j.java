package nq;

/* loaded from: classes8.dex */
public abstract class j implements nq.n {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f420415a;

    public j(com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb, int[] iArr) {
        int i17 = surfaceHolderCallback2C10435xb52e77fb.f146423q;
        if (i17 == 2 || i17 == 3) {
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i18 = length - 1;
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i18);
            iArr2[i18] = 12352;
            if (surfaceHolderCallback2C10435xb52e77fb.f146423q == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            iArr = iArr2;
        }
        this.f420415a = iArr;
    }
}
