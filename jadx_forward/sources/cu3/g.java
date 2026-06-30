package cu3;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd f304008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f304009e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd, android.graphics.Bitmap bitmap) {
        this.f304008d = c17002x1531c3fd;
        this.f304009e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd = this.f304008d;
        for (cu3.d dVar : c17002x1531c3fd.m67925x7f4a1465()) {
            if (!dVar.f304004f) {
                oj0.c cVar = oj0.c.f427259a;
                android.graphics.Bitmap bitmap = this.f304009e;
                cVar.d(bitmap);
                int f17 = i65.a.f(c17002x1531c3fd.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
                int f18 = i65.a.f(c17002x1531c3fd.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
                if (bitmap.getWidth() > bitmap.getHeight()) {
                    f17 = (int) ((bitmap.getWidth() / bitmap.getHeight()) * f18);
                } else if (bitmap.getWidth() < bitmap.getHeight()) {
                    f18 = (int) ((bitmap.getHeight() / bitmap.getWidth()) * f17);
                }
                c17002x1531c3fd.post(new cu3.f(dVar, cVar.b(bitmap, dVar.f304000b, f17, f18, c17002x1531c3fd.getDefaultWeight())));
            }
        }
    }
}
