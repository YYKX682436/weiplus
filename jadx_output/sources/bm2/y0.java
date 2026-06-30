package bm2;

/* loaded from: classes3.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a1 f22440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.w0 f22442f;

    public y0(bm2.a1 a1Var, int i17, bm2.w0 w0Var) {
        this.f22440d = a1Var;
        this.f22441e = i17;
        this.f22442f = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorStickerTextSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        bm2.a1 a1Var = this.f22440d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(a1Var.f21753e, "view holder click too fast,position:" + this.f22441e);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorStickerTextSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int adapterPosition = this.f22442f.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < a1Var.getItemCount()) {
            java.lang.Object obj = a1Var.x().get(adapterPosition);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.h84 h84Var = (r45.h84) obj;
            com.tencent.mars.xlog.Log.i(a1Var.f21753e, "click position:" + adapterPosition + ", select element:" + pm0.b0.g(h84Var));
            a1Var.f21756h = adapterPosition;
            yz5.p pVar = a1Var.f21757i;
            if (pVar != null) {
                pVar.invoke(h84Var, java.lang.Integer.valueOf(adapterPosition));
            }
            a1Var.notifyDataSetChanged();
        } else {
            com.tencent.mars.xlog.Log.i(a1Var.f21753e, "view holder click error,position:" + adapterPosition);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorStickerTextSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
