package bx3;

/* loaded from: classes.dex */
public final class a extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f36317d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f36318e;

    public a(android.content.Context context, java.util.List datas) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(datas, "datas");
        this.f36317d = context;
        this.f36318e = datas;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f36318e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f36318e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f36317d;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cfi, (android.view.ViewGroup) null);
        }
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oko) : null;
        if (textView != null) {
            textView.setText((java.lang.String) this.f36318e.get(i17));
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = (int) ((100.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            textView.setLayoutParams(layoutParams2);
            if (i17 % 2 == 0) {
                textView.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aar));
            } else {
                textView.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
            }
        }
        kotlin.jvm.internal.o.d(view);
        return view;
    }
}
