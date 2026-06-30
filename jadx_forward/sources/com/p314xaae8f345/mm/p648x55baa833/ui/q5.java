package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class q5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f145982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in.b f145983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x5 f145984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f145985h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p944x882e457a.f fVar, in.b bVar, com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f145981d = u3Var;
        this.f145982e = fVar;
        this.f145983f = bVar;
        this.f145984g = x5Var;
        this.f145985h = activityC10349x67700120;
        this.f145986i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p648x55baa833.ui.q5(this.f145981d, this.f145982e, this.f145983f, this.f145984g, this.f145985h, this.f145986i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p648x55baa833.ui.q5 q5Var = (com.p314xaae8f345.mm.p648x55baa833.ui.q5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f145981d.dismiss();
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f145982e;
        boolean b17 = fVar.b();
        com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var = this.f145984g;
        if (b17) {
            r45.xc3 xc3Var = (r45.xc3) fVar.f152151d;
            r45.xy xyVar = (xc3Var == null || (linkedList = xc3Var.f471501d) == null) ? null : (r45.xy) linkedList.get(0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetChatRoomQRCodeStatus:");
            sb6.append(xyVar != null ? new java.lang.Integer(xyVar.f472123e) : null);
            sb6.append(' ');
            sb6.append(xyVar != null ? xyVar.f472122d : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb6.toString());
            if (xyVar == null || xyVar.f472123e != 1) {
                android.content.Context context = x5Var.f146185i;
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = x5Var.f146180d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6e);
                e4Var.c();
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("revoke inviter: ");
                in.b bVar = this.f145983f;
                sb7.append(bVar.f374251d.f374254d);
                sb7.append(", ");
                sb7.append(bVar.f374251d.f374255e);
                sb7.append(' ');
                sb7.append(bVar.f374251d.f374261n);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb7.toString());
                android.content.Context context2 = x5Var.f146185i;
                com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120 = this.f145985h;
                java.lang.String string = activityC10349x67700120.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6i);
                java.lang.String chatRoomName = this.f145986i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chatRoomName, "$chatRoomName");
                in.c inviter = bVar.f374251d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inviter, "inviter");
                android.content.Context context3 = x5Var.f146185i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "access$getContext$p(...)");
                db5.e1.A(context2, string, activityC10349x67700120.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6j, java.lang.String.valueOf(activityC10349x67700120.V6(chatRoomName, inviter, context3, null))), activityC10349x67700120.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572100yp), activityC10349x67700120.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p648x55baa833.ui.o5(x5Var, xyVar), com.p314xaae8f345.mm.p648x55baa833.ui.p5.f145957d);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "GetChatRoomQRCodeStatus : fail");
            android.content.Context context4 = x5Var.f146185i;
            db5.t7.g(context4, context4.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6f));
        }
        return jz5.f0.f384359a;
    }
}
