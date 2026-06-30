package ro1;

/* loaded from: classes5.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String backupPath, ro1.i fileOps) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backupPath, "backupPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileOps, "fileOps");
        boolean b17 = fileOps.b(backupPath, ".wechat-deviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DeviceMeta", "[checkMetaExist] backupPath=" + backupPath + ", isExist=" + b17);
        return b17;
    }

    public final ro1.c b(byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, r26.c.f450398a);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("digest") && jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
                java.lang.String string = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                java.lang.String string2 = jSONObject.getString("digest");
                java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("wechat-microMsg" + string);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string2, a17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DeviceMeta", "Device meta file is corruption. md5=" + a17 + ", md5FromFile=" + string2);
                    return null;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(string);
                java.lang.String string3 = jSONObject2.getString("deviceId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                if (string3.length() == 0) {
                    throw new java.lang.RuntimeException("DeviceId must not be null.");
                }
                java.lang.String optString = jSONObject2.optString("accessMode", "SAF");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                return new ro1.c(string3, optString);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DeviceMeta", "Device meta file is corruption. Fail to find data or digest");
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DeviceMeta", th6, "Parse device meta info failed! content=".concat(str), new java.lang.Object[0]);
            return null;
        }
    }

    public final ro1.c c(java.lang.String backupPath, ro1.i fileOps) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backupPath, "backupPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileOps, "fileOps");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DeviceMeta", "Try to read deviceId from uri=".concat(backupPath));
        ro1.c cVar = null;
        try {
            java.io.InputStream c17 = fileOps.c(backupPath, ".wechat-deviceId");
            if (c17 != null) {
                try {
                    byte[] c18 = vz5.a.c(c17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DeviceMeta", "len of bytes = " + c18.length);
                    ro1.c b17 = ro1.c.f479509c.b(c18);
                    vz5.b.a(c17, null);
                    cVar = b17;
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DeviceMeta", e17, "An error occurs while reading meta", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DeviceMeta", "deviceMeta = " + cVar);
        return cVar;
    }

    public final boolean d(po1.d device, ro1.i fileOps) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileOps, "fileOps");
        ro1.c c17 = c(device.f438832e, fileOps);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DeviceMeta", "[writeMetaToPath] origin meta = " + c17);
        java.io.OutputStream d17 = fileOps.d(device.f438832e, ".wechat-deviceId");
        if (d17 == null) {
            return false;
        }
        try {
            ro1.c cVar = new ro1.c(device.f438828a, fileOps.a(c17 != null ? c17.f479511b : null));
            d17.write(ro1.c.a(cVar));
            if (d17 instanceof android.os.ParcelFileDescriptor.AutoCloseOutputStream) {
                ((android.os.ParcelFileDescriptor.AutoCloseOutputStream) d17).getFD().sync();
            } else if (d17 instanceof java.io.FileOutputStream) {
                ((java.io.FileOutputStream) d17).getFD().sync();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DeviceMeta", "Save device meta successful. meta=" + cVar);
            vz5.b.a(d17, null);
            return true;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(d17, th6);
                throw th7;
            }
        }
    }
}
