package kf4;

/* loaded from: classes4.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a f389011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a) {
        super(0);
        this.f389011d = c6082xbd84dd0a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a = this.f389011d;
        if ((c6082xbd84dd0a != null ? c6082xbd84dd0a.f136360g : null) != null) {
            am.jw jwVar = c6082xbd84dd0a.f136360g;
            if (jwVar.f88635a && !android.text.TextUtils.isEmpty(jwVar.f88636b)) {
                kf4.o oVar = kf4.o.f389017d;
                am.jw jwVar2 = c6082xbd84dd0a.f136360g;
                if (!oVar.c(jwVar2.f88636b)) {
                    if (jwVar2.f88637c) {
                        nf4.g g17 = ef4.w.f334001t.g();
                        java.lang.String username = jwVar2.f88636b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                        nf4.f y07 = g17.y0(username);
                        java.util.Map map = kf4.o.f389018e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "access$getUserStateMap$p(...)");
                        map.put(jwVar2.f88636b, y07);
                    } else {
                        kf4.o.f389018e.remove(jwVar2.f88636b);
                    }
                    kf4.o.a(oVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
