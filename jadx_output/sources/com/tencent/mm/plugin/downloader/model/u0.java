package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public abstract class u0 {
    public static boolean a(long j17) {
        return fp.i.c(((float) j17) * 1.3f);
    }

    public static h02.a b(com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        h02.a aVar = new h02.a();
        java.lang.String str = t0Var.f97150a;
        aVar.field_downloadUrl = str;
        aVar.field_secondaryUrl = t0Var.f97151b;
        aVar.field_fileSize = t0Var.f97152c;
        aVar.field_downloadUrlHashCode = str.hashCode();
        aVar.field_fileName = t0Var.f97153d;
        aVar.field_fileType = t0Var.f97155f;
        aVar.field_md5 = t0Var.f97154e;
        aVar.field_appId = t0Var.f97156g;
        aVar.field_autoInstall = t0Var.f97158i;
        aVar.field_showNotification = t0Var.f97159j;
        aVar.field_packageName = t0Var.f97157h;
        aVar.field_autoDownload = t0Var.f97160k;
        int i17 = t0Var.f97161l;
        aVar.field_scene = i17;
        boolean z17 = t0Var.f97163n;
        aVar.field_downloadInWifi = z17;
        aVar.field_fromWeApp = t0Var.f97164o;
        aVar.field_extInfo = t0Var.f97166q;
        aVar.field_isSecondDownload = t0Var.f97165p;
        aVar.field_fromDownloadApp = t0Var.f97167r;
        aVar.field_reserveInWifi = z17;
        aVar.field_downloadType = t0Var.f97171v;
        aVar.field_uiarea = t0Var.f97170u;
        aVar.field_noticeId = t0Var.f97169t;
        aVar.field_ssid = t0Var.f97168s;
        aVar.field_startScene = i17;
        aVar.field_enableBrotli = t0Var.D;
        java.util.LinkedList linkedList = t0Var.f97172w;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            d02.q qVar = new d02.q();
            qVar.f225356d = linkedList;
            try {
                aVar.field_sectionMd5Byte = qVar.toByteArray();
            } catch (java.io.IOException unused) {
            }
        }
        aVar.field_rawAppId = t0Var.f97173x;
        aVar.field_notificationTitle = t0Var.A;
        return aVar;
    }

    public static boolean c(long j17) {
        java.util.LinkedList linkedList;
        if (a(j17)) {
            return true;
        }
        h02.b g17 = com.tencent.mm.plugin.downloader.model.m0.g();
        if (g17 == null) {
            linkedList = null;
        } else {
            java.lang.String format = java.lang.String.format("select * from %s where %s<%d order by %s desc", "FileDownloadInfo", dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 604800000), dm.i4.COL_UPDATETIME);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoStorage", "getUpdateTimeBiggerThanTimeInterval, sql = " + format);
            android.database.Cursor rawQuery = g17.rawQuery(format, new java.lang.String[0]);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    h02.a aVar = new h02.a();
                    aVar.convertFrom(rawQuery);
                    linkedList2.add(aVar);
                }
                rawQuery.close();
            }
            linkedList = linkedList2;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h02.a aVar2 = (h02.a) it.next();
            int i17 = aVar2.field_status;
            if (i17 != 3 && i17 != 6 && i17 != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadUtil", "delete appId : %s, path : %s", aVar2.field_appId, aVar2.field_filePath);
                com.tencent.mm.plugin.downloader.model.m0.i(aVar2.field_downloadId);
                com.tencent.mm.vfs.w6.h(aVar2.field_filePath);
                m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
                java.lang.String str = aVar2.field_appId;
                ((l02.q) sVar).getClass();
                com.tencent.mm.plugin.downloader_app.model.s0.e(str);
                if (android.os.Environment.getExternalStorageDirectory().getFreeSpace() >= j17) {
                    return true;
                }
            }
        }
        return false;
    }
}
