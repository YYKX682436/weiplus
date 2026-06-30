package a91;

/* loaded from: classes13.dex */
public class z implements a91.d {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11780x939a1704 c11780x939a1704 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11780x939a1704) interfaceC11753x43f81f3c;
        if (c11780x939a1704 == null) {
            return false;
        }
        c(iVar, c11780x939a1704.f158648e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        if ("butt".equalsIgnoreCase(str)) {
            iVar.f552245b.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            iVar.f552244a.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            return true;
        }
        if ("round".equalsIgnoreCase(str)) {
            iVar.f552245b.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            iVar.f552244a.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            return true;
        }
        if (!"square".equalsIgnoreCase(str)) {
            return true;
        }
        iVar.f552245b.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        iVar.f552244a.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setLineCap";
    }
}
