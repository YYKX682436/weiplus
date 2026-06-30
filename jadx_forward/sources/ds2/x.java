package ds2;

/* loaded from: classes2.dex */
public final class x implements ek4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f324438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cs2.p f324439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f324440c;

    public x(ds2.b0 b0Var, cs2.p pVar, so2.i3 i3Var) {
        this.f324438a = b0Var;
        this.f324439b = pVar;
        this.f324440c = i3Var;
    }

    @Override // ek4.w
    public void b(int i17, dn.o oVar) {
        ds2.b0 b0Var = this.f324438a;
        java.lang.String str = b0Var.f324392g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload task on Start ");
        cs2.p pVar = this.f324439b;
        sb6.append(pVar.f69601xaca5bdda);
        sb6.append(' ');
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (i17 < 0 && ((cs2.p) b0Var.f("onPreloadCompleted", new ds2.w(b0Var, pVar))) != null) {
            java.util.Iterator it = b0Var.f324391f.iterator();
            while (it.hasNext()) {
                ((vr2.i) it.next()).e(pVar.f303625i2, "onPreloadCompleted start ret=" + i17 + " error", pVar, b0Var.f324388c.size(), b0Var.f324389d.size());
            }
        }
        if (i17 == 0) {
            kw2.y Uj = ((c61.l7) i95.n0.c(c61.l7.class)).Uj();
            java.lang.String field_mediaId = pVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            Uj.h(field_mediaId, pVar, this.f324440c);
        }
    }
}
