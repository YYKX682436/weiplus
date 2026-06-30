package a91;

/* loaded from: classes13.dex */
public class a implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        return c(iVar, canvas, ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), ik1.w.g(jSONArray, 3));
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        if (interfaceC11753x43f81f3c == null || !(interfaceC11753x43f81f3c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11751x5155918f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11751x5155918f c11751x5155918f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11751x5155918f) interfaceC11753x43f81f3c;
        return c(iVar, canvas, c11751x5155918f.f158575e, c11751x5155918f.f158576f, c11751x5155918f.f158577g, c11751x5155918f.f158578h);
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas, float f17, float f18, float f19, float f27) {
        if (!canvas.isHardwareAccelerated()) {
            iVar.getClass();
            canvas.drawRect(f17, f18, f17 + f19, f18 + f27, iVar.f552248e);
            return false;
        }
        if (canvas instanceof z81.l) {
            ((z81.l) canvas).a(f17, f18, f19 + f17, f27 + f18);
            return true;
        }
        iVar.getClass();
        return false;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "clearRect";
    }
}
