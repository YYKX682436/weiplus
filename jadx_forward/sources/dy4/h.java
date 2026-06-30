package dy4;

/* loaded from: classes15.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.j f326194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f326195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dy4.j jVar, sf.f fVar) {
        super(3);
        this.f326194d = jVar;
        this.f326195e = fVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        sf.f fVar = this.f326195e;
        dy4.j jVar = this.f326194d;
        if (intValue == 0) {
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = jVar.f326201h;
            if (c25485x5a0a6891 != null) {
                c25485x5a0a6891.mo94535x5c1200c2(str, 1);
            }
            fVar.g("ok");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(jVar.r(), "get url failed with errMsg %s", str2);
            fVar.g("fail");
        }
        return jz5.f0.f384359a;
    }
}
