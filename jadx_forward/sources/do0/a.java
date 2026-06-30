package do0;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p831x5b09653.C10840x64c8cbec f323597d;

    public a(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p831x5b09653.C10840x64c8cbec c10840x64c8cbec) {
        this.f323597d = c10840x64c8cbec;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/debug/LiveDebugView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(this.f323597d.f150104d.getText());
        yj0.a.h(this, "com/tencent/mm/live/core/debug/LiveDebugView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
