package pk2;

/* loaded from: classes3.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.n0 f437510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(pk2.n0 n0Var) {
        super(1);
        this.f437510d = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView textView;
        r45.nz6 vp6 = (r45.nz6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vp6, "vp");
        pk2.n0 n0Var = this.f437510d;
        n0Var.getClass();
        int i17 = vp6.f463311d;
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314909c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n0Var.f437556j, "onDefinitionSelected videoQualityLevel:" + i17);
        java.lang.String str = vp6.f463316i;
        if (str == null) {
            str = "";
        }
        if ((str.length() > 0) && (textView = n0Var.f437557k) != null) {
            textView.setText(str);
        }
        efVar.q0(vp6);
        efVar.U(vp6.f463311d);
        ml2.a5[] a5VarArr = ml2.a5.f408741d;
        int i18 = vp6.f463311d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.f77502x92235c1b, 2);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54481xb4cdf7db, i18);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.M2, jSONObject.toString(), null, 4, null);
        android.widget.TextView textView2 = n0Var.f437557k;
        android.content.Context context = textView2 != null ? textView2.getContext() : null;
        if (context != null) {
            db5.t7.h(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egw));
        }
        return jz5.f0.f384359a;
    }
}
