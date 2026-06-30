package com.p314xaae8f345.p3118xeeebfacc.ur;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/unit_rc/ur/MutexCpp;", "Lcom/tencent/unit_rc/BaseProxyObject;", "Lcom/tencent/unit_rc/ur/Mutex;", "", "tryLock", "Ljz5/f0;", "lock", "unlock", "<init>", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.unit_rc.ur.MutexCpp */
/* loaded from: classes16.dex */
public class C26858x37ac97c4 extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements com.p314xaae8f345.p3118xeeebfacc.ur.InterfaceC26857x474015f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p3118xeeebfacc.ur.C26858x37ac97c4.Companion INSTANCE = new com.p314xaae8f345.p3118xeeebfacc.ur.C26858x37ac97c4.Companion(null);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/tencent/unit_rc/ur/MutexCpp$Companion;", "", "()V", "create", "Lcom/tencent/unit_rc/ur/Mutex;", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: com.tencent.unit_rc.ur.MutexCpp$Companion, reason: from kotlin metadata */
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: create */
        public final com.p314xaae8f345.p3118xeeebfacc.ur.InterfaceC26857x474015f m106105xaf65a0fc() {
            return (com.p314xaae8f345.p3118xeeebfacc.ur.InterfaceC26857x474015f) p3380x6a61f93.p3385xf51700ea.C30572x21b18fb7.m170001x21b14333();
        }
    }

    /* renamed from: create */
    public static final com.p314xaae8f345.p3118xeeebfacc.ur.InterfaceC26857x474015f m106104xaf65a0fc() {
        return INSTANCE.m106105xaf65a0fc();
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.ur.InterfaceC26857x474015f
    /* renamed from: lock */
    public void mo106100x32c52b() {
        p3380x6a61f93.p3385xf51700ea.C30572x21b18fb7.m170000x21b0d143(m105978x2737f10());
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.ur.InterfaceC26857x474015f
    /* renamed from: tryLock */
    public boolean mo106101xc1a8a586() {
        return p3380x6a61f93.p3385xf51700ea.C30572x21b18fb7.m170002x21b4484f(m105978x2737f10());
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.ur.InterfaceC26857x474015f
    /* renamed from: unlock */
    public void mo106102xcde7df44() {
        p3380x6a61f93.p3385xf51700ea.C30572x21b18fb7.m170004x21ba33ae(m105978x2737f10());
    }
}
