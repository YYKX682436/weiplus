package fo5;

/* loaded from: classes14.dex */
public final class l0 implements lo5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f346550b;

    public l0(fo5.r0 r0Var, boolean z17) {
        this.f346549a = r0Var;
        this.f346550b = z17;
    }

    public void a(lo5.b op6) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        int ordinal = op6.ordinal();
        er4.r rVar = er4.r.MP_ROOM_TYPE_VIDEO;
        fo5.r0 r0Var = this.f346549a;
        boolean z18 = this.f346550b;
        if (ordinal == 0) {
            er4.r rVar2 = r0Var.f346616b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "onBannerOperationDone:SlideUpward :isSubCall: " + z18);
            if (!z18) {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fo5.i0(r0Var, null), 3, null);
                return;
            }
            er4.r roomType = r0Var.f346616b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
            z17 = roomType == rVar;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context, i65.a.r(context, z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.kbn : com.p314xaae8f345.mm.R.C30867xcad56011.kbp));
            return;
        }
        if (ordinal == 1) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fo5.f0(z18, r0Var, null), 3, null);
            return;
        }
        if (ordinal == 2) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fo5.h0(r0Var, z18, null), 3, null);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        er4.r roomType2 = r0Var.f346616b;
        if (!z18) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fo5.j0(r0Var, null), 3, null);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType2, "roomType");
        z17 = roomType2 == rVar;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        db5.t7.m(context2, i65.a.r(context2, z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.kbm : com.p314xaae8f345.mm.R.C30867xcad56011.kbo));
    }

    public void b(int i17, bp5.h renderTargetHolder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTargetHolder, "renderTargetHolder");
        fo5.r0 r0Var = this.f346549a;
        ro5.b bVar = r0Var.f346630p;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
            throw null;
        }
        bVar.c(i17, renderTargetHolder);
        if (z17) {
            ro5.b bVar2 = r0Var.f346630p;
            if (bVar2 != null) {
                bVar2.e();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                throw null;
            }
        }
    }
}
