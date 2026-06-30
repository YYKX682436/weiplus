package mz4;

/* loaded from: classes12.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.PopupWindow f414753a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f414754b;

    /* renamed from: c, reason: collision with root package name */
    public mz4.z f414755c;

    public a0(android.content.Context context, android.view.View view) {
        this.f414754b = view;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_d, (android.view.ViewGroup) null);
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2, false);
        this.f414753a = popupWindow;
        popupWindow.setClippingEnabled(false);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.plc).setOnClickListener(new mz4.v(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.pl_).setOnClickListener(new mz4.w(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.plb).setOnClickListener(new mz4.x(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.plk).setOnClickListener(new mz4.y(this));
    }
}
