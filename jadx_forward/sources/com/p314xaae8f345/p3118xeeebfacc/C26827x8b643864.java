package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/tencent/unit_rc/BaseObjectFinalizer;", "", "Lcom/tencent/unit_rc/BaseObjectDef;", "obj", "Ljz5/f0;", "registerObject", "", "nativePointer", "destroy", "Lcom/tencent/unit_rc/cleaner/Cleaner;", "cleaner$delegate", "Ljz5/g;", "getCleaner", "()Lcom/tencent/unit_rc/cleaner/Cleaner;", "cleaner", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.unit_rc.BaseObjectFinalizer */
/* loaded from: classes16.dex */
public final class C26827x8b643864 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p3118xeeebfacc.C26827x8b643864 f57652x4fbc8495 = new com.p314xaae8f345.p3118xeeebfacc.C26827x8b643864();

    /* renamed from: cleaner$delegate, reason: from kotlin metadata */
    private static final jz5.g cleaner = jz5.h.b(com.p314xaae8f345.p3118xeeebfacc.C26829xdd36f784.f57654x4fbc8495);

    private C26827x8b643864() {
    }

    /* renamed from: destroy */
    public static final native void m105989x5cd39ffa(long j17);

    /* renamed from: getCleaner */
    private final com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96 m105990x70de9080() {
        java.lang.Object mo141623x754a37bb = cleaner.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "<get-cleaner>(...)");
        return (com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96) mo141623x754a37bb;
    }

    /* renamed from: registerObject */
    public static final void m105991xdb7ef7c2(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        final long strongPointer = obj.getStrongPointer();
        f57652x4fbc8495.m105990x70de9080().m106054xd6dc2ea3(obj, new java.lang.Runnable() { // from class: com.tencent.unit_rc.BaseObjectFinalizer$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p3118xeeebfacc.C26827x8b643864.m105989x5cd39ffa(strongPointer);
            }
        });
    }
}
