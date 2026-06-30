package c01;

/* loaded from: classes11.dex */
public enum w implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f37528d = null;

    w() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f37528d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f37528d;
                if (obj == null) {
                    obj = new c01.u();
                    this.f37528d = obj;
                }
            }
        }
        return (c01.u) obj;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1063801905:
                if (str.equals("accountAware")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return c01.v.f37518a;
            case 1:
                return java.lang.Void.class;
            case 2:
                return java.lang.Boolean.TRUE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, "addcontact") || java.util.Objects.equals(obj, "dynacfg") || java.util.Objects.equals(obj, "dynacfg_split") || java.util.Objects.equals(obj, "banner") || java.util.Objects.equals(obj, "midinfo") || java.util.Objects.equals(obj, "revokemsg") || java.util.Objects.equals(obj, "clouddelmsg") || java.util.Objects.equals(obj, "updatepackage") || java.util.Objects.equals(obj, "deletepackage") || java.util.Objects.equals(obj, "delchatroommember") || java.util.Objects.equals(obj, "WakenPush") || java.util.Objects.equals(obj, "DisasterNotice") || java.util.Objects.equals(obj, "EmotionKv") || java.util.Objects.equals(obj, "globalalert") || java.util.Objects.equals(obj, "yybsigcheck") || java.util.Objects.equals(obj, "qy_status_notify") || java.util.Objects.equals(obj, "qy_chat_update") || java.util.Objects.equals(obj, "qy_revoke_msg") || java.util.Objects.equals(obj, "bindmobiletip") || java.util.Objects.equals(obj, "BindPhoneGuidance") || java.util.Objects.equals(obj, "ClientCheckConsistency") || java.util.Objects.equals(obj, "ClientCheckHook") || java.util.Objects.equals(obj, "ClientCheckGetAppList") || java.util.Objects.equals(obj, "ClientCheckGetExtInfo") || java.util.Objects.equals(obj, "ClientCheckSensorCollect") || java.util.Objects.equals(obj, "functionmsg") || java.util.Objects.equals(obj, "paymsg");
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(c01.u.class.getName());
    }
}
