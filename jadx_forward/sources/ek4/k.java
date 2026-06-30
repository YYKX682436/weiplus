package ek4;

/* loaded from: classes12.dex */
public final class k implements sx.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335192d;

    public k(ek4.s sVar) {
        this.f335192d = sVar;
    }

    @Override // sx.z
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        ek4.s sVar = this.f335192d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f335218a.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.g(sVar, str, gVar, hVar, str));
        return 1;
    }

    @Override // sx.z
    public int b(java.lang.String str, int i17, int i18) {
        ek4.s.a(this.f335192d);
        return 0;
    }

    @Override // sx.z
    public int c(java.lang.String str, int i17, int i18) {
        ek4.s sVar = this.f335192d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f335218a.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.h(sVar, str, i17, i18));
        return 1;
    }

    @Override // sx.z
    public int d(java.lang.String str, int i17, int i18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        ek4.s sVar = this.f335192d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f335218a.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.j(sVar, str, i17, i18, info));
        return 1;
    }

    @Override // sx.z
    /* renamed from: onM3U8Ready */
    public int mo48095xc5dd699b(java.lang.String str, java.lang.String str2) {
        ek4.s sVar = this.f335192d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f335218a.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.i(sVar, str, str2));
        return 1;
    }
}
