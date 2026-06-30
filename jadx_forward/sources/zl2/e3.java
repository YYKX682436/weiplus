package zl2;

/* loaded from: classes3.dex */
public final class e3 implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f555268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d64 f555269e;

    public e3(p3325xe03a0797.p3326xc267989b.q qVar, r45.d64 d64Var) {
        this.f555268d = qVar;
        this.f555269e = d64Var;
    }

    @Override // w25.e
    public final void i3(java.lang.String str, java.util.List list) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f555268d;
        if (list == null) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestLocationLikeByUser ready to save: ");
        sb6.append(str);
        sb6.append(' ');
        r45.c64 c64Var = (r45.c64) kz5.n0.Z(list);
        java.lang.String str2 = c64Var != null ? c64Var.f452844e : null;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(' ');
        r45.c64 c64Var2 = (r45.c64) kz5.n0.Z(list);
        java.lang.String str3 = c64Var2 != null ? c64Var2.f452843d : null;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" long=");
        r45.d64 d64Var = this.f555269e;
        sb6.append(d64Var.f453707d);
        sb6.append(" lat=");
        sb6.append(d64Var.f453708e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        r45.ze2 ze2Var = new r45.ze2();
        ze2Var.set(2, str);
        ze2Var.set(0, java.lang.Float.valueOf(d64Var.f453707d));
        ze2Var.set(1, java.lang.Float.valueOf(d64Var.f453708e));
        r45.c64 c64Var3 = (r45.c64) kz5.n0.Z(list);
        if (c64Var3 != null) {
            java.lang.String str4 = c64Var3.f452844e;
            ze2Var.set(3, str4 != null ? str4 : "");
            ze2Var.set(5, c64Var3.f452843d);
        }
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(ze2Var, list)));
    }
}
