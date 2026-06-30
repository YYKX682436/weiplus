package gi5;

/* loaded from: classes12.dex */
public final class q extends bg3.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // bg3.e
    public void W6(mf3.k mediaInfo, java.lang.String destPath) {
        r45.gp0 gp0Var;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        super.W6(mediaInfo, destPath);
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(destPath);
        ai5.c cVar = mediaInfo instanceof ai5.c ? (ai5.c) mediaInfo : null;
        if (cVar == null || (gp0Var = cVar.f86740a) == null || (str = gp0Var.f456964q2) == null) {
            return;
        }
        ((yb0.g) ((zb0.d0) i95.n0.c(zb0.d0.class))).getClass();
        x51.x0.f533642a.a(p17, str);
    }
}
