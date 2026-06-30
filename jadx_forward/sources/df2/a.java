package df2;

/* loaded from: classes3.dex */
public final class a implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.g f311179d;

    public a(df2.g gVar) {
        this.f311179d = gVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        jz5.f0 f0Var;
        r45.gw1 gw1Var = (r45.gw1) obj;
        if (gw1Var != null) {
            java.lang.String m75945x2fec8307 = gw1Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            df2.g gVar = this.f311179d;
            if (gVar.f311714q.contains(m75945x2fec8307)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CreateNextNoticeGuide", "observe: has shown this guide, msgId=".concat(m75945x2fec8307));
                return;
            }
            gVar.f311714q.add(m75945x2fec8307);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CreateNextNoticeGuide", "showBubble: show msgId=" + gw1Var.m75945x2fec8307(0) + ", guideTitle=" + gw1Var.m75945x2fec8307(2) + ", guideText=" + gw1Var.m75945x2fec8307(3));
            gVar.k7(gVar);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.U1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            gVar.h7(new df2.b(gVar));
            java.lang.String m75945x2fec83072 = gw1Var.m75945x2fec8307(2);
            if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                m75945x2fec83072 = gVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mn_);
            }
            java.lang.String str = m75945x2fec83072;
            java.lang.String m75945x2fec83073 = gw1Var.m75945x2fec8307(3);
            if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                m75945x2fec83073 = gVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mn9);
            }
            java.lang.String str2 = m75945x2fec83073;
            java.lang.String string = gVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mn8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            gVar.l7(new df2.d9(str, str2, string, null, 0, 0, 48, null));
            gVar.g7(new df2.f(gVar));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CreateNextNoticeGuide", "observe: post null");
        }
    }
}
