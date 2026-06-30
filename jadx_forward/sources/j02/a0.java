package j02;

/* loaded from: classes8.dex */
public final class a0 implements vz.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378509a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a) {
        this.f378509a = activityC13235x6e95dd9a;
    }

    @Override // vz.i1
    public final void Z(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a = this.f378509a;
        if (activityC13235x6e95dd9a.f178756f == j17) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            switch (i17) {
                case 1:
                    activityC13235x6e95dd9a.W6().f98345k.setVisibility(0);
                    activityC13235x6e95dd9a.W6().f98336b.setText(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9y, java.lang.Integer.valueOf((int) ((((float) c17.f68413xf432b5ad) / ((float) c17.f68443x78351860)) * 100))));
                    activityC13235x6e95dd9a.W6().f98336b.setOnClickListener(new j02.q(activityC13235x6e95dd9a, j17));
                    return;
                case 2:
                    activityC13235x6e95dd9a.W6().f98336b.setText(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573738lp4));
                    activityC13235x6e95dd9a.W6().f98336b.setOnClickListener(new j02.w(activityC13235x6e95dd9a, j17));
                    return;
                case 3:
                    activityC13235x6e95dd9a.W6().f98345k.setVisibility(8);
                    activityC13235x6e95dd9a.W6().f98336b.setText(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.flg));
                    activityC13235x6e95dd9a.W6().f98336b.setOnClickListener(new j02.x(j17, activityC13235x6e95dd9a));
                    return;
                case 4:
                    android.widget.Button button = activityC13235x6e95dd9a.W6().f98336b;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.flz));
                    java.lang.String format = java.lang.String.format("(%.1fMB)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) c17.f68443x78351860) / 1048576)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    sb6.append(format);
                    button.setText(sb6.toString());
                    activityC13235x6e95dd9a.W6().f98336b.setOnClickListener(new j02.t(activityC13235x6e95dd9a));
                    return;
                case 5:
                    activityC13235x6e95dd9a.W6().f98336b.setText(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ceh));
                    activityC13235x6e95dd9a.W6().f98336b.setOnClickListener(new j02.u(activityC13235x6e95dd9a));
                    return;
                case 6:
                    activityC13235x6e95dd9a.W6().f98336b.setText(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9y, java.lang.Integer.valueOf((int) ((((float) c17.f68413xf432b5ad) / ((float) c17.f68443x78351860)) * 100))));
                    activityC13235x6e95dd9a.W6().f98336b.setOnClickListener(new j02.s(activityC13235x6e95dd9a, j17));
                    return;
                case 7:
                default:
                    return;
                case 8:
                    activityC13235x6e95dd9a.W6().f98345k.setVisibility(8);
                    activityC13235x6e95dd9a.W6().f98336b.setText(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7e));
                    return;
                case 9:
                    activityC13235x6e95dd9a.W6().f98345k.setVisibility(8);
                    activityC13235x6e95dd9a.W6().f98336b.setText(activityC13235x6e95dd9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.flh));
                    activityC13235x6e95dd9a.W6().f98336b.setOnClickListener(new j02.z(activityC13235x6e95dd9a, c17));
                    return;
            }
        }
    }
}
