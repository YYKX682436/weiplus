package ay;

/* loaded from: classes14.dex */
public final class m implements p012xc85e97e9.p093xedfae76a.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final jy.m f96704a;

    /* renamed from: b, reason: collision with root package name */
    public final xx.y f96705b;

    public m(jy.m screenInfo, xx.y dataReporter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenInfo, "screenInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataReporter, "dataReporter");
        this.f96704a = screenInfo;
        this.f96705b = dataReporter;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        return new ay.l(this.f96704a, this.f96705b);
    }
}
