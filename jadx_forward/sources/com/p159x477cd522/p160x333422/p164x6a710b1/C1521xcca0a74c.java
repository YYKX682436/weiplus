package com.p159x477cd522.p160x333422.p164x6a710b1;

/* renamed from: com.eclipsesource.mmv8.utils.MemoryManager */
/* loaded from: classes7.dex */
public class C1521xcca0a74c {

    /* renamed from: memoryManagerReferenceHandler */
    private com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c.MemoryManagerReferenceHandler f5039x46ed590b;

    /* renamed from: v8, reason: collision with root package name */
    private com.p159x477cd522.p160x333422.V8 f125532v8;

    /* renamed from: references */
    private java.util.ArrayList<com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> f5040x528caa88 = new java.util.ArrayList<>();

    /* renamed from: releasing */
    private boolean f5042x5575f04 = false;

    /* renamed from: released */
    private boolean f5041xdf23d93d = false;

    /* renamed from: com.eclipsesource.mmv8.utils.MemoryManager$MemoryManagerReferenceHandler */
    /* loaded from: classes7.dex */
    public class MemoryManagerReferenceHandler implements com.p159x477cd522.p160x333422.InterfaceC1463xce10399f {
        private MemoryManagerReferenceHandler() {
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1463xce10399f
        /* renamed from: v8HandleCreated */
        public void mo15905x6302303e(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
            com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c.this.f5040x528caa88.add(abstractC1488x29d0ebef);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1463xce10399f
        /* renamed from: v8HandleDisposed */
        public void mo15906xa1c2178f(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
            if (com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c.this.f5042x5575f04) {
                return;
            }
            java.util.Iterator it = com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c.this.f5040x528caa88.iterator();
            while (it.hasNext()) {
                if (it.next() == abstractC1488x29d0ebef) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public C1521xcca0a74c(com.p159x477cd522.p160x333422.V8 v86) {
        this.f125532v8 = v86;
        com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c.MemoryManagerReferenceHandler memoryManagerReferenceHandler = new com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c.MemoryManagerReferenceHandler();
        this.f5039x46ed590b = memoryManagerReferenceHandler;
        v86.m16113x6f65040(memoryManagerReferenceHandler);
    }

    /* renamed from: checkReleased */
    private void m16641x6f109a65() {
        if (this.f5041xdf23d93d) {
            throw new java.lang.IllegalStateException("Memory manager released");
        }
    }

    /* renamed from: getObjectReferenceCount */
    public int m16642x53ed0a19() {
        m16641x6f109a65();
        return this.f5040x528caa88.size();
    }

    /* renamed from: isReleased */
    public boolean m16643xafdb8087() {
        return this.f5041xdf23d93d;
    }

    /* renamed from: persist */
    public void m16644xd78fb9d4(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
        this.f125532v8.m16208x23ad560e().m16431x2edbf932();
        m16641x6f109a65();
        this.f5040x528caa88.remove(abstractC1488x29d0ebef);
    }

    /* renamed from: release */
    public void m16645x41012807() {
        this.f125532v8.m16208x23ad560e().m16431x2edbf932();
        if (this.f5041xdf23d93d) {
            return;
        }
        this.f5042x5575f04 = true;
        try {
            java.util.Iterator<com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> it = this.f5040x528caa88.iterator();
            while (it.hasNext()) {
                it.next().mo15825x41012807();
            }
            this.f125532v8.m16262xe901aa23(this.f5039x46ed590b);
            this.f5040x528caa88.clear();
            this.f5042x5575f04 = false;
            this.f5041xdf23d93d = true;
        } catch (java.lang.Throwable th6) {
            this.f5042x5575f04 = false;
            throw th6;
        }
    }
}
