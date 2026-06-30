package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerInvoker */
/* loaded from: classes15.dex */
public class C27373x5f68c919 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27372x992e5512.Callback {

    /* renamed from: stub */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27372x992e5512 f59685x3608ae;

    public C27373x5f68c919() {
        this.f60613x19633840.put("SayHhello", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217.InvokerInterface() { // from class: aw5.d$$a
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217.InvokerInterface
            /* renamed from: invoke */
            public final java.nio.ByteBuffer mo9210xb9724478(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                java.nio.ByteBuffer m113736x947ea27;
                m113736x947ea27 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27373x5f68c919.this.m113736x947ea27(str, c27686x63f3cf48);
                return m113736x947ea27;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __sayHhelloAsync */
    public java.nio.ByteBuffer m113736x947ea27(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        this.f59685x3608ae.m113733xfbba2647((int) this.f60616xed126936.m119531x51013b59(str, ((java.lang.Integer) c27686x63f3cf48.m119491xbd1ad57b(java.lang.Integer.TYPE)).intValue()), c27686x63f3cf48.m119485xe22f9d47());
        return null;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217
    /* renamed from: attachStub */
    public void mo112761x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27372x992e5512 interfaceC27372x992e5512 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27372x992e5512) obj;
        interfaceC27372x992e5512.m113734x6c4ebec7(this);
        this.f59685x3608ae = interfaceC27372x992e5512;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27372x992e5512.Callback
    /* renamed from: onSayHhelloComplete */
    public void mo113735x3991416f(int i17, java.lang.String str) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext m119530x34f2fde1 = this.f60616xed126936.m119530x34f2fde1(i17);
            if (m119530x34f2fde1 == null) {
                java.lang.String.format("onSayHhelloComplete taskid:%dnot found!", java.lang.Integer.valueOf(i17));
                return;
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0("OnSayHhelloComplete");
            c27687xa835a820.m119514xd98e5cd2(java.lang.Integer.valueOf((int) m119530x34f2fde1.m119534x30961476()));
            c27687xa835a820.m119508x542d00d0(str);
            m119519xb9724478(m119530x34f2fde1.m119533xb1ff73bc(), c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception unused) {
            throw new java.lang.RuntimeException("AffNewLifeDartToNativeManagerInvoker.onSayHhelloComplete failed");
        }
    }
}
