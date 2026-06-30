package zs5;

/* loaded from: classes15.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f556996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f556997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f556998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f556999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e f557000h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(zs5.y yVar, long j17, long j18, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e eVar) {
        super(0);
        this.f556996d = yVar;
        this.f556997e = j17;
        this.f556998f = j18;
        this.f556999g = byteBuffer;
        this.f557000h = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zs5.u uVar;
        zs5.y yVar = this.f556996d;
        long j17 = this.f556997e;
        long j18 = this.f556998f;
        java.nio.ByteBuffer byteBuffer = this.f556999g;
        java.util.List<com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0> list = this.f557000h.f298529d;
        if (list == null) {
            list = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!yVar.f557048p) {
            yVar.f557048p = true;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            et5.e eVar = yVar.f557050r;
            if (eVar != null) {
                eVar.a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a0.DecodeSuccessCalledInNative);
            }
            zs5.u uVar2 = yVar.f557058z;
            uVar2.getClass();
            zs5.y yVar2 = uVar2.f557017a;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = yVar2.f557041i;
            boolean z17 = false;
            if (d1Var != null && d1Var.f298518d == j17) {
                if (yVar2.f557042j == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner scanReportInfo is null");
                    byte[] bArr = (byte[]) yVar2.f557052t.get(java.lang.Long.valueOf(j18));
                    if (bArr == null) {
                        jz5.l lVar = yVar2.f557053u;
                        if (lVar != null && ((java.lang.Number) lVar.f384366d).longValue() == j18) {
                            z17 = true;
                        }
                        if (z17) {
                            bArr = yVar2.f557054v;
                        }
                    }
                    uVar = uVar2;
                    yVar2.f557042j = new com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab(bArr, yVar2.f557035c, yVar2.f557036d, yVar2.f557037e);
                } else {
                    uVar = uVar2;
                }
                yVar2.f557052t.remove(java.lang.Long.valueOf(j18));
                java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) yVar2.f557051s.remove(java.lang.Long.valueOf(j18));
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var2 = yVar2.f557041i;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - (d1Var2 != null ? d1Var2.f298521g : -1L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner sessionId: " + j17 + ", decodeResultList.size: " + list.size() + ", totalCost: " + currentTimeMillis2 + ", bufferKey: " + j18 + ", removeRet: " + byteBuffer2 + ", previewBuffer: " + byteBuffer);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("decode_success_cost_time", currentTimeMillis2);
                bundle.putParcelable("ScanIdentifyReportInfo.DecodeKey", yVar2.f557042j);
                for (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0 i0Var : list) {
                    byte[] c17 = et5.g.c(i0Var);
                    java.lang.String a17 = et5.g.a(i0Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner result: " + a17 + ", charset: " + i0Var.f298590g);
                    com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e80 = new com.p314xaae8f345.p2891x34da02.C25311x69ff7e80(i0Var.f298588e, i0Var.f298589f, a17, c17, i0Var.f298590g, i0Var.f298591h);
                    c25311x69ff7e80.f296783m = i0Var.f298593m;
                    c25311x69ff7e80.f296784n = i0Var.f298595o;
                    c25311x69ff7e80.f296786p = true;
                    com.p314xaae8f345.p2891x34da02.C25303x87b156a3 a18 = zs5.y.A.a(i0Var);
                    if (a18 != null) {
                        arrayList2.add(a18);
                        c25311x69ff7e80.f296785o = new com.p314xaae8f345.p2891x34da02.C25310xa03ac6cd(a18);
                    }
                    arrayList.add(c25311x69ff7e80);
                    if (!yVar2.f557034b.f556878a) {
                        break;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner finalResultList.size: " + arrayList.size());
                if (!arrayList.isEmpty()) {
                    d75.b.g(new zs5.s(uVar.f557017a, j17, arrayList, arrayList2, bundle));
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDecodeSuccessInner sessionId: ");
                sb6.append(j17);
                sb6.append(" != ");
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var3 = yVar2.f557041i;
                sb6.append(d1Var3 != null ? java.lang.Long.valueOf(d1Var3.f298518d) : null);
                sb6.append(", sessionInfo invalid and ignore");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffScanDecodeQueue", sb6.toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "onDecodeSuccessInner cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        return jz5.f0.f384359a;
    }
}
