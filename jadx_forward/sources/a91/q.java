package a91;

/* loaded from: classes13.dex */
public class q implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        c(iVar, canvas);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        c(iVar, canvas);
        return true;
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas) {
        canvas.save();
        e91.b bVar = iVar.f552244a;
        iVar.f552246c.push(bVar);
        if (iVar.f552252i) {
            e91.b a17 = d91.c.f308984b.a();
            iVar.f552244a = a17;
            bVar.b(a17);
        } else {
            iVar.f552244a = bVar.a();
        }
        if (iVar.f552244a == null) {
            iVar.f552244a = bVar;
        }
        e91.b bVar2 = iVar.f552245b;
        iVar.f552247d.push(bVar2);
        if (iVar.f552252i) {
            iVar.f552245b = d91.b.f308983b.a();
        } else {
            iVar.f552245b = bVar2.a();
        }
        bVar2.b(iVar.f552245b);
        if (iVar.f552245b != null) {
            return true;
        }
        iVar.f552245b = bVar2;
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "save";
    }
}
