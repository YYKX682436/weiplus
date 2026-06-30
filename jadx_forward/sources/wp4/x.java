package wp4;

@j95.b
/* loaded from: classes4.dex */
public final class x extends i95.w implements n55.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f529986d = "MicroMsg.RemuxApiImpl";

    public void Ai(java.lang.String workTageId, long j17, long j18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTageId, "workTageId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529986d, "reportTimeLineCheckToUpload >> workTagId: " + workTageId + ", muxResult: " + i17 + ", confirmRemuxTime: " + j17 + " muxFinishTime: " + j18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportTimelineCheckUpload >> workTagId: ");
        sb6.append(workTageId);
        sb6.append(", muxResult: ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
        c6893x57fb842b.f142084d = 12;
        c6893x57fb842b.p(workTageId);
        c6893x57fb842b.f142086f = i17;
        c6893x57fb842b.f142089i = j17;
        c6893x57fb842b.f142092l = j18;
        c6893x57fb842b.k();
    }

    public o55.a Bi(java.lang.String workTagId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        dm.q0 d17 = zp4.e.f556487a.d(workTagId);
        java.lang.String str = this.f529986d;
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "getBackgroundVideoBasicInfo >> workTagId: " + workTagId + ", is not find");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getBackgroundVideoBasicInfo >> workTagId: " + workTagId + ", is find");
        int i17 = d17.f68035xdb9e6ea3;
        java.lang.String field_work_id = d17.f68034xcf7ab2c4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_work_id, "field_work_id");
        long j17 = d17.f68003xca7c3d7;
        java.lang.String field_output_video_path = d17.f68019xae81df62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_video_path, "field_output_video_path");
        java.lang.String field_output_thumb_path = d17.f68017xa8a162e7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_thumb_path, "field_output_thumb_path");
        return new o55.a(i17, field_work_id, j17, field_output_video_path, field_output_thumb_path, 0, 0L, d17.f68009xebaf647, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, null);
    }

    public void Di(java.lang.String workTagId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529986d, "updateWorkTypeByUploadAction >> workTagId: " + workTagId + ", action: " + i17);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new wp4.w(workTagId, this, i17, null), 2, null);
    }

    public void wi(java.lang.String workTagId, n55.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new wp4.o(workTagId, this, callback, null), 2, null);
    }
}
