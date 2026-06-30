package k53;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p33.l f385908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f385909e;

    public n0(k53.u0 u0Var, p33.l lVar) {
        this.f385909e = u0Var;
        this.f385908d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = k53.u0.f385927k + "thumb_" + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        java.lang.String str3 = this.f385908d.f433140i;
        k53.u0 u0Var = this.f385909e;
        u0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c17 = j53.d.c(str3);
        if (c17 == null) {
            c17 = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4.f264535b.b(j53.d.b(str2, str3));
            if (b17 != null) {
                c17.f264270f = b17.f264271g;
            }
        }
        if (c17 == null || (str = c17.f264269e) == null) {
            return;
        }
        u0Var.f385931d = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 n0Var = u0Var.f385936i;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f264470d;
        if (copyOnWriteArraySet != null && n0Var != null && !copyOnWriteArraySet.contains(n0Var)) {
            copyOnWriteArraySet.add(n0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().b(u0Var.f385937j);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new k53.o0(u0Var, c17));
    }
}
