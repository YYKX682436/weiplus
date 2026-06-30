package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes4.dex */
public class m7 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f273309a;

    /* renamed from: b, reason: collision with root package name */
    public int f273310b;

    public m7(android.content.Context context, android.net.Uri uri) {
        java.lang.String string;
        this.f273310b = 0;
        if (uri == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UriFileHelper", "initFileTypeAndPath uri == null");
            return;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UriFileHelper", "initFileTypeAndPath context == null");
            return;
        }
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        java.lang.String type = context.getContentResolver().getType(uri);
        if (type != null && type.length() > 0) {
            android.database.Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor is null");
            } else if (query.getCount() <= 0 || !query.moveToFirst()) {
                query.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
            } else {
                int columnIndex = query.getColumnIndex("_data");
                if (columnIndex == -1) {
                    query.close();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UriFileHelper", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
                } else {
                    string = query.getString(columnIndex);
                    query.close();
                    this.f273309a = string;
                }
            }
            string = null;
            this.f273309a = string;
        } else if (uri.getPath() != null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(uri.getPath());
            if (!r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UriFileHelper", "File is null");
                this.f273310b = 0;
                return;
            }
            java.lang.String o17 = r6Var.o();
            this.f273309a = o17;
            int lastIndexOf = o17.lastIndexOf(".");
            if (lastIndexOf == -1 || lastIndexOf >= this.f273309a.length() - 1) {
                this.f273310b = 1;
            } else {
                type = singleton.getMimeTypeFromExtension(this.f273309a.substring(lastIndexOf + 1));
            }
        }
        if (type == null || this.f273309a == null) {
            this.f273310b = 0;
            return;
        }
        if (type.contains("image")) {
            this.f273310b = 3;
        } else if (type.contains("video")) {
            this.f273310b = 4;
        } else if (type.contains("audio")) {
            this.f273310b = 5;
        } else if (type.contains("mm_item")) {
            this.f273310b = 2;
        } else {
            this.f273310b = 1;
        }
        uri.toString();
    }
}
