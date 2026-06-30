package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.ImageGCFileSystem */
/* loaded from: classes12.dex */
public class C22751xe388182 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22751xe388182> f39816x681a0c0c = new com.p314xaae8f345.mm.vfs.e3();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f294246f;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294247e;

    public C22751xe388182(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294247e = interfaceC22750xe27c22eb;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String str4 = com.p314xaae8f345.mm.vfs.q7.c("image2") + "/";
        if (str.startsWith("THUMBNAIL_DIRPATH://")) {
            str = str.substring(23);
            str2 = "th_";
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.a(com.p314xaae8f345.mm.vfs.q7.c("image") + "/", str4, str2, str, str3, 1, z17);
    }

    public static java.util.List d(android.os.CancellationSignal cancellationSignal) {
        boolean z17;
        l75.k0 k0Var = gm0.j1.u().f354686f;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^THUMBNAIL_DIRPATH://th_[0-9a-f]{32}$");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("^[0-9a-f]{32}");
        java.util.regex.Pattern compile3 = java.util.regex.Pattern.compile("^([A-Za-z0-9_@\\-]+_[A-Za-z0-9_@\\-]+_[0-9]+_backup)(?:__hd)?$");
        java.util.regex.Pattern compile4 = java.util.regex.Pattern.compile("^([A-Za-z0-9_@\\-]+_[A-Za-z0-9_@\\-]+_[0-9]+_backup)(?:_hd)?$");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = null;
        try {
            android.database.Cursor o17 = k0Var.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT bigImgPath,thumbImgPath FROM ImgInfo2, message WHERE message.type=3 AND (ImgInfo2.msglocalid=message.msgId OR ImgInfo2.msgSvrId=message.msgSvrId)", null, "ImgInfo2", null);
            while (true) {
                try {
                    boolean z18 = true;
                    if (!o17.moveToNext()) {
                        break;
                    }
                    cancellationSignal.throwIfCanceled();
                    java.lang.String string = o17.getString(0);
                    java.lang.String string2 = o17.getString(1);
                    if (compile.matcher(string2).matches()) {
                        arrayList.add(string2.substring(23));
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    java.util.regex.Matcher matcher = compile2.matcher(string);
                    if (matcher.find()) {
                        arrayList.add(matcher.group());
                    } else {
                        java.util.regex.Matcher matcher2 = compile3.matcher(string);
                        if (matcher2.matches()) {
                            arrayList.add(matcher2.group(1));
                        } else {
                            java.util.regex.Matcher matcher3 = compile4.matcher(string);
                            if (matcher3.matches()) {
                                arrayList.add(matcher3.group(1));
                            } else {
                                z18 = z17;
                            }
                        }
                    }
                    if (!z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VFS.ImageGCFileSystem", "Invalid ImgInfo found, thumbPath: %s, bigPath: %s", string2, string);
                    }
                } finally {
                }
            }
            o17.close();
            try {
                android.database.Cursor wi6 = ((ot0.g3) ((com.p314xaae8f345.mm.app.w2) i95.n0.c(com.p314xaae8f345.mm.app.w2.class))).wi(java.util.Arrays.asList(49, 1040187441, 452984881, 436207665));
                while (wi6.moveToNext()) {
                    try {
                        cancellationSignal.throwIfCanceled();
                        java.lang.String string3 = wi6.getString(0);
                        if (compile.matcher(string3).matches()) {
                            arrayList.add(string3.substring(23));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VFS.ImageGCFileSystem", "Invalid imgPath in message found, imgPath: %s", string3);
                        }
                    } finally {
                    }
                }
                wi6.close();
                java.util.Collections.sort(arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (str2 != null && !str2.equals(str)) {
                        arrayList2.add(str2);
                        str = str2;
                    }
                }
                return arrayList2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.ImageGCFileSystem", e17, "Failed to get hash list.", new java.lang.Object[0]);
                return null;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.ImageGCFileSystem", e18, "Failed to get hash list.", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.h3(this, (com.p314xaae8f345.mm.vfs.q2) this.f294247e.b(map));
    }

    /* renamed from: toString */
    public java.lang.String m82316x9616526c() {
        return "imageGC <- " + this.f294247e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22751xe388182.class, 1);
        parcel.writeParcelable(this.f294247e, i17);
    }

    public C22751xe388182(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22751xe388182.class, 1);
        this.f294247e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22751xe388182.class.getClassLoader());
    }
}
