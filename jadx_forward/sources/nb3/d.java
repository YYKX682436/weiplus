package nb3;

/* loaded from: classes9.dex */
public class d extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f417576e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.LayoutInflater f417577f;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f417575d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final int f417578g = 1;

    public d(android.content.Context context) {
        this.f417576e = context;
        this.f417577f = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f417575d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.vu3) this.f417575d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        nb3.c cVar;
        if (view == null) {
            view = this.f417577f.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bv7, viewGroup, false);
            cVar = new nb3.c(this);
            cVar.f417566a = view.findViewById(com.p314xaae8f345.mm.R.id.m7g);
            cVar.f417567b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.j6l);
            cVar.f417568c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6p);
            cVar.f417569d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6q);
            cVar.f417570e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6j);
            cVar.f417571f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6k);
            cVar.f417572g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6r);
            cVar.f417573h = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.j6m);
            cVar.f417574i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6n);
            view.setTag(cVar);
        } else {
            cVar = (nb3.c) view.getTag();
        }
        r45.vu3 vu3Var = (r45.vu3) this.f417575d.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(cVar.f417567b, vu3Var.f470114g, vu3Var.f470116i);
        cVar.f417571f.setVisibility(8);
        android.widget.TextView textView = cVar.f417568c;
        java.lang.String str = vu3Var.f470113f;
        android.content.Context context = this.f417576e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(context, textView, str);
        cVar.f417570e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gna, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(vu3Var.f470111d / 100.0d)));
        cVar.f417569d.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f(context, vu3Var.f470112e * 1000));
        cVar.f417569d.setVisibility(0);
        cVar.f417572g.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vu3Var.f470117m)) {
            cVar.f417573h.setVisibility(8);
            cVar.f417574i.setVisibility(8);
        } else {
            cVar.f417574i.setText(vu3Var.f470117m);
            if (this.f417578g == 2) {
                cVar.f417573h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_a);
            } else {
                cVar.f417573h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c99);
            }
            cVar.f417573h.setVisibility(0);
            cVar.f417574i.setVisibility(0);
        }
        return view;
    }
}
