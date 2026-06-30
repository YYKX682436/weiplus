package dy0;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 f326084d;

    public d(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 c10994x5f336d41) {
        this.f326084d = c10994x5f336d41;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dy0.j jVar = this.f326084d.f151214n;
        if (jVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            jVar.a(view, dy0.a.f326072d);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
