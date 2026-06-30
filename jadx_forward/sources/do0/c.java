package do0;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p831x5b09653.C10840x64c8cbec f323600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f323601e;

    public c(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p831x5b09653.C10840x64c8cbec c10840x64c8cbec, android.content.Context context) {
        this.f323600d = c10840x64c8cbec;
        this.f323601e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/debug/LiveDebugView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p831x5b09653.C10840x64c8cbec c10840x64c8cbec = this.f323600d;
        int visibility = c10840x64c8cbec.f150104d.getVisibility();
        android.content.Context context = this.f323601e;
        if (visibility == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.Button");
            ((android.widget.Button) view).setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.gcg));
            c10840x64c8cbec.f150104d.setVisibility(4);
            c10840x64c8cbec.f150105e.setVisibility(4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.Button");
            ((android.widget.Button) view).setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.gcf));
            c10840x64c8cbec.f150104d.setVisibility(0);
            c10840x64c8cbec.f150105e.setVisibility(0);
        }
        yj0.a.h(this, "com/tencent/mm/live/core/debug/LiveDebugView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
