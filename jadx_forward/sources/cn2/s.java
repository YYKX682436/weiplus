package cn2;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14422x564c9a4b f125144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f125145e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14422x564c9a4b c14422x564c9a4b, android.graphics.Bitmap bitmap) {
        this.f125144d = c14422x564c9a4b;
        this.f125145e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14422x564c9a4b c14422x564c9a4b = this.f125144d;
        c14422x564c9a4b.getClass();
        android.graphics.Bitmap bitmap = this.f125145e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        cn2.j1 j1Var = c14422x564c9a4b.f199455e;
        if (j1Var == null) {
            j1Var = new cn2.j1(c14422x564c9a4b);
        }
        c14422x564c9a4b.f199455e = j1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j1Var.f125080b, "play!");
        j1Var.f125082d = bitmap;
        if (j1Var.f125081c) {
            return;
        }
        j1Var.f125081c = true;
        android.view.View view = j1Var.f125079a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/LightStarProxy", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/LightStarProxy", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j1Var.f125079a.post(new cn2.g1(j1Var));
    }
}
