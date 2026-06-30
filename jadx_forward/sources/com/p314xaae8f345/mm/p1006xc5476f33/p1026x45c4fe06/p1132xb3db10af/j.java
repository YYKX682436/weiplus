package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class j extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f165690f = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f);

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f165691d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f165692e;

    public j(android.content.Context context) {
        this.f165691d = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f165692e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (kg1.c) this.f165692e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.k kVar;
        if (view == null) {
            view = this.f165691d.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3v, viewGroup, false);
            kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.k();
            kVar.f165693a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cql);
            view.setTag(kVar);
        } else {
            kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.k) view.getTag();
        }
        java.lang.String str = null;
        if (((kg1.c) this.f165692e.get(i17)).f389224a.isEmpty()) {
            kVar.f165693a.setText((java.lang.CharSequence) null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723 c12311xaad8723 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723) ((kg1.c) this.f165692e.get(i17)).f389224a.get(0);
            if (c12311xaad8723 != null) {
                str = f165690f.format(java.lang.Long.valueOf(c12311xaad8723.f165665d));
            }
        }
        kVar.f165693a.setText(str);
        return view;
    }
}
