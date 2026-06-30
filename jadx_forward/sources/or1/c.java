package or1;

/* loaded from: classes12.dex */
public class c extends pr1.a {

    /* renamed from: o, reason: collision with root package name */
    public static or1.b f428992o;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f428993h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f428994i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f428995j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f428996k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f428997l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f428998m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f428999n;

    public c(java.lang.Object obj) {
        super(5, obj);
    }

    @Override // fb5.c
    public void a(android.content.Context context, fb5.a aVar, java.lang.Object... objArr) {
        java.lang.Object obj;
        r45.gx5 gx5Var;
        qk.o oVar;
        java.lang.CharSequence charSequence;
        if (this.f342416c) {
            return;
        }
        if (context == null || aVar == null || (obj = this.f342415b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
            return;
        }
        if (!(obj instanceof r45.xp)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
            return;
        }
        or1.a aVar2 = (or1.a) aVar;
        r45.pp ppVar = ((r45.xp) obj).f471832e;
        if (ppVar == null || (gx5Var = ppVar.f464796f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDataItem", "The brItem.ContactItem or brItem.ContactItem.ContactItem is null.");
            return;
        }
        r45.rp rpVar = ppVar.f464795e;
        if (objArr != null && objArr.length > 1) {
            java.lang.Object obj2 = objArr[1];
            if (obj2 instanceof java.util.List) {
                this.f439463d = (java.util.List) obj2;
            }
        }
        this.f428997l = gx5Var.f457147d.f454289d;
        this.f428995j = rpVar == null ? "" : rpVar.f466601e;
        r45.du5 du5Var = gx5Var.f457148e;
        qk.j jVar = null;
        try {
            this.f428994i = lr1.m.c(context, du5Var == null ? null : du5Var.f454289d, this.f439463d, (int) aVar2.f428981b.getTextSize());
        } catch (java.lang.Exception unused) {
            this.f428994i = "";
        }
        java.lang.String str = gx5Var.f457147d.f454289d;
        r45.wa0 wa0Var = gx5Var.f457161u;
        if (wa0Var != null) {
            oVar = new qk.o();
            oVar.f66748xdec927b = str;
            int i17 = lr1.m.f402218a;
            oVar.f66733x6baace8e = wa0Var.f470534d;
            oVar.f66734xea1bd3d4 = wa0Var.f470537g;
            oVar.f66735x6bac33d0 = wa0Var.f470536f;
            oVar.f66740x26b3182a = wa0Var.f470535e;
        } else {
            oVar = null;
        }
        if (oVar != null && oVar.D0(false) != null) {
            jVar = oVar.D0(false).k();
        }
        if (jVar != null) {
            qk.n D0 = oVar.D0(false);
            org.json.JSONObject jSONObject = D0.f445789a;
            if (jSONObject != null) {
                D0.f445811w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("IsTrademarkProtection"), 0) == 1;
            }
            this.f428999n = D0.f445811w && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f445710b);
            this.f428998m = gx5Var.f457154n != 0;
        }
        java.lang.String str2 = gx5Var.f457157q;
        if (this.f439463d.size() > 0 && str2 != null && str2.toLowerCase().equals(((java.lang.String) this.f439463d.get(0)).toLowerCase())) {
            try {
                this.f428996k = lr1.m.c(context, str2, this.f439463d, (int) aVar2.f428985f.getTextSize());
                this.f428996k = android.text.TextUtils.concat(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574479id5), this.f428996k);
            } catch (java.lang.Exception unused2) {
                this.f428996k = "";
            }
        }
        java.lang.CharSequence charSequence2 = this.f428996k;
        if (charSequence2 == null || charSequence2.length() == 0 || (charSequence = this.f428995j) == null || ((java.lang.String) charSequence).length() == 0) {
            try {
                this.f428993h = lr1.m.c(context, gx5Var.f457152i, this.f439463d, (int) aVar2.f428983d.getTextSize());
            } catch (java.lang.Exception unused3) {
                this.f428993h = "";
            }
        }
        this.f342416c = true;
    }

    @Override // fb5.c
    public fb5.a b() {
        return new or1.a();
    }

    @Override // fb5.c
    public fb5.b c() {
        if (f428992o == null) {
            f428992o = new or1.b();
        }
        return f428992o;
    }
}
