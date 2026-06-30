package vx2;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx2.k f522771d;

    public c(vx2.k kVar) {
        this.f522771d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$attachFastSeek$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vx2.k kVar = this.f522771d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = kVar.f522786e;
        if (c15188xd8bd4bd != null) {
            long mo56695x7723e6ff = c15188xd8bd4bd.mo56695x7723e6ff();
            long mo56685x3d7f3f1d = c15188xd8bd4bd.mo56685x3d7f3f1d();
            vx2.k.b(kVar, mo56685x3d7f3f1d, mo56695x7723e6ff - mo56685x3d7f3f1d < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d ? mo56695x7723e6ff - 1000 : 10000 + mo56685x3d7f3f1d, mo56695x7723e6ff);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$attachFastSeek$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
