package cx2;

/* loaded from: classes9.dex */
public class m extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f306080d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f306081e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f306082f;

    public m(android.content.Context context, java.util.List list, java.util.List list2) {
        this.f306080d = context;
        this.f306081e = list2;
        this.f306082f = list;
    }

    public final cx2.l a(android.view.View view) {
        cx2.l lVar = new cx2.l(null);
        lVar.f306078a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bgw);
        lVar.f306079b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bgz);
        view.setTag(lVar);
        return lVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f306081e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f306081e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        cx2.l lVar;
        android.content.Context context = this.f306080d;
        if (view == null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569934sa, null);
            lVar = a(view);
        } else {
            lVar = (cx2.l) view.getTag();
            if (lVar == null) {
                lVar = a(view);
            }
        }
        java.util.List list = this.f306081e;
        int size = list.size() % 4;
        if (i17 >= 0 && i17 < list.size()) {
            java.util.List list2 = this.f306082f;
            if (i17 < list2.size()) {
                lVar.f306078a.setVisibility(0);
                lVar.f306079b.setVisibility(0);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(lVar.f306078a, (java.lang.String) list2.get(i17), null);
                lVar.f306079b.setText((java.lang.CharSequence) list.get(i17));
                lVar.f306079b.setText(((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, (java.lang.CharSequence) list.get(i17)));
                if (list.size() <= 12 || i17 < list.size() - size) {
                    lVar.f306079b.setPadding(0, 0, 0, 0);
                } else {
                    lVar.f306079b.setPadding(0, 0, 0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561162b4));
                }
            }
        }
        return view;
    }
}
