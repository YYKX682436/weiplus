package id3;

/* loaded from: classes.dex */
public final class d implements vz.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id3.e f372447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f372448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f372449c;

    public d(id3.e eVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f372447a = eVar;
        this.f372448b = f0Var;
        this.f372449c = h0Var;
    }

    @Override // vz.o1
    public final void d(int i17, java.lang.String str) {
        id3.e eVar = this.f372447a;
        if (i17 == 0) {
            eVar.a(eVar.e());
            return;
        }
        this.f372448b.f391649d = i17;
        if (str == null) {
            str = "";
        }
        this.f372449c.f391656d = str;
        eVar.a(eVar.d(i17, str));
    }
}
