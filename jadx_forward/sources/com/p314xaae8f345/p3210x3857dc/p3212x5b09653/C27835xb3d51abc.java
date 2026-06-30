package com.p314xaae8f345.p3210x3857dc.p3212x5b09653;

/* renamed from: com.tencent.xweb.debug.XWebTraceRecordFinishReceiver */
/* loaded from: classes13.dex */
public class C27835xb3d51abc extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.hasExtra("record_file_name")) {
            java.lang.String stringExtra = intent.getStringExtra("record_file_name");
            by5.c4.f("XWebTraceRecordFinishRe", "[XWEB_RECORD_TRACE] OnReceiveRecordFinish: " + stringExtra);
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                yu5.c.b(new qx5.RunnableC30012x6084821("Trace 录制失败"));
            } else if (!com.p314xaae8f345.p3210x3857dc.t0.f302127a.a()) {
                by5.c4.c("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Need local debug permission");
            } else {
                yu5.b.f547447a.a(new qx5.RunnableC30009x608481e(stringExtra));
            }
        }
    }
}
