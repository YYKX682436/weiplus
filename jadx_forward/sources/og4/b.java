package og4;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f426702f = "MBJsApiHideLoadingAll";

    @Override // lc3.c0
    public java.lang.String f() {
        return "hideLoadingAll";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        oe0.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f426702f, "[gameload] hideLoadingAll");
        pg4.e eVar = (pg4.e) this.f399423a;
        if (eVar != null && (qVar = eVar.B) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] hideLoading");
            ((ku5.t0) ku5.t0.f394148d).D(new n91.x(((n91.y) qVar).f417435b));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5291xdc800f54 c5291xdc800f54 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5291xdc800f54();
            c5291xdc800f54.f135611g.f89223a = 1;
            c5291xdc800f54.e();
        }
        s().mo146xb9724478(k());
    }
}
