package cm2;

/* loaded from: classes3.dex */
public final class s extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f43383e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f43384f;

    public s(com.tencent.mm.plugin.finder.live.plugin.l basePlugin, qo0.c statusMonitor) {
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f43383e = basePlugin;
        this.f43384f = statusMonitor;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b0w;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.CharSequence charSequence;
        java.lang.String string;
        java.lang.String str;
        java.lang.String str2;
        cm2.p item = (cm2.p) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nz_);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nzg);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nza);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kvq);
        r45.fr1 fr1Var = item.f43377h;
        java.lang.String str3 = "";
        boolean z18 = true;
        if (textView != null) {
            if (fr1Var == null || (str2 = fr1Var.getString(1)) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        if (textView2 != null) {
            if (fr1Var == null || (str = fr1Var.getString(2)) == null) {
                str = "";
            }
            textView2.setText(str);
        }
        if (textView3 != null) {
            if (fr1Var != null && (string = fr1Var.getString(3)) != null) {
                str3 = string;
            }
            textView3.setText(str3);
        }
        java.lang.Integer valueOf = fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(0)) : null;
        int b17 = i65.a.b(holder.f293121e, 6);
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
            charSequence = null;
            textView4.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            textView4.setText(holder.itemView.getContext().getResources().getString(com.tencent.mm.R.string.f491398cz2));
            textView4.setBackgroundResource(com.tencent.mm.R.drawable.a0x);
            int i19 = b17 * 2;
            textView4.setPadding(i19, b17, i19, b17);
        } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 4)) {
            textView4.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5));
            textView4.setText(holder.itemView.getContext().getResources().getString(com.tencent.mm.R.string.e4x));
            charSequence = null;
            textView4.setBackground(null);
            textView4.setPadding(0, 0, 0, 0);
        } else {
            textView4.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            textView4.setText(holder.itemView.getContext().getResources().getString(com.tencent.mm.R.string.f491398cz2));
            textView4.setBackgroundResource(com.tencent.mm.R.drawable.a0x);
            int i27 = b17 * 2;
            textView4.setPadding(i27, b17, i27, b17);
            charSequence = null;
        }
        textView4.setOnClickListener(new cm2.r(fr1Var, holder, item, this));
        java.lang.CharSequence text = textView2 != null ? textView2.getText() : charSequence;
        if (text == null || text.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        java.lang.CharSequence text2 = textView3 != null ? textView3.getText() : charSequence;
        if (text2 == null || text2.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
        }
        if (textView != null) {
            charSequence = textView.getText();
        }
        if (charSequence != null && charSequence.length() != 0) {
            z18 = false;
        }
        if (z18) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
