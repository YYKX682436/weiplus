package dz4;

/* loaded from: classes12.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f326731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.i3 f326732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f326733f;

    public d3(java.util.ArrayList arrayList, dz4.i3 i3Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f326731d = arrayList;
        this.f326732e = i3Var;
        this.f326733f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.i3 i3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f326731d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i3Var = this.f326732e;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            arrayList.add(i3Var.a(str));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f326733f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f391656d = null;
        dz4.n0 n0Var = i3Var.f326839b;
        if (n0Var != null) {
            n0Var.a(arrayList);
        }
    }
}
