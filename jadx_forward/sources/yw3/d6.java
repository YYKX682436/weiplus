package yw3;

/* loaded from: classes8.dex */
public final class d6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI f548253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f548254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI repairerSerializeClassDemoUI, org.json.JSONObject jSONObject, java.lang.String str) {
        super(0);
        this.f548253d = repairerSerializeClassDemoUI;
        this.f548254e = jSONObject;
        this.f548255f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI repairerSerializeClassDemoUI = this.f548253d;
        em.m3 m3Var = (em.m3) ((jz5.n) repairerSerializeClassDemoUI.d).mo141623x754a37bb();
        if (m3Var.f336149b == null) {
            m3Var.f336149b = (android.widget.TextView) m3Var.f336148a.findViewById(com.p314xaae8f345.mm.R.id.hpa);
        }
        m3Var.f336149b.setText("jsonTrim: \n" + this.f548254e);
        em.m3 m3Var2 = (em.m3) ((jz5.n) repairerSerializeClassDemoUI.d).mo141623x754a37bb();
        if (m3Var2.f336150c == null) {
            m3Var2.f336150c = (android.widget.TextView) m3Var2.f336148a.findViewById(com.p314xaae8f345.mm.R.id.psq);
        }
        m3Var2.f336150c.setText("xmlTrim: \n" + this.f548255f);
        return jz5.f0.f384359a;
    }
}
