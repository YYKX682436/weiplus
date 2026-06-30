package im2;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd f373834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd) {
        super(0);
        this.f373834d = c14380x23078afd;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh()) {
            ig2.m.f372926a.c();
        }
        ig2.m mVar = ig2.m.f372926a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd = this.f373834d;
        ig2.r f17 = mVar.f(c14380x23078afd.f198518h);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("directorHashCode: ");
        sb6.append(c14380x23078afd.f198521n);
        sb6.append(" direct: ");
        boolean z17 = false;
        sb6.append(f17 != null ? f17.hashCode() : 0);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = c14380x23078afd.f198514d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (f17 instanceof ig2.i) {
            ig2.i iVar = (ig2.i) f17;
            if (iVar.c().f372942h != null && iVar.hashCode() == c14380x23078afd.f198521n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "checkLeak auto stop " + c14380x23078afd.f198518h + " scene: " + iVar.c().f372935a);
                f17.a();
                mVar.d();
                mn0.b0 b0Var = iVar.c().f372942h;
                if (b0Var != null) {
                    mn0.b0.C(b0Var, true, false, false, 6, null);
                }
            }
        }
        ug5.f fVar = ug5.v.f509188g;
        java.lang.String key = java.lang.String.valueOf(c14380x23078afd.f198518h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "removePerformer key: ".concat(key));
        java.lang.Object remove = ug5.v.f509190i.remove(key);
        ug5.v vVar = remove instanceof ug5.v ? (ug5.v) remove : null;
        if (vVar != null) {
            java.lang.Object d17 = vVar.d("key_player");
            mn0.b0 b0Var2 = d17 instanceof mn0.b0 ? (mn0.b0) d17 : null;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("performerDirectorHashCode: ");
            sb8.append(c14380x23078afd.f198522o);
            sb8.append(" code: ");
            sb8.append(vVar.hashCode());
            sb8.append(" playing: ");
            sb8.append(b0Var2 != null ? java.lang.Boolean.valueOf(((mn0.y) b0Var2).b(false)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
            if ((f17 != null ? f17.hashCode() : 0) == c14380x23078afd.f198521n) {
                if (b0Var2 != null && ((mn0.y) b0Var2).b(false)) {
                    z17 = true;
                }
                if (z17) {
                    mn0.b0.C(b0Var2, true, false, false, 6, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
