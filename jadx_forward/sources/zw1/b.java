package zw1;

/* loaded from: classes9.dex */
public class b extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f558113d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f558114e = new java.util.ArrayList();

    public b(android.content.Context context) {
        this.f558113d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f558114e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f558114e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f558113d;
        if (view == null) {
            view = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570164z1, viewGroup, false);
            view.setTag(new zw1.a(view));
        }
        ww1.g gVar = (ww1.g) ((java.util.ArrayList) this.f558114e).get(i17);
        zw1.a aVar = (zw1.a) view.getTag();
        aVar.f558100a.setText(new java.text.SimpleDateFormat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9i)).format(new java.util.Date(gVar.f531722c * 1000)));
        aVar.f558101b.setText(ww1.d0.b(gVar.f531724e));
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f531723d);
        android.widget.TextView textView = aVar.f558102c;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setText(gVar.f531723d);
            textView.setVisibility(0);
        }
        return view;
    }
}
