package ra3;

/* loaded from: classes5.dex */
public class h implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f475038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ra3.l f475039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.e[] f475040c;

    public h(boolean[] zArr, ra3.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.e[] eVarArr) {
        this.f475038a = zArr;
        this.f475039b = lVar;
        this.f475040c = eVarArr;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppEmoticonUtil", "[onSelectedEmoji] emojiInfo:%s", interfaceC4987x84e327cb);
        this.f475038a[0] = true;
        java.lang.String md52 = interfaceC4987x84e327cb.mo42933xb5885648();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w1) this.f475039b;
        w1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("md5", md52);
        w1Var.f225349a.f224976f.c(jSONObject, false);
        mo9754xc39a57c1();
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
        this.f475040c[0].dismiss();
    }
}
