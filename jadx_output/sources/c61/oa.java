package c61;

/* loaded from: classes8.dex */
public final class oa extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f39209d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39210e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.pigeon.mm_foundation.FlutterCgiFinderExtInfo f39211f;

    public oa(byte[] rawData, long j17, com.tencent.pigeon.mm_foundation.FlutterCgiFinderExtInfo extInfo) {
        kotlin.jvm.internal.o.g(rawData, "rawData");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f39209d = rawData;
        this.f39210e = j17;
        this.f39211f = extInfo;
    }

    @Override // com.tencent.mm.protobuf.f
    public int op(int i17, java.lang.Object... objs) {
        kotlin.jvm.internal.o.g(objs, "objs");
        if (i17 != 1) {
            return super.op(i17, java.util.Arrays.copyOf(objs, objs.length));
        }
        r45.he heVar = this.BaseRequest;
        int i18 = heVar != null ? b36.f.i(1, heVar.computeSize()) + 0 : 0;
        com.tencent.pigeon.mm_foundation.FlutterCgiFinderExtInfo extInfo = this.f39211f;
        if (extInfo.getFinderBaseRequestIndex() > 1) {
            en3.b0 b0Var = (en3.b0) ((ra0.w) i95.n0.c(ra0.w.class));
            b0Var.getClass();
            kotlin.jvm.internal.o.g(extInfo, "extInfo");
            java.lang.Long scene = extInfo.getScene();
            r45.kv0 Bi = b0Var.Bi(scene != null ? (int) scene.longValue() : 0, (int) this.f39210e);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<java.lang.String> feedIdList = extInfo.getFeedIdList();
            if (feedIdList != null) {
                for (java.lang.String str : feedIdList) {
                    java.lang.Long scene2 = extInfo.getScene();
                    arrayList.add(new jz5.l(java.lang.Integer.valueOf(scene2 != null ? (int) scene2.longValue() : 0), java.lang.Long.valueOf(pm0.v.Z(str))));
                }
            }
            db2.t4.i(db2.t4.f228171a, Bi, arrayList, null, 4, null);
            i18 += b36.f.i((int) extInfo.getFinderBaseRequestIndex(), Bi.computeSize());
        }
        return i18 + this.f39209d.length;
    }

    @Override // com.tencent.mm.protobuf.f
    public byte[] toByteArray() {
        int i17;
        validate();
        byte[] bArr = new byte[computeSize()];
        g36.f fVar = new g36.f(bArr);
        r45.he heVar = this.BaseRequest;
        if (heVar != null) {
            fVar.i(1, heVar.computeSize());
            this.BaseRequest.writeFields(fVar);
            i17 = b36.f.i(1, this.BaseRequest.computeSize());
        } else {
            i17 = 0;
        }
        com.tencent.pigeon.mm_foundation.FlutterCgiFinderExtInfo extInfo = this.f39211f;
        if (extInfo.getFinderBaseRequestIndex() > 1) {
            en3.b0 b0Var = (en3.b0) ((ra0.w) i95.n0.c(ra0.w.class));
            b0Var.getClass();
            kotlin.jvm.internal.o.g(extInfo, "extInfo");
            java.lang.Long scene = extInfo.getScene();
            r45.kv0 Bi = b0Var.Bi(scene != null ? (int) scene.longValue() : 0, (int) this.f39210e);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<java.lang.String> feedIdList = extInfo.getFeedIdList();
            if (feedIdList != null) {
                for (java.lang.String str : feedIdList) {
                    java.lang.Long scene2 = extInfo.getScene();
                    arrayList.add(new jz5.l(java.lang.Integer.valueOf(scene2 != null ? (int) scene2.longValue() : 0), java.lang.Long.valueOf(pm0.v.Z(str))));
                }
            }
            db2.t4.i(db2.t4.f228171a, Bi, arrayList, null, 4, null);
            fVar.i((int) extInfo.getFinderBaseRequestIndex(), Bi.computeSize());
            Bi.writeFields(fVar);
            i17 += b36.f.i((int) extInfo.getFinderBaseRequestIndex(), Bi.computeSize());
        }
        byte[] bArr2 = this.f39209d;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
        return bArr;
    }
}
