package mm2;

/* loaded from: classes3.dex */
public final class n2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public boolean f410811f;

    /* renamed from: g, reason: collision with root package name */
    public r45.eq1 f410812g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f410813h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f410814i;

    /* renamed from: m, reason: collision with root package name */
    public dm.o4 f410815m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f410816n;

    /* renamed from: o, reason: collision with root package name */
    public r45.gg1 f410817o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(gk2.e liveBuContext) {
        super(liveBuContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveBuContext, "liveBuContext");
        this.f410816n = new java.util.ArrayList();
    }

    public final void N6(r45.eq1 eq1Var) {
        this.f410812g = eq1Var;
    }

    public final void O6(boolean z17) {
        zl2.q4 q4Var = zl2.q4.f555466a;
        if (q4Var.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFansClubSlice", "isFansClubMember:" + this.f410811f + ",new:" + z17);
        }
        if (z17 != this.f410811f) {
            if (q4Var.E()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("LiveFansClubSlice", "isFansClubMember:" + this.f410811f + ",new:" + z17, new java.lang.Object[0]);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFansClubSlice", "isFansClubMember:" + this.f410811f + ",new:" + z17);
            }
        }
        this.f410811f = z17;
    }

    public final void P6(dm.o4 o4Var) {
        java.lang.String str = o4Var != null ? o4Var.f67814x2c488eb6 : null;
        dm.o4 o4Var2 = this.f410815m;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, o4Var2 != null ? o4Var2.f67814x2c488eb6 : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("joinGift:");
            dm.o4 o4Var3 = this.f410815m;
            sb6.append(o4Var3 != null ? o4Var3.f67814x2c488eb6 : null);
            sb6.append(',');
            dm.o4 o4Var4 = this.f410815m;
            sb6.append(o4Var4 != null ? java.lang.Integer.valueOf(o4Var4.f67799x225ba391) : null);
            sb6.append(',');
            dm.o4 o4Var5 = this.f410815m;
            sb6.append(o4Var5 != null ? java.lang.Integer.valueOf(o4Var5.f67821x227a87d7) : null);
            sb6.append(',');
            dm.o4 o4Var6 = this.f410815m;
            sb6.append(o4Var6 != null ? java.lang.Float.valueOf(o4Var6.f67813x29a891c4) : null);
            sb6.append(",new:");
            sb6.append(o4Var != null ? o4Var.f67814x2c488eb6 : null);
            sb6.append(',');
            sb6.append(o4Var != null ? java.lang.Integer.valueOf(o4Var.f67799x225ba391) : null);
            sb6.append(',');
            sb6.append(o4Var != null ? java.lang.Integer.valueOf(o4Var.f67821x227a87d7) : null);
            sb6.append(',');
            sb6.append(o4Var != null ? java.lang.Float.valueOf(o4Var.f67813x29a891c4) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFansClubSlice", sb6.toString());
        }
        this.f410815m = o4Var;
    }

    public final void Q6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFansClubSlice", "isNeverJoinFanClub set to " + z17);
        this.f410813h = z17;
    }

    public final void R6(boolean z17) {
        zl2.q4 q4Var = zl2.q4.f555466a;
        if (q4Var.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFansClubSlice", "isSuperFans:" + this.f410814i + ",new:" + z17);
        }
        if (z17 != this.f410814i) {
            if (q4Var.E()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("LiveFansClubSlice", "isSuperFans:" + this.f410814i + ",new:" + z17, new java.lang.Object[0]);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFansClubSlice", "isSuperFans:" + this.f410814i + ",new:" + z17);
            }
        }
        this.f410814i = z17;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        O6(false);
        this.f410812g = null;
        P6(null);
        Q6(false);
    }
}
