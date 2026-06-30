package ek2;

/* loaded from: classes3.dex */
public final class r0 extends ek2.g0 {

    /* renamed from: y, reason: collision with root package name */
    public static final ek2.q0 f335052y = new ek2.q0(null);

    /* renamed from: u, reason: collision with root package name */
    public final r45.t12 f335053u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f335054v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f335055w;

    /* renamed from: x, reason: collision with root package name */
    public final r45.vp2 f335056x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(long j17, byte[] bArr, long j18, java.lang.String nonceId, java.lang.String str, java.lang.String finderUsername, r45.qt2 contextObj, r45.t12 finderLiveMsg, java.lang.String clientMsgId, java.lang.String str2, r45.o72 o72Var) {
        super(contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveMsg, "finderLiveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientMsgId, "clientMsgId");
        this.f335053u = finderLiveMsg;
        this.f335054v = "Finder.CgiFinderLiveCommentPostNew";
        this.f335055w = new org.json.JSONObject();
        r45.vp2 vp2Var = new r45.vp2();
        this.f335056x = vp2Var;
        db2.t4 t4Var = db2.t4.f309704a;
        vp2Var.set(1, t4Var.b(3896, contextObj));
        vp2Var.set(4, java.lang.Long.valueOf(j17));
        vp2Var.set(6, java.lang.Long.valueOf(j18));
        vp2Var.set(5, clientMsgId);
        vp2Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        vp2Var.set(3, finderLiveMsg);
        vp2Var.set(7, nonceId);
        vp2Var.set(8, finderUsername);
        r45.up2 up2Var = new r45.up2();
        up2Var.set(0, str2);
        vp2Var.set(9, up2Var);
        vp2Var.set(10, o72Var);
        t4Var.h((r45.kv0) vp2Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(contextObj.m75939xb282bd08(7)), java.lang.Long.valueOf(j18), str)));
        w04.l.INSTANCE.Ch(540999694, 6);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = vp2Var;
        r45.wp2 wp2Var = new r45.wp2();
        wp2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) wp2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = wp2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpostlivemsg";
        lVar.f152200d = 3896;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveCommentPost init ");
        sb6.append(vp2Var.m75942xfb822ef2(4));
        sb6.append(",msgId:");
        sb6.append(vp2Var.m75945x2fec8307(5));
        sb6.append(',');
        r45.t12 t12Var = (r45.t12) vp2Var.m75936x14adae67(3);
        sb6.append(t12Var != null ? t12Var.m75945x2fec8307(2) : null);
        sb6.append(",type:");
        r45.t12 t12Var2 = (r45.t12) vp2Var.m75936x14adae67(3);
        sb6.append(t12Var2 != null ? java.lang.Integer.valueOf(t12Var2.m75939xb282bd08(3)) : null);
        sb6.append(",float_type:");
        r45.t12 t12Var3 = (r45.t12) vp2Var.m75936x14adae67(3);
        sb6.append(t12Var3 != null ? java.lang.Integer.valueOf(t12Var3.m75939xb282bd08(13)) : null);
        sb6.append("(is float:");
        r45.t12 t12Var4 = (r45.t12) vp2Var.m75936x14adae67(3);
        sb6.append(t12Var4 != null ? java.lang.Integer.valueOf(t12Var4.m75939xb282bd08(12)) : null);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveCommentPostNew", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.wp2 resp = (r45.wp2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(", toastInfo:");
        r45.zm6 zm6Var = (r45.zm6) resp.m75936x14adae67(3);
        sb6.append(zm6Var != null ? java.lang.Boolean.valueOf(zm6Var.m75933x41a8a7f2(1)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335054v, sb6.toString());
        if (i18 == -200024) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        org.json.JSONObject jSONObject = this.f335055w;
        jSONObject.put("liveId", this.f335056x.m75942xfb822ef2(4));
        jSONObject.put("msg", this.f335053u.m75945x2fec8307(2));
    }

    @Override // az2.j
    public java.util.List s() {
        r45.t12 t12Var = (r45.t12) this.f335056x.m75936x14adae67(3);
        return kz5.b0.c(new jz5.l("type", java.lang.String.valueOf(t12Var != null ? t12Var.m75939xb282bd08(3) : 0)));
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335055w;
    }
}
