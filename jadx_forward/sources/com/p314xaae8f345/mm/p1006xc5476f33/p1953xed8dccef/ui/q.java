package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes8.dex */
public class q extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f234863d;

    /* renamed from: e, reason: collision with root package name */
    public final int f234864e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f234865f;

    /* renamed from: g, reason: collision with root package name */
    public int f234866g = -1;

    public q(android.content.Context context, int i17) {
        this.f234863d = context;
        this.f234864e = i17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f234865f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.View.inflate(this.f234863d, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570824c05, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.r();
            rVar.f234870a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o3b);
            rVar.f234871b = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bs7);
            rVar.f234872c = (android.widget.RadioButton) view.findViewById(com.p314xaae8f345.mm.R.id.lhs);
            view.setTag(rVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.r rVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.r) view.getTag();
        rVar2.f234870a.setText((java.lang.CharSequence) this.f234865f.get(i17));
        int i18 = this.f234864e;
        if (i18 == 1) {
            rVar2.f234871b.setVisibility(8);
            rVar2.f234872c.setVisibility(0);
            rVar2.f234872c.setChecked(i17 == this.f234866g);
        } else if (i18 != 2) {
            rVar2.f234871b.setVisibility(8);
            rVar2.f234872c.setVisibility(8);
        } else {
            rVar2.f234871b.setVisibility(0);
            rVar2.f234872c.setVisibility(8);
            rVar2.f234871b.setChecked(i17 == this.f234866g);
        }
        return view;
    }
}
