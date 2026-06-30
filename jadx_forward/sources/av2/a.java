package av2;

/* loaded from: classes2.dex */
public final class a implements av2.d {

    /* renamed from: a, reason: collision with root package name */
    public float f95729a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f95730b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 f95732d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 abstractActivityC15139x91efb0f1) {
        this.f95732d = abstractActivityC15139x91efb0f1;
    }

    public void a(float f17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 abstractActivityC15139x91efb0f1 = this.f95732d;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = abstractActivityC15139x91efb0f1.f211360w;
        if (((c22584xf7d97e83 != null ? c22584xf7d97e83.f292654p : null) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) && !this.f95730b && !this.f95731c && !z17) {
            if (f17 > this.f95729a && i17 == 1) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("left_slide_enter_profile_page", null, kz5.b1.e(new jz5.l("comment_scene", java.lang.Integer.valueOf(abstractActivityC15139x91efb0f1.getD()))), 1, false);
                this.f95730b = true;
            }
            float f18 = this.f95729a;
            if (!(f18 == 0.0f) && f18 > f17 && i17 == 1) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = abstractActivityC15139x91efb0f1.f211360w;
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = c22584xf7d97e832 != null ? c22584xf7d97e832.f292654p : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 activityC14075x761bf857 = abstractActivityC22579xbed01a37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) abstractActivityC22579xbed01a37 : null;
                ((cy1.a) rVar).yj("right_slide_exit_profile_page", null, kz5.b1.e(new jz5.l("comment_scene", activityC14075x761bf857 != null ? java.lang.Integer.valueOf(activityC14075x761bf857.getD()) : null)), 1, false);
                this.f95731c = true;
            }
        }
        this.f95729a = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1.c7(abstractActivityC15139x91efb0f1, i17);
    }

    public void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 activityC14075x761bf857;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 abstractActivityC15139x91efb0f1 = this.f95732d;
        if (i17 == 0) {
            if (this.f95731c) {
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = abstractActivityC15139x91efb0f1.f211360w;
                p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = c22584xf7d97e83 != null ? c22584xf7d97e83.f292654p : null;
                activityC14075x761bf857 = activityC0053x3d3f670c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) activityC0053x3d3f670c : null;
                if (activityC14075x761bf857 != null) {
                    activityC14075x761bf857.e7(true);
                }
                this.f95731c = false;
            }
            this.f95730b = false;
        } else if (i17 == 1) {
            if (this.f95730b) {
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = abstractActivityC15139x91efb0f1.f211360w;
                p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c2 = c22584xf7d97e832 != null ? c22584xf7d97e832.f292654p : null;
                activityC14075x761bf857 = activityC0053x3d3f670c2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) activityC0053x3d3f670c2 : null;
                if (activityC14075x761bf857 != null) {
                    activityC14075x761bf857.e7(false);
                }
                this.f95730b = false;
            }
            this.f95731c = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1.c7(abstractActivityC15139x91efb0f1, i17);
    }
}
