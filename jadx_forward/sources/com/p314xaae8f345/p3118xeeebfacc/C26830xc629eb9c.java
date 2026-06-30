package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/unit_rc/BaseProxyObject;", "Lcom/tencent/unit_rc/BaseObject;", "()V", "equals", "", "other", "", "hashCode", "", "isProxy", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.tencent.unit_rc.BaseProxyObject */
/* loaded from: classes15.dex */
public class C26830xc629eb9c extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c.Companion INSTANCE = new com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c.Companion(null);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/tencent/unit_rc/BaseProxyObject$Companion;", "", "()V", "equal", "", "pa", "", "pb", "hashCode", "", "pointer", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: com.tencent.unit_rc.BaseProxyObject$Companion, reason: from kotlin metadata */
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: equal */
        public final native boolean m105999x5c46734(long pa6, long pb6);

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: hashCode */
        public final native int m106000x8cdac1b(long pointer);
    }

    /* renamed from: equals */
    public boolean m105995xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(other, "null cannot be cast to non-null type com.tencent.unit_rc.BaseProxyObject");
        return INSTANCE.m105999x5c46734(m105978x2737f10(), ((com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c) other).m105978x2737f10());
    }

    /* renamed from: hashCode */
    public int m105996x8cdac1b() {
        return INSTANCE.m106000x8cdac1b(m105978x2737f10());
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: isProxy */
    public boolean mo105981x7b487764() {
        return true;
    }
}
