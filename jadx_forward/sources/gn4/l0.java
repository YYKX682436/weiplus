package gn4;

/* loaded from: classes15.dex */
public class l0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 f355171d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02) {
        this.f355171d = activityC18757xb5c40a02;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        sm4.j jVar = (sm4.j) m1Var;
        r45.mn6 mn6Var = (r45.mn6) jVar.f491486e.f152243a.f152217a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355171d;
        r45.xn6 xn6Var = jVar.f491488g;
        if (i17 == 0 && i18 == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("docId", mn6Var.f462230d);
                jSONObject.put("opType", "LIKE");
                jSONObject.put("isLike", mn6Var.f462232f == 4);
            } catch (org.json.JSONException unused) {
            }
            if (xn6Var != null) {
                boolean z17 = mn6Var.f462232f == 4;
                xn6Var.R = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "setCmtListener onSceneEnd succ, thumb: %s count: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(xn6Var.X));
            }
            android.view.View view = null;
            if (mn6Var.f462232f == 4) {
                fn4.m E = activityC18757xb5c40a02.f256689o.E(xn6Var);
                r45.xn6 xn6Var2 = activityC18757xb5c40a02.I.f346108d;
                if (xn6Var2 != null && (str2 = xn6Var2.f471792h) != null && str2.equals(xn6Var.f471792h) && (E instanceof gn4.d0)) {
                    view = E.j();
                }
                if (view != null) {
                    activityC18757xb5c40a02.X6(xn6Var, view, true);
                    if (E instanceof gn4.d0) {
                        E.i().mo129842x143e7d6c().x();
                    }
                }
            } else {
                if (((r45.nn6) jVar.f491486e.f152244b.f152233a).f463088e) {
                    db5.e1.s(activityC18757xb5c40a02, activityC18757xb5c40a02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574927k11), "");
                } else {
                    db5.t7.m123882x26a183b(activityC18757xb5c40a02.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574928k12, 0).show();
                }
                activityC18757xb5c40a02.X6(xn6Var, null, false);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5636xb8854922 c5636xb8854922 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5636xb8854922();
            java.lang.String jSONObject2 = jSONObject.toString();
            am.gh ghVar = c5636xb8854922.f135964g;
            ghVar.f88295a = jSONObject2;
            ghVar.f88296b = "";
            c5636xb8854922.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopStory.TopStoryFSVideoUI", "NetSceneTopStorySetComment response, errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            db5.t7.m123883x26a183b(activityC18757xb5c40a02.mo55332x76847179(), activityC18757xb5c40a02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0_), 0).show();
            if (xn6Var != null) {
                xn6Var.R = !xn6Var.R;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "setCmtListener onSceneEnd error, thumb:" + xn6Var.R);
            }
        }
        activityC18757xb5c40a02.runOnUiThread(new gn4.k0(this, jVar));
    }
}
