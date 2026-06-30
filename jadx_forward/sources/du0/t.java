package du0;

/* loaded from: classes.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f324971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.i0 f324972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p3325xe03a0797.p3326xc267989b.q qVar, du0.i0 i0Var) {
        super(1);
        this.f324971d = qVar;
        this.f324972e = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPermissionsGranted: currentLatLng latitude ");
        sb6.append(lVar != null ? (java.lang.Float) lVar.f384366d : null);
        sb6.append(" longitude ");
        sb6.append(lVar != null ? (java.lang.Float) lVar.f384367e : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", sb6.toString());
        p3325xe03a0797.p3326xc267989b.q qVar = this.f324971d;
        if (lVar == null) {
            ou0.a.a(qVar, null);
        } else {
            this.f324972e.P6(((java.lang.Number) lVar.f384366d).floatValue(), ((java.lang.Number) lVar.f384367e).floatValue(), new du0.s(qVar));
        }
        return jz5.f0.f384359a;
    }
}
