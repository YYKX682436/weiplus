package bp4;

/* loaded from: classes5.dex */
public final class o1 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f23307f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f23308g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f23309h;

    /* renamed from: i, reason: collision with root package name */
    public int f23310i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23307f = parent;
        this.f23308g = parent.getContext();
        this.f23309h = jz5.h.b(new bp4.n1(this));
        this.f23310i = -1;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.jgg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        z((android.view.ViewGroup) findViewById, com.tencent.mm.R.raw.icons_filled_crop, com.tencent.mm.R.string.ctr);
        android.view.View findViewById2 = parent.findViewById(com.tencent.mm.R.id.jgo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        z((android.view.ViewGroup) findViewById2, com.tencent.mm.R.raw.icons_filled_sticker, com.tencent.mm.R.string.cts);
        android.view.View findViewById3 = parent.findViewById(com.tencent.mm.R.id.jhh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        z((android.view.ViewGroup) findViewById3, com.tencent.mm.R.raw.icons_filled_text, com.tencent.mm.R.string.ctu);
        android.view.View findViewById4 = parent.findViewById(com.tencent.mm.R.id.jhg);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        z((android.view.ViewGroup) findViewById4, com.tencent.mm.R.raw.icons_outline_change_speed, com.tencent.mm.R.string.ctt);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        ju3.d0 d0Var = this.f465332d;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jgg) {
            ju3.c0 c0Var = ju3.c0.f301883j2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("EDIT_VLOG_SELECT_TRACK", this.f23310i);
            d0Var.w(c0Var, bundle);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jgo) {
            ju3.d0.k(d0Var, ju3.c0.I, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jhh) {
            ju3.d0.k(d0Var, ju3.c0.K, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jhg) {
            ju3.d0.k(d0Var, ju3.c0.f301888m2, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void reset() {
        this.f23310i = -1;
        setVisibility(4);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        ((android.view.ViewGroup) ((jz5.n) this.f23309h).getValue()).setVisibility(i17);
    }

    public final void z(android.view.ViewGroup viewGroup, int i17, int i18) {
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc);
        android.content.Context context = this.f23308g;
        textView.setText(i65.a.r(context, i18));
        ((android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.h5n)).setImageDrawable(com.tencent.mm.ui.uk.e(context, i17, -1));
        viewGroup.setOnClickListener(this);
    }
}
