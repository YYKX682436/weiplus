package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class t8 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 f262162d;

    public t8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 activityC19120x14dda335, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o8 o8Var) {
        this.f262162d = activityC19120x14dda335;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 activityC19120x14dda335 = this.f262162d;
        if (activityC19120x14dda335.f261626i) {
            java.util.List list = activityC19120x14dda335.f261628n;
            if (list == null) {
                return 1;
            }
            return 1 + list.size();
        }
        java.util.List list2 = activityC19120x14dda335.f261628n;
        if (list2 == null) {
            return 0;
        }
        return list2.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 activityC19120x14dda335 = this.f262162d;
        java.util.List list = activityC19120x14dda335.f261628n;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return activityC19120x14dda335.f261628n.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s8 s8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) getItem(i17);
        if (view == null) {
            view = android.view.LayoutInflater.from(this.f262162d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d8_, viewGroup, false);
            s8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s8(this);
            s8Var.f262151a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ae_);
            view.setTag(s8Var);
        } else {
            s8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s8) view.getTag();
        }
        if (c19091x9511676c != null) {
            s8Var.f262151a.setText(c19091x9511676c.f69233x225aa2b6);
        } else {
            s8Var.f262151a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kz6);
        }
        return view;
    }
}
