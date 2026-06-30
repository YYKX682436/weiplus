package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class u extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 f154351d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i iVar) {
        this.f154351d = activityC11339x6e0beaf2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2 = this.f154351d;
        android.view.View inflate = android.view.View.inflate(activityC11339x6e0beaf2.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569400a4, null);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) inflate.findViewById(com.p314xaae8f345.mm.R.id.h88);
        inflate.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        int i18 = activityC11339x6e0beaf2.f153965f;
        if (i18 == 1) {
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(activityC11339x6e0beaf2.f153967h);
            if (Bi != null) {
                activityC11339x6e0beaf2.U6(c21524xecd57b9a, Bi);
            } else {
                activityC11339x6e0beaf2.f153968i = db5.e1.O(activityC11339x6e0beaf2, null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, activityC11339x6e0beaf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o(activityC11339x6e0beaf2));
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(activityC11339x6e0beaf2.f153967h, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.q(activityC11339x6e0beaf2, c21524xecd57b9a));
            }
        } else if (i18 == 2) {
            c21524xecd57b9a.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.r(activityC11339x6e0beaf2, c21524xecd57b9a));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreviewHdHeadImg", "scene(%s) invalid", java.lang.Integer.valueOf(i18));
            activityC11339x6e0beaf2.finish();
        }
        inflate.findViewById(com.p314xaae8f345.mm.R.id.h9y).setImportantForAccessibility(2);
        return inflate;
    }
}
