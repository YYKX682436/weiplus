package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/tencent/unit_rc/SharedMemoryIndexHolder;", "", ya.b.f77479x42930b2, "", "(I)V", "getIndex", "()I", "setIndex", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.tencent.unit_rc.SharedMemoryIndexHolder */
/* loaded from: classes4.dex */
public final /* data */ class C26841x7a9e0f58 {
    private int index;

    public C26841x7a9e0f58() {
        this(0, 1, null);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p3118xeeebfacc.C26841x7a9e0f58 m106034x75149012(com.p314xaae8f345.p3118xeeebfacc.C26841x7a9e0f58 c26841x7a9e0f58, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = c26841x7a9e0f58.index;
        }
        return c26841x7a9e0f58.m106036x2eaf75(i17);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p3118xeeebfacc.C26841x7a9e0f58 m106036x2eaf75(int index) {
        return new com.p314xaae8f345.p3118xeeebfacc.C26841x7a9e0f58(index);
    }

    /* renamed from: equals */
    public boolean m106037xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.p314xaae8f345.p3118xeeebfacc.C26841x7a9e0f58) && this.index == ((com.p314xaae8f345.p3118xeeebfacc.C26841x7a9e0f58) other).index;
    }

    /* renamed from: getIndex */
    public final int m106038x7498cf1c() {
        return this.index;
    }

    /* renamed from: hashCode */
    public int m106039x8cdac1b() {
        return java.lang.Integer.hashCode(this.index);
    }

    /* renamed from: setIndex */
    public final void m106040x5326e990(int i17) {
        this.index = i17;
    }

    /* renamed from: toString */
    public java.lang.String m106041x9616526c() {
        return "SharedMemoryIndexHolder(index=" + this.index + ')';
    }

    public C26841x7a9e0f58(int i17) {
        this.index = i17;
    }

    public /* synthetic */ C26841x7a9e0f58(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
