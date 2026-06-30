package a91;

/* loaded from: classes13.dex */
public class q implements a91.d {
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
        canvas.save();
        e91.b bVar = iVar.f470711a;
        iVar.f470713c.push(bVar);
        if (iVar.f470719i) {
            e91.b a17 = d91.c.f227451b.a();
            iVar.f470711a = a17;
            bVar.b(a17);
        } else {
            iVar.f470711a = bVar.a();
        }
        if (iVar.f470711a == null) {
            iVar.f470711a = bVar;
        }
        e91.b bVar2 = iVar.f470712b;
        iVar.f470714d.push(bVar2);
        if (iVar.f470719i) {
            iVar.f470712b = d91.b.f227450b.a();
        } else {
            iVar.f470712b = bVar2.a();
        }
        bVar2.b(iVar.f470712b);
        if (iVar.f470712b != null) {
            return true;
        }
        iVar.f470712b = bVar2;
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "save";
    }
}
