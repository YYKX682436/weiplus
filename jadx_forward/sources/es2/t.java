package es2;

/* loaded from: classes2.dex */
public final class t implements ek4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cs2.p f337939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337940d;

    public t(es2.h0 h0Var, java.lang.String str, cs2.p pVar, java.lang.String str2) {
        this.f337937a = h0Var;
        this.f337938b = str;
        this.f337939c = pVar;
        this.f337940d = str2;
    }

    @Override // ek4.y
    public void a(int i17, dn.h hVar) {
        es2.h0 h0Var = this.f337937a;
        java.lang.String str = h0Var.f337908h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel ");
        sb6.append(this.f337938b);
        sb6.append(" preload task on Stop ");
        cs2.p it = this.f337939c;
        sb6.append(it);
        sb6.append(' ');
        java.lang.String str2 = this.f337940d;
        sb6.append(str2);
        sb6.append(' ');
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        es2.g0 g0Var = h0Var.f337909i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        g0Var.b(str2, it, h0Var.f337904d.size(), h0Var.f337905e.size());
    }
}
