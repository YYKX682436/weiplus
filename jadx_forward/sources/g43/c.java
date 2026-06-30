package g43;

/* loaded from: classes5.dex */
public final class c implements u33.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f350278b;

    public c(java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f350277a = str;
        this.f350278b = qVar;
    }

    @Override // u33.f
    public final void a(java.util.Map map) {
        u33.h hVar = (u33.h) map.get(this.f350277a);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f350278b;
        if (hVar == null) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        y33.e eVar = (y33.e) hVar;
        java.lang.String str = eVar.f66967xdde069b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUserName(...)");
        java.lang.String str2 = eVar.f66960x21eb2633;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getNickName(...)");
        java.lang.String str3 = eVar.f66951x81118851;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getAvatarUrl(...)");
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new w33.e(str, str2, str3)));
    }
}
