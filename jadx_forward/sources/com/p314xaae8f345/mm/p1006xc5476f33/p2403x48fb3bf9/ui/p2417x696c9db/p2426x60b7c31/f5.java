package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class f5 implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f266637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266638g;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, java.lang.String str, int i17) {
        this.f266638g = c1Var;
        this.f266635d = y2Var;
        this.f266636e = str;
        this.f266637f = i17;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return oz5.m.f431862d;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        boolean z17 = obj instanceof qc0.m1;
        nw4.y2 y2Var = this.f266635d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266638g;
        if (z17) {
            qc0.m1 m1Var = (qc0.m1) obj;
            if (m1Var.f442944b == -1 && m1Var.f442945c == 0) {
                java.lang.String str = m1Var.a().f442929b;
                if (str == null || str.equals("")) {
                    c1Var.i5(y2Var, "doOpenCamera:fail", null);
                    return;
                }
                try {
                    boolean equals = "imageSearch".equals(this.f266636e);
                    int i17 = this.f266637f;
                    if (equals) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("imgPath", str);
                        hashMap.put("searchScene", java.lang.Integer.valueOf(i17));
                        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(c1Var.f266508d, 11, 6, hashMap);
                        c1Var.i5(y2Var, "doOpenCamera:success", null);
                        return;
                    }
                    su4.i1 i1Var = new su4.i1();
                    i1Var.f494456b = c1Var.f266508d;
                    i1Var.f494461g = str;
                    i1Var.f494463i = i17;
                    i1Var.f494458d = 17;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
                    c1Var.i5(y2Var, "doOpenCamera:success", null);
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doOpenCamera fail, ex = ", e17);
                    c1Var.i5(y2Var, "doOpenCamera:fail", null);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doOpenCamera fail 2");
        c1Var.i5(y2Var, "doOpenCamera:fail", null);
    }
}
