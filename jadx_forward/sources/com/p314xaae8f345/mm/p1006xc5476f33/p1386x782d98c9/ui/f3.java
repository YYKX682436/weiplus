package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class f3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 f180987d;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 activityC13469x6a5106b4) {
        this.f180987d = activityC13469x6a5106b4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f180987d.f180816d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f180987d.f180816d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e3 e3Var;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 activityC13469x6a5106b4 = this.f180987d;
        r32.e eVar = (r32.e) activityC13469x6a5106b4.f180816d.get(i17);
        if (view == null) {
            view = activityC13469x6a5106b4.f180818f ? android.view.LayoutInflater.from(activityC13469x6a5106b4).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a9v, viewGroup, false) : android.view.LayoutInflater.from(activityC13469x6a5106b4).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a9u, viewGroup, false);
            e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e3(this);
            e3Var.f180973a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.diu);
            e3Var.f180974b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) view.findViewById(com.p314xaae8f345.mm.R.id.djl);
            e3Var.f180975c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.djf);
            e3Var.f180976d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dje);
            e3Var.f180974b.i(0, activityC13469x6a5106b4.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            e3Var.f180974b.m79271x1c5c5ff4(activityC13469x6a5106b4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            e3Var.f180974b.m79267x52d64a5e(true);
            e3Var.f180974b.m79266x3b2de958(true);
            view.setTag(e3Var);
        } else {
            e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e3) view.getTag();
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = e3Var.f180973a;
        java.lang.String str = eVar.f66784xdec927b;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, str, 0.5f, true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = e3Var.f180974b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str2 = eVar.f66784xdec927b;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(str2);
        float m79234x40077844 = e3Var.f180974b.m79234x40077844();
        ((ke0.e) xVar).getClass();
        c21526xca364659.m79270x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13469x6a5106b4, e17, m79234x40077844));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f66781x5f8c68f4) || (textView = e3Var.f180975c) == null) {
            android.widget.TextView textView2 = e3Var.f180975c;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            textView.setVisibility(0);
            e3Var.f180975c.setText(eVar.f66781x5f8c68f4);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        long j17 = eVar.f66783x9de75411;
        int i18 = (int) (((currentTimeMillis - j17) / 60) + 1);
        if (i18 <= 30) {
            e3Var.f180976d.setText(activityC13469x6a5106b4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c3p, java.lang.Integer.valueOf(i18)));
        } else {
            e3Var.f180976d.setText(k35.m1.f(activityC13469x6a5106b4, j17 * 1000, true, false));
        }
        return view;
    }
}
