package do0;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p831x5b09653.C10840x64c8cbec f323598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f323599e;

    public b(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p831x5b09653.C10840x64c8cbec c10840x64c8cbec, android.content.Context context) {
        this.f323598d = c10840x64c8cbec;
        this.f323599e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/debug/LiveDebugView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p831x5b09653.C10840x64c8cbec c10840x64c8cbec = this.f323598d;
        int currentTextColor = c10840x64c8cbec.f150104d.getCurrentTextColor();
        android.content.Context context = this.f323599e;
        if (currentTextColor == i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3)) {
            c10840x64c8cbec.f150104d.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            c10840x64c8cbec.f150105e.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        } else {
            c10840x64c8cbec.f150104d.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
            c10840x64c8cbec.f150105e.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        }
        yj0.a.h(this, "com/tencent/mm/live/core/debug/LiveDebugView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
