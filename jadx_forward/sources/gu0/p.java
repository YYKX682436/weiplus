package gu0;

/* loaded from: classes5.dex */
public final class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e f357316d;

    public p(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e) {
        this.f357316d = activityC10926xa2f37a4e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "back edit confirmed by user");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e = this.f357316d;
        gu0.k2 k2Var = activityC10926xa2f37a4e.f150710d;
        if (k2Var != null) {
            gu0.o oVar = new gu0.o(activityC10926xa2f37a4e);
            if (k2Var.f357262e) {
                oVar.mo152xb9724478();
                return;
            }
            k2Var.f357262e = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "finishWithBackEdit");
            k2Var.f357281x.b();
            k2Var.f357278u = null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isCancel", false);
            jSONObject.put("isReedit", true);
            eu0.b bVar = k2Var.f357258a;
            eu0.n nVar = bVar.f338235h;
            if (nVar != null) {
                jSONObject.put("musicInfo", nVar.a());
            }
            java.lang.String str = bVar.f338229b;
            if (str != null) {
                jSONObject.put("transitionID", str);
            }
            java.util.List list = bVar.f338232e;
            if (list != null) {
                jSONObject.put("assetInfos", new org.json.JSONArray((java.util.Collection) list));
            }
            java.lang.String str2 = bVar.f338230c;
            if (str2 != null) {
                jSONObject.put("prompt", str2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "finishWithBackEdit: result param: " + jSONObject);
            k2Var.q(true ^ p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f338228a, "reedit"), jSONObject, oVar);
        }
    }
}
