package r35;

/* loaded from: classes9.dex */
public class n2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f450745d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f450746e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f450747f;

    public n2(android.content.Context context, java.util.List list, java.util.List list2) {
        this.f450745d = context;
        this.f450746e = list2;
        this.f450747f = list;
    }

    public final r35.m2 a(android.view.View view) {
        r35.m2 m2Var = new r35.m2(null);
        m2Var.f450723a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bgw);
        m2Var.f450724b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bgz);
        view.setTag(m2Var);
        return m2Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f450746e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f450746e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        r35.m2 m2Var;
        android.content.Context context = this.f450745d;
        if (view == null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569934sa, null);
            view.findViewById(com.p314xaae8f345.mm.R.id.bgw).setImportantForAccessibility(2);
            m2Var = a(view);
        } else {
            m2Var = (r35.m2) view.getTag();
            if (m2Var == null) {
                m2Var = a(view);
            }
        }
        java.util.List list = this.f450746e;
        int size = list.size() % 4;
        if (i17 >= 0 && i17 < list.size()) {
            java.util.List list2 = this.f450747f;
            if (i17 < list2.size()) {
                m2Var.f450723a.setVisibility(0);
                m2Var.f450724b.setVisibility(0);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(m2Var.f450723a, (java.lang.String) list2.get(i17), null);
                m2Var.f450724b.setText((java.lang.CharSequence) list.get(i17));
                m2Var.f450724b.setText(((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, (java.lang.CharSequence) list.get(i17)));
                if (list.size() <= 12 || i17 < list.size() - size) {
                    m2Var.f450724b.setPadding(0, 0, 0, 0);
                } else {
                    m2Var.f450724b.setPadding(0, 0, 0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561162b4));
                }
            }
        }
        return view;
    }
}
