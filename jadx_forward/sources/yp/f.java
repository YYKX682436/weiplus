package yp;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final yp.f f545911a = new yp.f();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f545912b = jz5.h.a(jz5.i.f384362d, yp.e.f545910d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f545913c = new java.lang.Object();

    public final java.util.ArrayList a(int i17) {
        jz5.g gVar = f545912b;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((android.util.SparseArray) gVar.mo141623x754a37bb()).get(i17);
        if (arrayList != null) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        ((android.util.SparseArray) gVar.mo141623x754a37bb()).put(i17, arrayList2);
        return arrayList2;
    }

    public final void c(int i17, yp.o viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        synchronized (f545913c) {
            java.util.ArrayList a17 = f545911a.a(i17);
            a17.add(viewHolder);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuHolderPool", "recycleDanamku: size=" + a17.size() + ", itemType=" + i17);
        }
    }

    public final yp.o a(int i17, yp.p render) {
        yp.o oVar;
        yp.o oVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(render, "render");
        synchronized (f545913c) {
            java.util.ArrayList a17 = f545911a.a(i17);
            oVar = a17.isEmpty() ^ true ? (yp.o) fp.l.a(a17) : null;
        }
        if (oVar == null) {
            oVar2 = render.m(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(oVar2, "onCreateViewHolder(...)");
        } else {
            oVar2 = oVar;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getViewHolder: itemType=");
        sb6.append(i17);
        sb6.append(", holder=");
        sb6.append(oVar2);
        sb6.append(", fromCache: ");
        sb6.append(oVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuHolderPool", sb6.toString());
        return oVar2;
    }
}
