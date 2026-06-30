package t21;

/* loaded from: classes12.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f496369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f496370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f496371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t21.p3 f496372g;

    public m3(t21.p3 p3Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f496372g = p3Var;
        this.f496369d = m1Var;
        this.f496370e = i17;
        this.f496371f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        t21.p3.f496396y++;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f496369d;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        int i18 = this.f496370e;
        t21.p3 p3Var = this.f496372g;
        if (mo808xfb85f7b0 == 150) {
            p3Var.f496406p = false;
            t21.r0 r0Var = (t21.r0) m1Var;
            i17 = r0Var.f496447r;
            p3Var.f496411u = null;
            str = r0Var.f496438f;
        } else {
            if (m1Var.mo808xfb85f7b0() != 149) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoService", "onSceneEnd Error SceneType:" + m1Var.mo808xfb85f7b0());
                t21.p3.f496396y = t21.p3.f496396y + (-1);
                return;
            }
            if (i18 == 4 && this.f496371f == 102) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ignore_c2c_retry_upload_video_error, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoService", "upload video returns 102 code, waiting for the retried response");
                    t21.p3.f496396y--;
                    return;
                }
            }
            if (m1Var instanceof t21.w0) {
                t21.w0 w0Var = (t21.w0) m1Var;
                int i19 = w0Var.f496569i;
                boolean h17 = ih.a.h("clicfg_video_service_ignore_duplicate", true);
                java.lang.String str2 = w0Var.f496566f;
                if (!h17 && !((java.util.HashMap) p3Var.f496405o).containsKey(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoService", "call end duplicate, just return, file name = " + str2);
                    return;
                }
                str = str2;
                i17 = i19;
            } else {
                str = m1Var instanceof t21.q1 ? ((t21.q1) m1Var).f496419f : null;
                i17 = 0;
            }
            p3Var.f496407q = false;
            p3Var.f496412v = null;
        }
        if (str != null && ((java.util.HashMap) p3Var.f496405o).get(str) != null) {
            java.util.Map map = p3Var.f496405o;
            ((fp.j) ((java.util.HashMap) map).get(str)).a();
            ((java.util.HashMap) map).remove(str);
        }
        m1Var.mo808xfb85f7b0();
        java.util.Objects.toString(m1Var);
        if (i18 == 3 && i17 != 0) {
            p3Var.f496409s--;
        } else if (i18 != 0) {
            p3Var.f496409s = 0;
        }
        int i27 = p3Var.f496409s;
        boolean z17 = p3Var.f496406p;
        boolean z18 = p3Var.f496407q;
        if (i27 > 0) {
            t21.p3.b(p3Var);
        } else if (!z18 && !z17) {
            p3Var.f();
        }
        t21.p3.f496396y--;
    }

    /* renamed from: toString */
    public java.lang.String m165702x9616526c() {
        return super.toString() + "|onSceneEnd";
    }
}
