package l31;

/* loaded from: classes9.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f396865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f396867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l31.f0 f396868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396869h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396870i;

    public d0(int i17, int i18, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, l31.f0 f0Var, java.lang.String str, java.lang.String str2) {
        this.f396865d = i17;
        this.f396866e = i18;
        this.f396867f = c11158xe7d16ed5;
        this.f396868g = f0Var;
        this.f396869h = str;
        this.f396870i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e31.l lVar;
        int i17 = this.f396866e;
        l31.f0 f0Var = this.f396868g;
        int i18 = this.f396865d;
        if (i18 != 0 || i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdateSubscribeMsgListTask", "updateSubscribeMsgList failed");
            e31.l lVar2 = f0Var.f396875f;
            java.lang.String str = this.f396870i;
            if (lVar2 != null) {
                lVar2.d(i18, i17, str);
            }
            e31.l lVar3 = f0Var.f396874e;
            if (lVar3 != null) {
                lVar3.d(i18, i17, str);
                return;
            }
            return;
        }
        java.lang.String str2 = this.f396869h;
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f396867f;
        if (c11158xe7d16ed5 != null && (lVar = f0Var.f396875f) != null) {
            lVar.e(str2, c11158xe7d16ed5);
        }
        e31.l lVar4 = f0Var.f396874e;
        if (lVar4 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed5);
            lVar4.e(str2, c11158xe7d16ed5);
        }
    }
}
