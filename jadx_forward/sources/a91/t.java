package a91;

/* loaded from: classes13.dex */
public class t implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            java.lang.String string = jSONArray.getString(0);
            if (android.text.TextUtils.isEmpty(string)) {
                return false;
            }
            e91.b bVar = iVar.f552244a;
            bVar.f331876g = string;
            bVar.setTypeface(android.graphics.Typeface.create(string, bVar.f331877h));
            e91.b bVar2 = iVar.f552245b;
            bVar2.f331876g = string;
            bVar2.setTypeface(android.graphics.Typeface.create(string, bVar2.f331877h));
            return true;
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetFontFamily", "get 'fontFamily' error.");
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11774x891b914b c11774x891b914b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11774x891b914b) interfaceC11753x43f81f3c;
        if (c11774x891b914b == null) {
            return false;
        }
        java.lang.String str = c11774x891b914b.f158642e;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        e91.b bVar = iVar.f552244a;
        bVar.f331876g = str;
        bVar.setTypeface(android.graphics.Typeface.create(str, bVar.f331877h));
        e91.b bVar2 = iVar.f552245b;
        bVar2.f331876g = str;
        bVar2.setTypeface(android.graphics.Typeface.create(str, bVar2.f331877h));
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setFontFamily";
    }
}
