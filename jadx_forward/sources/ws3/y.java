package ws3;

/* loaded from: classes9.dex */
public class y extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f530729q = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f530732f;

    /* renamed from: g, reason: collision with root package name */
    public ws3.w f530733g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f530734h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f530735i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.AutoCompleteTextView f530736m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd f530737n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f530738o;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f530730d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f530731e = false;

    /* renamed from: p, reason: collision with root package name */
    public ws3.u f530739p = null;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd, java.util.List list) {
        this.f530735i = viewOnFocusChangeListenerC16962x770823dd.getContext();
        this.f530737n = viewOnFocusChangeListenerC16962x770823dd;
        this.f530736m = (android.widget.AutoCompleteTextView) viewOnFocusChangeListenerC16962x770823dd.m67842xd454f3ba();
        this.f530738o = list;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized vs3.a getItem(int i17) {
        if (!this.f530731e) {
            if (i17 >= this.f530730d.size()) {
                return null;
            }
            return (vs3.a) this.f530730d.get(i17);
        }
        if (i17 == 0) {
            return null;
        }
        if (i17 > this.f530730d.size()) {
            return null;
        }
        return (vs3.a) this.f530730d.get(i17 - 1);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f530731e) {
            return this.f530730d.size() + 2;
        }
        if (this.f530730d.size() > 0) {
            return this.f530730d.size() + 1;
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f530733g == null) {
            this.f530733g = new ws3.w(this, null);
        }
        return this.f530733g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (!this.f530731e) {
            return i17 < this.f530730d.size() ? 0 : 1;
        }
        if (i17 == 0) {
            return 2;
        }
        return i17 <= this.f530730d.size() ? 0 : 3;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ws3.x xVar;
        android.widget.ImageView imageView;
        int itemViewType = getItemViewType(i17);
        android.content.Context context = this.f530735i;
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cco, null);
                inflate.setOnClickListener(new ws3.s(this));
                return inflate;
            }
            if (itemViewType == 2) {
                android.view.View inflate2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ccm, null);
                inflate2.setOnClickListener(new ws3.r(this));
                return inflate2;
            }
            if (itemViewType != 3) {
                return view;
            }
            android.view.View inflate3 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cco, null);
            ((android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.lmv)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.gsm);
            inflate3.setOnClickListener(new ws3.t(this));
            return inflate3;
        }
        if (view == null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ccn, null);
            xVar = new ws3.x(this, null);
            xVar.f530726a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j9z);
            xVar.f530727b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j9y);
            xVar.f530728c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ofk);
            view.setTag(xVar);
        } else {
            xVar = (ws3.x) view.getTag();
        }
        if (xVar != null && (imageView = xVar.f530728c) != null) {
            if (i17 == 0) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        vs3.a item = getItem(i17);
        if (item == null || xVar == null || xVar.f530726a == null || xVar.f530727b == null) {
            return view;
        }
        java.lang.String b17 = vs3.b.b(item.f521408a);
        if (vs3.a.f521406f.equals(item.f521412e)) {
            xVar.f530726a.setTextSize(16.0f);
            xVar.f530726a.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            xVar.f530727b.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            xVar.f530726a.setText(b17);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(b17);
            for (int i18 : item.f521412e) {
                if (i18 >= 0) {
                    if (i18 >= 7) {
                        i18 += 2;
                    } else if (i18 >= 3) {
                        i18++;
                    }
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2h)), i18, i18 + 1, 34);
                }
            }
            xVar.f530726a.setTextSize(24.0f);
            xVar.f530726a.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            xVar.f530727b.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            xVar.f530726a.setText(spannableStringBuilder);
        }
        java.lang.String str = item.f521409b;
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str.trim())) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f521410c)) {
                xVar.f530727b.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxx));
                return view;
            }
            xVar.f530727b.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxx) + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxp, item.f521410c));
            return view;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f521410c)) {
            xVar.f530727b.setText(item.f521409b);
        } else {
            xVar.f530727b.setText(item.f521409b + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxp, item.f521410c));
        }
        if (item.f521409b.equals(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxw))) {
            xVar.f530727b.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2e));
            return view;
        }
        xVar.f530727b.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a09));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }
}
