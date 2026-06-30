package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo */
/* loaded from: classes2.dex */
public class C27427xeb19d27d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d f60054xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d();

    /* renamed from: by_pass_custom_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f60055x5b9cf076;

    /* renamed from: inner_exp_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f60056x873b0159;

    /* renamed from: tab_tips_object_id_type */
    public int f60058xe8a8c31b = 0;

    /* renamed from: topic_id */
    public long f60059xc6f0e22b = 0;

    /* renamed from: position */
    public int f60057x2c929929 = 0;

    /* renamed from: wording */
    public java.lang.String f60060x5ae4fc98 = "";

    public C27427xeb19d27d() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        this.f60055x5b9cf076 = gVar;
        this.f60056x873b0159 = gVar;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115300xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115301x7c90cfc0() {
        return f60054xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115302x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115303x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d c27427xeb19d27d = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f60058xe8a8c31b), java.lang.Integer.valueOf(c27427xeb19d27d.f60058xe8a8c31b)) && n51.f.a(java.lang.Long.valueOf(this.f60059xc6f0e22b), java.lang.Long.valueOf(c27427xeb19d27d.f60059xc6f0e22b)) && n51.f.a(java.lang.Integer.valueOf(this.f60057x2c929929), java.lang.Integer.valueOf(c27427xeb19d27d.f60057x2c929929)) && n51.f.a(this.f60060x5ae4fc98, c27427xeb19d27d.f60060x5ae4fc98) && n51.f.a(this.f60055x5b9cf076, c27427xeb19d27d.f60055x5b9cf076) && n51.f.a(this.f60056x873b0159, c27427xeb19d27d.f60056x873b0159);
    }

    /* renamed from: getByPassCustomInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m115304xdf68be5d() {
        return this.f60055x5b9cf076;
    }

    /* renamed from: getBy_pass_custom_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m115305xb3cccd40() {
        return this.f60055x5b9cf076;
    }

    /* renamed from: getInnerExpInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m115306x51093bab() {
        return this.f60056x873b0159;
    }

    /* renamed from: getInner_exp_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m115307x75d2ce4f() {
        return this.f60056x873b0159;
    }

    /* renamed from: getPosition */
    public int m115308xa86cd69f() {
        return this.f60057x2c929929;
    }

    /* renamed from: getTabTipsObjectIdType */
    public int m115309x65da98eb() {
        return this.f60058xe8a8c31b;
    }

    /* renamed from: getTab_tips_object_id_type */
    public int m115310xb8a92ae5() {
        return this.f60058xe8a8c31b;
    }

    /* renamed from: getTopicId */
    public long m115311xf9e58274() {
        return this.f60059xc6f0e22b;
    }

    /* renamed from: getTopic_id */
    public long m115312x42cb1fa1() {
        return this.f60059xc6f0e22b;
    }

    /* renamed from: getWording */
    public java.lang.String m115313x98b23862() {
        return this.f60060x5ae4fc98;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115314x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f60058xe8a8c31b);
            fVar.h(2, this.f60059xc6f0e22b);
            fVar.e(3, this.f60057x2c929929);
            java.lang.String str = this.f60060x5ae4fc98;
            if (str != null) {
                fVar.j(4, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f60055x5b9cf076;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f60056x873b0159;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f60058xe8a8c31b) + 0 + b36.f.h(2, this.f60059xc6f0e22b) + b36.f.e(3, this.f60057x2c929929);
            java.lang.String str2 = this.f60060x5ae4fc98;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f60055x5b9cf076;
            if (gVar3 != null) {
                e17 += b36.f.b(5, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f60056x873b0159;
            return gVar4 != null ? e17 + b36.f.b(6, gVar4) : e17;
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
        switch (intValue) {
            case 1:
                this.f60058xe8a8c31b = aVar2.g(intValue);
                return 0;
            case 2:
                this.f60059xc6f0e22b = aVar2.i(intValue);
                return 0;
            case 3:
                this.f60057x2c929929 = aVar2.g(intValue);
                return 0;
            case 4:
                this.f60060x5ae4fc98 = aVar2.k(intValue);
                return 0;
            case 5:
                this.f60055x5b9cf076 = aVar2.d(intValue);
                return 0;
            case 6:
                this.f60056x873b0159 = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setByPassCustomInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115316x83655369(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60055x5b9cf076 = gVar;
        return this;
    }

    /* renamed from: setBy_pass_custom_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115317x2118cb4(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60055x5b9cf076 = gVar;
        return this;
    }

    /* renamed from: setInnerExpInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115318x875236b7(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60056x873b0159 = gVar;
        return this;
    }

    /* renamed from: setInner_exp_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115319x3dc9365b(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60056x873b0159 = gVar;
        return this;
    }

    /* renamed from: setPosition */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115320xa32537ab(int i17) {
        this.f60057x2c929929 = i17;
        return this;
    }

    /* renamed from: setTabTipsObjectIdType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115321xb41f585f(int i17) {
        this.f60058xe8a8c31b = i17;
        return this;
    }

    /* renamed from: setTab_tips_object_id_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115322xced91059(int i17) {
        this.f60058xe8a8c31b = i17;
        return this;
    }

    /* renamed from: setTopicId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115323x6d56cfe8(long j17) {
        this.f60059xc6f0e22b = j17;
        return this;
    }

    /* renamed from: setTopic_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115324x3d8380ad(long j17) {
        this.f60059xc6f0e22b = j17;
        return this;
    }

    /* renamed from: setWording */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115325xc2385d6(java.lang.String str) {
        this.f60060x5ae4fc98 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d m115315x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27427xeb19d27d) super.mo11468x92b714fd(bArr);
    }
}
