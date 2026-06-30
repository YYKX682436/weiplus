package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes13.dex */
public class h2 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f270865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f270866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ec0.e f270867c;

    public h2(android.content.Context context, java.lang.String[] strArr, ec0.e eVar) {
        this.f270865a = context;
        this.f270866b = strArr;
        this.f270867c = eVar;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        return this.f270865a.getContentResolver().query(android.net.Uri.parse(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i2.f270875a), null, null, this.f270866b, null);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        android.database.Cursor cursor = (android.database.Cursor) obj;
        ec0.e eVar = this.f270867c;
        if (cursor == null || cursor.getCount() <= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : this.f270866b) {
                arrayList.add(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3(-1, str, "", "", "", 10237));
            }
            eVar.i3(arrayList);
        } else {
            cursor.moveToFirst();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList2.add(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3(cursor.getInt(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("product_id")), cursor.getString(cursor.getColumnIndex("full_price")), cursor.getString(cursor.getColumnIndex("price_currency")), cursor.getString(cursor.getColumnIndex("price_amount")), cursor.getInt(cursor.getColumnIndex("product_state"))));
                cursor.moveToNext();
            }
            cursor.close();
            eVar.i3(arrayList2);
        }
        super.onPostExecute(cursor);
    }
}
