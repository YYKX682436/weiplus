package e33;

/* loaded from: classes10.dex */
public class l3 {

    /* renamed from: j, reason: collision with root package name */
    public e33.v2 f328860j;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f328851a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(1, "album-image-gallery-lazy-loader", 1);

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f328852b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f328853c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f328854d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f328855e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public int f328856f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f328857g = new jt0.i(5, new e33.i3(this), e33.l3.class);

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseIntArray f328858h = new android.util.SparseIntArray();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f328859i = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f328861k = false;

    public l3(e33.v2 v2Var) {
        this.f328860j = v2Var;
    }

    public final void a(int i17, android.graphics.Bitmap bitmap) {
        e33.u2 u2Var;
        android.util.SparseArray sparseArray = this.f328852b;
        if (sparseArray.get(i17) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) ((java.lang.ref.WeakReference) sparseArray.get(i17)).get();
        java.lang.String str = (java.lang.String) this.f328854d.get(i17);
        if (bitmap != null && c21524xecd57b9a != null) {
            int hashCode = bitmap.hashCode();
            android.util.SparseIntArray sparseIntArray = this.f328858h;
            int indexOfValue = sparseIntArray.indexOfValue(i17);
            if (indexOfValue >= 0) {
                sparseIntArray.removeAt(indexOfValue);
            }
            sparseIntArray.put(hashCode, i17);
        }
        e33.v2 v2Var = this.f328860j;
        v2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "onImageGalleryLoaded, bigImgPath: %s, bitmap: %s.", str, bitmap);
        v2Var.f329037o.remove(str);
        if (c21524xecd57b9a != null && (u2Var = (e33.u2) c21524xecd57b9a.getTag()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "onImageGalleryLoaded, viewHolder.isImg: %s.", java.lang.Boolean.valueOf(u2Var.f329016a));
            if (bitmap != null) {
                v2Var.q(u2Var, bitmap);
            }
        }
        c(i17);
    }

    public void b(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a, java.lang.String str, int i17) {
        java.util.LinkedList linkedList = this.f328859i;
        if (linkedList.contains(str)) {
            return;
        }
        int hashCode = c21524xecd57b9a.hashCode();
        c(hashCode);
        this.f328853c.put(str, java.lang.Integer.valueOf(hashCode));
        this.f328854d.put(hashCode, str);
        this.f328852b.put(hashCode, new java.lang.ref.WeakReference(c21524xecd57b9a));
        linkedList.add(str);
        d(i17);
    }

    public final void c(int i17) {
        android.util.SparseArray sparseArray = this.f328854d;
        if (sparseArray.get(i17) != null) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            this.f328852b.remove(i17);
            sparseArray.remove(i17);
            this.f328853c.remove(str);
            this.f328855e.remove(i17);
        }
    }

    public final void d(int i17) {
        if (this.f328861k) {
            return;
        }
        java.util.LinkedList linkedList = this.f328859i;
        if (linkedList.size() == 0) {
            return;
        }
        java.lang.String str = (java.lang.String) linkedList.removeLast();
        if (this.f328853c.containsKey(str)) {
            this.f328861k = true;
            this.f328851a.a(new e33.k3(this, str, i17));
        }
    }
}
