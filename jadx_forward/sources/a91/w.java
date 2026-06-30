package a91;

/* loaded from: classes13.dex */
public class w implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            c(iVar, jSONArray.getString(0));
            return true;
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetFontWeight", "get 'fontWeight' error.");
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11777xeefaf00d c11777xeefaf00d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11777xeefaf00d) interfaceC11753x43f81f3c;
        if (c11777xeefaf00d == null) {
            return false;
        }
        c(iVar, c11777xeefaf00d.f158645e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        str.getClass();
        if (str.equals("normal")) {
            iVar.f552244a.setFakeBoldText(false);
            iVar.f552245b.setFakeBoldText(false);
        } else if (str.equals("bold")) {
            iVar.f552244a.setFakeBoldText(true);
            iVar.f552245b.setFakeBoldText(true);
        }
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setFontWeight";
    }
}
