package hw2;

/* loaded from: classes10.dex */
public final class w extends yt3.s3 {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f367109g;

    /* renamed from: h, reason: collision with root package name */
    public final ju3.d0 f367110h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f367111i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f367112m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 closeImg, ju3.d0 finderRecordStatus, android.view.View view) {
        super(closeImg, finderRecordStatus);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeImg, "closeImg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderRecordStatus, "finderRecordStatus");
        this.f367109g = closeImg;
        this.f367110h = finderRecordStatus;
        this.f367111i = view;
        android.content.Context context = closeImg.getContext();
        this.f367112m = context;
        closeImg.setContentDescription(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571541ib));
    }

    @Override // yt3.s3, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordClosePlugin", "RecordClosePlugin close");
        nu3.i iVar = nu3.i.f421751a;
        iVar.d(3);
        iVar.b(3);
        iVar.i(this.f547202f);
        ju3.d0.k(this.f367110h, ju3.c0.S2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.s3, yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        super.mo9067x901b6914(i17);
        android.view.View view = this.f367111i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f367109g.setVisibility(i17);
    }
}
