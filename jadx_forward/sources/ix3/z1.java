package ix3;

/* loaded from: classes12.dex */
public final class z1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f377153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377153d = jz5.h.b(new ix3.y1(this));
    }

    public final em.a3 T6() {
        return (em.a3) ((jz5.n) this.f377153d).mo141623x754a37bb();
    }

    public final void U6(java.lang.String str) {
        try {
            if (!(com.p314xaae8f345.mm.vfs.w6.j(str) && com.p314xaae8f345.mm.vfs.w6.k(str) > 0)) {
                throw new java.lang.IllegalArgumentException("showExif error file not exist!".toString());
            }
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
            if (i17 == null) {
                throw new java.lang.IllegalArgumentException("showExif error null file path".toString());
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("=== EXIF时间信息 ===\n\n");
            java.lang.String[] strArr = {p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e};
            for (int i18 = 0; i18 < 3; i18++) {
                java.lang.String str2 = strArr[i18];
                sb6.append(str2 + ": " + c1098xe10e35e9.m7340x351be6(str2) + '\n');
            }
            em.a3 T6 = T6();
            if (T6.f335595b == null) {
                T6.f335595b = (android.widget.TextView) T6.f335594a.findViewById(com.p314xaae8f345.mm.R.id.t8t);
            }
            T6.f335595b.setText(sb6.toString());
            em.a3 T62 = T6();
            if (T62.f335598e == null) {
                T62.f335598e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) T62.f335594a.findViewById(com.p314xaae8f345.mm.R.id.ssx);
            }
            T62.f335598e.setVisibility(0);
            em.a3 T63 = T6();
            if (T63.f335598e == null) {
                T63.f335598e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) T63.f335594a.findViewById(com.p314xaae8f345.mm.R.id.ssx);
            }
            T63.f335598e.setOnClickListener(new ix3.x1(c1098xe10e35e9, this, str));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RepairerFileMsgDebugUIC", e17, "showExif error", new java.lang.Object[0]);
            em.a3 T64 = T6();
            if (T64.f335595b == null) {
                T64.f335595b = (android.widget.TextView) T64.f335594a.findViewById(com.p314xaae8f345.mm.R.id.t8t);
            }
            T64.f335595b.setText("读取EXIF信息失败: " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emi;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("文件消息调试页面");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.u1(this));
        }
        long longExtra = m158359x1e885992().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(stringExtra, longExtra);
        i95.m c17 = i95.n0.c(tg3.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(tg3.u0.Z1((tg3.u0) c17, k17, null, 2, null));
        em.a3 T6 = T6();
        if (T6.f335599f == null) {
            T6.f335599f = (android.widget.Button) T6.f335594a.findViewById(com.p314xaae8f345.mm.R.id.upa);
        }
        T6.f335599f.setOnClickListener(new ix3.v1(this, longExtra, r6Var));
        em.a3 T62 = T6();
        if (T62.f335596c == null) {
            T62.f335596c = (android.widget.Button) T62.f335594a.findViewById(com.p314xaae8f345.mm.R.id.t98);
        }
        T62.f335596c.setOnClickListener(new ix3.w1(stringExtra, longExtra, this));
        ub0.o oVar = (ub0.o) i95.n0.c(ub0.o.class);
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        if (((ub0.p) oVar).Ai(o17)) {
            em.a3 T63 = T6();
            if (T63.f335597d == null) {
                T63.f335597d = (android.widget.FrameLayout) T63.f335594a.findViewById(com.p314xaae8f345.mm.R.id.t8s);
            }
            T63.f335597d.setVisibility(0);
            U6(r6Var.o());
        }
    }
}
