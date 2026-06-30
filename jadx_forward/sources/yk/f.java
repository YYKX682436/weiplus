package yk;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f544278d;

    public f(android.content.Context context) {
        this.f544278d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yk.o oVar = com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135231m;
        android.content.Context context = this.f544278d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135233o = kz5.c0.i(yk.u.class, yk.b.class, yk.b0.class, yk.f0.class, yk.d0.class, yk.d.class);
        if (((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135232n).mo141623x754a37bb()).intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "use period work.");
            oVar.b(context);
        }
    }
}
