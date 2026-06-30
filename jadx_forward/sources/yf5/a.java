package yf5;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f543377a = -1;

    /* renamed from: b, reason: collision with root package name */
    public android.util.SparseArray f543378b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashMap f543379c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f543380d = kz5.p0.f395529d;

    public final void a(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f543377a = list.size();
        android.util.SparseArray sparseArray = new android.util.SparseArray(list.size());
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            yf5.x xVar = (yf5.x) obj;
            java.lang.String h17 = xVar.f543528d.h1();
            if (h17 == null) {
                h17 = "";
            }
            sparseArray.put(i17, h17);
            java.lang.String h18 = xVar.f543528d.h1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "getUsername(...)");
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 conv = xVar.f543528d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(conv, "conv");
            hashMap.put(h18, conv);
            arrayList.add(xVar);
            i17 = i18;
        }
        this.f543378b = sparseArray;
        this.f543379c = hashMap;
        this.f543380d = arrayList;
    }
}
