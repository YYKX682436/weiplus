package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes12.dex */
public class h0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f175285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f175286i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f175287j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.database.MatrixCursor f175288k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e f175289l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e c12937x3f78629e, long j17, android.database.Cursor cursor, android.net.Uri uri, int i17, java.lang.String[] strArr, android.database.MatrixCursor matrixCursor) {
        super(j17, cursor);
        this.f175289l = c12937x3f78629e;
        this.f175285h = uri;
        this.f175286i = i17;
        this.f175287j = strArr;
        this.f175288k = matrixCursor;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        this.f175285h.toString();
        int i17 = this.f175286i;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "query fail, invalid code = %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        java.lang.String[] strArr = this.f175287j;
        int length = strArr.length;
        int i18 = 0;
        while (true) {
            android.database.MatrixCursor matrixCursor = this.f175288k;
            if (i18 >= length) {
                matrixCursor.getCount();
                return matrixCursor;
            }
            java.lang.String str = strArr[i18];
            matrixCursor.addRow(new java.lang.String[]{str, this.f175289l.f175206e.getString(str, "")});
            i18++;
        }
    }
}
