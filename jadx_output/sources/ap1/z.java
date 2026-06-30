package ap1;

/* loaded from: classes5.dex */
public final class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f12768d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12769e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f12770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f12771g;

    public z(ap1.i0 i0Var, java.util.List items, boolean z17) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f12771g = i0Var;
        this.f12768d = items;
        this.f12769e = z17;
        this.f12770f = new com.tencent.mm.sdk.platformtools.r2(128);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f12768d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ap1.c2 c2Var;
        ap1.b0 holder = (ap1.b0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        ap1.a0 a0Var = (ap1.a0) this.f12768d.get(i17);
        ap1.i0 i0Var = this.f12771g;
        j75.f U6 = i0Var.U6();
        holder.f12606d.setChecked((U6 == null || (c2Var = (ap1.c2) U6.getState()) == null) ? false : c2Var.d(a0Var.f12600a));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(holder.f12607e, a0Var.f12600a, null);
        android.widget.TextView textView = holder.f12608f;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f12770f;
        java.lang.String str = a0Var.f12600a;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) r2Var.get(str);
        if (charSequence == null) {
            charSequence = oo1.g.f347143a.a(context, str);
            r2Var.put(str, charSequence);
        }
        textView.setText(charSequence);
        if (this.f12769e) {
            holder.f12609g.setText(com.tencent.mm.sdk.platformtools.t8.S1(a0Var.f12602c));
        }
        i0Var.W6(a0Var, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.en9, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        ap1.b0 b0Var = new ap1.b0(inflate);
        b0Var.f12609g.setVisibility(this.f12769e ? 0 : 8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = b0Var.f12610h;
        weImageView.setVisibility(8);
        android.view.View view = b0Var.itemView;
        ap1.i0 i0Var = this.f12771g;
        view.setOnClickListener(new ap1.x(b0Var, i0Var, this));
        weImageView.setOnClickListener(new ap1.y(i0Var));
        return b0Var;
    }
}
