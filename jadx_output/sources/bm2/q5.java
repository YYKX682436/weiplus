package bm2;

/* loaded from: classes11.dex */
public final class q5 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.r5 f22257a;

    public q5(bm2.r5 r5Var) {
        this.f22257a = r5Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup parent, android.view.View view) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.avn, parent, false);
        bm2.p5 p5Var = this.f22257a.H;
        kotlin.jvm.internal.o.e(p5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveMultiChatRoomDataItem.FinderLiveMultiChatRoomViewHolder");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.fbp);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        p5Var.f22225a = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.fbt);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        p5Var.f22226b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.fbq);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        p5Var.f22227c = (android.widget.TextView) findViewById3;
        p5Var.f22230f = inflate.findViewById(com.tencent.mm.R.id.mjc);
        android.widget.TextView textView = p5Var.f22227c;
        kotlin.jvm.internal.o.d(textView);
        textView.setVisibility(8);
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.fbs);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        p5Var.f22228d = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.fbr);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.CheckBox");
        p5Var.f22229e = (android.widget.CheckBox) findViewById5;
        inflate.setTag(p5Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View v17, com.tencent.mm.ui.contact.item.d data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(data, "data");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    @Override // com.tencent.mm.ui.contact.item.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.content.Context r22, com.tencent.mm.ui.contact.item.b r23, com.tencent.mm.ui.contact.item.d r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.q5.c(android.content.Context, com.tencent.mm.ui.contact.item.b, com.tencent.mm.ui.contact.item.d, boolean, boolean):void");
    }
}
