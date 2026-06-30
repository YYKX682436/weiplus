package l51;

/* loaded from: classes12.dex */
public class f implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f398096d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f398097e;

    /* renamed from: f, reason: collision with root package name */
    public final int f398098f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11041x8f29e5e1 f398099g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f398100h;

    public f(java.lang.String str, java.io.File file, java.util.List list, int i17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11041x8f29e5e1 interfaceC11041x8f29e5e1, java.lang.String str2) {
        this.f398098f = -1;
        this.f398097e = list;
        this.f398096d = file;
        this.f398098f = i17;
        this.f398099g = interfaceC11041x8f29e5e1;
        this.f398100h = str2;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() {
        java.util.List list = this.f398097e;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            l51.g gVar = new l51.g();
            l51.d[] dVarArr = new l51.d[list.size()];
            list.toArray(dVarArr);
            gVar.a(dVarArr, this.f398096d.getAbsolutePath(), this.f398099g, this.f398100h);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("HdiffApk-SZServer", "multi thread，pid = " + this.f398098f + "\n,entry count: " + arrayList.size() + "\n，cost time  = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception unused) {
            return java.lang.Boolean.FALSE;
        }
    }
}
