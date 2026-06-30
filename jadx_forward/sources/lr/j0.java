package lr;

/* loaded from: classes12.dex */
public final class j0 extends lr.s0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f402066m = 0;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f402067f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f402068g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f402069h;

    /* renamed from: i, reason: collision with root package name */
    public final lr.i0 f402070i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f402067f = itemView.findViewById(com.p314xaae8f345.mm.R.id.dcr);
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.dcs);
        this.f402068g = findViewById;
        this.f402069h = itemView.findViewById(com.p314xaae8f345.mm.R.id.dct);
        this.f402070i = new lr.i0(this);
        itemView.addOnAttachStateChangeListener(new lr.g0(this));
        itemView.setOnClickListener(null);
        findViewById.setOnClickListener(new lr.f0(this));
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        j();
    }

    public final void j() {
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.f179165c) {
            android.view.View view = this.f402067f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f402068g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f402069h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f402067f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f402068g;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f402069h;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
