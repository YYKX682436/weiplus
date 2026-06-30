package pw3;

/* loaded from: classes8.dex */
public class h extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f440237d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f440238e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f440239f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f440240g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Filter f440241h;

    public h(android.content.Context context, java.util.List list) {
        this.f440240g = context;
        this.f440237d = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f440238e.size();
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f440241h == null) {
            this.f440241h = new pw3.f(this, null);
        }
        return this.f440241h;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f440238e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f440240g;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569717ju, viewGroup, false);
            pw3.g gVar = new pw3.g(this, null);
            gVar.f440234a = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.f565004az2);
            gVar.f440235b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565006az4);
            gVar.f440236c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565005az3);
            view.setTag(gVar);
        }
        pw3.g gVar2 = (pw3.g) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 c17100xa183cf65 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65) getItem(i17);
        android.util.Pair pair = (android.util.Pair) ((java.util.ArrayList) this.f440239f).get(i17);
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        android.text.SpannableString spannableString = new android.text.SpannableString(c17100xa183cf65.f238008i);
        spannableString.setSpan(foregroundColorSpan, ((java.lang.Integer) pair.first).intValue(), ((java.lang.Integer) pair.second).intValue(), 18);
        gVar2.f440234a.m75396xca029dad(c17100xa183cf65.f238005f);
        gVar2.f440235b.setText(spannableString);
        gVar2.f440236c.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aev, c17100xa183cf65.f238006g, c17100xa183cf65.f238004e));
        return view;
    }
}
