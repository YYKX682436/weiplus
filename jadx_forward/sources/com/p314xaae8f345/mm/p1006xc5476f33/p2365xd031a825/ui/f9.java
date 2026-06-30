package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes8.dex */
public class f9 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f261808d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f261809e;

    /* renamed from: f, reason: collision with root package name */
    public at4.j1 f261810f = null;

    public f9(android.content.Context context, java.util.ArrayList arrayList) {
        this.f261809e = context;
        this.f261808d = arrayList;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public at4.j1 getItem(int i17) {
        if (this.f261808d == null || getCount() <= i17) {
            return null;
        }
        return (at4.j1) this.f261808d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f261808d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e9 e9Var;
        if (view == null) {
            view = android.view.View.inflate(this.f261809e, com.p314xaae8f345.mm.R.C30864xbddafb2a.d8k, null);
            e9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e9(this, null);
            e9Var.f261789a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
            e9Var.f261790b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.mki);
            view.setTag(e9Var);
        } else {
            e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e9) view.getTag();
        }
        at4.j1 item = getItem(i17);
        if (item != null) {
            e9Var.f261789a.setText(item.f66180x3bf5cb4c);
            if (item.f66181x43bffadc == 1) {
                this.f261810f = item;
                e9Var.f261790b.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
            } else {
                e9Var.f261790b.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            }
        }
        return view;
    }
}
