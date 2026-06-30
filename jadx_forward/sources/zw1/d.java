package zw1;

/* loaded from: classes9.dex */
public class d extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f558132d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f558133e = new java.util.ArrayList();

    public d(android.content.Context context) {
        this.f558132d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f558133e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (ww1.n1) ((java.util.ArrayList) this.f558133e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f558132d;
        if (view == null) {
            view = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570166z3, viewGroup, false);
            view.setTag(new zw1.c(view));
        }
        zw1.c cVar = (zw1.c) view.getTag();
        ww1.n1 n1Var = (ww1.n1) ((java.util.ArrayList) this.f558133e).get(i17);
        cVar.f558123a.setText(ww1.d0.a(context, n1Var.f531782b, n1Var.f531781a));
        cVar.f558124b.setText(ww1.d0.b(n1Var.f531784d));
        cVar.f558125c.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9s, java.lang.Integer.valueOf(n1Var.f531783c)));
        return view;
    }
}
