package gp;

/* loaded from: classes10.dex */
public class d extends android.media.MediaMetadataRetriever {
    @Override // android.media.MediaMetadataRetriever
    public void setDataSource(java.lang.String str, java.util.Map map) {
        java.lang.String scheme = android.net.Uri.parse(str).getScheme();
        if (scheme == null || scheme.equals("file") || scheme.equals("wcf") || scheme.equals("assets")) {
            try {
                android.os.ParcelFileDescriptor z17 = com.p314xaae8f345.mm.vfs.w6.z(com.p314xaae8f345.mm.vfs.z7.a(str), null, "r");
                try {
                    setDataSource(z17.getFileDescriptor());
                    z17.close();
                    return;
                } finally {
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.VFSMediaMetadataRetriever", "Cannot open URI: " + str + ", " + e17.getMessage());
            }
        }
        super.setDataSource(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    @Override // android.media.MediaMetadataRetriever
    public void setDataSource(android.content.Context context, android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        if (scheme == null || scheme.equals("file") || scheme.equals("wcf") || scheme.equals("assets")) {
            try {
                android.os.ParcelFileDescriptor y17 = com.p314xaae8f345.mm.vfs.w6.y(uri, "r");
                try {
                    setDataSource(y17.getFileDescriptor());
                    y17.close();
                    return;
                } finally {
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.VFSMediaMetadataRetriever", "Cannot open URI: " + uri + ", " + e17.getMessage());
            }
        }
        super.setDataSource(context, uri);
    }

    @Override // android.media.MediaMetadataRetriever
    public void setDataSource(java.lang.String str) {
        try {
            android.os.ParcelFileDescriptor z17 = com.p314xaae8f345.mm.vfs.w6.z(com.p314xaae8f345.mm.vfs.z7.a(str), null, "r");
            try {
                setDataSource(z17.getFileDescriptor());
                z17.close();
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.VFSMediaMetadataRetriever", "Cannot find path: " + str + ", " + e17.getMessage());
            super.setDataSource(str);
        }
    }
}
