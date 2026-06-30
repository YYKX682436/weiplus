package rf3;

/* loaded from: classes12.dex */
public final class f extends lf3.n implements sf3.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // sf3.f
    public sf3.k Q3(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        return sf3.k.f488933h;
    }

    @Override // sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        sf3.g e17 = mediaInfo.e();
        if (e17 == null) {
            return;
        }
        listener.f(sf3.k.f488930e, e17.b(sf3.m.f488936e, sf3.m.f488937f, sf3.m.f488939h), mediaInfo.mo147256x74bf41ce());
    }
}
