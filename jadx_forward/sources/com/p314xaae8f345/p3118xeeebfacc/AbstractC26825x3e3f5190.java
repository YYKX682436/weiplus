package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0086 J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0086 R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/tencent/unit_rc/BaseObject;", "Lcom/tencent/unit_rc/BaseObjectDef;", "", "isProxy", "", ya.b.f77479x42930b2, "Ljz5/f0;", "notifyFieldUpdated", "strongBaseRC", "weakBaseRC", "", "strongPointer", "J", "getStrongPointer", "()J", "weakPointer", "getWeakPointer", "getCppPointer", "cppPointer", "<init>", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.unit_rc.BaseObject */
/* loaded from: classes11.dex */
public abstract class AbstractC26825x3e3f5190 implements com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190.Companion INSTANCE = new com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190.Companion(null);
    private final long strongPointer;
    private final long weakPointer;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/tencent/unit_rc/BaseObject$Companion;", "", "", "nativePointer", "", ya.b.f77479x42930b2, "Ljz5/f0;", "nativeNotifyFieldUpdated", "Lcom/tencent/unit_rc/BaseObjectDef;", "obj", "notifyFieldUpdated", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.tencent.unit_rc.BaseObject$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: nativeNotifyFieldUpdated */
        public final native void m105986x1a88c4c1(long j17, int i17);

        /* renamed from: notifyFieldUpdated */
        public final void m105987x3f27f04a(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            long strongPointer = obj.getStrongPointer();
            if (strongPointer == 0) {
                strongPointer = obj.getWeakPointer();
            }
            if (strongPointer == 0) {
                return;
            }
            m105986x1a88c4c1(strongPointer, i17);
        }
    }

    /* renamed from: getCppPointer */
    public final long m105978x2737f10() {
        if (getStrongPointer() != 0) {
            return getStrongPointer();
        }
        if (getWeakPointer() != 0) {
            return getWeakPointer();
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    public long getStrongPointer() {
        return this.strongPointer;
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    public long getWeakPointer() {
        return this.weakPointer;
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: isProxy */
    public boolean mo105981x7b487764() {
        return false;
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: notifyFieldUpdated */
    public void mo105982x3f27f04a(int i17) {
        long m105978x2737f10 = m105978x2737f10();
        if (m105978x2737f10 == 0) {
            return;
        }
        INSTANCE.m105986x1a88c4c1(m105978x2737f10, i17);
    }

    /* renamed from: strongBaseRC */
    public final native com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 m105983x605e7639();

    /* renamed from: weakBaseRC */
    public final native com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 m105984xfbdcb25a();
}
