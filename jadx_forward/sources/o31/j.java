package o31;

/* loaded from: classes9.dex */
public final class j implements f31.e, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public f31.e f424209d;

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        try {
            f31.e eVar = this.f424209d;
            if (eVar != null) {
                eVar.a(i17, i18, errMsg, c11158xe7d16ed5);
            }
        } finally {
            this.f424209d = null;
        }
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f424209d = null;
    }
}
