package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.SessionDescription */
/* loaded from: classes6.dex */
public class C29856x9a240ba6 {

    /* renamed from: description */
    public final java.lang.String f75942x993583fc;

    /* renamed from: type */
    public final org.p3371xd0ce3e8d.C29856x9a240ba6.Type f75943x368f3a;

    /* renamed from: org.webrtc.SessionDescription$Type */
    /* loaded from: classes6.dex */
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER,
        ROLLBACK;

        /* renamed from: canonicalForm */
        public java.lang.String m156368x7e7d8bd8() {
            return name().toLowerCase(java.util.Locale.US);
        }
    }

    public C29856x9a240ba6(org.p3371xd0ce3e8d.C29856x9a240ba6.Type type, java.lang.String str) {
        this.f75943x368f3a = type;
        this.f75942x993583fc = str;
    }

    /* renamed from: getDescription */
    public java.lang.String m156362x730bcac6() {
        return this.f75942x993583fc;
    }

    /* renamed from: getTypeInCanonicalForm */
    public java.lang.String m156363x16305ce3() {
        return this.f75943x368f3a.m156368x7e7d8bd8();
    }
}
