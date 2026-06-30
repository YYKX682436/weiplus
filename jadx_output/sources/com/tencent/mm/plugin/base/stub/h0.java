package com.tencent.mm.plugin.base.stub;

/* loaded from: classes12.dex */
public class h0 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f93752h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93753i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f93754j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.database.MatrixCursor f93755k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXCommProvider f93756l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.base.stub.WXCommProvider wXCommProvider, long j17, android.database.Cursor cursor, android.net.Uri uri, int i17, java.lang.String[] strArr, android.database.MatrixCursor matrixCursor) {
        super(j17, cursor);
        this.f93756l = wXCommProvider;
        this.f93752h = uri;
        this.f93753i = i17;
        this.f93754j = strArr;
        this.f93755k = matrixCursor;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        this.f93752h.toString();
        int i17 = this.f93753i;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "query fail, invalid code = %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        java.lang.String[] strArr = this.f93754j;
        int length = strArr.length;
        int i18 = 0;
        while (true) {
            android.database.MatrixCursor matrixCursor = this.f93755k;
            if (i18 >= length) {
                matrixCursor.getCount();
                return matrixCursor;
            }
            java.lang.String str = strArr[i18];
            matrixCursor.addRow(new java.lang.String[]{str, this.f93756l.f93673e.getString(str, "")});
            i18++;
        }
    }
}
