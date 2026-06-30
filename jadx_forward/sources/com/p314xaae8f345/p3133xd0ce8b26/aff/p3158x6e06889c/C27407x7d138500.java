package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderGuestInfo */
/* loaded from: classes2.dex */
public class C27407x7d138500 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 f59919xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500();

    /* renamed from: guest_type */
    public int f59920x977a0141 = 0;

    /* renamed from: show_type */
    public int f59921x8e8dc33c = 0;

    /* renamed from: com.tencent.wechat.aff.newlife.FinderGuestInfo$GuestType */
    /* loaded from: classes.dex */
    public enum GuestType implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
        Guest_Type_None(0),
        Guest_Type_Biz(1);


        /* renamed from: Guest_Type_Biz_VALUE */
        public static final int f59924xe2ba5dc7 = 1;

        /* renamed from: Guest_Type_None_VALUE */
        public static final int f59926xd0f2f728 = 0;

        /* renamed from: value */
        public final int f59927x6ac9171;

        GuestType(int i17) {
            this.f59927x6ac9171 = i17;
        }

        /* renamed from: forNumber */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500.GuestType m114739x382ad972(int i17) {
            if (i17 == 0) {
                return Guest_Type_None;
            }
            if (i17 != 1) {
                return null;
            }
            return Guest_Type_Biz;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
        /* renamed from: getNumber */
        public final int mo11476x276ffe3f() {
            return this.f59927x6ac9171;
        }

        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500.GuestType m114740xdce0328(int i17) {
            return m114739x382ad972(i17);
        }
    }

    /* renamed from: com.tencent.wechat.aff.newlife.FinderGuestInfo$ShowType */
    /* loaded from: classes.dex */
    public enum ShowType implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
        Show_Type_Biz_Profile(1);


        /* renamed from: Show_Type_Biz_Profile_VALUE */
        public static final int f59930xd0d02e8c = 1;

        /* renamed from: value */
        public final int f59931x6ac9171;

        ShowType(int i17) {
            this.f59931x6ac9171 = i17;
        }

        /* renamed from: forNumber */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500.ShowType m114745x382ad972(int i17) {
            if (i17 != 1) {
                return null;
            }
            return Show_Type_Biz_Profile;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
        /* renamed from: getNumber */
        public final int mo11476x276ffe3f() {
            return this.f59931x6ac9171;
        }

        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500.ShowType m114746xdce0328(int i17) {
            return m114745x382ad972(i17);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114723xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114724x7c90cfc0() {
        return f59919xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114725x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114726x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 c27407x7d138500 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59920x977a0141), java.lang.Integer.valueOf(c27407x7d138500.f59920x977a0141)) && n51.f.a(java.lang.Integer.valueOf(this.f59921x8e8dc33c), java.lang.Integer.valueOf(c27407x7d138500.f59921x8e8dc33c));
    }

    /* renamed from: getGuestType */
    public int m114727xca7cf67c() {
        return this.f59920x977a0141;
    }

    /* renamed from: getGuest_type */
    public int m114728x85bab937() {
        return this.f59920x977a0141;
    }

    /* renamed from: getShowType */
    public int m114729x67a8554d() {
        return this.f59921x8e8dc33c;
    }

    /* renamed from: getShow_type */
    public int m114730x8dfb3486() {
        return this.f59921x8e8dc33c;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114731x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f59920x977a0141);
            fVar.e(2, this.f59921x8e8dc33c);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f59920x977a0141) + 0 + b36.f.e(2, this.f59921x8e8dc33c);
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
            this.f59920x977a0141 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f59921x8e8dc33c = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setGuestType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114733x26d0b6f0(int i17) {
        this.f59920x977a0141 = i17;
        return this;
    }

    /* renamed from: setGuest_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114734xb3df0743(int i17) {
        this.f59920x977a0141 = i17;
        return this;
    }

    /* renamed from: setShowType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114735x6260b659(int i17) {
        this.f59921x8e8dc33c = i17;
        return this;
    }

    /* renamed from: setShow_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114736xea4ef4fa(int i17) {
        this.f59921x8e8dc33c = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 m114732x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27407x7d138500) super.mo11468x92b714fd(bArr);
    }
}
