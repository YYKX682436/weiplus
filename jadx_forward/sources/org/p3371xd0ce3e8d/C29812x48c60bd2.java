package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.MediaConstraints */
/* loaded from: classes.dex */
public class C29812x48c60bd2 {

    /* renamed from: mandatory */
    public final java.util.List<org.p3371xd0ce3e8d.C29812x48c60bd2.KeyValuePair> f75549xe894a9d9 = new java.util.ArrayList();

    /* renamed from: optional */
    public final java.util.List<org.p3371xd0ce3e8d.C29812x48c60bd2.KeyValuePair> f75550xfb4a4b60 = new java.util.ArrayList();

    /* renamed from: org.webrtc.MediaConstraints$KeyValuePair */
    /* loaded from: classes.dex */
    public static class KeyValuePair {
        private final java.lang.String key;

        /* renamed from: value */
        private final java.lang.String f75551x6ac9171;

        public KeyValuePair(java.lang.String str, java.lang.String str2) {
            this.key = str;
            this.f75551x6ac9171 = str2;
        }

        /* renamed from: equals */
        public boolean m155722xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            org.p3371xd0ce3e8d.C29812x48c60bd2.KeyValuePair keyValuePair = (org.p3371xd0ce3e8d.C29812x48c60bd2.KeyValuePair) obj;
            return this.key.equals(keyValuePair.key) && this.f75551x6ac9171.equals(keyValuePair.f75551x6ac9171);
        }

        /* renamed from: getKey */
        public java.lang.String m155723xb5884f29() {
            return this.key;
        }

        /* renamed from: getValue */
        public java.lang.String m155724x754a37bb() {
            return this.f75551x6ac9171;
        }

        /* renamed from: hashCode */
        public int m155725x8cdac1b() {
            return this.key.hashCode() + this.f75551x6ac9171.hashCode();
        }

        /* renamed from: toString */
        public java.lang.String m155726x9616526c() {
            return this.key + ": " + this.f75551x6ac9171;
        }
    }

    /* renamed from: stringifyKeyValuePairList */
    private static java.lang.String m155718xb82ce275(java.util.List<org.p3371xd0ce3e8d.C29812x48c60bd2.KeyValuePair> list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        for (org.p3371xd0ce3e8d.C29812x48c60bd2.KeyValuePair keyValuePair : list) {
            if (sb6.length() > 1) {
                sb6.append(", ");
            }
            sb6.append(keyValuePair.m155726x9616526c());
        }
        sb6.append("]");
        return sb6.toString();
    }

    /* renamed from: getMandatory */
    public java.util.List<org.p3371xd0ce3e8d.C29812x48c60bd2.KeyValuePair> m155719xe8021b23() {
        return this.f75549xe894a9d9;
    }

    /* renamed from: getOptional */
    public java.util.List<org.p3371xd0ce3e8d.C29812x48c60bd2.KeyValuePair> m155720x772488d6() {
        return this.f75550xfb4a4b60;
    }

    /* renamed from: toString */
    public java.lang.String m155721x9616526c() {
        return "mandatory: " + m155718xb82ce275(this.f75549xe894a9d9) + ", optional: " + m155718xb82ce275(this.f75550xfb4a4b60);
    }
}
