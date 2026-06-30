package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f f176880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f, java.lang.String str) {
        super(1);
        this.f176880d = activityC13069x47bc6a4f;
        this.f176881e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f.f176766y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176880d;
        activityC13069x47bc6a4f.getClass();
        if (fVar == null) {
            return null;
        }
        java.lang.String str = "errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c;
        java.lang.String str2 = activityC13069x47bc6a4f.f176767d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        int i18 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i18 == 0 && fVar.f152149b == 0) {
            r45.so5 so5Var = (r45.so5) fVar.f152151d;
            if (so5Var == null) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "retcode: " + so5Var.f467420d + ", retmsg: " + so5Var.f467421e);
            if (so5Var.f467420d == 0) {
                java.util.ArrayList arrayList = activityC13069x47bc6a4f.f176775o;
                boolean z17 = true;
                int size = arrayList.size() - 1;
                while (true) {
                    if (-1 >= size) {
                        z17 = false;
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a) arrayList.get(size)).a().f472875e, this.f176881e)) {
                        arrayList.remove(size);
                        break;
                    }
                    size--;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC13069x47bc6a4f.f176774n;
                    if (c22848x6ddd90cf == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPageAdapter");
                        throw null;
                    }
                    c22848x6ddd90cf.m8146xced61ae5();
                }
                activityC13069x47bc6a4f.Y6();
            } else {
                lu1.a0.r(activityC13069x47bc6a4f.mo55332x76847179(), so5Var.f467421e);
            }
        } else {
            lu1.a0.q(activityC13069x47bc6a4f.mo55332x76847179(), "");
        }
        return f0Var;
    }
}
