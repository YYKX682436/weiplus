package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes14.dex */
public final class nc implements com.p314xaae8f345.p3210x3857dc.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc f283575a;

    public nc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc pcVar) {
        this.f283575a = pcVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProfileReadyUI", "xfile on user cancel finish");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void c() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void d(int i17, android.graphics.Bitmap thumbnail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnail, "thumbnail");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProfileReadyUI", "xfile onThumbnailLoad " + i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProfileReadyUI", "xfile onPageCountUpdate " + i17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc pcVar = this.f283575a;
        com.p314xaae8f345.mm.ui.zg m79804x79877fba = pcVar.m79804x79877fba();
        if (m79804x79877fba != null) {
            m79804x79877fba.f294163j = i17;
        }
        com.p314xaae8f345.mm.ui.zg m79804x79877fba2 = pcVar.m79804x79877fba();
        if (m79804x79877fba2 != null) {
            m79804x79877fba2.b();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void f(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProfileReadyUI", "xfile onPageChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc pcVar = this.f283575a;
        com.p314xaae8f345.mm.ui.zg m79804x79877fba = pcVar.m79804x79877fba();
        if (m79804x79877fba != null) {
            m79804x79877fba.f294161h = i17;
        }
        com.p314xaae8f345.mm.ui.zg m79804x79877fba2 = pcVar.m79804x79877fba();
        if (m79804x79877fba2 != null) {
            m79804x79877fba2.b();
        }
        if (pcVar.f283630m) {
            return;
        }
        pcVar.getClass();
        if (((float) i18) / ((float) i19) >= 1.3333334f) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o1 o1Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f.I;
            android.content.Context context = pcVar.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (o1Var.a(context) != 0) {
                android.content.Context context2 = pcVar.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                if (o1Var.a(context2) != 180) {
                    return;
                }
            }
            pcVar.f283630m = true;
            com.p314xaae8f345.mm.ui.zg zgVar = pcVar.f283629i;
            if (zgVar != null) {
                int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                android.content.Context context3 = zgVar.f294154a;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context3);
                e4Var.f293309c = context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2r);
                e4Var.b(com.p314xaae8f345.mm.R.C30861xcebc809e.bdu);
                zgVar.f294164k = e4Var.c();
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void h(android.view.MotionEvent motionEvent) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void i() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    /* renamed from: onDoubleTap */
    public void mo56908xce1d2af3(android.view.MotionEvent motionEvent) {
    }
}
