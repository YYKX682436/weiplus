package r61;

/* loaded from: classes4.dex */
public class u0 extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f474495f = {l75.n0.m145250x3fdc6f77(r61.s0.S, "GoogleFriend")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f474496d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.a1 f474497e;

    public u0(l75.k0 k0Var) {
        super(k0Var, r61.s0.S, "GoogleFriend", null);
        this.f474497e = new r61.t0(this);
        this.f474496d = k0Var;
    }

    public android.database.Cursor D0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append(" WHERE ( ");
            sb6.append("GoogleFriend.googleid='" + str + "'");
            sb6.append(" ) ");
        }
        return this.f474496d.B("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + ((java.lang.Object) sb6), null);
    }

    public boolean J0(r61.s0 s0Var) {
        java.lang.String str = s0Var.f65889xb2c2ce0c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend   WHERE GoogleFriend.googleitemid = \"");
        java.lang.String str2 = "" + str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        java.lang.String sb7 = sb6.toString();
        l75.k0 k0Var = this.f474496d;
        android.database.Cursor f17 = k0Var.f(sb7, null, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        if (!moveToFirst) {
            return mo880xb970c2b9(s0Var);
        }
        int p17 = k0Var.p("GoogleFriend", s0Var.mo9763xeb27878e(), "googleitemid=?", new java.lang.String[]{"" + s0Var.f65889xb2c2ce0c});
        if (p17 > 0) {
            m145262xf35bbb4();
        }
        return p17 > 0;
    }

    public boolean L0(java.lang.String str, int i17) {
        return this.f474496d.A("GoogleFriend", "UPDATE GoogleFriend SET googlecgistatus='" + i17 + "' WHERE googleitemid='" + str + "'");
    }

    public boolean P0(java.lang.String str, int i17, int i18) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f474496d.A("GoogleFriend", "UPDATE GoogleFriend SET googlecgistatus='" + i17 + "' , status='" + i18 + "' WHERE username='" + str + "'");
    }

    @Override // l75.n0
    /* renamed from: getTableName */
    public java.lang.String mo145255x88e404c3() {
        return "GoogleFriend";
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(r61.s0 s0Var) {
        if (s0Var == null) {
            return false;
        }
        return ((int) this.f474496d.l("GoogleFriend", "googleitemid", s0Var.mo9763xeb27878e())) > 0;
    }

    public boolean z0(java.util.ArrayList arrayList) {
        long j17;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        l75.k0 k0Var = this.f474496d;
        if (k0Var != null) {
            j17 = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "surround insertList in a transaction, ticket = %d", java.lang.Long.valueOf(j17));
        } else {
            j17 = -1;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            mo880xb970c2b9((r61.s0) arrayList.get(i17));
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "end updateList transaction");
        }
        l75.a1 a1Var = this.f474497e;
        a1Var.b(2, a1Var, "");
        return true;
    }
}
