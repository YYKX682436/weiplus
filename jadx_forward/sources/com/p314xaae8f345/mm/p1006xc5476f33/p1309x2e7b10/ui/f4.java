package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes4.dex */
public class f4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a f176539d;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.y3 y3Var) {
        this.f176539d = activityC13058x9cebb75a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f176539d.f176437f.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.nu) this.f176539d.f176437f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e4 e4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a = this.f176539d;
        if (view == null) {
            view = android.view.View.inflate(activityC13058x9cebb75a.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569893r6, null);
            e4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e4(this);
            e4Var.f176531a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mu6);
            e4Var.f176532b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568435mu2);
            e4Var.f176533c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mtz);
            e4Var.f176534d = view.findViewById(com.p314xaae8f345.mm.R.id.mu9);
            view.setTag(e4Var);
        } else {
            e4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e4) view.getTag();
        }
        r45.nu nuVar = (r45.nu) activityC13058x9cebb75a.f176437f.get(i17);
        if (nuVar == null) {
            e4Var.f176531a.setText("");
            e4Var.f176532b.setText("");
            e4Var.f176533c.setText("");
            return view;
        }
        e4Var.f176531a.setText(nuVar.f463205d);
        if (nuVar.f463212n <= 0.0f) {
            e4Var.f176532b.setVisibility(8);
        } else {
            e4Var.f176532b.setText(lu1.a0.D(activityC13058x9cebb75a.getBaseContext(), nuVar.f463212n));
            e4Var.f176532b.setVisibility(0);
        }
        e4Var.f176533c.setText(nuVar.f463209h + nuVar.f463210i + nuVar.f463211m);
        e4Var.f176534d.setOnClickListener(activityC13058x9cebb75a.f176446r);
        e4Var.f176534d.setTag(nuVar);
        return view;
    }
}
