package l31;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f396855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l31.e f396857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f396858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396859h;

    public c(int i17, int i18, l31.e eVar, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, java.lang.String str) {
        this.f396855d = i17;
        this.f396856e = i18;
        this.f396857f = eVar;
        this.f396858g = c11158xe7d16ed5;
        this.f396859h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f396856e;
        l31.e eVar = this.f396857f;
        int i18 = this.f396855d;
        if (i18 != 0 || i17 != 0) {
            e31.l lVar = eVar.f396871e;
            if (lVar != null) {
                lVar.d(i18, i17, this.f396859h);
                return;
            }
            return;
        }
        e31.l lVar2 = eVar.f396871e;
        if (lVar2 != null) {
            java.lang.String str = eVar.f396846a;
            com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f396858g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed5);
            lVar2.e(str, c11158xe7d16ed5);
        }
    }
}
