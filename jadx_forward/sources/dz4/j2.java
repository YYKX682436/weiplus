package dz4;

/* loaded from: classes12.dex */
public final class j2 extends dz4.d2 {
    @Override // dz4.z1
    public void b(dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.app.Activity activity = context.f326787a;
        android.app.Dialog e17 = e(activity);
        dz4.i iVar = context.f326789c;
        dz4.f fVar = iVar instanceof dz4.f ? (dz4.f) iVar : null;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "handleForwardResultFromC2CNote: reqData null");
            return;
        }
        java.lang.String str = context.f326790d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeNoteFlutterForwardChatHelper", "handleForwardResultFromC2CNote want to send record msg, but toUser is null");
            return;
        }
        long j17 = -1;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            j17 = java.lang.Long.parseLong(fVar.f326765m);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(fVar.f326766n, j17);
        if (k17 == null || k17.m124847x74d37ac6() != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "want to send record msg, but message info is null");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar = c5888x4e3b0044.f136196g;
        eqVar.f88116a = 4;
        eqVar.f88127l = k17;
        eqVar.f88121f = str;
        eqVar.f88122g = context.f326791e;
        c5888x4e3b0044.e();
        e17.dismiss();
        j(activity);
    }

    @Override // dz4.z1
    public boolean c(dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return context.f326789c.f326823a == 1;
    }

    @Override // dz4.d2
    public dc5.a d(java.lang.String msgXml, dz4.a2 forwardData, dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgXml, "msgXml");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardData, "forwardData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        dc5.a d17 = super.d(msgXml, forwardData, context);
        int i17 = d17.f125235d;
        dz4.i iVar = context.f326789c;
        dz4.f fVar = iVar instanceof dz4.f ? (dz4.f) iVar : null;
        if (fVar != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                d17.set(i17 + 0, java.lang.Long.valueOf(java.lang.Long.parseLong(fVar.f326765m)));
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            d17.set(i17 + 1, fVar.f326766n);
        }
        return d17;
    }

    @Override // dz4.d2
    public boolean g() {
        return false;
    }
}
