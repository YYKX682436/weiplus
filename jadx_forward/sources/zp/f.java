package zp;

/* loaded from: classes10.dex */
public class f extends android.util.LruCache {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zp.g f556444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zp.g gVar, int i17) {
        super(i17);
        this.f556444a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // android.util.LruCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int sizeOf(java.lang.Object r2, java.lang.Object r3) {
        /*
            r1 = this;
            java.lang.String r2 = (java.lang.String) r2
            r2 = 0
            if (r3 != 0) goto L6
            goto L36
        L6:
            zp.g r0 = r1.f556444a
            r0.getClass()
            boolean r0 = r3 instanceof android.graphics.Bitmap
            if (r0 == 0) goto L1b
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            int r0 = r3.getRowBytes()
            int r3 = r3.getHeight()
        L19:
            int r0 = r0 * r3
            goto L32
        L1b:
            boolean r0 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L31
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            if (r3 != 0) goto L28
            goto L31
        L28:
            int r0 = r3.getRowBytes()
            int r3 = r3.getHeight()
            goto L19
        L31:
            r0 = r2
        L32:
            if (r0 != 0) goto L35
            goto L36
        L35:
            r2 = r0
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zp.f.sizeOf(java.lang.Object, java.lang.Object):int");
    }
}
