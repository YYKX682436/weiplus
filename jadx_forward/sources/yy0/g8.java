package yy0;

@j95.b
/* loaded from: classes4.dex */
public final class g8 extends i95.w implements pp0.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f549645d = "MicroMsg.Maas.BackgroundVideoWorkService";

    public void Ai(java.lang.String workTagId, n55.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yy0.x7(workTagId, this, callback, null), 2, null);
    }

    public o55.a Bi(java.lang.String workTagId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        dm.ib d17 = iz0.d.f377577a.d(workTagId);
        java.lang.String str = this.f549645d;
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "getBackgroundVideoBasicInfo >> workTagId: " + workTagId + ", is not find");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getBackgroundVideoBasicInfo >> workTagId: " + workTagId + ", workType: " + d17.f67037xdb9e6ea3 + ", is find");
        int i17 = d17.f67037xdb9e6ea3;
        java.lang.String field_work_id = d17.f67036xcf7ab2c4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_work_id, "field_work_id");
        long j17 = d17.f67023xca7c3d7;
        java.lang.String field_output_video_path = d17.f67027xae81df62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_video_path, "field_output_video_path");
        java.lang.String field_output_thumb_path = d17.f67026xa8a162e7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_thumb_path, "field_output_thumb_path");
        return new o55.a(i17, field_work_id, j17, field_output_video_path, field_output_thumb_path, 0, 0L, d17.f67024xebaf647, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, null);
    }

    public void Di(java.lang.String workTagId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549645d, "updateWorkTypeByUploadAction >> workTagId: " + workTagId + ", action: " + i17);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yy0.f8(workTagId, this, i17, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object wi(java.lang.String r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yy0.s7
            if (r0 == 0) goto L13
            r0 = r6
            yy0.s7 r0 = (yy0.s7) r0
            int r1 = r0.f549859g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f549859g = r1
            goto L18
        L13:
            yy0.s7 r0 = new yy0.s7
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f549857e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f549859g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f549856d
            java.lang.String r5 = (java.lang.String) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L56
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "cancelWork: "
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = r4.f549645d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            az0.i5 r6 = az0.i5.f97090a
            r0.f549856d = r5
            r0.f549859g = r3
            java.lang.Object r6 = r6.o(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            com.tencent.maas.export.MJExportManager r6 = (com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4041xf31b2ebc) r6
            if (r6 == 0) goto L62
            com.tencent.maas.export.c r0 = new com.tencent.maas.export.c
            r0.<init>(r5)
            r6.a(r0)
        L62:
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy0.g8.wi(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
