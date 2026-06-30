package qk;

/* loaded from: classes9.dex */
public class o extends dm.h1 implements rv.t2 {

    /* renamed from: p1, reason: collision with root package name */
    public java.util.List f445833p1;

    /* renamed from: x1, reason: collision with root package name */
    public qk.n f445834x1;

    /* renamed from: y1, reason: collision with root package name */
    public static final l75.e0 f445831y1 = dm.h1.m125022x3593deb(qk.o.class);

    /* renamed from: z1, reason: collision with root package name */
    public static int f445832z1 = 0;
    public static qk.n A1 = null;

    public qk.n A0() {
        return D0(false);
    }

    public qk.n D0(boolean z17) {
        if (this.f445834x1 == null || z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f66740x26b3182a) || f445832z1 != this.f66740x26b3182a.hashCode()) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.M4(this.f66748xdec927b)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.a();
                }
                qk.n a17 = qk.n.a(this.f66740x26b3182a);
                this.f445834x1 = a17;
                A1 = a17;
                java.lang.String str = this.f66740x26b3182a;
                if (str == null) {
                    str = "";
                }
                f445832z1 = str.hashCode();
            } else {
                this.f445834x1 = A1;
            }
        }
        return this.f445834x1;
    }

    public boolean F0() {
        qk.g d17;
        A0();
        qk.n nVar = this.f445834x1;
        if (nVar == null || (d17 = nVar.d()) == null) {
            return false;
        }
        boolean z17 = d17.f445650b == 1;
        if (z17) {
            int i17 = this.f66732x6e664fd4;
            if (!((1 & i17) != 0)) {
                this.f66732x6e664fd4 = 1 | i17;
                ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).wi(this);
            }
        }
        return z17;
    }

    public boolean G0() {
        A0();
        return this.f66746x2262335f == 3;
    }

    public boolean I0() {
        A0();
        return this.f66746x2262335f == 2;
    }

    public boolean J0() {
        A0();
        int i17 = this.f66746x2262335f;
        return i17 == 2 || i17 == 3;
    }

    public boolean L0() {
        A0();
        qk.n nVar = this.f445834x1;
        if (nVar == null || nVar.d() == null) {
            return false;
        }
        boolean z17 = this.f445834x1.f445799k.f445650b == 2;
        if (z17) {
            int i17 = this.f66732x6e664fd4;
            if (!((2 & i17) != 0)) {
                this.f66732x6e664fd4 = 2 | i17;
                ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).wi(this);
            }
        }
        return z17;
    }

    public boolean P0() {
        A0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "is report location, user %s %B", this.f66748xdec927b, java.lang.Boolean.valueOf(this.f445834x1.o()));
        return this.f445834x1.o();
    }

    public boolean Q0() {
        A0();
        return this.f66746x2262335f == 1;
    }

    public boolean R0() {
        A0();
        qk.n nVar = this.f445834x1;
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo() null");
            return true;
        }
        if (nVar.i() != null) {
            return !this.f445834x1.i().f445780c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo().getRegisterSource() null");
        return true;
    }

    public boolean T0() {
        A0();
        return this.f66746x2262335f == 0;
    }

    public boolean U0() {
        if (java.lang.System.currentTimeMillis() - this.f66747xa783a79b > 86400000) {
            return true;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return this.f66747xa783a79b < calendar.getTimeInMillis();
    }

    public boolean W0() {
        return (this.f66733x6baace8e & 1) == 0;
    }

    @Override // dm.h1, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
    }

    @Override // dm.h1, l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        return super.mo9763xeb27878e();
    }

    @Override // dm.h1, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f445831y1;
    }

    public void t0() {
        A0();
        qk.n nVar = this.f445834x1;
        org.json.JSONObject jSONObject = nVar.f445789a;
        if (jSONObject != null) {
            nVar.f445802n = jSONObject.optInt("ConnectorMsgType");
        }
        this.f66727x700528c7 = nVar.f445802n;
        this.f66746x2262335f = D0(false).j();
        if (F0()) {
            this.f66732x6e664fd4 |= 1;
        } else {
            this.f66732x6e664fd4 &= -2;
        }
    }

    public boolean u0() {
        return (this.f66733x6baace8e & 4) != 0;
    }

    public java.util.List v0() {
        java.util.List list = this.f445833p1;
        if (list != null) {
            return list;
        }
        this.f445833p1 = new java.util.LinkedList();
        java.lang.String str = this.f66735x6bac33d0;
        if (str == null || str.length() == 0) {
            return this.f445833p1;
        }
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(this.f66735x6bac33d0).optJSONArray("urls");
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                qk.d dVar = new qk.d();
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                dVar.f445594a = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                dVar.f445596c = optJSONObject.optString("url");
                dVar.f445595b = optJSONObject.optString("title_key");
                dVar.f445597d = optJSONObject.optString("description");
                this.f445833p1.add(dVar);
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        return this.f445833p1;
    }

    public long w0() {
        qk.g d17;
        A0();
        qk.n nVar = this.f445834x1;
        if (nVar != null && (d17 = nVar.d()) != null) {
            long j17 = d17.f445653e;
            if (j17 != 0) {
                return j17;
            }
        }
        return 0L;
    }

    public java.lang.String y0() {
        java.lang.String str;
        try {
            str = D0(false).d().f445649a;
        } catch (java.lang.NullPointerException unused) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "check father: %s, %s", this.f66748xdec927b, str);
        }
        return str;
    }

    public java.lang.String z0() {
        qk.g d17;
        java.lang.String str;
        A0();
        qk.n nVar = this.f445834x1;
        if (nVar == null || (d17 = nVar.d()) == null || (str = d17.f445651c) == null || str.isEmpty()) {
            return null;
        }
        return d17.f445651c;
    }
}
