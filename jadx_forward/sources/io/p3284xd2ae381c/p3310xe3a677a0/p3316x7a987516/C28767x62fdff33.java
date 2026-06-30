package io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516;

/* renamed from: io.flutter.plugins.pathprovider.StorageDirectoryMapper */
/* loaded from: classes7.dex */
class C28767x62fdff33 {
    /* renamed from: androidType */
    public static java.lang.String m138914x37e16a49(java.lang.Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 0:
                return android.os.Environment.DIRECTORY_MUSIC;
            case 1:
                return android.os.Environment.DIRECTORY_PODCASTS;
            case 2:
                return android.os.Environment.DIRECTORY_RINGTONES;
            case 3:
                return android.os.Environment.DIRECTORY_ALARMS;
            case 4:
                return android.os.Environment.DIRECTORY_NOTIFICATIONS;
            case 5:
                return android.os.Environment.DIRECTORY_PICTURES;
            case 6:
                return android.os.Environment.DIRECTORY_MOVIES;
            case 7:
                return android.os.Environment.DIRECTORY_DOWNLOADS;
            case 8:
                return android.os.Environment.DIRECTORY_DCIM;
            case 9:
                return android.os.Environment.DIRECTORY_DOCUMENTS;
            default:
                throw new java.lang.IllegalArgumentException("Unknown index: " + num);
        }
    }
}
