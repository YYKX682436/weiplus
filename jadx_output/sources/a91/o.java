package a91;

/* loaded from: classes13.dex */
public class o implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        c(iVar, canvas);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        c(iVar, canvas);
        return true;
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas) {
        canvas.restore();
        java.util.Stack stack = iVar.f470713c;
        if (stack.isEmpty()) {
            return true;
        }
        e91.b bVar = iVar.f470711a;
        e91.b bVar2 = iVar.f470712b;
        iVar.f470711a = (e91.b) stack.pop();
        iVar.f470712b = (e91.b) iVar.f470714d.pop();
        if (!iVar.f470719i) {
            return true;
        }
        if (iVar.f470711a != bVar) {
            d91.c.f227451b.c(bVar);
        }
        if (iVar.f470712b == bVar2) {
            return true;
        }
        d91.b.f227450b.c(bVar2);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "restore";
    }
}
