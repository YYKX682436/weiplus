package wc5;

/* loaded from: classes10.dex */
public final class k0 extends wm3.a implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f526122d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f526123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 baseActivity) {
        super(baseActivity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivity, "baseActivity");
        this.f526122d = baseActivity;
    }

    public final uc5.r T6() {
        android.view.LayoutInflater.Factory factory = this.f526122d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034 A[SYNTHETIC] */
    @Override // xg3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(xg3.m0 r10, xg3.l0 r11) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.k0.c0(xg3.m0, xg3.l0):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        if (this.f526123e) {
            this.f526123e = false;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryRevokeUIC", "stopListening");
        }
        super.mo13982x7cf2e371();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (xc5.l.f535053q) {
            xc5.l.f535053q = false;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f526122d;
            db5.e1.y(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbs), "", this.f526122d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572472bb1), null);
        }
    }
}
