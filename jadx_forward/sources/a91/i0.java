package a91;

/* loaded from: classes13.dex */
public class i0 implements a91.d {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11787xf39e212a c11787xf39e212a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11787xf39e212a) interfaceC11753x43f81f3c;
        if (c11787xf39e212a == null) {
            return false;
        }
        c(iVar, c11787xf39e212a.f158663e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        if ("left".equalsIgnoreCase(str)) {
            iVar.f552244a.setTextAlign(android.graphics.Paint.Align.LEFT);
            iVar.f552245b.setTextAlign(android.graphics.Paint.Align.LEFT);
            return true;
        }
        if ("right".equalsIgnoreCase(str)) {
            iVar.f552244a.setTextAlign(android.graphics.Paint.Align.RIGHT);
            iVar.f552245b.setTextAlign(android.graphics.Paint.Align.RIGHT);
            return true;
        }
        if (!"center".equalsIgnoreCase(str)) {
            return true;
        }
        iVar.f552244a.setTextAlign(android.graphics.Paint.Align.CENTER);
        iVar.f552245b.setTextAlign(android.graphics.Paint.Align.CENTER);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setTextAlign";
    }
}
