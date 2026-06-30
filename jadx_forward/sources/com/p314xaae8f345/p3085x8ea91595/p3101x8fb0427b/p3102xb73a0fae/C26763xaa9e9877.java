package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae;

/* renamed from: com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2 */
/* loaded from: classes13.dex */
public class C26763xaa9e9877 extends com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa {

    /* renamed from: DB_NAME */
    protected static final java.lang.String f56748x8326c1ac = "tmassistant_sdk_v2.db";

    /* renamed from: DB_VERSION */
    protected static final int f56749xe976f9f7 = 3;

    /* renamed from: TABLESS */
    private static final java.lang.Class<?>[] f56750xce3c1a8e = {com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.class, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26771xc4857426.class, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.class, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26773x1ad92530.class, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26770x1f2f7bb2.class, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26774x7029b141.class};

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa f56751x46143c22;

    public C26763xaa9e9877(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i17) {
        super(context, str, cursorFactory, i17);
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa m105423x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa abstractC26765x881576fa;
        android.content.Context m105492x76847179;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.class) {
            if (f56751x46143c22 == null && (m105492x76847179 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179()) != null) {
                f56751x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877(m105492x76847179, f56748x8326c1ac, null, 3);
            }
            abstractC26765x881576fa = f56751x46143c22;
        }
        return abstractC26765x881576fa;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa
    /* renamed from: getDBVersion */
    public int mo105420x2a6413e4() {
        return 3;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa
    /* renamed from: getTables */
    public java.lang.Class<?>[] mo105421x308e615b() {
        return f56750xce3c1a8e;
    }
}
