package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.e f289029d;

    public b(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.e eVar) {
        this.f289029d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/ADBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.e eVar = this.f289029d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.f fVar = eVar.f289031m;
        if (fVar != null && eVar.f289034p != null) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.g gVar = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.g) fVar.f289036o.get(0);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.d dVar = eVar.f289034p;
            p35.b bVar = gVar.f289039a;
            java.lang.String str = bVar.f433240a;
            java.lang.String str2 = bVar.f433247h;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.c cVar = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.c) dVar;
            cVar.getClass();
            p35.b.a();
            ((e21.z0) c01.d9.b().w()).c(new e21.u(2, str));
            ((com.p314xaae8f345.mm.app.p622xc5476f33.j) o25.z1.a()).c((android.content.Context) cVar.f289030a.f484375g.get(), str2, true, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/ADBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
