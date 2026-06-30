package androidx.media;

/* loaded from: classes13.dex */
public class AudioAttributesImplBase implements androidx.media.AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f11697a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f11698b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f11699c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f11700d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i17 = this.f11700d;
        return i17 != -1 ? i17 : androidx.media.AudioAttributesCompat.c(false, this.f11699c, this.f11697a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public java.lang.Object b() {
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media.AudioAttributesImplBase)) {
            return false;
        }
        androidx.media.AudioAttributesImplBase audioAttributesImplBase = (androidx.media.AudioAttributesImplBase) obj;
        if (this.f11698b != audioAttributesImplBase.f11698b) {
            return false;
        }
        int i17 = this.f11699c;
        int i18 = audioAttributesImplBase.f11699c;
        int a17 = audioAttributesImplBase.a();
        if (a17 == 6) {
            i18 |= 4;
        } else if (a17 == 7) {
            i18 |= 1;
        }
        return i17 == (i18 & bd1.f.CTRL_INDEX) && this.f11697a == audioAttributesImplBase.f11697a && this.f11700d == audioAttributesImplBase.f11700d;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f11698b), java.lang.Integer.valueOf(this.f11699c), java.lang.Integer.valueOf(this.f11697a), java.lang.Integer.valueOf(this.f11700d)});
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AudioAttributesCompat:");
        if (this.f11700d != -1) {
            sb6.append(" stream=");
            sb6.append(this.f11700d);
            sb6.append(" derived");
        }
        sb6.append(" usage=");
        int i17 = this.f11697a;
        int i18 = androidx.media.AudioAttributesCompat.f11693b;
        switch (i17) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = "unknown usage " + i17;
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb6.append(str);
        sb6.append(" content=");
        sb6.append(this.f11698b);
        sb6.append(" flags=0x");
        sb6.append(java.lang.Integer.toHexString(this.f11699c).toUpperCase());
        return sb6.toString();
    }
}
