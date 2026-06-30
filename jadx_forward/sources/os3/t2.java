package os3;

/* loaded from: classes8.dex */
public class t2 extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f429742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f429743e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f429744f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f429745g;

    /* renamed from: h, reason: collision with root package name */
    public os3.r2 f429746h;

    public t2(android.content.Context context, java.util.List list) {
        this.f429744f = context;
        this.f429742d = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f429742d.size();
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f429746h == null) {
            this.f429746h = new os3.r2(this, null);
        }
        return this.f429746h;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (ks3.u) this.f429742d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        android.content.Context context = this.f429744f;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cbh, null);
            os3.s2 s2Var = new os3.s2(this, null);
            s2Var.f429727a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ldx);
            s2Var.f429728b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ldu);
            s2Var.f429729c = (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.ldy);
            view2.setTag(s2Var);
        } else {
            view2 = (android.view.ViewGroup) view;
        }
        ks3.u uVar = (ks3.u) this.f429742d.get(i17);
        os3.s2 s2Var2 = (os3.s2) view2.getTag();
        s2Var2.f429727a.setText(uVar.f393283e);
        s2Var2.f429728b.setText(uVar.f393284f);
        s2Var2.f429729c.setVisibility(8);
        view2.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        return view2;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
