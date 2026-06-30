package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.i1.class)
/* loaded from: classes5.dex */
public class yh extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.i1, ih3.m {

    /* renamed from: e, reason: collision with root package name */
    public me5.e f281848e;

    /* renamed from: f, reason: collision with root package name */
    public me5.g f281849f;

    /* renamed from: g, reason: collision with root package name */
    public me5.p f281850g;

    /* renamed from: h, reason: collision with root package name */
    public hh3.d f281851h;

    /* renamed from: i, reason: collision with root package name */
    public me5.n f281852i;

    /* renamed from: m, reason: collision with root package name */
    public d14.f f281853m;

    /* renamed from: n, reason: collision with root package name */
    public me5.a f281854n;

    /* renamed from: o, reason: collision with root package name */
    public me5.c f281855o;

    /* renamed from: p, reason: collision with root package name */
    public me5.b f281856p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f281857q;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        me5.e eVar = this.f281848e;
        if (eVar != null) {
            eVar.c();
            this.f281848e = null;
        }
        me5.g gVar = this.f281849f;
        if (gVar != null) {
            gVar.c();
            this.f281849f = null;
        }
        me5.p pVar = this.f281850g;
        if (pVar != null) {
            pVar.c();
            this.f281850g = null;
        }
        hh3.d dVar = this.f281851h;
        if (dVar != null) {
            dVar.c();
            this.f281851h = null;
        }
        me5.n nVar = this.f281852i;
        if (nVar != null) {
            nVar.c();
            this.f281852i = null;
        }
        d14.f fVar = this.f281853m;
        if (fVar != null) {
            fVar.c();
            this.f281853m = null;
        }
        me5.a aVar = this.f281854n;
        if (aVar != null) {
            aVar.c();
            this.f281854n = null;
        }
        me5.c cVar = this.f281855o;
        if (cVar != null) {
            cVar.c();
            this.f281855o = null;
        }
        me5.b bVar = this.f281856p;
        if (bVar != null) {
            bVar.c();
            this.f281856p = null;
        }
    }

    public void m0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, java.util.LinkedList linkedList4, java.util.LinkedList linkedList5, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        android.content.Intent intent = new android.content.Intent(this.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2.class);
        intent.putExtra("msgLocalId", f9Var.m124847x74d37ac6());
        intent.putExtra("msgSvrId", f9Var.I0());
        intent.putExtra("msgTalker", f9Var.Q0());
        intent.putExtra("invitertitle", this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571327bv, java.lang.Integer.valueOf(linkedList.size())));
        intent.putExtra("inviterusername", str);
        intent.putExtra("chatroom", str5);
        intent.putExtra("inviterappid", str2);
        intent.putExtra("inviterdescid", str3);
        intent.putExtra("invitationreason", str4);
        intent.putExtra("ticket", str6);
        intent.putExtra(dm.i4.f66875xa013b0d5, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ","));
        intent.putExtra("nickname", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList2, ","));
        intent.putExtra("descid", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList3, ","));
        intent.putExtra("appid", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList4, ","));
        intent.putExtra("headimgurl", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList5, ","));
        yb5.d dVar = this.f280113d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/NewXmlSysMsgComponent", "dealApproveAddChatRoomMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/NewXmlSysMsgComponent", "dealApproveAddChatRoomMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void n0(android.view.View view, java.util.LinkedList linkedList, java.lang.String str) {
        if (this.f281857q == null) {
            this.f281857q = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this.f280113d.g());
        }
        this.f281857q.a(view, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vh(this), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xh(this, linkedList, str), null);
    }

    public final void o0(long j17, java.util.LinkedList linkedList, int i17) {
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280286r) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) this.f280113d.f542241c.a(sb5.n.class))).n0(j17, linkedList, 1, i17);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class));
        aVar.getClass();
        r01.q3.Ui().z0(aVar.w0());
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.List w07 = aVar.f280277f.w0();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (w07 != null && w07.contains(str)) {
                linkedList2.add(str);
            }
        }
        java.lang.String str2 = null;
        if (linkedList2.size() == 0) {
            if (linkedList.size() == 1) {
                db5.e1.y(aVar.f280113d.g(), aVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4k), null, aVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4l), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.e(aVar));
                return;
            } else {
                db5.e1.y(aVar.f280113d.g(), aVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4g), null, aVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4l), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.f(aVar));
                return;
            }
        }
        android.content.res.Resources s17 = aVar.f280113d.s();
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (linkedList2.size() > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(aVar.f280277f.v0((java.lang.String) linkedList2.get(0)));
            for (int i18 = 1; i18 < linkedList2.size(); i18++) {
                sb6.append(aVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b08));
                sb6.append(aVar.f280277f.v0((java.lang.String) linkedList2.get(i18)));
            }
            str2 = sb6.toString();
        }
        objArr[0] = str2;
        db5.e1.C(aVar.f280113d.g(), s17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4e, objArr), null, aVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4m), aVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.g(aVar, linkedList2), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.h(aVar));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        this.f281850g = new me5.p(this);
        this.f281849f = new me5.g(this);
        this.f281848e = new me5.e(this);
        this.f281851h = new hh3.d(this);
        this.f281852i = new me5.n(this);
        this.f281853m = new d14.f(this);
        this.f281854n = new me5.a(this);
        this.f281855o = new me5.c(this);
        this.f281856p = new me5.b(this);
    }
}
