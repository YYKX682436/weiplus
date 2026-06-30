package a91;

/* loaded from: classes13.dex */
public class c0 implements a91.d {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11782x545b9680 c11782x545b9680 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11782x545b9680) interfaceC11753x43f81f3c;
        if (c11782x545b9680 == null) {
            return false;
        }
        c(iVar, c11782x545b9680.f158651e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        if ("miter".equalsIgnoreCase(str)) {
            iVar.f552245b.setStrokeJoin(android.graphics.Paint.Join.MITER);
            iVar.f552244a.setStrokeJoin(android.graphics.Paint.Join.MITER);
            return true;
        }
        if ("round".equalsIgnoreCase(str)) {
            iVar.f552245b.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            iVar.f552244a.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            return true;
        }
        if (!"bevel".equalsIgnoreCase(str)) {
            return true;
        }
        iVar.f552245b.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
        iVar.f552244a.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setLineJoin";
    }
}
