package du3;

/* loaded from: classes10.dex */
public final class i implements wu3.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.m f325149a;

    public i(du3.m mVar) {
        this.f325149a = mVar;
    }

    @Override // wu3.a1
    public void a(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String font) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(font, "font");
        du3.m mVar = this.f325149a;
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                if (mVar.f325184g.getMode() == 0) {
                    boolean z17 = mVar.f325185h;
                    jz5.g gVar = mVar.f325190p;
                    if (!z17) {
                        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Q6(hk0.p.f363319d, charSequence.toString(), i17, i18, font);
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar.f325186i, charSequence) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar.f325189o, font) && mVar.f325187m == i17 && mVar.f325188n == i18) {
                        int i19 = rl.b.f478676a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAddTextPlugin", "changeText but no edit change", null);
                    } else {
                        int i27 = rl.b.f478676a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAddTextPlugin", "changeText and change", null);
                        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Q6(hk0.p.f363321f, charSequence.toString(), i17, i18, font);
                    }
                }
                mVar.f325184g.m68225x76500a7f(false);
                return;
            }
        }
        mVar.f325184g.m68225x76500a7f(false);
    }

    @Override // wu3.a1
    /* renamed from: onCancel */
    public void mo126263x3d6f0539() {
        this.f325149a.f325184g.m68225x76500a7f(false);
    }
}
