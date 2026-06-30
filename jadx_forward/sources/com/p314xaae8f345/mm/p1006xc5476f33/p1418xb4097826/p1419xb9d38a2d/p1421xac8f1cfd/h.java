package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l f183239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l lVar) {
        super(2);
        this.f183239d = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) obj;
        j92.a item = (j92.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f183239d.getClass();
        m92.b bVar = item.f379885d;
        java.lang.String str2 = bVar.f68723xdec927b;
        boolean z17 = str2 == null || str2.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        if (z17) {
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, itemView, "create_new_account", 8, 0, null, null, 56, null);
        } else {
            java.lang.String str3 = bVar.f68723xdec927b;
            r45.ui4 ui4Var = (r45.ui4) bVar.u0().m75936x14adae67(27);
            if (ui4Var == null || (str = ui4Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            r45.f03 b07 = nk6.b0("finder_private_msg_entrance", str3);
            r45.f03 b08 = nk6.b0("AuthorProfileNotify", str3);
            int i17 = (b07 != null && b07.f455420d == 2 ? b07.f455421e : 0) + (b08 != null && b08.f455420d == 2 ? b08.f455421e : 0);
            android.view.View itemView2 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("finder_username", str3);
            lVarArr[1] = new jz5.l("is_red_dot", java.lang.Integer.valueOf(i17 > 0 ? 1 : 0));
            lVarArr[2] = new jz5.l("wx_username", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, itemView2, "switch_avatar", 8, 0, kz5.c1.k(lVarArr), null, 40, null);
        }
        return jz5.f0.f384359a;
    }
}
