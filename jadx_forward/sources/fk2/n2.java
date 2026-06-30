package fk2;

/* loaded from: classes3.dex */
public abstract class n2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f344974m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
        this.f344974m = "CommentItemRedPacket";
    }

    public final void q(final android.content.Context context, java.lang.String clickSendId) {
        final r45.v62 v62Var;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSendId, "clickSendId");
        we2.a aVar = this.f526773a;
        java.util.List a17 = aVar.a();
        if (a17 != null) {
            java.util.Iterator it = a17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((r45.v62) obj).m75945x2fec8307(0), clickSendId)) {
                        break;
                    }
                }
            }
            v62Var = (r45.v62) obj;
        } else {
            v62Var = null;
        }
        if (v62Var != null) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c50.c1.ii((c50.c1) c17, ml2.f5.f408991f, android.text.TextUtils.isEmpty(v62Var.m75945x2fec8307(4)) ? ml2.e5.f408923f : ml2.e5.f408924g, false, 0, 12, null);
            final android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
            aVar.x((android.app.Activity) context, v62Var, new android.os.ResultReceiver(m77777x504cd8a2) { // from class: com.tencent.mm.plugin.finder.live.model.commentitem.CommentItemRedPacket$onSpanClick$1$1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p17;
                    fk2.n2 n2Var = fk2.n2.this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n2Var.f344974m, "openLuckyMoney result:" + i17);
                    r45.v62 v62Var2 = v62Var;
                    if (i17 != -1) {
                        if (i17 == 1 && (p17 = n2Var.f526773a.p()) != null) {
                            qo0.b bVar = qo0.b.f446861a4;
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", v62Var2.m75945x2fec8307(0));
                            p17.mo46557x60d69242(bVar, bundle2);
                            return;
                        }
                        return;
                    }
                    n2Var.f526773a.u(context, v62Var2.m75945x2fec8307(0));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p18 = n2Var.f526773a.p();
                    if (p18 != null) {
                        qo0.b bVar2 = qo0.b.f446861a4;
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", v62Var2.m75945x2fec8307(0));
                        p18.mo46557x60d69242(bVar2, bundle3);
                    }
                }
            }, new fk2.m2(this));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click lucky money item :[");
        sb6.append(v62Var != null ? v62Var.m75945x2fec8307(0) : null);
        sb6.append(", ");
        sb6.append(v62Var != null ? v62Var.m75945x2fec8307(5) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f344974m, sb6.toString());
    }
}
