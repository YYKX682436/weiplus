package p012xc85e97e9.p096x62f6fe4;

/* renamed from: androidx.media.AudioAttributesImplBase */
/* loaded from: classes13.dex */
public class C1132xef9eb9de implements p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d {

    /* renamed from: a, reason: collision with root package name */
    public int f93230a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f93231b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f93232c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f93233d = -1;

    @Override // p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d
    public int a() {
        int i17 = this.f93233d;
        return i17 != -1 ? i17 : p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f.c(false, this.f93232c, this.f93230a);
    }

    @Override // p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d
    public java.lang.Object b() {
        return null;
    }

    /* renamed from: equals */
    public boolean m7882xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof p012xc85e97e9.p096x62f6fe4.C1132xef9eb9de)) {
            return false;
        }
        p012xc85e97e9.p096x62f6fe4.C1132xef9eb9de c1132xef9eb9de = (p012xc85e97e9.p096x62f6fe4.C1132xef9eb9de) obj;
        if (this.f93231b != c1132xef9eb9de.f93231b) {
            return false;
        }
        int i17 = this.f93232c;
        int i18 = c1132xef9eb9de.f93232c;
        int a17 = c1132xef9eb9de.a();
        if (a17 == 6) {
            i18 |= 4;
        } else if (a17 == 7) {
            i18 |= 1;
        }
        return i17 == (i18 & bd1.f.f4202x366c91de) && this.f93230a == c1132xef9eb9de.f93230a && this.f93233d == c1132xef9eb9de.f93233d;
    }

    /* renamed from: hashCode */
    public int m7883x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f93231b), java.lang.Integer.valueOf(this.f93232c), java.lang.Integer.valueOf(this.f93230a), java.lang.Integer.valueOf(this.f93233d)});
    }

    /* renamed from: toString */
    public java.lang.String m7884x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AudioAttributesCompat:");
        if (this.f93233d != -1) {
            sb6.append(" stream=");
            sb6.append(this.f93233d);
            sb6.append(" derived");
        }
        sb6.append(" usage=");
        int i17 = this.f93230a;
        int i18 = p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f.f93226b;
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
        sb6.append(this.f93231b);
        sb6.append(" flags=0x");
        sb6.append(java.lang.Integer.toHexString(this.f93232c).toUpperCase());
        return sb6.toString();
    }
}
