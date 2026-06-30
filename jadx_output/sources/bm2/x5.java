package bm2;

/* loaded from: classes3.dex */
public final class x5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f22430d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f22431e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f22432f;

    public x5(yz5.l lVar, yz5.l lVar2) {
        this.f22430d = lVar;
        this.f22431e = lVar2;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList linkedList = this.f22432f;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        jz5.f0 f0Var;
        bm2.t5 holder = (bm2.t5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.itemView.getContext();
        java.util.LinkedList linkedList = this.f22432f;
        r45.h32 h32Var = linkedList != null ? (r45.h32) linkedList.get(i17) : null;
        if (h32Var != null) {
            r45.h32 h32Var2 = h32Var;
            holder.f22310d.setText(zl2.q4.t(zl2.q4.f473933a, h32Var2, com.tencent.mm.R.string.e1u, false, false, false, 20, null));
            com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView noticeBindItemMiniInfoView = holder.f22312f;
            kotlin.jvm.internal.o.f(noticeBindItemMiniInfoView, "<get-bindItemMiniInfoView>(...)");
            boolean a17 = com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView.a(noticeBindItemMiniInfoView, h32Var2, false, false, false, 14, null);
            android.widget.TextView textView = holder.f22311e;
            if (a17) {
                textView.setVisibility(8);
            } else {
                noticeBindItemMiniInfoView.setVisibility(8);
                java.lang.String string = h32Var.getString(3);
                if (!(true ^ (string == null || string.length() == 0))) {
                    string = null;
                }
                if (string != null) {
                    textView.setVisibility(0);
                    textView.setText(h32Var.getString(3));
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    textView.setVisibility(8);
                }
            }
            holder.f22313g.setText(context.getString(com.tencent.mm.R.string.dyx, zl2.r4.S(zl2.r4.f473950a, h32Var.getInteger(5), 0, 2, null)));
            yz5.l lVar = this.f22431e;
            if (lVar != null) {
                boolean booleanValue = ((java.lang.Boolean) lVar.invoke(h32Var.getString(4))).booleanValue();
                android.view.View view = holder.f22314h;
                android.widget.TextView textView2 = holder.f22315i;
                if (booleanValue) {
                    textView2.setText(context.getString(com.tencent.mm.R.string.dyw));
                    textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
                    view.setOnClickListener(null);
                } else {
                    textView2.setText(context.getString(com.tencent.mm.R.string.dyv));
                    textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                    view.setOnClickListener(new bm2.v5(this, h32Var));
                }
            }
            holder.itemView.setOnClickListener(new bm2.w5(context, h32Var));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.avp, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.t5(this, inflate);
    }
}
