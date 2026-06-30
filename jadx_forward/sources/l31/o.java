package l31;

/* loaded from: classes9.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f396909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l31.q f396911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f396912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396913h;

    public o(int i17, int i18, l31.q qVar, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, java.lang.String str) {
        this.f396909d = i17;
        this.f396910e = i18;
        this.f396911f = qVar;
        this.f396912g = c11158xe7d16ed5;
        this.f396913h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f396910e;
        l31.q qVar = this.f396911f;
        int i18 = this.f396909d;
        if (i18 != 0 || i17 != 0) {
            e31.l lVar = qVar.f396915e;
            if (lVar != null) {
                lVar.d(i18, i17, this.f396913h);
                return;
            }
            return;
        }
        e31.l lVar2 = qVar.f396915e;
        if (lVar2 != null) {
            java.lang.String str = qVar.f396846a;
            com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f396912g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed5);
            lVar2.e(str, c11158xe7d16ed5);
        }
    }
}
