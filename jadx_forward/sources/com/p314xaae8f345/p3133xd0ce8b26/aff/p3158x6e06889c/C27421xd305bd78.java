package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderReddotFreqConfig */
/* loaded from: classes4.dex */
public class C27421xd305bd78 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 f60020xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78();

    /* renamed from: control_items */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem> f60021x4895765e = new java.util.LinkedList<>();

    /* renamed from: stay_entry_min_duration */
    public int f60022x70040734 = 0;

    /* renamed from: com.tencent.wechat.aff.newlife.FinderReddotFreqConfig$ControlItem */
    /* loaded from: classes4.dex */
    public static class ControlItem extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem f60023xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem();

        /* renamed from: n_value */
        public int f60025x63b66a60 = 0;

        /* renamed from: m_value */
        public int f60024x2ed02f1f = 0;

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115151xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115152x7c90cfc0() {
            return f60023xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115153x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115154x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem controlItem = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.f60025x63b66a60), java.lang.Integer.valueOf(controlItem.f60025x63b66a60)) && n51.f.a(java.lang.Integer.valueOf(this.f60024x2ed02f1f), java.lang.Integer.valueOf(controlItem.f60024x2ed02f1f));
        }

        /* renamed from: getMValue */
        public int m115155x2400fffa() {
            return this.f60024x2ed02f1f;
        }

        /* renamed from: getM_value */
        public int m115156x6c9d6ae9() {
            return this.f60024x2ed02f1f;
        }

        /* renamed from: getNValue */
        public int m115157x25b5d899() {
            return this.f60025x63b66a60;
        }

        /* renamed from: getN_value */
        public int m115158xa183a62a() {
            return this.f60025x63b66a60;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115159x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(1, this.f60025x63b66a60);
                fVar.e(2, this.f60024x2ed02f1f);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.e(1, this.f60025x63b66a60) + 0 + b36.f.e(2, this.f60024x2ed02f1f);
            }
            if (i17 == 2) {
                c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
                for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                    if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                        aVar.b();
                    }
                }
                return 0;
            }
            if (i17 != 3) {
                return -1;
            }
            c36.a aVar2 = (c36.a) objArr[0];
            int intValue = ((java.lang.Integer) objArr[2]).intValue();
            if (intValue == 1) {
                this.f60025x63b66a60 = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            this.f60024x2ed02f1f = aVar2.g(intValue);
            return 0;
        }

        /* renamed from: setMValue */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115161x17363406(int i17) {
            this.f60024x2ed02f1f = i17;
            return this;
        }

        /* renamed from: setM_value */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115162xe00eb85d(int i17) {
            this.f60024x2ed02f1f = i17;
            return this;
        }

        /* renamed from: setNValue */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115163x18eb0ca5(int i17) {
            this.f60025x63b66a60 = i17;
            return this;
        }

        /* renamed from: setN_value */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115164x14f4f39e(int i17) {
            this.f60025x63b66a60 = i17;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem m115160x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115132xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115133x7c90cfc0() {
        return f60020xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115134x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78();
    }

    /* renamed from: addAllElementControlItems */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115135x29b8441f(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem> collection) {
        this.f60021x4895765e.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementControl_items */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115136x32468e22(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem> collection) {
        this.f60021x4895765e.addAll(collection);
        return this;
    }

    /* renamed from: addElementControlItems */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115137xd6505f1e(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem controlItem) {
        this.f60021x4895765e.add(controlItem);
        return this;
    }

    /* renamed from: addElementControl_items */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115138x18b1d303(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem controlItem) {
        this.f60021x4895765e.add(controlItem);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115139x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 c27421xd305bd78 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78) fVar;
        return n51.f.a(this.f60021x4895765e, c27421xd305bd78.f60021x4895765e) && n51.f.a(java.lang.Integer.valueOf(this.f60022x70040734), java.lang.Integer.valueOf(c27421xd305bd78.f60022x70040734));
    }

    /* renamed from: getControlItems */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem> m115140xfefff6d9() {
        return this.f60021x4895765e;
    }

    /* renamed from: getControl_items */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem> m115141x5f532a8() {
        return this.f60021x4895765e;
    }

    /* renamed from: getStayEntryMinDuration */
    public int m115142x601b5f23() {
        return this.f60022x70040734;
    }

    /* renamed from: getStay_entry_min_duration */
    public int m115143x40046efe() {
        return this.f60022x70040734;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115144x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f60021x4895765e);
            fVar.e(2, this.f60022x70040734);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f60021x4895765e) + 0 + b36.f.e(2, this.f60022x70040734);
        }
        if (i17 == 2) {
            this.f60021x4895765e.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f60022x70040734 = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem controlItem = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem();
            if (bArr != null && bArr.length > 0) {
                controlItem.mo11468x92b714fd(bArr);
            }
            this.f60021x4895765e.add(controlItem);
        }
        return 0;
    }

    /* renamed from: setControlItems */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115146x3548f1e5(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem> linkedList) {
        this.f60021x4895765e = linkedList;
        return this;
    }

    /* renamed from: setControl_items */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115147x98cb991c(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78.ControlItem> linkedList) {
        this.f60021x4895765e = linkedList;
        return this;
    }

    /* renamed from: setStayEntryMinDuration */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115148xda6e8e2f(int i17) {
        this.f60022x70040734 = i17;
        return this;
    }

    /* renamed from: setStay_entry_min_duration */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115149x56345472(int i17) {
        this.f60022x70040734 = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 m115145x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27421xd305bd78) super.mo11468x92b714fd(bArr);
    }
}
