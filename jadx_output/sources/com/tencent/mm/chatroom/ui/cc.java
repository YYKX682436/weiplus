package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class cc extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f64085d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f64086e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f64087f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f64088g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f64089h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final vg3.x3 f64090i = (vg3.x3) gm0.j1.s(vg3.x3.class);

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomMemberUI f64091m;

    public cc(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI, android.content.Context context, com.tencent.mm.storage.a3 a3Var, java.lang.String str, java.util.List list, java.lang.String str2) {
        this.f64091m = seeRoomMemberUI;
        this.f64086e = a3Var;
        this.f64085d = str;
        this.f64087f = context;
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        d(c01.v1.m(str));
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.chatroom.ui.yb getItem(int i17) {
        return (com.tencent.mm.chatroom.ui.yb) this.f64089h.get(i17);
    }

    public void c(java.lang.String str) {
        com.tencent.mm.storage.z3 z3Var;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f64089h = this.f64088g;
        } else {
            for (com.tencent.mm.chatroom.ui.yb ybVar : this.f64088g) {
                if (ybVar != null && (z3Var = ybVar.f64692b) != null && ybVar.f64691a == 1) {
                    if (z3Var.w0() == null || !z3Var.w0().toUpperCase().contains(str.toUpperCase())) {
                        java.lang.String d17 = z3Var.d1();
                        com.tencent.mm.storage.a3 a3Var = this.f64086e;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.chatroom.ui.SeeRoomMemberUI.U6(a3Var, d17)) && com.tencent.mm.chatroom.ui.SeeRoomMemberUI.U6(a3Var, z3Var.d1()).contains(str)) {
                            arrayList.add(ybVar);
                        } else if (z3Var.f2() != null && z3Var.f2().toUpperCase().contains(str.toUpperCase())) {
                            arrayList.add(ybVar);
                        } else if (z3Var.T0() != null && z3Var.T0().toUpperCase().contains(str.toUpperCase())) {
                            arrayList.add(ybVar);
                        } else if (z3Var.t0() != null && z3Var.t0().contains(str)) {
                            arrayList.add(ybVar);
                        } else if (z3Var.d1() != null && z3Var.d1().contains(str)) {
                            arrayList.add(ybVar);
                        } else if (!z3Var.r2()) {
                            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
                            if (z07 != null && (str2 = z07.field_conRemark) != null && str2.toUpperCase().contains(str.toUpperCase())) {
                                arrayList.add(ybVar);
                            }
                        }
                    } else {
                        arrayList.add(ybVar);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomMemberUI", "[setMemberListBySearch]");
            this.f64089h = arrayList;
        }
        notifyDataSetChanged();
    }

    public void d(java.util.List list) {
        com.tencent.mm.storage.a3 a3Var;
        if (list == null) {
            return;
        }
        this.f64089h.clear();
        int i17 = 0;
        while (true) {
            int size = list.size();
            a3Var = this.f64086e;
            if (i17 >= size) {
                break;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) this.f64090i).Bi().n((java.lang.String) list.get(i17), true);
            if (a3Var.L0(n17.d1())) {
                this.f64089h.add(new com.tencent.mm.chatroom.ui.yb(1, n17, 3));
            } else if (a3Var.G0(n17.d1())) {
                this.f64089h.add(new com.tencent.mm.chatroom.ui.yb(1, n17, 2));
            } else {
                this.f64089h.add(new com.tencent.mm.chatroom.ui.yb(1, n17, 1));
            }
            i17++;
        }
        java.util.Collections.sort(this.f64089h, new com.tencent.mm.chatroom.ui.zb(this));
        this.f64089h.add(new com.tencent.mm.chatroom.ui.yb(2, null));
        if (a3Var.P0()) {
            this.f64089h.add(new com.tencent.mm.chatroom.ui.yb(3, null));
        }
        this.f64088g = this.f64089h;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f64089h.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.cc.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
