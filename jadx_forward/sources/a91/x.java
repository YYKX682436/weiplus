package a91;

/* loaded from: classes13.dex */
public class x implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        try {
            int i17 = jSONArray.getInt(0);
            e91.b bVar = iVar.f552244a;
            float f17 = i17 / 255.0f;
            bVar.f331874e = f17;
            bVar.setColor(bVar.f331875f);
            e91.b bVar2 = iVar.f552245b;
            bVar2.f331874e = f17;
            bVar2.setColor(bVar2.f331875f);
            return true;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SetGlobalAlphaAction", "getGlobalAlpha value error. exception : %s", e17);
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11778x3b576267 c11778x3b576267 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11778x3b576267) interfaceC11753x43f81f3c;
        if (c11778x3b576267 == null) {
            return false;
        }
        int i17 = c11778x3b576267.f158646e;
        e91.b bVar = iVar.f552244a;
        float f17 = i17 / 255.0f;
        bVar.f331874e = f17;
        bVar.setColor(bVar.f331875f);
        e91.b bVar2 = iVar.f552245b;
        bVar2.f331874e = f17;
        bVar2.setColor(bVar2.f331875f);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setGlobalAlpha";
    }
}
