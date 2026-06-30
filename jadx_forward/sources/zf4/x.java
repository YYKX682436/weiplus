package zf4;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f554236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f554237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf4.a0 f554238f;

    public x(zf4.a0 a0Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f554238f = a0Var;
        this.f554236d = m1Var;
        this.f554237e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        zf4.a0.f554168q++;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f554236d;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        zf4.a0 a0Var = this.f554238f;
        if (mo808xfb85f7b0 == 128) {
            a0Var.f554172g = false;
            w21.k kVar = (w21.k) m1Var;
            i17 = kVar.f523940i;
            str = kVar.f523937f;
        } else {
            if (m1Var.mo808xfb85f7b0() != 329) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindService", "onSceneEnd Error SceneType:" + m1Var.mo808xfb85f7b0());
                zf4.a0.f554168q = zf4.a0.f554168q + (-1);
                return;
            }
            a0Var.f554173h = false;
            zf4.g gVar = (zf4.g) m1Var;
            i17 = gVar.f554193h;
            str = gVar.f554191f;
        }
        if (str != null && ((java.util.HashMap) a0Var.f554171f).get(str) != null) {
            java.util.Map map = a0Var.f554171f;
            ((fp.j) ((java.util.HashMap) map).get(str)).a();
            ((java.util.HashMap) map).remove(str);
        }
        m1Var.mo808xfb85f7b0();
        int i18 = this.f554237e;
        if (i18 == 3 && i17 != 0) {
            a0Var.f554175m--;
        } else if (i18 != 0) {
            a0Var.f554175m = 0;
        }
        int i19 = a0Var.f554175m;
        boolean z17 = a0Var.f554172g;
        boolean z18 = a0Var.f554173h;
        if (i19 > 0) {
            zf4.a0.a(a0Var);
        } else if (!z18 && !z17) {
            a0Var.b();
        }
        zf4.a0.f554168q--;
    }
}
