package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class k extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f236728d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f236729e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f236730f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.j f236731g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f236732h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab f236733i;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab, com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.a aVar) {
        this.f236733i = viewOnFocusChangeListenerC16958xba487cab;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized vs3.a getItem(int i17) {
        if (!this.f236729e) {
            if (i17 >= this.f236728d.size()) {
                return null;
            }
            return (vs3.a) this.f236728d.get(i17);
        }
        if (i17 == 0) {
            return null;
        }
        if (i17 > this.f236728d.size()) {
            return null;
        }
        return (vs3.a) this.f236728d.get(i17 - 1);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f236729e) {
            return this.f236728d.size() + 2;
        }
        if (this.f236728d.size() > 0) {
            return this.f236728d.size() + 1;
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f236731g == null) {
            this.f236731g = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.j(this, null);
        }
        return this.f236731g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (!this.f236729e) {
            return i17 < this.f236728d.size() ? 0 : 1;
        }
        if (i17 == 0) {
            return 2;
        }
        return i17 <= this.f236728d.size() ? 0 : 3;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.m mVar;
        int itemViewType = getItemViewType(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab = this.f236733i;
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                android.view.View inflate = android.view.View.inflate(viewOnFocusChangeListenerC16958xba487cab.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cco, null);
                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.e(this));
                return inflate;
            }
            if (itemViewType == 2) {
                android.view.View inflate2 = android.view.View.inflate(viewOnFocusChangeListenerC16958xba487cab.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ccm, null);
                inflate2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.d(this));
                return inflate2;
            }
            if (itemViewType != 3) {
                return view;
            }
            android.view.View inflate3 = android.view.View.inflate(viewOnFocusChangeListenerC16958xba487cab.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cco, null);
            ((android.widget.TextView) inflate3).setText(com.p314xaae8f345.mm.R.C30867xcad56011.gsm);
            inflate3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.f(this));
            return inflate3;
        }
        if (view == null) {
            view = android.view.View.inflate(viewOnFocusChangeListenerC16958xba487cab.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ccn, null);
            mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.m(viewOnFocusChangeListenerC16958xba487cab, null);
            mVar.f236736a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j9z);
            mVar.f236737b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j9y);
            view.setTag(mVar);
        } else {
            mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.m) view.getTag();
        }
        vs3.a item = getItem(i17);
        if (item == null || mVar == null || mVar.f236736a == null || mVar.f236737b == null) {
            return view;
        }
        java.lang.String b17 = vs3.b.b(item.f521408a);
        if (vs3.a.f521406f.equals(item.f521412e)) {
            mVar.f236736a.setText(b17);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(b17);
            for (int i18 : item.f521412e) {
                if (i18 >= 0) {
                    if (i18 >= 7) {
                        i18 += 2;
                    } else if (i18 >= 3) {
                        i18++;
                    }
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(-65536), i18, i18 + 1, 34);
                }
            }
            mVar.f236736a.setText(spannableStringBuilder);
        }
        java.lang.String str = item.f521409b;
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str.trim())) {
            mVar.f236737b.setText("");
        } else {
            mVar.f236737b.setText(viewOnFocusChangeListenerC16958xba487cab.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsx, item.f521409b));
        }
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }
}
