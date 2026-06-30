package yt3;

/* loaded from: classes10.dex */
public final class a4 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f546878d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f546879e;

    /* renamed from: f, reason: collision with root package name */
    public yt3.c f546880f;

    /* renamed from: g, reason: collision with root package name */
    public float f546881g;

    public a4(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546878d = view;
        this.f546879e = status;
        this.f546880f = yt3.c.f546907e;
        view.s(com.p314xaae8f345.mm.R.raw.f79657x766371e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchFlashPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordSwitchFlashPlugin", "onClick >> " + this.f546880f);
        yt3.c cVar = this.f546880f;
        yt3.c cVar2 = yt3.c.f546907e;
        if (cVar == cVar2) {
            cVar2 = yt3.c.f546906d;
        }
        this.f546880f = cVar2;
        yt3.c cVar3 = yt3.c.f546906d;
        this.f546878d.s(cVar2 == cVar3 ? com.p314xaae8f345.mm.R.raw.f79658x7c1c1250 : com.p314xaae8f345.mm.R.raw.f79657x766371e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", this.f546880f == cVar3);
        this.f546879e.w(ju3.c0.f383410g, bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setClickFlashLightCount >> ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = nu3.f.f421744b;
        sb6.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
        sb6.append(", ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = nu3.f.f421744b;
        sb6.append(c6355x3a305212 != null ? java.lang.Long.valueOf(c6355x3a305212.f137050m) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305213 = nu3.f.f421744b;
        if (c6355x3a305213 != null) {
            c6355x3a305213.f137050m++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchFlashPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f546878d.setVisibility(i17);
    }
}
