package ye5;

/* loaded from: classes12.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f542782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(yb5.d dVar) {
        super(1);
        this.f542782d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        b11.c mediaGroupVideoInfo = (b11.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaGroupVideoInfo, "mediaGroupVideoInfo");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x4 x4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x4) ((sb5.c0) this.f542782d.f542241c.a(sb5.c0.class));
        x4Var.getClass();
        java.util.Map map = x4Var.f281747e;
        long j17 = mediaGroupVideoInfo.f98563c;
        long j18 = mediaGroupVideoInfo.f98564d;
        boolean z17 = mediaGroupVideoInfo.f98565e;
        boolean z18 = mediaGroupVideoInfo.f98566f;
        java.lang.String fileName = mediaGroupVideoInfo.f98561a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String groupId = mediaGroupVideoInfo.f98562b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        map.put(fileName, new b11.c(fileName, groupId, j17, j18, z17, z18));
        return jz5.f0.f384359a;
    }
}
