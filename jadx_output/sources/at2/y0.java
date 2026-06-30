package at2;

/* loaded from: classes3.dex */
public final class y0 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f13778m;

    /* renamed from: n, reason: collision with root package name */
    public if2.d0 f13779n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f13778m = new java.util.ArrayList();
    }

    public static final void Z6(at2.y0 y0Var) {
        if2.d0 d0Var = y0Var.f13779n;
        if (d0Var != null) {
            d0Var.d(8);
        }
        ((mm2.c1) y0Var.business(mm2.c1.class)).N1 = false;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
        y0Var.X6(qo0.b.Z2, bundle);
    }

    public final void a7() {
        if2.d0 d0Var = this.f13779n;
        if (d0Var == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f13778m).iterator();
        while (it.hasNext()) {
            android.widget.TextView textView = (android.widget.TextView) it.next();
            boolean b17 = kotlin.jvm.internal.o.b(textView.getTag(), java.lang.Float.valueOf(((ct2.j) business(ct2.j.class)).B));
            android.view.View view = d0Var.f291105a;
            if (b17) {
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m));
            } else {
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        dt2.a0 a0Var;
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.f486333kx5);
        kotlin.jvm.internal.o.d(viewGroup);
        this.f13779n = new if2.d0(viewGroup, this);
        if (viewGroup.getContext().getResources().getConfiguration().orientation != 2 && (findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f485242h03)) != null) {
            findViewById.setOnClickListener(new at2.w0(this));
        }
        viewGroup.setOnClickListener(new at2.x0(this));
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.nep);
        textView.setTag(java.lang.Float.valueOf(0.5f));
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f13778m;
        arrayList.add(textView);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.neu);
        textView2.setTag(java.lang.Float.valueOf(1.0f));
        arrayList.add(textView2);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ner);
        textView3.setTag(java.lang.Float.valueOf(1.25f));
        arrayList.add(textView3);
        android.widget.TextView textView4 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.nes);
        textView4.setTag(java.lang.Float.valueOf(1.5f));
        arrayList.add(textView4);
        android.widget.TextView textView5 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.net);
        textView5.setTag(java.lang.Float.valueOf(2.0f));
        arrayList.add(textView5);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.widget.TextView) it.next()).setOnClickListener(new at2.v0(this, viewGroup));
        }
        a7();
        float f17 = ((ct2.j) business(ct2.j.class)).B;
        ((ct2.j) business(ct2.j.class)).B = f17;
        at2.u1 u1Var = (at2.u1) R6(at2.u1.class);
        if (u1Var != null && (a0Var = u1Var.f13762q) != null) {
            a0Var.f243158a.setPlaySpeed(f17);
        }
        a7();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        if2.d0 d0Var = this.f13779n;
        if (d0Var != null) {
            d0Var.d(8);
        }
        ((java.util.ArrayList) this.f13778m).clear();
    }
}
