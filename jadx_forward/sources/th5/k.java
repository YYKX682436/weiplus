package th5;

/* loaded from: classes12.dex */
public final class k extends lf3.n implements zf3.a {

    /* renamed from: d, reason: collision with root package name */
    public final zh5.v f500927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f500927d = new zh5.v(activity);
    }

    @Override // zf3.a
    public void I(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        if (mediaInfo.mo2109xfb85f7b0() == mf3.u.f407658g) {
            mediaInfo = new th5.j(mediaInfo, mediaInfo instanceof th5.q ? (th5.q) mediaInfo : null);
        }
        this.f500927d.I(mediaInfo);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        this.f500927d.mo2273x9d4787cb(i17, i18, intent);
    }

    @Override // zf3.a
    public void z4(mf3.k mediaInfo, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (mediaInfo.mo2109xfb85f7b0() == mf3.u.f407658g) {
            mediaInfo = new th5.j(mediaInfo, mediaInfo instanceof th5.q ? (th5.q) mediaInfo : null);
        }
        this.f500927d.z4(mediaInfo, userName);
    }
}
