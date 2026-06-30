package pk1;

/* loaded from: classes7.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static /* synthetic */ pk1.q b(pk1.f fVar, android.content.Context context, android.os.Looper looper, boolean z17, mk1.b0 b0Var, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            looper = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            b0Var = null;
        }
        return fVar.a(context, looper, z17, b0Var);
    }

    public final pk1.q a(android.content.Context context, android.os.Looper looper, boolean z17, mk1.b0 b0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        synchronized (this) {
            int i17 = pk1.q.P;
            if (16 <= i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandThumbMediaPlayer", "create, reach limit");
                return null;
            }
            pk1.q.P = i17 + 1;
            return new pk1.q(context, looper, z17, b0Var, null);
        }
    }
}
