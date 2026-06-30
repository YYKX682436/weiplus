package pk2;

/* loaded from: classes3.dex */
public final class ya implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f437937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.za f437938b;

    public ya(java.lang.Integer num, pk2.za zaVar) {
        this.f437937a = num;
        this.f437938b = zaVar;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        pk2.f8.f437280a.b(4, 0, 1, z17 ? 2 : 3, this.f437937a);
        zl2.r4.f555483a.V2(z17);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f409511q;
        jz5.l[] lVarArr = new jz5.l[1];
        lVarArr[0] = new jz5.l("button_click_type", z17 ? "1" : "0");
        zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), null, null, null, null, false, 124, null);
        qk2.f.f(this.f437938b, false, 1, null);
    }
}
