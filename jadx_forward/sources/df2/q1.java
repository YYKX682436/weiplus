package df2;

/* loaded from: classes3.dex */
public final class q1 extends if2.b implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x7 {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w7 f312659m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f312660n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f312661o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312660n = "";
        this.f312661o = "";
    }

    public void Z6(df2.kx action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorOptionController", "onFocusMicClick, action=" + action + ", curUserSdkId=" + this.f312660n);
        df2.b3 b3Var = (df2.b3) m56789x25fe639c(df2.b3.class);
        if (b3Var == null) {
            return;
        }
        int ordinal = action.ordinal();
        if (ordinal == 0) {
            ml2.h1[] h1VarArr = ml2.h1.f409053d;
            a7(2);
            b3Var.b7(this.f312660n);
        } else {
            if (ordinal != 1) {
                return;
            }
            ml2.h1[] h1VarArr2 = ml2.h1.f409053d;
            a7(3);
            b3Var.c7(this.f312660n);
        }
    }

    public final void a7(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.P2, jSONObject.toString(), null, 4, null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w7 w7Var = this.f312659m;
        if (w7Var != null) {
            if (!w7Var.q()) {
                w7Var = null;
            }
            if (w7Var != null) {
                w7Var.a();
            }
        }
        this.f312659m = null;
    }
}
