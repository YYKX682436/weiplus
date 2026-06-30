package nf4;

/* loaded from: classes4.dex */
public final class j extends dm.z7 {
    public static final l75.e0 M = dm.z7.m125773x3593deb(nf4.j.class);
    public static final java.lang.String N = "rowid";
    public static final java.lang.String P = "serverStoryNameIndex";
    public static final java.lang.String Q = "serverStoryNameTimeIndex";
    public static final java.lang.String R = "serverStoryUsernameCreateTimeIndex";
    public int L;

    public j() {
        new java.util.ArrayList();
        new java.util.ArrayList();
    }

    public final void A0(int i17) {
        int i18 = this.f69405x686589a9;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        this.f69405x686589a9 = (~i17) & i18;
    }

    public final boolean D0(r45.lf6 contentObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentObj, "contentObj");
        try {
            this.f69402xad49e234 = contentObj.mo14344x5f01b1f6();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StoryInfo", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final void F0(boolean z17) {
        int i17;
        if (z17) {
            int i18 = this.f69406x52c1d072;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            i17 = i18 | 16;
        } else {
            int i19 = this.f69406x52c1d072;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            i17 = i19 & (-17);
        }
        this.f69406x52c1d072 = i17;
    }

    public final void G0(r45.lf6 timeline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeline, "timeline");
        try {
            this.f69402xad49e234 = timeline.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StoryInfo", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // dm.z7, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cu6) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cu6, "cu");
        super.mo9015xbf5d97fd(cu6);
        df4.a aVar = df4.b.f313571a;
        try {
            i17 = java.lang.Integer.parseInt(android.text.format.DateFormat.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jld), this.f69403xac3be4e * 1000).toString());
        } catch (java.lang.NumberFormatException e17) {
            df4.a aVar2 = df4.b.f313571a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StoryTimeUtil", e17, "NumberFormatException", new java.lang.Object[0]);
            i17 = 0;
        }
        this.L = i17;
    }

    @Override // dm.z7, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    public final void t0(int i17) {
        int i18 = this.f69405x686589a9;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        this.f69405x686589a9 = i17 | i18;
    }

    public final boolean u0() {
        return pm0.v.z(this.f69405x686589a9, 8);
    }

    public final r45.ye6 v0() {
        r45.ye6 ye6Var = new r45.ye6();
        if (this.f69407x5d40d76e == null) {
            return ye6Var;
        }
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.ye6().mo11468x92b714fd(this.f69407x5d40d76e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryMediaPostInfo");
            return (r45.ye6) mo11468x92b714fd;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StoryInfo", "error get StoryMediaPostInfo " + this.f69410x443468b);
            return new r45.ye6();
        }
    }

    public final boolean w0() {
        return pm0.v.z(this.f69406x52c1d072, 16);
    }

    public final r45.lf6 y0() {
        if (this.f69402xad49e234 == null) {
            r45.lf6 lf6Var = new r45.lf6();
            r45.oe6 oe6Var = new r45.oe6();
            r45.tl5 tl5Var = new r45.tl5();
            tl5Var.f468086e = 0.0f;
            tl5Var.f468085d = 0.0f;
            lf6Var.f460964g = tl5Var;
            lf6Var.f460965h = oe6Var;
            lf6Var.f460961d = "";
            lf6Var.f460963f = 0;
            return lf6Var;
        }
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.lf6().mo11468x92b714fd(this.f69402xad49e234);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryTimelineObject");
            return (r45.lf6) mo11468x92b714fd;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StoryInfo", "error get storyinfo timeline!");
            r45.lf6 lf6Var2 = new r45.lf6();
            r45.oe6 oe6Var2 = new r45.oe6();
            r45.tl5 tl5Var2 = new r45.tl5();
            tl5Var2.f468086e = 0.0f;
            tl5Var2.f468085d = 0.0f;
            lf6Var2.f460964g = tl5Var2;
            lf6Var2.f460965h = oe6Var2;
            lf6Var2.f460961d = "";
            lf6Var2.f460963f = 0;
            return lf6Var2;
        }
    }

    public final boolean z0() {
        int i17 = this.f69403xac3be4e;
        int e17 = c01.id.e();
        ef4.n.f333993a.a();
        return i17 <= e17 - 86400;
    }
}
