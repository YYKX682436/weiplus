package te2;

/* loaded from: classes5.dex */
public final class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.fa f499438d;

    public ba(te2.fa faVar) {
        this.f499438d = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        te2.fa faVar = this.f499438d;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(faVar.f499541d.getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(faVar.f499545h, "navigationBarHeight:" + c17);
        android.view.ViewGroup.LayoutParams layoutParams = faVar.f499541d.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c17;
    }
}
