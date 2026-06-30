package je2;

/* loaded from: classes3.dex */
public final class z extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f380822f;

    /* renamed from: g, reason: collision with root package name */
    public int f380823g;

    /* renamed from: h, reason: collision with root package name */
    public int f380824h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f380822f = "LiveSeiDataSlice";
    }

    public final int N6() {
        return this.f380824h;
    }

    public final int O6() {
        return this.f380823g;
    }

    public final r45.p72 P6() {
        java.lang.String str;
        r45.p72 p72Var = new r45.p72();
        r45.v74 v74Var = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410513g;
        if (v74Var == null || (str = v74Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        if (str.length() == 0) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str = a52.a.f83117l;
        }
        p72Var.set(0, str);
        p72Var.set(1, "LiveCdn_" + ((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        r45.s7 s7Var = new r45.s7();
        s7Var.set(0, java.lang.Integer.valueOf(this.f380823g));
        s7Var.set(1, java.lang.Integer.valueOf(this.f380824h));
        p72Var.set(2, s7Var);
        p72Var.set(3, java.lang.Long.valueOf(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410516m));
        p72Var.set(4, java.lang.Long.valueOf(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        p72Var.set(5, 0);
        return p72Var;
    }

    public final void Q6(int i17, java.lang.String str) {
        try {
            long a17 = c01.id.a();
            cl0.d dVar = new cl0.d(str);
            hn0.u uVar = hn0.u.f363970e;
            R6((int) java.lang.Math.abs(a17 - (i17 == 16 ? dVar.f124379a.optLong("st", 0L) : 0L)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f380822f, "recordDelayMs " + e17.getMessage());
        }
    }

    public final void R6(int i17) {
        if (i17 != this.f380824h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f380822f, "anchorDelayMs from " + this.f380824h + " to " + i17);
        }
        this.f380824h = i17;
    }

    public final void S6(int i17) {
        if (i17 != this.f380823g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f380822f, "anchorStatus from " + this.f380823g + " to " + i17);
        }
        this.f380823g = i17;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        S6(0);
        R6(0);
    }
}
