package ox0;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 f431081d;

    public d(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575) {
        this.f431081d = c10986x82320575;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.k5(m7Var, null), 3, null);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575 = this.f431081d;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63 = c10986x82320575.f151173p;
        if (c4023x59e5ad63 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
            throw null;
        }
        sg.a m32753xea2eed26 = c4023x59e5ad63.m32753xea2eed26();
        int i17 = m32753xea2eed26 == null ? -1 : ox0.c.f431080a[m32753xea2eed26.ordinal()];
        sg.a aVar = sg.a.Horizontal;
        if (i17 != 1) {
            if (i17 == 2) {
                aVar = sg.a.None;
            } else if (i17 == 3) {
                aVar = sg.a.HorizontalAndVertical;
            } else if (i17 == 4) {
                aVar = sg.a.Vertical;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Flip, ");
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad632 = c10986x82320575.f151173p;
        if (c4023x59e5ad632 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
            throw null;
        }
        sb6.append(c4023x59e5ad632.m32753xea2eed26());
        sb6.append(" -> ");
        sb6.append(aVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropView", sb6.toString());
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad633 = c10986x82320575.f151173p;
        if (c4023x59e5ad633 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
            throw null;
        }
        c4023x59e5ad633.f129439d = aVar;
        c10986x82320575.d();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
