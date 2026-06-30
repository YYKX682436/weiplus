package com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708;

/* renamed from: com.tencent.wemagic.common.zidl_gen.ZIDL_xyzzHllyB */
/* loaded from: classes8.dex */
class C27735xf53ec508 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.b f301601a;

    /* renamed from: ZIDL_AX */
    private native void m119793x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_BX */
    private native void m119794x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_CX */
    private native void m119795x1964d1bd(long j17, long j18);

    /* renamed from: ZIDL_DX */
    private native void m119796x1964d1dc(long j17, long j18);

    /* renamed from: ZIDL_EX */
    private native void m119797x1964d1fb(long j17, long j18);

    /* renamed from: ZIDL_FX */
    private native void m119798x1964d21a(long j17, long j18);

    /* renamed from: ZIDL_GX */
    private native void m119799x1964d239(long j17, long j18);

    /* renamed from: ZIDL_HX */
    private native void m119800x1964d258(long j17, long j18);

    /* renamed from: ZIDL_IX */
    private native void m119801x1964d277(long j17, long j18);

    /* renamed from: ZIDL_AV */
    public void m119802x1964d17d(long j17, long j18) {
        this.f301601a.getClass();
    }

    /* renamed from: ZIDL_BV */
    public void m119803x1964d19c(long j17, java.lang.String str, long j18) {
        this.f301601a.getClass();
    }

    /* renamed from: ZIDL_CV */
    public void m119804x1964d1bb(long j17, java.lang.String str, long j18, float f17, float f18, float f19, float f27, int i17) {
        this.f301601a.getClass();
    }

    /* renamed from: ZIDL_DV */
    public void m119805x1964d1da(long j17, java.lang.String str, long j18) {
        this.f301601a.getClass();
    }

    /* renamed from: ZIDL_EV */
    public void m119806x1964d1f9(long j17, java.lang.String str, long j18) {
        this.f301601a.getClass();
    }

    /* renamed from: ZIDL_FV */
    public void m119807x1964d218(long j17, long j18, java.lang.String apiName, java.lang.String apiData, long j19) {
        ((yw5.a) this.f301601a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiData, "apiData");
        zw5.a aVar = yw5.a.f548533a;
        aVar.getClass();
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) aVar.f558472a).get(java.lang.Long.valueOf(j18));
        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.api.InterfaceC27730x99f590fe interfaceC27730x99f590fe = weakReference != null ? (com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.api.InterfaceC27730x99f590fe) weakReference.get() : null;
        if (interfaceC27730x99f590fe != null) {
            interfaceC27730x99f590fe.mo119757xb9724478(apiName, apiData, j19);
            return;
        }
        java.lang.String concat = "fail:internal error ".concat("jsapi adapter not found");
        if (concat == null) {
            concat = "fail:internal error";
        }
        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.c.f301618b.d(j18, (int) j19, 4, concat, "");
    }

    /* renamed from: ZIDL_GV */
    public void m119808x1964d237(long j17, int i17, boolean z17) {
        this.f301601a.getClass();
    }

    /* renamed from: ZIDL_HV */
    public void m119809x1964d256(long j17, long j18, final java.lang.String str) {
        ((yw5.a) this.f301601a).getClass();
        vw5.b bVar = (vw5.b) yw5.a.f548534b.get(java.lang.Long.valueOf(j18));
        if (bVar != null) {
            if (str == null) {
                str = "";
            }
            final xw5.d dVar = (xw5.d) bVar;
            java.lang.String format = "onJsLog: ".concat(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
            if (!(copyOf.length == 0)) {
                format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
            com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d.f301597a.b(new java.lang.Runnable() { // from class: xw5.d$$d
                @Override // java.lang.Runnable
                public final void run() {
                    xw5.d this$0 = xw5.d.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    java.lang.String str2 = str;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "$str");
                    if (this$0.f539288j && this$0.f539287i) {
                        this$0.c(str2);
                    } else {
                        this$0.f539285g.add(str2);
                    }
                }
            });
        }
    }

    /* renamed from: ZIDL_IV */
    public void m119810x1964d275(long j17, long j18, final boolean z17) {
        ((yw5.a) this.f301601a).getClass();
        vw5.b bVar = (vw5.b) yw5.a.f548534b.get(java.lang.Long.valueOf(j18));
        if (bVar != null) {
            final xw5.d dVar = (xw5.d) bVar;
            java.lang.String format = "onSwitch: " + z17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
            if (!(copyOf.length == 0)) {
                format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
            com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d.f301597a.b(new java.lang.Runnable() { // from class: xw5.d$$b
                @Override // java.lang.Runnable
                public final void run() {
                    xw5.d this$0 = xw5.d.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    boolean z18 = z17;
                    this$0.f539286h = z18;
                    if (!z18) {
                        this$0.b();
                    } else {
                        if (this$0.a()) {
                            return;
                        }
                        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOf2.length == 0 ? "onSwitch, vconsole container not found" : java.lang.String.format("onSwitch, vconsole container not found", java.util.Arrays.copyOf(copyOf2, copyOf2.length)));
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.b bVar = (com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.b) obj;
        this.f301601a = bVar;
        bVar.getClass();
    }
}
