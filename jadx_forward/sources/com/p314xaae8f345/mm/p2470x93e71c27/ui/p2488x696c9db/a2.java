package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class a2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f273035d = "MicroMsg.FileSelectorAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final int f273036e = 4;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f273037f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f273038g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n1 f273039h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1 f273040i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n2 f273041m;

    /* renamed from: n, reason: collision with root package name */
    public int f273042n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273043o;

    public a2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        this.f273043o = activityC19730xa7b9756f;
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedList, "synchronizedList(...)");
        this.f273037f = synchronizedList;
        java.util.List synchronizedList2 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedList2, "synchronizedList(...)");
        this.f273038g = synchronizedList2;
        this.f273039h = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n1(activityC19730xa7b9756f, this);
        this.f273040i = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1(activityC19730xa7b9756f, this);
        this.f273041m = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n2(activityC19730xa7b9756f, this);
        this.f273042n = 1;
    }

    public final boolean a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var) {
        java.util.Iterator it = this.f273038g.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2) it.next();
            if (d2Var2.f273156a == 4) {
                if (d2Var.f273156a == 4 && (d2Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e2) && ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e2) d2Var).f273135q) {
                    boolean z17 = d2Var.f273095f == d2Var2.f273095f;
                    boolean z18 = d2Var.f273099j == d2Var2.f273099j;
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d2Var.f273098i, d2Var2.f273098i);
                    if (z18 && z17 && b17) {
                        return true;
                    }
                }
            } else if (java.lang.String.valueOf(d2Var.f273098i).equals(d2Var2.f273098i) && d2Var2.f273095f == d2Var.f273095f && d2Var2.f273093d == d2Var.f273093d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d2Var2.f273094e, d2Var.f273094e)) {
                return true;
            }
        }
    }

    public final int c(java.lang.String str, java.lang.String str2) {
        if (str2 == null || r26.n0.N(str2)) {
            str2 = com.p314xaae8f345.mm.vfs.w6.n(str);
        }
        return yu.i.f547296a.b(false, str2, false, false);
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f2 getItem(int i17) {
        return (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f2) this.f273037f.get(i17);
    }

    public final java.util.ArrayList f(java.util.List list) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2) it.next();
            if (d2Var == null || 1 == (i17 = d2Var.f273156a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f273035d, d2Var == null ? "getListItemFromData, fileItem=null" : "getListItemFromData, type:FileType.TYPE_INVALID");
            } else {
                if (4 != i17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, d2Var.f273158c)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g2 g2Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g2(this.f273043o);
                    java.lang.String str2 = d2Var.f273158c;
                    g2Var.f273158c = str2;
                    if (str2 == null) {
                        str2 = "";
                    }
                    g2Var.f273156a = 2;
                    arrayList.add(g2Var);
                    str = str2;
                }
                arrayList.add(d2Var);
            }
        }
        return arrayList;
    }

    public final android.graphics.Bitmap g(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f273035d, "getThumbnail fail, path not exist");
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273043o;
        android.database.Cursor query = activityC19730xa7b9756f.getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new java.lang.String[]{"_id"}, "_data=?", new java.lang.String[]{str}, null);
        if (query != null) {
            if (query.moveToFirst()) {
                int i17 = query.getInt(query.getColumnIndex("_id"));
                query.close();
                android.content.ContentResolver contentResolver = activityC19730xa7b9756f.getContentResolver();
                zj0.a aVar = new zj0.a();
                aVar.c(null);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar.c(3);
                aVar.c(java.lang.Long.valueOf(i17));
                aVar.c(contentResolver);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter", "getThumbnail", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.content.ContentResolver contentResolver2 = (android.content.ContentResolver) aVar.a(0);
                zj0.c.f554818a.set(aVar);
                long longValue = ((java.lang.Long) aVar.a(1)).longValue();
                zj0.a a17 = zj0.c.a();
                android.graphics.Bitmap thumbnail = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentResolver2, longValue, ((java.lang.Integer) a17.a(2)).intValue(), (android.graphics.BitmapFactory.Options) a17.a(3));
                yj0.a.e(obj, thumbnail, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter", "getThumbnail", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/provider/MediaStore$Images$Thumbnails_EXEC_", "getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                return thumbnail;
            }
            query.close();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f273037f.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return getItem(i17).f273156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0185 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013f A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:19:0x00ae, B:22:0x00bb, B:24:0x00bf, B:26:0x00c3, B:27:0x00c9, B:30:0x00d3, B:33:0x00db, B:36:0x00e5, B:39:0x0196, B:42:0x01a5, B:46:0x01aa, B:47:0x019b, B:48:0x00eb, B:49:0x00e0, B:50:0x00d8, B:51:0x00ce, B:52:0x0102, B:56:0x0109, B:59:0x011c, B:62:0x0124, B:65:0x012c, B:68:0x013a, B:71:0x014d, B:73:0x0159, B:75:0x015d, B:77:0x0165, B:79:0x0169, B:80:0x016d, B:82:0x0171, B:83:0x017f, B:84:0x0184, B:85:0x0185, B:87:0x0189, B:88:0x013f, B:89:0x0131, B:90:0x0129, B:91:0x0121, B:92:0x010e, B:93:0x0112, B:96:0x0117, B:97:0x00b6), top: B:18:0x00ae }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r26, android.view.View r27, android.view.ViewGroup r28) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f273036e;
    }

    public final boolean h(java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String lowerCase = fileName.toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        return (android.os.Build.VERSION.SDK_INT >= 28 && r26.i0.n(lowerCase, ".heic", false)) || r26.i0.n(lowerCase, ".bmp", false) || r26.i0.n(lowerCase, ".png", false) || r26.i0.n(lowerCase, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG, false) || r26.i0.n(lowerCase, ".jpeg", false) || r26.i0.n(lowerCase, ".gif", false);
    }

    public final void j() {
        int i17 = this.f273042n;
        this.f273037f = i17 != 1 ? i17 != 2 ? i17 != 3 ? new java.util.ArrayList() : f(this.f273041m.f273418f) : f(this.f273040i.f273418f) : f(this.f273039h.f273418f);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273043o;
        int i18 = activityC19730xa7b9756f.f272917x;
        if (i18 == 1 || i18 == 2) {
            android.widget.ListView listView = activityC19730xa7b9756f.f272902f;
            if (listView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            listView.setVisibility(0);
            notifyDataSetChanged();
        } else {
            android.widget.ListView listView2 = activityC19730xa7b9756f.f272902f;
            if (listView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            listView2.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f273035d, "loadData: size:" + this.f273037f + " selectedTabType:" + activityC19730xa7b9756f.f272917x + " fromType:" + this.f273042n);
    }

    public final void k() {
        int i17;
        j();
        int size = this.f273037f.size();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273043o;
        if (size > 0 || !(1 == (i17 = this.f273042n) || 2 == i17)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a739 = activityC19730xa7b9756f.f272904h;
            if (c19640x3c29a739 == null) {
                return;
            }
            c19640x3c29a739.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a7392 = activityC19730xa7b9756f.f272904h;
        if (c19640x3c29a7392 != null) {
            c19640x3c29a7392.a();
        }
    }

    public final void l(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : -1;
        if (intValue != -1) {
            m(v17, intValue);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f273035d, "onSelectorWrapperClicked: v:" + v17);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.view.View r24, int r25) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2.m(android.view.View, int):void");
    }

    public final void n(java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        int i17 = this.f273042n;
        this.f273037f = i17 != 1 ? i17 != 2 ? i17 != 3 ? new java.util.ArrayList() : f(this.f273041m.c(content)) : f(this.f273040i.c(content)) : f(this.f273039h.c(content));
        notifyDataSetChanged();
    }

    public final void o(int i17) {
        if (!(i17 != 1 ? i17 != 2 ? i17 != 3 ? true : this.f273041m.f273420h : this.f273040i.f273420h : this.f273039h.f273420h)) {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n1 n1Var = this.f273039h;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = n1Var.f273316r;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a739 = activityC19730xa7b9756f.f272904h;
                if (c19640x3c29a739 != null) {
                    c19640x3c29a739.setVisibility(0);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a7392 = activityC19730xa7b9756f.f272904h;
                if (c19640x3c29a7392 != null) {
                    c19640x3c29a7392.c();
                }
                n1Var.f273420h = false;
                n1Var.f273421i = 0;
                n1Var.f273417e = 30;
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l1(n1Var));
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1 r1Var = this.f273040i;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f2 = r1Var.f273392o;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a7393 = activityC19730xa7b9756f2.f272904h;
                if (c19640x3c29a7393 != null) {
                    c19640x3c29a7393.setVisibility(0);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a7394 = activityC19730xa7b9756f2.f272904h;
                if (c19640x3c29a7394 != null) {
                    c19640x3c29a7394.c();
                }
                r1Var.f273420h = false;
                r1Var.f273421i = 0;
                r1Var.f273417e = 100;
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q1(r1Var));
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n2 n2Var = this.f273041m;
                n2Var.getClass();
                n2Var.f273317o = new com.p314xaae8f345.mm.vfs.r6(lp0.b.Y());
                n2Var.f273320r = false;
                n2Var.e(new com.p314xaae8f345.mm.vfs.r6(lp0.b.Y()));
            }
        }
        this.f273042n = i17;
        j();
    }

    public final void p(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (this.f273042n != 3) {
            return;
        }
        this.f273041m.e(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(path)));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var = this.f273043o.f272907n;
        if (a2Var != null) {
            a2Var.j();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }
}
