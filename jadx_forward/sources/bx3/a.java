package bx3;

/* loaded from: classes.dex */
public final class a extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f117850d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f117851e;

    public a(android.content.Context context, java.util.List datas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(datas, "datas");
        this.f117850d = context;
        this.f117851e = datas;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f117851e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f117851e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f117850d;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cfi, (android.view.ViewGroup) null);
        }
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oko) : null;
        if (textView != null) {
            textView.setText((java.lang.String) this.f117851e.get(i17));
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = (int) ((100.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            textView.setLayoutParams(layoutParams2);
            if (i17 % 2 == 0) {
                textView.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aar));
            } else {
                textView.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        return view;
    }
}
