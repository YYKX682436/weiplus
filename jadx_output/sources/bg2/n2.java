package bg2;

/* loaded from: classes3.dex */
public final class n2 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20322e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.flow.j2 f20323f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f20324g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f20325h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20326i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20327m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20322e = "Finder.LiveConvertPromoteDataController";
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        java.util.ArrayList arrayList;
        bg2.g2 g2Var;
        kotlinx.coroutines.y0 y0Var;
        cm2.t tVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(14);
        boolean z17 = false;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((r45.ch1) obj).getInteger(1) == 20051) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        r45.ch1 ch1Var = arrayList != null ? (r45.ch1) kz5.n0.k0(arrayList) : null;
        r45.f52 f52Var = new r45.f52();
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                f52Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
        if ((f52Var.getInteger(3) == 1 || ((f52Var.getByteString(2) != null || f52Var.getBoolean(12)) && f52Var.getInteger(3) == 0) ? f52Var : null) != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            byte[] byteArray = f52Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            cm2.t I2 = r4Var.I2(byteArray);
            if (f52Var.getInteger(3) == 1) {
                kotlinx.coroutines.flow.j2 j2Var = this.f20323f;
                if ((j2Var != null ? (cm2.t) ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null) != null && I2 != null) {
                    kotlinx.coroutines.flow.j2 j2Var2 = this.f20323f;
                    if (j2Var2 != null && (tVar = (cm2.t) ((kotlinx.coroutines.flow.h3) j2Var2).getValue()) != null && tVar.f43385d == I2.f43385d) {
                        z17 = true;
                    }
                    if (!z17) {
                        return;
                    }
                }
                kotlinx.coroutines.flow.j2 j2Var3 = this.f20323f;
                if (j2Var3 != null) {
                    ((kotlinx.coroutines.flow.h3) j2Var3).k(null);
                }
            } else if (f52Var.getBoolean(12)) {
                long j17 = f52Var.getBoolean(11) ? e06.p.j(new e06.k(1, f52Var.getInteger(9)), c06.e.f37716d) : 0L;
                com.tencent.mars.xlog.Log.i(this.f20322e, "[notifyBubble] delay = " + j17);
                in5.s0 s0Var = this.f417141d.f417149i;
                if (s0Var != null && (y0Var = s0Var.f293120d) != null) {
                    kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new bg2.j2(j17, this, f52Var, null), 2, null);
                }
            } else {
                kotlinx.coroutines.flow.j2 j2Var4 = this.f20323f;
                if (j2Var4 != null) {
                    ((kotlinx.coroutines.flow.h3) j2Var4).k(I2);
                }
            }
        }
        if (f52Var.getInteger(8) <= 0 || (g2Var = (bg2.g2) N6(bg2.g2.class)) == null) {
            return;
        }
        int integer = f52Var.getInteger(8);
        int integer2 = f52Var.getInteger(9);
        bg2.j7 j7Var = g2Var.f20104f;
        if (j7Var != null) {
            j7Var.d().post(new bg2.i7(integer, j7Var, integer2));
        }
    }

    @Override // tc2.c
    public void Q6() {
        this.f20323f = kotlinx.coroutines.flow.i3.a(null);
    }

    @Override // tc2.c
    public void U6() {
        kotlinx.coroutines.r2 r2Var = this.f20326i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        a7();
        this.f20323f = null;
        this.f20324g = null;
        this.f20325h = null;
        kotlinx.coroutines.r2 r2Var2 = this.f20327m;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f20327m = null;
    }

    public final r45.qc2 Y6(r45.f52 f52Var) {
        com.tencent.mm.protobuf.g gVar;
        java.lang.String str;
        r45.qc2 qc2Var = new r45.qc2();
        qc2Var.set(0, java.lang.Long.valueOf(f52Var != null ? f52Var.getLong(4) : 0L));
        if (f52Var == null || (gVar = f52Var.getByteString(6)) == null) {
            gVar = this.f20325h;
        }
        qc2Var.set(1, gVar);
        qc2Var.set(2, f52Var != null ? f52Var.getByteString(2) : null);
        qc2Var.set(3, java.lang.Boolean.FALSE);
        if (f52Var == null || (str = f52Var.getString(13)) == null) {
            str = "";
        }
        qc2Var.set(4, str);
        qc2Var.set(5, this.f20324g);
        return qc2Var;
    }

    public final void Z6(r45.f52 f52Var) {
        cm2.t tVar;
        if (f52Var == null) {
            kotlinx.coroutines.flow.j2 j2Var = this.f20323f;
            f52Var = (j2Var == null || (tVar = (cm2.t) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null) ? null : zl2.r4.f473950a.J2(tVar);
        }
        kotlinx.coroutines.r2 r2Var = this.f20326i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        a7();
        r45.qc2 Y6 = Y6(f52Var);
        com.tencent.mars.xlog.Log.i(this.f20322e, "[startPollingPromoteInfo] req:" + pm0.b0.g(Y6));
        bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Y6(10, Y6, false, new bg2.k2(this, r45.rc2.class));
        }
        in5.s0 s0Var = this.f417141d.f417149i;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        this.f20326i = mMActivity != null ? kotlinx.coroutines.l.d(v65.m.b(mMActivity), null, null, new bg2.m2(this, null), 3, null) : null;
    }

    public final void a7() {
        bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Z6(10);
        }
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        kotlinx.coroutines.y0 y0Var;
        byte[] byteArray;
        kotlin.jvm.internal.o.g(resp, "resp");
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = false;
        if (d2Var != null && (d2Var.f20011g || d2Var.f20012h || d2Var.f20014m || d2Var.f20018q)) {
            z17 = true;
        }
        if (z17) {
            kotlinx.coroutines.flow.j2 j2Var = this.f20323f;
            kotlinx.coroutines.r2 r2Var = null;
            if (j2Var != null) {
                r45.f52 f52Var = (r45.f52) resp.getCustom(40);
                ((kotlinx.coroutines.flow.h3) j2Var).k((f52Var == null || (byteArray = f52Var.toByteArray()) == null) ? null : zl2.r4.f473950a.I2(byteArray));
            }
            Z6(null);
            in5.s0 s0Var = this.f417141d.f417149i;
            if (s0Var != null && (y0Var = s0Var.f293120d) != null) {
                r2Var = kotlinx.coroutines.l.d(y0Var, null, null, new bg2.i2(this, null), 3, null);
            }
            this.f20327m = r2Var;
        }
    }

    @Override // tc2.h
    public void onLiveEnd() {
        a7();
        kotlinx.coroutines.r2 r2Var = this.f20327m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f20327m = null;
    }
}
