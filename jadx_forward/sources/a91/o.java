package a91;

/* loaded from: classes13.dex */
public class o implements a91.d {
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
        canvas.restore();
        java.util.Stack stack = iVar.f552246c;
        if (stack.isEmpty()) {
            return true;
        }
        e91.b bVar = iVar.f552244a;
        e91.b bVar2 = iVar.f552245b;
        iVar.f552244a = (e91.b) stack.pop();
        iVar.f552245b = (e91.b) iVar.f552247d.pop();
        if (!iVar.f552252i) {
            return true;
        }
        if (iVar.f552244a != bVar) {
            d91.c.f308984b.c(bVar);
        }
        if (iVar.f552245b == bVar2) {
            return true;
        }
        d91.b.f308983b.c(bVar2);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "restore";
    }
}
