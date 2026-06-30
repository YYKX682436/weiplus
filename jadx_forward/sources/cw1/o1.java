package cw1;

/* loaded from: classes10.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a f304726d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a activityC13109x1b5b413a) {
        this.f304726d = activityC13109x1b5b413a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.setEnabled(false);
        yv1.i0 i0Var = this.f304726d.f177207d.f547533d;
        if (i0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CleanService", "Cancel clean tasks triggered");
            i0Var.f547605d.m108007xae7a2e7a();
            aw1.l0 l0Var = aw1.l0.f96101a;
            synchronized (l0Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "stopCompressOriginalMediaTaskAsync");
                if (aw1.l0.f96107g) {
                    l0Var.e(false);
                    android.os.CancellationSignal cancellationSignal = aw1.l0.f96110j;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                    aw1.l0.f96110j = null;
                    d11.d dVar = aw1.l0.f96120t;
                    if (dVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoTransController");
                        throw null;
                    }
                    dVar.f307190b.a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "stopCompressOriginalMediaTaskAsync, done");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "stopCompressOriginalMediaTaskAsync task not running");
                }
            }
            bw1.f fVar = i0Var.f547604c;
            if (fVar != null) {
                fVar.a(jz5.f0.f384359a);
            }
            i0Var.d(true, false);
        }
        mt1.b0.s(35, 0L, new java.lang.Long[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
