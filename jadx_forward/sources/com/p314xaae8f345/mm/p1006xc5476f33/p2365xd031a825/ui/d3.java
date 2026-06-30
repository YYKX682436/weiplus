package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class d3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 f261767d;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2) {
        this.f261767d = activityC19109xac2e2ee2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2 = this.f261767d;
        if (activityC19109xac2e2ee2.f261493z.a() != null) {
            return activityC19109xac2e2ee2.f261493z.a().size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.Integer) this.f261767d.f261493z.a().get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.View.inflate(this.f261767d, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571158d70, null);
        at4.b1 b1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2 = this.f261767d;
        checkedTextView.setText(b1Var.b(activityC19109xac2e2ee2, ((java.lang.Integer) activityC19109xac2e2ee2.f261493z.a().get(i17)).intValue()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee22 = this.f261767d;
        if (activityC19109xac2e2ee22.f261473J == ((java.lang.Integer) activityC19109xac2e2ee22.f261493z.a().get(i17)).intValue()) {
            checkedTextView.setChecked(true);
        } else {
            checkedTextView.setChecked(false);
        }
        checkedTextView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        return checkedTextView;
    }
}
