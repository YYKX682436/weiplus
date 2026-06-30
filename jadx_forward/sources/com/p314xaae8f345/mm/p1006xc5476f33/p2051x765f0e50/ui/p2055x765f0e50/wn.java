package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes15.dex */
public class wn extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 f243249d;

    public wn(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mn mnVar) {
        this.f243249d = activityC17476xb3aa84a7;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7 = this.f243249d;
        int size = ((java.util.ArrayList) activityC17476xb3aa84a7.f242267d).size();
        if (activityC17476xb3aa84a7.f242272i) {
            return size;
        }
        if (size == 0) {
            return 1;
        }
        if (size > 0 && size < com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7.f242266n) {
            return size + 2;
        }
        if (size >= com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7.f242266n) {
            return size + 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (getItemViewType(i17) == 0) {
            return ((java.util.ArrayList) this.f243249d.f242267d).get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7 = this.f243249d;
        int size = ((java.util.ArrayList) activityC17476xb3aa84a7.f242267d).size();
        if (activityC17476xb3aa84a7.f242272i || i17 < size) {
            return 0;
        }
        if (size == 0) {
            return 1;
        }
        if (size >= com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7.f242266n) {
            return 2;
        }
        if (i17 == size) {
            return 1;
        }
        return i17 == size + 1 ? 2 : -1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vn vnVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7 = this.f243249d;
        if (view == null) {
            view = activityC17476xb3aa84a7.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cmd, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ojr);
            android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ojs);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ojw);
            vnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vn(this, null);
            vnVar.f243206a = imageView;
            vnVar.f243207b = imageView2;
            vnVar.f243208c = textView;
            view.setTag(vnVar);
        } else {
            vnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vn) view.getTag();
        }
        if (getItemViewType(i17) == 0) {
            java.lang.String str = (java.lang.String) ((java.util.ArrayList) activityC17476xb3aa84a7.f242267d).get(i17);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            vnVar.f243206a.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(vnVar.f243206a, str, null);
            android.widget.TextView textView2 = vnVar.f243208c;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String g27 = n17.g2();
            float textSize = vnVar.f243208c.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC17476xb3aa84a7, g27, textSize));
            if (activityC17476xb3aa84a7.f242272i) {
                vnVar.f243207b.setVisibility(0);
            } else {
                vnVar.f243207b.setVisibility(8);
            }
        } else {
            vnVar.f243208c.setVisibility(4);
            vnVar.f243207b.setVisibility(8);
            vnVar.f243206a.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            if (getItemViewType(i17) == 1) {
                vnVar.f243206a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562486g8);
            } else if (getItemViewType(i17) == 2) {
                vnVar.f243206a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562487g9);
            }
        }
        vnVar.f243206a.setTag(com.p314xaae8f345.mm.R.id.mnv, java.lang.Integer.valueOf(getItemViewType(i17)));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
