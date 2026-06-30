package fh4;

/* loaded from: classes4.dex */
public class g extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f344227d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f344228e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f344229f;

    public g(android.content.Context context) {
        this.f344228e = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f344227d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f344227d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fh4.f fVar;
        java.lang.String str = (java.lang.String) this.f344227d.get(i17);
        if (view == null) {
            view = android.view.View.inflate(this.f344228e, com.p314xaae8f345.mm.R.C30864xbddafb2a.cxp, null);
            fVar = new fh4.f(this);
            fVar.f344225a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hke);
            fVar.f344226b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oog);
            view.setTag(fVar);
        } else {
            fVar = (fh4.f) view.getTag();
        }
        fVar.f344225a.setBackgroundResource(str.equals(this.f344229f) ? com.p314xaae8f345.mm.R.C30861xcebc809e.bnl : 0);
        fVar.f344226b.setVisibility(8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(fVar.f344225a, str, true);
        return view;
    }
}
