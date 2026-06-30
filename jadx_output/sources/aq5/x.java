package aq5;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq5.y f13331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f13332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f13333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f13334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(aq5.y yVar, byte[] bArr, java.util.List list, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13331d = yVar;
        this.f13332e = bArr;
        this.f13333f = list;
        this.f13334g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq5.x(this.f13331d, this.f13332e, this.f13333f, this.f13334g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aq5.x xVar = (aq5.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        int i18;
        kotlinx.coroutines.sync.m mVar;
        int i19;
        int i27;
        r45.y77 y77Var;
        aq5.q0 q0Var;
        aq5.x xVar = this;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        while (true) {
            aq5.y yVar = xVar.f13331d;
            r45.i87 i87Var = (r45.i87) ((aq5.d0) yVar.f13340d).a(4, xVar.f13332e, new r45.i87(), true, "sendFile: connection closed while waiting SendFileResponse", com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, true);
            if (i87Var == null) {
                break;
            }
            int i28 = (int) i87Var.f376820d;
            long j17 = i87Var.f376821e;
            kotlinx.coroutines.sync.m mVar2 = yVar.f13346j;
            if (mVar2 != null) {
                ((kotlinx.coroutines.sync.o) mVar2).c();
            }
            int i29 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
            if (i29 <= 0) {
                com.tencent.mars.xlog.Log.w(yVar.f13337a, "sendFile: SendFileResponse receive_size=" + j17);
            } else {
                java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) yVar.f13349m).get(new java.lang.Integer(i28));
                yVar.f13349m.put(new java.lang.Integer(i28), new java.lang.Long((l17 != null ? l17.longValue() : 0L) + j17));
                yVar.f13348l += j17;
            }
            java.lang.Long l18 = (java.lang.Long) ((java.util.LinkedHashMap) yVar.f13349m).get(new java.lang.Integer(i28));
            long longValue = l18 != null ? l18.longValue() : 0L;
            java.util.List list = xVar.f13333f;
            r45.y77 y77Var2 = (r45.y77) kz5.n0.a0(list, i28);
            long j18 = y77Var2 != null ? y77Var2.f390844e : 0L;
            if (j18 > 0) {
                i18 = (int) ((100 * longValue) / j18);
                i17 = i29;
            } else {
                i17 = i29;
                i18 = 0;
            }
            long j19 = xVar.f13334g;
            if (j19 > 0) {
                mVar = mVar2;
                i19 = i17;
                i27 = (int) ((yVar.f13348l * 100) / j19);
            } else {
                mVar = mVar2;
                i19 = i17;
                i27 = 0;
            }
            java.lang.String str = yVar.f13337a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendFile: recv ack fileIndex=");
            sb6.append(i28);
            sb6.append(", receiveSize=");
            sb6.append(j17);
            sb6.append(", fileAcked=");
            sb6.append(longValue);
            sb6.append('/');
            sb6.append(j18);
            sb6.append(" (");
            sb6.append(i18);
            sb6.append("%), totalAcked=");
            sb6.append(yVar.f13348l);
            sb6.append('/');
            sb6.append(j19);
            sb6.append(" (");
            sb6.append(i27);
            sb6.append("%), window(inFlight=");
            int i37 = yVar.f13345i;
            sb6.append(i37 - (mVar != null ? ((kotlinx.coroutines.sync.o) mVar).b() : i37));
            sb6.append('/');
            sb6.append(yVar.f13345i);
            sb6.append(')');
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (i19 > 0 && (y77Var = (r45.y77) kz5.n0.a0(list, i28)) != null) {
                byte[] bArr = new byte[(int) j17];
                aq5.f fVar = (aq5.f) yVar.f13338b.invoke();
                if (fVar != null && (q0Var = fVar.f13234d) != null) {
                    q0Var.e(i28, bArr, y77Var);
                }
            }
            if (yVar.f13350n || yVar.f13348l < j19) {
                xVar = this;
            } else {
                cq5.i iVar = cq5.i.f221543a;
                iVar.h(cq5.h.f221538e);
                iVar.g(cq5.g.f221533e);
                yVar.f13350n = true;
                byte[] bArr2 = this.f13332e;
                java.lang.String str2 = yVar.f13337a;
                try {
                    r45.f87 f87Var = new r45.f87();
                    f87Var.f374107d = true;
                    dq5.a aVar2 = dq5.a.f242371a;
                    byte[] byteArray = f87Var.toByteArray();
                    kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                    com.tencent.mars.xlog.Log.i(str2, "sendFile: SayGoodbye sent, result=" + aVar2.a(6, byteArray, bArr2));
                    break;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str2, e17, "sendFile: failed to send SayGoodbye", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
