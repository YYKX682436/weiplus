package id3;

/* loaded from: classes.dex */
public final class h implements vz.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id3.i f372451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f372452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f372453c;

    public h(id3.i iVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f372451a = iVar;
        this.f372452b = f0Var;
        this.f372453c = h0Var;
    }

    @Override // vz.o1
    public final void d(int i17, java.lang.String str) {
        id3.i iVar = this.f372451a;
        if (i17 == 0) {
            iVar.a(iVar.e());
            return;
        }
        this.f372452b.f391649d = i17;
        if (str == null) {
            str = "";
        }
        this.f372453c.f391656d = str;
        iVar.a(iVar.d(i17, str));
    }
}
