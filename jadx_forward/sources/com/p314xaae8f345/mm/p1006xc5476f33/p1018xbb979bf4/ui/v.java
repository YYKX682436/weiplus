package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public class v implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.w f156166b;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.w wVar, int i17) {
        this.f156166b = wVar;
        this.f156165a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        i83.b bVar;
        synchronized (this.f156166b.f156169d.f155961g) {
            bVar = this.f156165a < this.f156166b.f156169d.f155963i.size() ? (i83.b) this.f156166b.f156169d.f155963i.get(this.f156165a) : null;
        }
        if (bVar == null) {
            return;
        }
        if (i17 == 0) {
            this.f156166b.f156169d.T6(bVar.f371167d);
            return;
        }
        if (i17 == 1) {
            q71.l lVar = new q71.l(bVar.f371167d);
            this.f156166b.f156169d.f155958d = null;
            c01.d9.e().g(lVar);
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11489x419d951f activityC11489x419d951f = this.f156166b.f156169d;
        activityC11489x419d951f.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = bVar.f371168e;
        if (str == null || !str.equals("0")) {
            java.lang.String str2 = bVar.f371168e;
            if (str2 != null && str2.equals("1") && !android.text.TextUtils.isEmpty(bVar.f371170g)) {
                sb6.append(activityC11489x419d951f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573868g35));
                sb6.append("：");
                sb6.append(bVar.f371170g);
                sb6.append(" \n");
            }
        } else {
            if (!android.text.TextUtils.isEmpty(bVar.f371169f)) {
                sb6.append(activityC11489x419d951f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573868g35));
                sb6.append("：");
                sb6.append(bVar.f371169f);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f371171h)) {
                sb6.append(activityC11489x419d951f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573863g30));
                sb6.append("：");
                sb6.append(bVar.f371171h);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f371178r)) {
                sb6.append(activityC11489x419d951f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2n));
                sb6.append("：");
                sb6.append(bVar.f371178r);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f371175o)) {
                sb6.append(activityC11489x419d951f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2w));
                sb6.append("：");
                sb6.append(bVar.f371175o);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f371173m)) {
                sb6.append(activityC11489x419d951f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2g));
                sb6.append("：");
                sb6.append(bVar.f371173m);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f371172i)) {
                sb6.append(activityC11489x419d951f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2i));
                sb6.append("：");
                sb6.append(bVar.f371172i);
                sb6.append(" \n");
            }
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(activityC11489x419d951f.mo55332x76847179(), null, sb6.toString(), null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.InvoiceListUI", e17, "", new java.lang.Object[0]);
        }
    }
}
