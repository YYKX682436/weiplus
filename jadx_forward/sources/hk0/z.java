package hk0;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: i, reason: collision with root package name */
    public int f363390i;

    /* renamed from: j, reason: collision with root package name */
    public int f363391j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f363392k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f363393l;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f363382a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f363383b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f363384c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f363385d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f363386e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f363387f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f363388g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f363389h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f363394m = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.afi);

    public final java.lang.String a(hk0.h brushType, xk0.d doodleItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brushType, "brushType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doodleItem, "doodleItem");
        java.lang.String str = "BRUSH_" + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addBrushData >> type: " + brushType + ", editId: " + str);
        java.util.LinkedList linkedList = this.f363382a;
        hk0.l lVar = hk0.l.f363296d;
        linkedList.add(new hk0.k(lVar, str));
        this.f363385d.put(str, new hk0.c(lVar, brushType, doodleItem, null, 8, null));
        return str;
    }

    public final java.lang.String b(hk0.z0 mosaicType, xk0.k mosaicItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mosaicType, "mosaicType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mosaicItem, "mosaicItem");
        java.lang.String str = "MOSAIC_" + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addMosaicData >> type: " + mosaicType + ", mosaicItem: " + mosaicItem);
        java.util.LinkedList linkedList = this.f363382a;
        hk0.l lVar = hk0.l.f363297e;
        linkedList.add(new hk0.k(lVar, str));
        this.f363386e.put(str, new hk0.w0(lVar, mosaicType, mosaicItem, null, 8, null));
        return str;
    }

    public final hk0.c c(java.lang.String editId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
        return (hk0.c) this.f363385d.get(editId);
    }

    public final hk0.m d(java.lang.String editId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
        return (hk0.m) this.f363388g.get(editId);
    }

    public final hk0.w0 e(java.lang.String editId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
        return (hk0.w0) this.f363386e.get(editId);
    }

    public final hk0.a1 f(java.lang.String editId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
        return (hk0.a1) this.f363387f.get(editId);
    }

    public final hk0.n g(java.lang.String editId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
        if (r26.n0.B(editId, "EMOJI", false)) {
            return d(editId);
        }
        if (r26.n0.B(editId, "TEXT", false)) {
            return f(editId);
        }
        return null;
    }

    public final java.lang.String h(hk0.p handleType, xk0.p textItem, java.lang.String str) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleType, "handleType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textItem, "textItem");
        java.lang.String str2 = ((hk0.k) this.f363382a.getLast()).f363291b;
        hk0.a1 a1Var = (hk0.a1) this.f363387f.get(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "updateLastTextData " + handleType + ' ' + str2);
        if (a1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "updateLastTextData " + str2);
            a1Var.f363226c = handleType;
            a1Var.f363231h = textItem;
            textItem.f536499x = str2;
            a1Var.f363232i = str;
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoDataModel", "when artist ready to update but state data is error " + str2);
        }
        return str2;
    }
}
