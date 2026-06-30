package j33;

/* loaded from: classes10.dex */
public abstract class q {
    public static java.lang.String a(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 3006243:
                if (str.equals("avc1")) {
                    c17 = 0;
                    break;
                }
                break;
            case 3117788:
                if (str.equals("encv")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3199032:
                if (str.equals("hev1")) {
                    c17 = 2;
                    break;
                }
                break;
            case 3214780:
                if (str.equals("hvc1")) {
                    c17 = 3;
                    break;
                }
                break;
            case 3356560:
                if (str.equals("mp4a")) {
                    c17 = 4;
                    break;
                }
                break;
            case 3356581:
                if (str.equals("mp4v")) {
                    c17 = 5;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 5:
                return "video/avc";
            case 1:
            case 2:
            case 3:
                return "video/hevc";
            case 4:
                return "audio/mp4a-latm";
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumAdapter.MIMEUtils", "unsupport type: %s", str);
                return "";
        }
    }
}
