package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeActionManagerInvoker */
/* loaded from: classes15.dex */
public class C27369xdfcb6bbe extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27368xfaa63c8d.Callback {

    /* renamed from: stub */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27368xfaa63c8d f59683x3608ae;

    public C27369xdfcb6bbe() {
        this.f60613x19633840.put("DoAction", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217.InvokerInterface() { // from class: aw5.b$$a
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217.InvokerInterface
            /* renamed from: invoke */
            public final java.nio.ByteBuffer mo9210xb9724478(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                java.nio.ByteBuffer m113723x6b182c7b;
                m113723x6b182c7b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27369xdfcb6bbe.this.m113723x6b182c7b(str, c27686x63f3cf48);
                return m113723x6b182c7b;
            }
        });
        this.f60613x19633840.put("DoActionSync", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217.InvokerInterface() { // from class: aw5.b$$b
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217.InvokerInterface
            /* renamed from: invoke */
            public final java.nio.ByteBuffer mo9210xb9724478(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                java.nio.ByteBuffer m113724xc9ae34bc;
                m113724xc9ae34bc = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27369xdfcb6bbe.this.m113724xc9ae34bc(str, c27686x63f3cf48);
                return m113724xc9ae34bc;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __doActionAsync */
    public java.nio.ByteBuffer m113723x6b182c7b(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        this.f59683x3608ae.mo113719x415dec5b((int) this.f60616xed126936.m119531x51013b59(str, c27686x63f3cf48.m119487xe339ac4f()), (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d.m115706x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __doActionSync */
    public java.nio.ByteBuffer m113724xc9ae34bc(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 mo113720x75c0f8dc = this.f59683x3608ae.mo113720x75c0f8dc((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d.m115706x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()));
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
        c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(mo113720x75c0f8dc));
        return c27687xa835a820.m119495xeed4b35e();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217
    /* renamed from: attachStub */
    public void mo112761x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27368xfaa63c8d interfaceC27368xfaa63c8d = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27368xfaa63c8d) obj;
        interfaceC27368xfaa63c8d.mo113721x6c4ebec7(this);
        this.f59683x3608ae = interfaceC27368xfaa63c8d;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27368xfaa63c8d.Callback
    /* renamed from: onDoActionComplete */
    public void mo113722x6ac7baf9(int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 c27438x4d6b8053) {
        try {
            long j17 = i17;
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext m119530x34f2fde1 = this.f60616xed126936.m119530x34f2fde1(j17);
            if (m119530x34f2fde1 == null) {
                java.lang.String.format("onDoActionComplete taskid:%dnot found!", java.lang.Integer.valueOf(i17));
                return;
            }
            this.f60616xed126936.m119529xf32a0c62(j17);
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0("OnDoActionComplete");
            c27687xa835a820.m119510x55370fd8((int) m119530x34f2fde1.m119534x30961476());
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(c27438x4d6b8053));
            m119519xb9724478(m119530x34f2fde1.m119533xb1ff73bc(), c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeActionManagerInvoker.onDoActionComplete failed", e17);
        }
    }
}
