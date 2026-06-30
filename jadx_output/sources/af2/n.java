package af2;

/* loaded from: classes3.dex */
public final class n extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f4535a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4536b;

    public n(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f4535a = liveContext;
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.lang.Object obj;
        kn0.p pVar;
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f445214a;
        if (r71Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isHistory:");
            sb6.append(r71Var.getInteger(22));
            sb6.append(", getConfig:");
            r45.b94 b94Var = (r45.b94) r71Var.getCustom(21);
            if (b94Var == null || (obj = pm0.b0.b(b94Var)) == null) {
                obj = "";
            }
            sb6.append(obj);
            sb6.append(",msgsize:");
            sb6.append(r71Var.getList(2).size());
            com.tencent.mars.xlog.Log.i("LiveMsgRespSpeedInterceptor", sb6.toString());
            mm2.e5 e5Var = (mm2.e5) this.f4535a.a(mm2.e5.class);
            r45.b94 b94Var2 = (r45.b94) r71Var.getCustom(21);
            if (b94Var2 != null) {
                if (!(b94Var2.getInteger(10) >= 0 || b94Var2.getInteger(11) > 0 || b94Var2.getInteger(0) > 0 || b94Var2.getInteger(6) > 0 || b94Var2.getInteger(3) > 0)) {
                    b94Var2 = null;
                }
                if (b94Var2 != null) {
                    r45.b94 other = e5Var.f329002f;
                    kotlin.jvm.internal.o.g(other, "other");
                    boolean z17 = b94Var2.getInteger(10) == other.getInteger(10) && b94Var2.getInteger(11) == other.getInteger(11) && b94Var2.getInteger(0) == other.getInteger(0) && b94Var2.getInteger(12) == other.getInteger(12);
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSpeedControlSlice", "[isSame] " + z17);
                    if (!z17) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[isSame]  ");
                        sb7.append("config = " + pm0.b0.b(b94Var2));
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSpeedControlSlice", sb7.toString());
                    }
                    if (!z17) {
                        e5Var.f329002f = b94Var2;
                        mm2.e5.f329001o = e5Var.f329002f.getInteger(12);
                    }
                }
            }
            tn0.w0 w0Var = dk2.ef.f233378d;
            if ((w0Var == null || (pVar = w0Var.D) == null || pVar.f()) ? false : true) {
                mm2.e5 e5Var2 = (mm2.e5) this.f4535a.a(mm2.e5.class);
                java.util.LinkedList list = r71Var.getList(2);
                kotlin.jvm.internal.o.f(list, "getMsgList(...)");
                java.util.LinkedList list2 = r71Var.getList(14);
                kotlin.jvm.internal.o.f(list2, "getApp_msg_list(...)");
                if (((mm2.c1) e5Var2.business(mm2.c1.class)).f328902w) {
                    if (e5Var2.f329002f.getInteger(10) <= 0) {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        z65.c.a();
                    } else {
                        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                        h0Var.f310123d = new java.util.ArrayList();
                        java.util.Iterator it = list.iterator();
                        kotlin.jvm.internal.o.f(it, "iterator(...)");
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            kotlin.jvm.internal.o.f(next, "next(...)");
                            r45.t12 t12Var = (r45.t12) next;
                            if (e5Var2.f329004h.contains(java.lang.Integer.valueOf(t12Var.getInteger(3)))) {
                                ((java.util.ArrayList) h0Var.f310123d).add(t12Var);
                                it.remove();
                            }
                        }
                        java.util.Iterator it6 = list2.iterator();
                        kotlin.jvm.internal.o.f(it6, "iterator(...)");
                        while (it6.hasNext()) {
                            java.lang.Object next2 = it6.next();
                            kotlin.jvm.internal.o.f(next2, "next(...)");
                            r45.ch1 ch1Var = (r45.ch1) next2;
                            if (e5Var2.f329004h.contains(java.lang.Integer.valueOf(ch1Var.getInteger(1)))) {
                                ((java.util.ArrayList) h0Var.f310123d).add(ch1Var);
                                it6.remove();
                            }
                        }
                        e5Var2.f329005i.post(new mm2.c5(e5Var2, h0Var));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSpeedControlSlice", "unable LiveRoom Comment,clear cache");
                    e5Var2.f329005i.post(new mm2.b5(e5Var2));
                }
            }
            if (!this.f4536b) {
                mm2.e5 e5Var3 = (mm2.e5) this.f4535a.a(mm2.e5.class);
                kotlinx.coroutines.l.d(e5Var3.f328963d.f272475i, kotlinx.coroutines.q1.f310570c, null, new mm2.a5(e5Var3, null), 2, null);
                this.f4536b = true;
            }
        }
        return true;
    }

    @Override // we2.x
    public void c() {
        this.f4536b = false;
    }
}
