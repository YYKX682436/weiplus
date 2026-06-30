package t21;

/* loaded from: classes12.dex */
public class w1 implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.u1 f496588a;

    public w1(t21.u1 u1Var) {
        this.f496588a = u1Var;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "onUploadFailure, errCode:%s, uploadID:%s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "onUploadFailure, uploadId:%s", str);
        t21.u1 u1Var = this.f496588a;
        t21.d3.G(u1Var.f496494f);
        u1Var.f496492d.mo815x76e0bfae(3, i17, "", u1Var);
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        t21.u1 u1Var = this.f496588a;
        u1Var.f496499n = t21.d3.h(u1Var.f496494f);
        t21.v2 v2Var = u1Var.f496499n;
        if (v2Var == null || v2Var.f496544i == 105) {
            int i17 = v2Var == null ? -1 : v2Var.f496544i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s info is null or has paused, status:%d", u1Var.K(), java.lang.Integer.valueOf(i17));
            p25.e eVar = u1Var.f496503r;
            if (eVar != null) {
                ((z25.d) eVar).f();
            }
            u1Var.f496492d.mo815x76e0bfae(3, 0, "info is null or has paused, status" + i17, u1Var);
            u1Var.f496498m.a(3, 0, 0L, "");
            return;
        }
        t21.v2 v2Var2 = u1Var.f496501p;
        if (v2Var2 != null) {
            if (v2Var2.f496539d > j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra originFileInfo cdnEndProc error oldpos:%d newpos:%d", u1Var.K(), java.lang.Integer.valueOf(u1Var.f496501p.f496539d), java.lang.Long.valueOf(j17));
                return;
            }
            v2Var2.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            t21.v2 v2Var3 = u1Var.f496501p;
            v2Var3.f496539d = (int) j17;
            v2Var3.U = 1032;
            t21.d3.Q(v2Var3);
            return;
        }
        if (v2Var.f496539d > j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", u1Var.K(), java.lang.Integer.valueOf(u1Var.f496499n.f496539d), java.lang.Long.valueOf(j17));
            return;
        }
        v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        t21.v2 v2Var4 = u1Var.f496499n;
        v2Var4.f496539d = (int) j17;
        v2Var4.U = 1032;
        t21.d3.Q(v2Var4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ed  */
    @Override // z25.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(z25.j r23) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w1.c(z25.j):void");
    }
}
