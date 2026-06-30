package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "y22/h", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI */
/* loaded from: classes10.dex */
public final class ActivityC13388xb8f672d4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f180138u = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb f180140e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e f180141f;

    /* renamed from: g, reason: collision with root package name */
    public r22.a f180142g;

    /* renamed from: h, reason: collision with root package name */
    public r22.c f180143h;

    /* renamed from: i, reason: collision with root package name */
    public int f180144i;

    /* renamed from: m, reason: collision with root package name */
    public long f180145m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f180147o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f180148p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.p1379x65fca6e.C13385x3dbd864f f180149q;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13389x99f4d642 f180152t;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f180139d = "MicroMsg.EmojiCaptureUI";

    /* renamed from: n, reason: collision with root package name */
    public int f180146n = 2;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 f180150r = new com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141();

    /* renamed from: s, reason: collision with root package name */
    public final y22.m f180151s = new y22.m(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$hardCoderSystemEventListener$1] */
    public ActivityC13388xb8f672d4() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f180152t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5637xe5a09771>(a0Var) { // from class: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$hardCoderSystemEventListener$1
            {
                this.f39173x3fe91575 = -637576831;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5637xe5a09771 c5637xe5a09771) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 activityC13388xb8f672d4;
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5637xe5a09771 event = c5637xe5a09771;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.hh hhVar = event.f135965g;
                if (hhVar == null || (c13392x8bacb7fb = (activityC13388xb8f672d4 = com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4.this).f180140e) == null) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13388xb8f672d4.f180139d, "summerhardcoder system event [%s] BackCamera[%s]", java.lang.Integer.valueOf(hhVar.f88367a), java.lang.Boolean.valueOf(c13392x8bacb7fb.f180193z));
                if (hhVar.f88367a != 1 || !c13392x8bacb7fb.f180193z) {
                    return false;
                }
                c13392x8bacb7fb.d();
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.p314xaae8f345.mm.R.C30854x2dc211.f559259n);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return wo.v1.f529355b.O ? 7 : 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a6a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((w22.v) r0).f() == true) goto L8;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r4 = this;
            r22.c r0 = r4.f180143h
            r1 = 0
            if (r0 == 0) goto Lf
            w22.v r0 = (w22.v) r0
            boolean r0 = r0.f()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 != 0) goto L19
            y22.m r0 = r4.f180151s
            r2 = 2
            r3 = 0
            y22.h.a(r0, r1, r3, r2, r3)
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4.onBackPressed():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0495  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f180139d, "onDestroy");
        mo48814x2efc64();
        super.onDestroy();
        r22.a aVar = this.f180142g;
        if (aVar != null) {
            w22.g gVar = (w22.g) aVar;
            gVar.f524073k.d();
            x22.f fVar = gVar.f524074l;
            if (fVar != null) {
                fVar.f533098a = null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f180140e;
        if (c13392x8bacb7fb != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = c13392x8bacb7fb.f180181n;
            c13394xa8c361b5.getClass();
            u85.i.f507240a.f(c13394xa8c361b5.f180214v);
            c13394xa8c361b5.f180206n.getClass();
            v85.e.f515643h = null;
        }
        r22.c cVar = this.f180143h;
        if (cVar != null) {
            w22.v vVar = (w22.v) cVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", "destroy");
            r22.d dVar = vVar.f524114b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h = dVar.getF180230h();
            if (f180230h != null) {
                f180230h.m54890x360802();
            }
            dVar.getF180231i().b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e) dVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy ");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c13397xbda8fd8e.f180240u;
            sb6.append(abstractC19636xc6b37291);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13397xbda8fd8e.f180226d, sb6.toString());
            abstractC19636xc6b37291.a();
            vVar.f524124l.getClass();
            qr.e.f447541a.b(vVar.f524125m.f505508b, vVar.f524127o);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.p1379x65fca6e.C13385x3dbd864f c13385x3dbd864f = this.f180149q;
        if (c13385x3dbd864f != null) {
            unregisterReceiver(c13385x3dbd864f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markEmojiCaptureUIOnDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 1L, 1L);
        is0.b.f375924a.c();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (wo.v1.f529355b.f529194f == 1 && i17 == 700) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f180140e;
            if ((c13392x8bacb7fb != null && c13392x8bacb7fb.f180193z) && c13392x8bacb7fb != null) {
                c13392x8bacb7fb.d();
            }
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f180144i != 0) {
            r22.c cVar = this.f180143h;
            if (cVar != null) {
                ((w22.v) cVar).g();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f180140e;
        if (c13392x8bacb7fb != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13392x8bacb7fb.f180174d, "PauseCapture");
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13393xb0efbc76 f180183p = c13392x8bacb7fb.getF180183p();
            f180183p.f180194v.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.p1382x36452d.C13404xce5cc0b2 c13404xce5cc0b2 = f180183p.f180195w;
            c13404xce5cc0b2.removeCallbacks(c13404xce5cc0b2.f180313g);
            c13392x8bacb7fb.f180192y.k();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f180144i != 0) {
            r22.c cVar = this.f180143h;
            if (cVar != null) {
                ((w22.v) cVar).h();
                return;
            }
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(this, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f180139d, "initOnCreateAfterConnected: no permission");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f180140e;
        if (c13392x8bacb7fb != null) {
            c13392x8bacb7fb.c();
        }
    }
}
