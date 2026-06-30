package s43;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f484490a = new java.util.HashMap();

    public j(s43.g gVar) {
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        sd.l0 mo64556x9a3f0ba2;
        s43.h hVar = (s43.h) this.f484490a.get(str);
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.c5 c5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.c5) hVar;
            s43.i.f484489a.f484490a.remove(c5Var.f221143c);
            if (jSONObject != null) {
                c5Var.f221141a.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("showAtSomeoneView", "onFinish result = " + jSONObject);
                sd.a aVar = (sd.a) c5Var.f221142b.f488129a;
                if (aVar == null || (mo64556x9a3f0ba2 = aVar.mo64556x9a3f0ba2()) == null) {
                    return;
                }
                mo64556x9a3f0ba2.b("GameAtSomeoneStateFinish", jSONObject);
            }
        }
    }

    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        sd.l0 mo64556x9a3f0ba2;
        s43.h hVar = (s43.h) this.f484490a.get(str);
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.c5 c5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.c5) hVar;
            if (jSONObject == null) {
                return;
            }
            c5Var.f221141a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("showAtSomeoneView", "GameAtSomeoneStateChange onChanged state = " + jSONObject);
            sd.a aVar = (sd.a) c5Var.f221142b.f488129a;
            if (aVar == null || (mo64556x9a3f0ba2 = aVar.mo64556x9a3f0ba2()) == null) {
                return;
            }
            mo64556x9a3f0ba2.b("GameAtSomeoneStateChange", jSONObject);
        }
    }
}
