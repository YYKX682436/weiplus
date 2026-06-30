package i4;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f369873a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f369874b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f369876d;

    /* renamed from: e, reason: collision with root package name */
    public final int f369877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f369878f;

    public f(android.graphics.Bitmap bitmap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f369874b = arrayList;
        this.f369875c = 16;
        this.f369876d = 12544;
        this.f369877e = -1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f369878f = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new java.lang.IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(i4.j.f369888e);
        this.f369873a = bitmap;
        arrayList.add(i4.k.f369893d);
        arrayList.add(i4.k.f369894e);
        arrayList.add(i4.k.f369895f);
        arrayList.add(i4.k.f369896g);
        arrayList.add(i4.k.f369897h);
        arrayList.add(i4.k.f369898i);
    }

    public android.os.AsyncTask a(i4.h hVar) {
        if (hVar != null) {
            return new i4.e(this, hVar).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, this.f369873a);
        }
        throw new java.lang.IllegalArgumentException("listener can not be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i4.j b() {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.f.b():i4.j");
    }
}
