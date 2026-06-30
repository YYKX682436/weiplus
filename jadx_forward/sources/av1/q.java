package av1;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a f95723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a activityC13090x679cb21a) {
        super(1);
        this.f95723d = activityC13090x679cb21a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xu1.c it = (xu1.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a.f177020q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a activityC13090x679cb21a = this.f95723d;
        activityC13090x679cb21a.getClass();
        switch (it.ordinal()) {
            case 0:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "trans to pc disconnect");
                activityC13090x679cb21a.X6(3);
                break;
            case 1:
                activityC13090x679cb21a.X6(1);
                break;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "trans to pc CONNECTED");
                if (nu1.n.f421703e == null) {
                    nu1.n.f421703e = new tu1.o();
                }
                tu1.o oVar = nu1.n.f421703e;
                if ((oVar == null || oVar.f503653k) ? false : true) {
                    if (oVar == null) {
                        nu1.n.f421703e = new tu1.o();
                    }
                    tu1.o oVar2 = nu1.n.f421703e;
                    if (oVar2 != null) {
                        oVar2.f503653k = true;
                    }
                    java.lang.Object systemService = activityC13090x679cb21a.getSystemService("media_projection");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                    android.content.Intent createScreenCaptureIntent = ((android.media.projection.MediaProjectionManager) systemService).createScreenCaptureIntent();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScreenCaptureIntent, "createScreenCaptureIntent(...)");
                    activityC13090x679cb21a.startActivityForResult(createScreenCaptureIntent, activityC13090x679cb21a.f177027m);
                    activityC13090x679cb21a.X6(4);
                    break;
                }
                break;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
                activityC13090x679cb21a.X6(2);
                break;
            case 4:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "trans to pc ERROR");
                activityC13090x679cb21a.X6(5);
                break;
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
                activityC13090x679cb21a.W6();
                activityC13090x679cb21a.X6(7);
                break;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "trans to pc service removed");
                activityC13090x679cb21a.W6();
                activityC13090x679cb21a.X6(8);
                break;
        }
        return jz5.f0.f384359a;
    }
}
