package nu1;

@j95.b
/* loaded from: classes13.dex */
public final class n extends i95.w implements nu1.i {

    /* renamed from: e, reason: collision with root package name */
    public static tu1.o f421703e;

    /* renamed from: d, reason: collision with root package name */
    public final nu1.m f421704d = new nu1.m(this);

    static {
        new nu1.j(null);
    }

    public boolean Ai() {
        if (f421703e == null) {
            f421703e = new tu1.o();
        }
        tu1.o oVar = f421703e;
        if (oVar != null) {
            return oVar.f503653k;
        }
        return false;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCast", "happened account release");
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f421704d);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCast", "happened account release");
        wi();
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f421704d);
    }

    public void wi() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.p1318x7643c6b5.ServiceC13083xe7c89147.class));
        if (f421703e == null) {
            f421703e = new tu1.o();
        }
        tu1.o oVar = f421703e;
        if (oVar != null) {
            oVar.d();
        }
    }
}
