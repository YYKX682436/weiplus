package l31;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f396921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l31.t f396923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f396924g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396925h;

    public r(int i17, int i18, l31.t tVar, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, java.lang.String str) {
        this.f396921d = i17;
        this.f396922e = i18;
        this.f396923f = tVar;
        this.f396924g = c11158xe7d16ed5;
        this.f396925h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f396922e;
        l31.t tVar = this.f396923f;
        int i18 = this.f396921d;
        if (i18 != 0 || i17 != 0) {
            e31.l lVar = tVar.f396927e;
            if (lVar != null) {
                lVar.d(i18, i17, this.f396925h);
                return;
            }
            return;
        }
        e31.l lVar2 = tVar.f396927e;
        if (lVar2 != null) {
            java.lang.String str = tVar.f396846a;
            com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f396924g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed5);
            lVar2.e(str, c11158xe7d16ed5);
        }
    }
}
