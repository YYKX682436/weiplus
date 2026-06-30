package o72;

/* loaded from: classes9.dex */
public abstract class r3 {
    public static final void a(android.content.Intent intent, com.p314xaae8f345.mm.p2610xe8058ca2.C21013x64a751f c21013x64a751f) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (c21013x64a751f == null) {
            return;
        }
        intent.putExtra("content_type_forward_to_wework", 6);
        intent.putExtra("Select_Data_Send_To_WeWork", c21013x64a751f);
    }

    public static final void b(android.content.Intent intent, o72.r2 r2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if ((r2Var != null ? r2Var.f67640x5ab01132 : null) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r2Var.f67640x5ab01132.f452497f)) {
            return;
        }
        r45.gp0 J2 = o72.x1.J(r2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getFirstDataItem(...)");
        java.lang.String x17 = o72.x1.x(J2);
        if (com.p314xaae8f345.mm.vfs.w6.j(x17)) {
            com.p314xaae8f345.mm.p2610xe8058ca2.C21015xc6dde2a5 c21015xc6dde2a5 = new com.p314xaae8f345.mm.p2610xe8058ca2.C21015xc6dde2a5(com.p314xaae8f345.mm.vfs.w6.i(x17, false));
            intent.putExtra("content_type_forward_to_wework", 3);
            intent.putExtra("Select_Data_Send_To_WeWork", c21015xc6dde2a5);
        }
    }

    public static final void c(android.content.Intent intent, o72.r2 r2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (r2Var == null) {
            return;
        }
        int i17 = r2Var.f67657x2262335f;
        if (i17 == 1) {
            java.lang.String str = r2Var.f67640x5ab01132.f452507s;
            if (str == null) {
                return;
            }
            com.p314xaae8f345.mm.p2610xe8058ca2.C21014xc800ae97 c21014xc800ae97 = new com.p314xaae8f345.mm.p2610xe8058ca2.C21014xc800ae97(str);
            intent.putExtra("content_type_forward_to_wework", 1);
            intent.putExtra("Select_Data_Send_To_WeWork", c21014xc800ae97);
            return;
        }
        if (i17 == 2) {
            r45.bq0 bq0Var = r2Var.f67640x5ab01132;
            if (bq0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(bq0Var.f452497f)) {
                return;
            }
            r45.gp0 J2 = o72.x1.J(r2Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getFirstDataItem(...)");
            java.lang.String x17 = o72.x1.x(J2);
            if (com.p314xaae8f345.mm.vfs.w6.j(x17)) {
                com.p314xaae8f345.mm.p2610xe8058ca2.C21011xd572f9ed c21011xd572f9ed = new com.p314xaae8f345.mm.p2610xe8058ca2.C21011xd572f9ed(com.p314xaae8f345.mm.vfs.w6.i(x17, false));
                intent.putExtra("content_type_forward_to_wework", 2);
                intent.putExtra("Select_Data_Send_To_WeWork", c21011xd572f9ed);
                return;
            }
            return;
        }
        switch (i17) {
            case 4:
                b(intent, r2Var);
                return;
            case 5:
                r45.tq0 tq0Var = r2Var.f67640x5ab01132.f452501m;
                if (tq0Var == null) {
                    return;
                }
                com.p314xaae8f345.mm.p2610xe8058ca2.C21012x4b00eae4 c21012x4b00eae4 = new com.p314xaae8f345.mm.p2610xe8058ca2.C21012x4b00eae4(android.text.TextUtils.isEmpty(tq0Var.f468201h) ? r2Var.f67640x5ab01132.f452495d.f459585y : tq0Var.f468201h, tq0Var.f468197d, tq0Var.f468199f, tq0Var.f468203m);
                intent.putExtra("content_type_forward_to_wework", 7);
                intent.putExtra("Select_Data_Send_To_WeWork", c21012x4b00eae4);
                return;
            case 6:
                r45.bq0 bq0Var2 = r2Var.f67640x5ab01132;
                r45.pp0 pp0Var = bq0Var2 != null ? bq0Var2.f452499h : null;
                if (pp0Var == null) {
                    return;
                }
                a(intent, new com.p314xaae8f345.mm.p2610xe8058ca2.C21013x64a751f(pp0Var.f464807o, pp0Var.f464805m, java.lang.Double.valueOf(pp0Var.f464799d), java.lang.Double.valueOf(pp0Var.f464801f), java.lang.Double.valueOf(pp0Var.f464803h)));
                return;
            case 7:
                break;
            case 8:
                r45.bq0 bq0Var3 = r2Var.f67640x5ab01132;
                if (bq0Var3 == null) {
                    return;
                }
                r45.gp0 gp0Var = (r45.gp0) bq0Var3.f452497f.get(0);
                com.p314xaae8f345.mm.p2610xe8058ca2.C21010xd7fb9f66 c21010xd7fb9f66 = new com.p314xaae8f345.mm.p2610xe8058ca2.C21010xd7fb9f66(com.p314xaae8f345.mm.vfs.w6.i(o72.x1.x(gp0Var), false), java.lang.Long.valueOf(gp0Var.R), gp0Var.f456937d);
                intent.putExtra("content_type_forward_to_wework", 4);
                intent.putExtra("Select_Data_Send_To_WeWork", c21010xd7fb9f66);
                return;
            default:
                switch (i17) {
                    case 18:
                        intent.putExtra("content_type_forward_to_wework", 13);
                        return;
                    case 19:
                        r45.bq0 bq0Var4 = r2Var.f67640x5ab01132;
                        r45.dp0 dp0Var = bq0Var4 != null ? bq0Var4.I : null;
                        if (dp0Var == null) {
                            return;
                        }
                        com.p314xaae8f345.mm.p2610xe8058ca2.C21008x40c862d0 c21008x40c862d0 = new com.p314xaae8f345.mm.p2610xe8058ca2.C21008x40c862d0(dp0Var.f454167d, dp0Var.f454172i, dp0Var.f454170g, com.p314xaae8f345.mm.vfs.w6.i(o72.x1.X((r45.gp0) bq0Var4.f452497f.getFirst()), false), dp0Var.f454173m, r2Var.f67640x5ab01132.f452505q, java.lang.Integer.valueOf(dp0Var.f454171h));
                        intent.putExtra("content_type_forward_to_wework", 5);
                        intent.putExtra("Select_Data_Send_To_WeWork", c21008x40c862d0);
                        return;
                    case 20:
                        return;
                    case 21:
                        break;
                    default:
                        intent.putExtra("content_type_forward_to_wework", -1);
                        return;
                }
        }
        intent.putExtra("content_type_forward_to_wework", 11);
    }
}
