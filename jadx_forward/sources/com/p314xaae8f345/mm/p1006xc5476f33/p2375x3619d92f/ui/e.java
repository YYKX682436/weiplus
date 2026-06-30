package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* loaded from: classes9.dex */
public class e extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b f262573d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.a aVar) {
        this.f262573d = activityC19159x79c8ee9b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f262573d.f262545f).size() + 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b = this.f262573d;
        if (i17 < ((java.util.ArrayList) activityC19159x79c8ee9b.f262545f).size()) {
            return ((java.util.ArrayList) activityC19159x79c8ee9b.f262545f).get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return i17 >= ((java.util.ArrayList) this.f262573d.f262545f).size() ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b = this.f262573d;
        if (itemViewType == 1) {
            if (view == null) {
                view = android.view.LayoutInflater.from(activityC19159x79c8ee9b.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4w, viewGroup, false);
                view.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.c(activityC19159x79c8ee9b, view));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.c) view.getTag()).f262572a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572605bt0);
        } else {
            if (view == null) {
                view = android.view.LayoutInflater.from(activityC19159x79c8ee9b.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4v, viewGroup, false);
                view.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.f(activityC19159x79c8ee9b, view));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.d) view.getTag();
            r45.od odVar = (r45.od) getItem(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.f) dVar;
            if (odVar != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = fVar.f262574a;
                c19659x677e0913.m75394x3288e7c1(true);
                c19659x677e0913.m75396xca029dad(odVar.f463693m);
                java.lang.String format = java.lang.String.format("%s %s(%s)", odVar.f463687d, odVar.f463689f, odVar.f463691h);
                android.widget.TextView textView = fVar.f262575b;
                textView.setText(format);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(odVar.f463695o);
                android.widget.TextView textView2 = fVar.f262576c;
                if (K0) {
                    textView2.setText(java.lang.String.format("%s", odVar.f463690g));
                } else {
                    textView2.setText(java.lang.String.format("%s，%s", odVar.f463690g, odVar.f463695o));
                }
                boolean z17 = odVar.f463694n;
                com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b2 = fVar.f262577d;
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "disable card: %s", odVar.f463687d);
                    view.setEnabled(false);
                    textView.setTextColor(activityC19159x79c8ee9b2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560837vk));
                    textView2.setTextColor(activityC19159x79c8ee9b2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560837vk));
                } else {
                    view.setEnabled(true);
                    textView.setTextColor(activityC19159x79c8ee9b2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                    textView2.setTextColor(activityC19159x79c8ee9b2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a09));
                }
            } else {
                fVar.getClass();
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        r45.od odVar = (r45.od) getItem(i17);
        return odVar != null ? !odVar.f463694n : super.isEnabled(i17);
    }
}
