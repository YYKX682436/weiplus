package aw2;

/* loaded from: classes2.dex */
public final class f0 extends uo2.m0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aw2.j0 f96281c;

    public f0(aw2.j0 j0Var) {
        this.f96281c = j0Var;
    }

    @Override // uo2.m0
    public void a(java.lang.Object obj) {
        aw2.j0 j0Var = this.f96281c;
        j0Var.getClass();
        if (obj instanceof org.json.JSONObject) {
            try {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                j0Var.f96292f = jSONObject.optString(dm.i4.f66865x76d1ec5a);
                j0Var.f96293g = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 chooseView = j0Var.f96291e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chooseView, "chooseView");
                java.lang.String str = j0Var.f96293g;
                if (str == null) {
                    str = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(chooseView, str, false, 2, null);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostMusicWidget", java.lang.String.valueOf(e17.getMessage()));
            }
        }
    }

    @Override // uo2.m0
    public boolean b(long j17, int i17) {
        aw2.j0 j0Var = this.f96281c;
        java.lang.String str = ((dv2.o0) ((jz5.n) j0Var.f96296m).mo141623x754a37bb()).f325446d;
        if (str != null) {
            if (str.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = j0Var.f96295i;
                int i18 = str.length() == 0 ? -1 : 0;
                if (sVar != null) {
                    sVar.c(j17, i17, "{\"errCode\": " + i18 + ",\"audioUrl\": \"" + str + "\"}");
                }
                return false;
            }
        }
        dv2.o0 o0Var = (dv2.o0) ((jz5.n) j0Var.f96296m).mo141623x754a37bb();
        aw2.e0 e0Var = new aw2.e0(j0Var, j17, i17);
        o0Var.getClass();
        o0Var.f325449g = e0Var;
        pf5.e.m158343xd39de650(o0Var, null, null, new dv2.n0(o0Var, null), 3, null);
        return true;
    }
}
