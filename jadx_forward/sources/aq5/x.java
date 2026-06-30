package aq5;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq5.y f94864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f94865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f94866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f94867g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(aq5.y yVar, byte[] bArr, java.util.List list, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94864d = yVar;
        this.f94865e = bArr;
        this.f94866f = list;
        this.f94867g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq5.x(this.f94864d, this.f94865e, this.f94866f, this.f94867g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        aq5.x xVar = (aq5.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        xVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        int i18;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.m mVar;
        int i19;
        int i27;
        r45.y77 y77Var;
        aq5.q0 q0Var;
        aq5.x xVar = this;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        while (true) {
            aq5.y yVar = xVar.f94864d;
            r45.i87 i87Var = (r45.i87) ((aq5.d0) yVar.f94873d).a(4, xVar.f94865e, new r45.i87(), true, "sendFile: connection closed while waiting SendFileResponse", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, true);
            if (i87Var == null) {
                break;
            }
            int i28 = (int) i87Var.f458353d;
            long j17 = i87Var.f458354e;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.m mVar2 = yVar.f94879j;
            if (mVar2 != null) {
                ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar2).c();
            }
            int i29 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
            if (i29 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(yVar.f94870a, "sendFile: SendFileResponse receive_size=" + j17);
            } else {
                java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) yVar.f94882m).get(new java.lang.Integer(i28));
                yVar.f94882m.put(new java.lang.Integer(i28), new java.lang.Long((l17 != null ? l17.longValue() : 0L) + j17));
                yVar.f94881l += j17;
            }
            java.lang.Long l18 = (java.lang.Long) ((java.util.LinkedHashMap) yVar.f94882m).get(new java.lang.Integer(i28));
            long longValue = l18 != null ? l18.longValue() : 0L;
            java.util.List list = xVar.f94866f;
            r45.y77 y77Var2 = (r45.y77) kz5.n0.a0(list, i28);
            long j18 = y77Var2 != null ? y77Var2.f472377e : 0L;
            if (j18 > 0) {
                i18 = (int) ((100 * longValue) / j18);
                i17 = i29;
            } else {
                i17 = i29;
                i18 = 0;
            }
            long j19 = xVar.f94867g;
            if (j19 > 0) {
                mVar = mVar2;
                i19 = i17;
                i27 = (int) ((yVar.f94881l * 100) / j19);
            } else {
                mVar = mVar2;
                i19 = i17;
                i27 = 0;
            }
            java.lang.String str = yVar.f94870a;
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
            sb6.append(yVar.f94881l);
            sb6.append('/');
            sb6.append(j19);
            sb6.append(" (");
            sb6.append(i27);
            sb6.append("%), window(inFlight=");
            int i37 = yVar.f94878i;
            sb6.append(i37 - (mVar != null ? ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar).b() : i37));
            sb6.append('/');
            sb6.append(yVar.f94878i);
            sb6.append(')');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (i19 > 0 && (y77Var = (r45.y77) kz5.n0.a0(list, i28)) != null) {
                byte[] bArr = new byte[(int) j17];
                aq5.f fVar = (aq5.f) yVar.f94871b.mo152xb9724478();
                if (fVar != null && (q0Var = fVar.f94767d) != null) {
                    q0Var.e(i28, bArr, y77Var);
                }
            }
            if (yVar.f94883n || yVar.f94881l < j19) {
                xVar = this;
            } else {
                cq5.i iVar = cq5.i.f303076a;
                iVar.h(cq5.h.f303071e);
                iVar.g(cq5.g.f303066e);
                yVar.f94883n = true;
                byte[] bArr2 = this.f94865e;
                java.lang.String str2 = yVar.f94870a;
                try {
                    r45.f87 f87Var = new r45.f87();
                    f87Var.f455640d = true;
                    dq5.a aVar2 = dq5.a.f323904a;
                    byte[] mo14344x5f01b1f6 = f87Var.mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "sendFile: SayGoodbye sent, result=" + aVar2.a(6, mo14344x5f01b1f6, bArr2));
                    break;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e17, "sendFile: failed to send SayGoodbye", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
