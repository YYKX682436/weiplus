package y20;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y20.f f540531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y20.f fVar) {
        super(1);
        this.f540531d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qq.c option = (qq.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        y20.f fVar = this.f540531d;
        fVar.f540536e.mo146xb9724478(option);
        p012xc85e97e9.p016x746ad0e3.app.m mVar = fVar.f540537f;
        if (mVar != null) {
            mVar.dismiss();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialog");
        throw null;
    }
}
