package ox0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 f431079d;

    public b(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575) {
        this.f431079d = c10986x82320575;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.n5(m7Var, null), 3, null);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575 = this.f431079d;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63 = c10986x82320575.f151173p;
        if (c4023x59e5ad63 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
            throw null;
        }
        sg.b m32756xc48060b7 = c4023x59e5ad63.m32756xc48060b7();
        int i17 = m32756xc48060b7 == null ? -1 : ox0.a.f431078a[m32756xc48060b7.ordinal()];
        sg.b bVar = sg.b.CW90;
        if (i17 != 1) {
            if (i17 == 2) {
                bVar = sg.b.CW180;
            } else if (i17 == 3) {
                bVar = sg.b.CCW90;
            } else if (i17 == 4) {
                bVar = sg.b.None;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Rotate, ");
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad632 = c10986x82320575.f151173p;
        if (c4023x59e5ad632 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
            throw null;
        }
        sb6.append(c4023x59e5ad632.m32756xc48060b7());
        sb6.append("-> ");
        sb6.append(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropView", sb6.toString());
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad633 = c10986x82320575.f151173p;
        if (c4023x59e5ad633 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
            throw null;
        }
        c4023x59e5ad633.f129438c = bVar;
        c10986x82320575.d();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
