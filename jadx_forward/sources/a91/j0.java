package a91;

/* loaded from: classes13.dex */
public class j0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        c(iVar, jSONArray.optString(0));
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11788x8113fa8c c11788x8113fa8c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11788x8113fa8c) interfaceC11753x43f81f3c;
        if (c11788x8113fa8c == null) {
            return false;
        }
        c(iVar, c11788x8113fa8c.f158664e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetTextBaselineAction", "SetTextBaselineAction, align:%s", str);
        if ("top".equalsIgnoreCase(str)) {
            e91.b bVar = iVar.f552244a;
            e91.a aVar = e91.a.TOP;
            bVar.f331873d = aVar;
            iVar.f552245b.f331873d = aVar;
            return true;
        }
        if ("middle".equalsIgnoreCase(str)) {
            e91.b bVar2 = iVar.f552244a;
            e91.a aVar2 = e91.a.MIDDLE;
            bVar2.f331873d = aVar2;
            iVar.f552245b.f331873d = aVar2;
            return true;
        }
        if ("bottom".equalsIgnoreCase(str)) {
            e91.b bVar3 = iVar.f552244a;
            e91.a aVar3 = e91.a.BOTTOM;
            bVar3.f331873d = aVar3;
            iVar.f552245b.f331873d = aVar3;
            return true;
        }
        if (!"normal".equalsIgnoreCase(str)) {
            return true;
        }
        e91.b bVar4 = iVar.f552244a;
        e91.a aVar4 = e91.a.NORMAL;
        bVar4.f331873d = aVar4;
        iVar.f552245b.f331873d = aVar4;
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setTextBaseline";
    }
}
