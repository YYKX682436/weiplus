package uo1;

/* loaded from: classes5.dex */
public final class f implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f511090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f511091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f511092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f511093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f511094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f511095f;

    public f(boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, long j17, yz5.a aVar) {
        this.f511090a = z17;
        this.f511091b = y1Var;
        this.f511092c = f0Var;
        this.f511093d = g0Var;
        this.f511094e = j17;
        this.f511095f = aVar;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        if (z17 && this.f511090a) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f511091b;
            y1Var.h(new uo1.e(y1Var, this.f511092c, this.f511093d, this.f511094e, this.f511095f));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f511092c;
        f0Var.f391649d = z17 ? f0Var.f391649d | 1 : f0Var.f391649d & (-2);
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f511093d;
        if (g0Var.f391654d > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackupUIUtils", "[222] clear pause time. restartTime=" + g0Var.f391654d);
            eo1.a aVar = eo1.a.f337078a;
            long j17 = this.f511094e;
            aVar.b(j17, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.q(j17);
            g0Var.f391654d = 0L;
        }
        this.f511095f.mo152xb9724478();
    }
}
