package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3031xd1c47ede;

/* renamed from: com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionNode */
/* loaded from: classes15.dex */
public class C26341x1ba2194 {

    /* renamed from: mLongMap */
    private java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Long>> f52480xb2e1b813;

    public C26341x1ba2194() {
        this.f52480xb2e1b813 = null;
        this.f52480xb2e1b813 = new java.util.HashMap<>();
    }

    /* renamed from: addAction */
    public boolean m102030xe0672637(int i17) {
        if (this.f52480xb2e1b813.containsKey(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        this.f52480xb2e1b813.put(java.lang.Integer.valueOf(i17), new java.util.HashMap<>());
        return true;
    }

    /* renamed from: removeAction */
    public void m102031xad7befda(int i17) {
        if (this.f52480xb2e1b813.containsKey(java.lang.Integer.valueOf(i17))) {
            this.f52480xb2e1b813.remove(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: setLongActionConfig */
    public boolean m102032xb79f2a36(int i17, int i18, long j17) {
        if (!this.f52480xb2e1b813.containsKey(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        this.f52480xb2e1b813.get(java.lang.Integer.valueOf(i17)).put(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
        return true;
    }
}
