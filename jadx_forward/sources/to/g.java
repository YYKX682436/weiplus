package to;

/* loaded from: classes13.dex */
public class g extends android.media.MediaPlayer {
    public g() {
        int hashCode = hashCode();
        to.f.f502430g++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioManager", "mm media player init [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f502430g), java.lang.Integer.valueOf(to.f.f502431h));
        java.util.HashMap hashMap = to.f.f502432i;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hashMap.put(valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        to.f.a();
    }

    @Override // android.media.MediaPlayer
    public void release() {
        super.release();
        int hashCode = hashCode();
        to.f.f502431h++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioManager", "mm media player release [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f502430g), java.lang.Integer.valueOf(to.f.f502431h));
        to.f.f502432i.remove(java.lang.Integer.valueOf(hashCode));
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(android.content.Context context, android.net.Uri uri) {
        if (fp.h.c(26)) {
            setDataSource(context, uri, null, null);
        } else {
            setDataSource(context, uri, (java.util.Map) null);
        }
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map map) {
        if (fp.h.c(26)) {
            setDataSource(context, uri, map, null);
            return;
        }
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && !scheme.equals("file") && !scheme.equals("wcf") && !scheme.equals("assets")) {
            super.setDataSource(context, uri, (java.util.Map<java.lang.String, java.lang.String>) map);
            return;
        }
        android.os.ParcelFileDescriptor y17 = com.p314xaae8f345.mm.vfs.w6.y(uri, "r");
        try {
            setDataSource(y17.getFileDescriptor());
            y17.close();
        } catch (java.lang.Throwable th6) {
            if (y17 != null) {
                try {
                    y17.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map map, java.util.List list) {
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && !scheme.equals("file") && !scheme.equals("wcf") && !scheme.equals("assets")) {
            super.setDataSource(context, uri, map, list);
            return;
        }
        android.os.ParcelFileDescriptor y17 = com.p314xaae8f345.mm.vfs.w6.y(uri, "r");
        try {
            setDataSource(y17.getFileDescriptor());
            y17.close();
        } catch (java.lang.Throwable th6) {
            if (y17 != null) {
                try {
                    y17.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(java.lang.String str) {
        try {
            android.os.ParcelFileDescriptor z17 = com.p314xaae8f345.mm.vfs.w6.z(com.p314xaae8f345.mm.vfs.z7.a(str), null, "r");
            try {
                setDataSource(z17.getFileDescriptor());
                z17.close();
            } finally {
            }
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaPlayerWrapper", "Cannot find path: " + str + ", " + e17.getMessage());
            super.setDataSource(str);
        }
    }
}
