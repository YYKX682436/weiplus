package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class wb implements w24.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f243227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f243228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f243229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f243230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f243231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f243232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 f243233g;

    public wb(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 activityC17420x3d09cd46, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3) {
        this.f243233g = activityC17420x3d09cd46;
        this.f243227a = c22624x85d69039;
        this.f243228b = c22624x85d690392;
        this.f243229c = c22624x85d690393;
        this.f243230d = imageView;
        this.f243231e = imageView2;
        this.f243232f = imageView3;
    }

    public void a(int i17) {
        float y17;
        float g17;
        k14.o oVar;
        float w17;
        float g18;
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 activityC17420x3d09cd46 = this.f243233g;
        activityC17420x3d09cd46.f241924m = i17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17420x3d09cd46.mo55332x76847179();
        if (mo55332x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FontSizeService", "onChangeFontSize get null");
            oVar = new k14.o();
        } else {
            if (i17 != 0) {
                switch (i17) {
                    case 2:
                        w17 = i65.a.w(mo55332x76847179);
                        g17 = j65.f.g() / 360.0f;
                        y17 = w17;
                        break;
                    case 3:
                        w17 = i65.a.z(mo55332x76847179);
                        g17 = (j65.f.g() / 360.0f) * 1.12f;
                        y17 = w17;
                        break;
                    case 4:
                        y17 = i65.a.s(mo55332x76847179);
                        g18 = j65.f.g() / 340.0f;
                        f17 = 1.125f;
                        g17 = g18 * f17;
                        break;
                    case 5:
                        y17 = i65.a.t(mo55332x76847179);
                        g18 = j65.f.g() / 340.0f;
                        f17 = 1.4f;
                        g17 = g18 * f17;
                        break;
                    case 6:
                        y17 = i65.a.u(mo55332x76847179);
                        g18 = j65.f.g() / 340.0f;
                        f17 = 1.55f;
                        g17 = g18 * f17;
                        break;
                    case 7:
                        y17 = i65.a.v(mo55332x76847179);
                        g18 = j65.f.g() / 340.0f;
                        f17 = 1.65f;
                        g17 = g18 * f17;
                        break;
                    default:
                        i65.a.x(mo55332x76847179);
                        g17 = j65.f.g() / 400.0f;
                        y17 = 1.0f;
                        break;
                }
            } else {
                y17 = i65.a.y(mo55332x76847179);
                g17 = j65.f.g() / 440.0f;
            }
            if (!i65.a.l(mo55332x76847179)) {
                g17 = y17;
            }
            k14.o oVar2 = new k14.o();
            oVar2.f384899a = y17;
            oVar2.f384900b = g17;
            oVar = oVar2;
        }
        activityC17420x3d09cd46.f241922h = oVar.f384899a;
        activityC17420x3d09cd46.f241923i = oVar.f384900b;
        this.f243227a.l(0, com.p314xaae8f345.mm.ui.zk.e(activityC17420x3d09cd46.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * activityC17420x3d09cd46.f241923i);
        this.f243228b.l(0, com.p314xaae8f345.mm.ui.zk.e(activityC17420x3d09cd46.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * activityC17420x3d09cd46.f241923i);
        this.f243229c.l(0, com.p314xaae8f345.mm.ui.zk.e(activityC17420x3d09cd46.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * activityC17420x3d09cd46.f241923i);
        activityC17420x3d09cd46.m78576x47d78717(i65.a.f(mo55332x76847179, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b) * i65.a.m(mo55332x76847179));
        if (i65.a.l(activityC17420x3d09cd46.mo55332x76847179())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46.U6(activityC17420x3d09cd46, this.f243230d, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46.U6(activityC17420x3d09cd46, this.f243231e, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46.U6(activityC17420x3d09cd46, this.f243232f, i17);
        }
    }
}
