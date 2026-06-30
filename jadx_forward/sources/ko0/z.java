package ko0;

/* loaded from: classes4.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.o f391448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f391449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jz5.o oVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f391448d = oVar;
        this.f391449e = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject nameAndHash = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameAndHash, "nameAndHash");
        java.lang.String str = ((java.lang.String) this.f391448d.f384376f) + '/' + nameAndHash.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            this.f391449e.f391645d = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveCore.LiveFilterUtil", "#checkAndMakeToReady childFile:" + str + " is not exist");
        }
        return jz5.f0.f384359a;
    }
}
